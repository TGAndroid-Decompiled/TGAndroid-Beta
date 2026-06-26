package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.ui.Components.AnimatedFileNative;

public class VideoFramesRewinder {
    private Frame currentFrame;
    private boolean destroyAfterPrepare;
    int h;
    private boolean isPreparing;
    private long lastSeek;
    private AnimatedFileNative mDecoder;
    private int maxFrameSide;
    private int maxFramesCount;
    private View parentView;
    private long prepareToMs;
    private float prepareWithSpeed;
    int w;
    private final Paint paint = new Paint(2);
    private final int[] meta = new int[7];
    private final ArrayList<Frame> freeFrames = new ArrayList<>();
    private final TreeSet<Frame> frames = new TreeSet<>(new Comparator() {
        @Override
        public final int compare(Object obj, Object obj2) {
            return VideoFramesRewinder.lambda$new$0((VideoFramesRewinder.Frame) obj, (VideoFramesRewinder.Frame) obj2);
        }
    });
    private AtomicBoolean stop = new AtomicBoolean(false);
    private AtomicLong until = new AtomicLong(0);
    private float lastSpeed = 1.0f;
    private Runnable prepareRunnable = new Runnable() {
        @Override
        public final void run() {
            this.f$0.lambda$new$2();
        }
    };

    public VideoFramesRewinder() {
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 1) {
            this.maxFramesCount = 200;
            this.maxFrameSide = 580;
        } else if (devicePerformanceClass == 2) {
            this.maxFramesCount = 400;
            this.maxFrameSide = 720;
        } else {
            this.maxFramesCount = 100;
            this.maxFrameSide = 480;
        }
    }

    public void draw(Canvas canvas, int i, int i2) {
        this.w = i;
        this.h = i2;
        if (this.mDecoder == null || this.currentFrame == null) {
            return;
        }
        canvas.save();
        canvas.scale(i / this.currentFrame.bitmap.getWidth(), i2 / this.currentFrame.bitmap.getHeight());
        canvas.drawBitmap(this.currentFrame.bitmap, 0.0f, 0.0f, this.paint);
        canvas.restore();
    }

    public boolean isReady() {
        return this.mDecoder != null;
    }

    public void setup(File file) {
        if (file == null) {
            release();
        } else {
            this.stop.set(false);
            this.mDecoder = AnimatedFileNative.createDecoderFrom(file.getAbsolutePath(), this.meta, UserConfig.selectedAccount, 0L, null, true);
        }
    }

    public static int lambda$new$0(Frame frame, Frame frame2) {
        return (int) (frame.position - frame2.position);
    }

    class Frame {
        Bitmap bitmap;
        long position;

        private Frame() {
        }
    }

    public void lambda$new$2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.VideoFramesRewinder.lambda$new$2():void");
    }

    public void lambda$new$1(ArrayList arrayList, long j) {
        FileLog.d("[VideoFramesRewinder] total prepare of " + arrayList.size() + " took " + (System.currentTimeMillis() - j) + "ms");
        if (!arrayList.isEmpty()) {
            FileLog.d("[VideoFramesRewinder] prepared from " + ((Frame) arrayList.get(0)).position + "ms to " + ((Frame) arrayList.get(arrayList.size() - 1)).position + "ms (requested up to " + this.prepareToMs + "ms)");
        }
        this.isPreparing = false;
        Iterator<Frame> it = this.frames.iterator();
        while (it.hasNext()) {
            Frame next = it.next();
            if (this.currentFrame != next && next.position > this.lastSeek) {
                if (this.freeFrames.size() > 20) {
                    AndroidUtilities.recycleBitmap(next.bitmap);
                } else {
                    this.freeFrames.add(next);
                }
                it.remove();
            }
        }
        while (!arrayList.isEmpty() && this.frames.size() < this.maxFramesCount) {
            this.frames.add((Frame) arrayList.remove(arrayList.size() - 1));
        }
        if (arrayList.size() > 0) {
            FileLog.d("[VideoFramesRewinder] prepared " + arrayList.size() + " more frames than I could fit :(");
        }
        if (this.destroyAfterPrepare) {
            release();
            this.stop.set(false);
        }
    }

    private void prepare(long j) {
        if (this.isPreparing) {
            return;
        }
        FileLog.d("[VideoFramesRewinder] starting preparing " + j + "ms");
        this.isPreparing = true;
        this.prepareToMs = j;
        this.prepareWithSpeed = this.lastSpeed;
        Utilities.themeQueue.postRunnable(this.prepareRunnable);
    }

    public void seek(long j, float f) {
        if (this.mDecoder == null) {
            return;
        }
        this.lastSeek = j;
        this.lastSpeed = f;
        this.until.set(j);
        Iterator<Frame> it = this.frames.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            Frame next = it.next();
            arrayList.add(Long.valueOf(next.position));
            float f2 = 25.0f * f;
            if (Math.abs(next.position - j) < f2) {
                if (this.currentFrame != next) {
                    FileLog.d("[VideoFramesRewinder] found a frame " + next.position + "ms to fit to " + j + "ms from " + this.frames.size() + " frames");
                    this.currentFrame = next;
                    invalidate();
                    int i = 0;
                    while (it.hasNext()) {
                        it.next();
                        it.remove();
                        i++;
                    }
                    if (i > 0) {
                        FileLog.d("[VideoFramesRewinder] also deleted " + i + " frames after this frame");
                    }
                }
                for (int size = arrayList.size() - 2; size >= 0; size--) {
                    long jLongValue = ((Long) arrayList.get(size + 1)).longValue();
                    long jLongValue2 = ((Long) arrayList.get(size)).longValue();
                    if (Math.abs(jLongValue - jLongValue2) > f2) {
                        prepare(jLongValue2);
                        return;
                    }
                }
                prepare(Math.max(0L, this.frames.first().position - 20));
                return;
            }
        }
        FileLog.d("[VideoFramesRewinder] didn't find a frame, wanting to prepare " + j + "ms");
        prepare(Math.max(0L, j));
    }

    public void clearCurrent() {
        if (this.currentFrame != null) {
            this.currentFrame = null;
            invalidate();
        }
    }

    public void release() {
        if (this.isPreparing) {
            this.stop.set(true);
            this.destroyAfterPrepare = true;
            return;
        }
        AnimatedFileNative animatedFileNative = this.mDecoder;
        if (animatedFileNative != null) {
            animatedFileNative.recycle();
            this.mDecoder = null;
        }
        this.destroyAfterPrepare = false;
        clearCurrent();
        this.until.set(0L);
        Iterator<Frame> it = this.frames.iterator();
        while (it.hasNext()) {
            AndroidUtilities.recycleBitmap(it.next().bitmap);
        }
        this.frames.clear();
        Iterator<Frame> it2 = this.freeFrames.iterator();
        while (it2.hasNext()) {
            AndroidUtilities.recycleBitmap(it2.next().bitmap);
        }
        this.freeFrames.clear();
    }

    public void setParentView(View view) {
        this.parentView = view;
    }

    private void invalidate() {
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
