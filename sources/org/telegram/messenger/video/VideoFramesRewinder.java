package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.Utilities;
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
    private final int[] meta = new int[8];
    private final ArrayList<Frame> freeFrames = new ArrayList<>();
    private final TreeSet<Frame> frames = new TreeSet<>(new a((byte) 1));
    private AtomicBoolean stop = new AtomicBoolean(false);
    private AtomicLong until = new AtomicLong(0);
    private float lastSpeed = 1.0f;
    private Runnable prepareRunnable = new azb(this, (byte) 15);

    public VideoFramesRewinder() {
        int o = xea.o();
        if (o != 1) {
            if (o != 2) {
                this.maxFramesCount = 100;
                this.maxFrameSide = 480;
                return;
            }
            this.maxFramesCount = 400;
            this.maxFrameSide = 720;
            return;
        }
        this.maxFramesCount = 200;
        this.maxFrameSide = 580;
    }

    private void invalidate() {
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static int lambda$new$0(Frame frame, Frame frame2) {
        return (int) (frame.position - frame2.position);
    }

    public void lambda$new$1(ArrayList arrayList, long j) {
        cc4.b("[VideoFramesRewinder] total prepare of " + arrayList.size() + " took " + (System.currentTimeMillis() - j) + "ms");
        if (!arrayList.isEmpty()) {
            cc4.b("[VideoFramesRewinder] prepared from " + ((Frame) arrayList.get(0)).position + "ms to " + ((Frame) arrayList.get(arrayList.size() - 1)).position + "ms (requested up to " + this.prepareToMs + "ms)");
        }
        this.isPreparing = false;
        Iterator<Frame> it = this.frames.iterator();
        while (it.hasNext()) {
            Frame next = it.next();
            if (this.currentFrame != next && next.position > this.lastSeek) {
                if (this.freeFrames.size() > 20) {
                    hl.w2(next.bitmap);
                } else {
                    this.freeFrames.add(next);
                }
                it.remove();
            }
        }
        while (!arrayList.isEmpty() && this.frames.size() < this.maxFramesCount) {
            this.frames.add((Frame) qd4.l(1, arrayList));
        }
        if (arrayList.size() > 0) {
            cc4.b("[VideoFramesRewinder] prepared " + arrayList.size() + " more frames than I could fit :(");
        }
        if (this.destroyAfterPrepare) {
            release();
            this.stop.set(false);
        }
    }

    public void lambda$new$2() {
        Frame frame;
        char c;
        int i;
        int i2;
        AnimatedFileNative animatedFileNative;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        int[] iArr = this.meta;
        char c2 = 4;
        int i3 = iArr[4];
        int i4 = 0;
        int min = Math.min(this.w / 4, iArr[0]);
        int min2 = Math.min(this.h / 4, this.meta[1]);
        int i5 = this.maxFrameSide;
        if (min > i5 || min2 > i5) {
            float max = i5 / Math.max(min, min2);
            min = (int) (min * max);
            min2 = (int) (min2 * max);
        }
        this.mDecoder.g(this.prepareToMs - (this.prepareWithSpeed * 350.0f), false);
        char c3 = 3;
        long j = this.meta[3];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            char c4 = c2;
            if (this.meta[c3] > this.until.get() || i6 >= this.maxFramesCount || this.stop.get()) {
                break;
            }
            float f = 1000.0f / i3;
            char c5 = c3;
            long j2 = j;
            long j3 = (this.prepareWithSpeed * f) + ((float) j);
            if (!this.freeFrames.isEmpty()) {
                frame = this.freeFrames.remove(i4);
            } else {
                frame = new Frame(this, i4);
            }
            Bitmap bitmap = frame.bitmap;
            if (bitmap == null || bitmap.getWidth() != min || frame.bitmap.getHeight() != min2) {
                hl.w2(frame.bitmap);
                try {
                    frame.bitmap = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                } catch (OutOfMemoryError unused) {
                    cc4.b("[VideoFramesRewinder] failed to create bitmap: out of memory");
                }
            }
            while (true) {
                c = c5;
                i = i3;
                i2 = i6;
                int i8 = ((this.meta[c5] + ((long) Math.ceil(f))) > j3 ? 1 : ((this.meta[c5] + ((long) Math.ceil(f))) == j3 ? 0 : -1));
                animatedFileNative = this.mDecoder;
                if (i8 >= 0) {
                    break;
                }
                animatedFileNative.c(null, true, 0.0f, this.meta[c4], false);
                i3 = i;
                c5 = c;
                i6 = i2;
            }
            if (animatedFileNative.c(frame.bitmap, true, 0.0f, this.meta[c4], false) == 0) {
                i7++;
                if (i7 > 6) {
                    break;
                }
                j = j2;
            } else {
                long j4 = this.meta[c];
                frame.position = j4;
                arrayList.add(frame);
                j = j4;
            }
            i6 = i2 + 1;
            c2 = c4;
            i3 = i;
            c3 = c;
            i4 = 0;
        }
        hl.c3(new j5b(this, arrayList, currentTimeMillis, (byte) 13));
    }

    private void prepare(long j) {
        if (this.isPreparing) {
            return;
        }
        cc4.b("[VideoFramesRewinder] starting preparing " + j + "ms");
        this.isPreparing = true;
        this.prepareToMs = j;
        this.prepareWithSpeed = this.lastSpeed;
        Utilities.i.c(this.prepareRunnable);
    }

    public void clearCurrent() {
        if (this.currentFrame != null) {
            this.currentFrame = null;
            invalidate();
        }
    }

    public void draw(Canvas canvas, int i, int i2) {
        this.w = i;
        this.h = i2;
        if (this.mDecoder != null && this.currentFrame != null) {
            canvas.save();
            canvas.scale(i / this.currentFrame.bitmap.getWidth(), i2 / this.currentFrame.bitmap.getHeight());
            canvas.drawBitmap(this.currentFrame.bitmap, 0.0f, 0.0f, this.paint);
            canvas.restore();
        }
    }

    public boolean isReady() {
        if (this.mDecoder != null) {
            return true;
        }
        return false;
    }

    public void release() {
        if (this.isPreparing) {
            this.stop.set(true);
            this.destroyAfterPrepare = true;
            return;
        }
        AnimatedFileNative animatedFileNative = this.mDecoder;
        if (animatedFileNative != null) {
            animatedFileNative.f();
            this.mDecoder = null;
        }
        int i = 0;
        this.destroyAfterPrepare = false;
        clearCurrent();
        this.until.set(0L);
        Iterator<Frame> it = this.frames.iterator();
        while (it.hasNext()) {
            hl.w2(it.next().bitmap);
        }
        this.frames.clear();
        ArrayList<Frame> arrayList = this.freeFrames;
        int size = arrayList.size();
        while (i < size) {
            Frame frame = arrayList.get(i);
            i++;
            hl.w2(frame.bitmap);
        }
        this.freeFrames.clear();
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
            if (((float) Math.abs(next.position - j)) < f2) {
                if (this.currentFrame != next) {
                    cc4.b("[VideoFramesRewinder] found a frame " + next.position + "ms to fit to " + j + "ms from " + this.frames.size() + " frames");
                    this.currentFrame = next;
                    invalidate();
                    int i = 0;
                    while (it.hasNext()) {
                        it.next();
                        it.remove();
                        i++;
                    }
                    if (i > 0) {
                        cc4.b("[VideoFramesRewinder] also deleted " + i + " frames after this frame");
                    }
                }
                for (int size = arrayList.size() - 2; size >= 0; size--) {
                    long longValue = ((Long) arrayList.get(size + 1)).longValue();
                    long longValue2 = ((Long) arrayList.get(size)).longValue();
                    if (((float) Math.abs(longValue - longValue2)) > f2) {
                        prepare(longValue2);
                        return;
                    }
                }
                prepare(Math.max(0L, this.frames.first().position - 20));
                return;
            }
        }
        cc4.b("[VideoFramesRewinder] didn't find a frame, wanting to prepare " + j + "ms");
        prepare(Math.max(0L, j));
    }

    public void setParentView(View view) {
        this.parentView = view;
    }

    public void setup(File file) {
        if (file == null) {
            release();
            return;
        }
        this.stop.set(false);
        this.mDecoder = AnimatedFileNative.a(file.getAbsolutePath(), this.meta, yac.t0, 0L, null, true);
    }

    public class Frame {
        Bitmap bitmap;
        long position;

        private Frame() {
            VideoFramesRewinder.this = r1;
        }

        public Frame(VideoFramesRewinder videoFramesRewinder, int i) {
            this();
        }
    }
}
