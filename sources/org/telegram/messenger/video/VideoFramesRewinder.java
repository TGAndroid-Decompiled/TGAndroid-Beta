package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import bi.d3;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.ui.Cells.f1;
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
    int f25983w;
    private final Paint paint = new Paint(2);
    private final int[] meta = new int[8];
    private final ArrayList<Frame> freeFrames = new ArrayList<>();
    private final TreeSet<Frame> frames = new TreeSet<>(new b(1));
    private AtomicBoolean stop = new AtomicBoolean(false);
    private AtomicLong until = new AtomicLong(0);
    private float lastSpeed = 1.0f;
    private Runnable prepareRunnable = new a(this, 2);

    public class Frame {
        Bitmap bitmap;
        long position;

        private Frame() {
            VideoFramesRewinder.this = r1;
        }
    }

    public VideoFramesRewinder() {
        int o4 = iz.o();
        if (o4 != 1) {
            if (o4 != 2) {
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

    public void lambda$new$1(ArrayList arrayList, long j3) {
        a8.b("[VideoFramesRewinder] total prepare of " + arrayList.size() + " took " + (System.currentTimeMillis() - j3) + "ms");
        if (!arrayList.isEmpty()) {
            a8.b("[VideoFramesRewinder] prepared from " + ((Frame) arrayList.get(0)).position + "ms to " + ((Frame) arrayList.get(arrayList.size() - 1)).position + "ms (requested up to " + this.prepareToMs + "ms)");
        }
        this.isPreparing = false;
        Iterator<Frame> it = this.frames.iterator();
        while (it.hasNext()) {
            Frame next = it.next();
            if (this.currentFrame != next && next.position > this.lastSeek) {
                if (this.freeFrames.size() > 20) {
                    g0.z2(next.bitmap);
                } else {
                    this.freeFrames.add(next);
                }
                it.remove();
            }
        }
        while (!arrayList.isEmpty() && this.frames.size() < this.maxFramesCount) {
            this.frames.add((Frame) f1.k(1, arrayList));
        }
        if (arrayList.size() > 0) {
            a8.b("[VideoFramesRewinder] prepared " + arrayList.size() + " more frames than I could fit :(");
        }
        if (this.destroyAfterPrepare) {
            release();
            this.stop.set(false);
        }
    }

    public void lambda$new$2() {
        Frame frame;
        char c10;
        int i7;
        int i10;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        int[] iArr = this.meta;
        char c11 = 4;
        int i11 = iArr[4];
        int i12 = 0;
        int min = Math.min(this.f25983w / 4, iArr[0]);
        int min2 = Math.min(this.h / 4, this.meta[1]);
        int i13 = this.maxFrameSide;
        if (min > i13 || min2 > i13) {
            float max = i13 / Math.max(min, min2);
            min = (int) (min * max);
            min2 = (int) (min2 * max);
        }
        this.mDecoder.g(this.prepareToMs - (this.prepareWithSpeed * 350.0f), false);
        char c12 = 3;
        long j3 = this.meta[3];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            char c13 = c11;
            if (this.meta[c12] > this.until.get() || i14 >= this.maxFramesCount || this.stop.get()) {
                break;
            }
            float f10 = 1000.0f / i11;
            char c14 = c12;
            long j10 = j3;
            long j11 = (this.prepareWithSpeed * f10) + ((float) j3);
            if (!this.freeFrames.isEmpty()) {
                frame = this.freeFrames.remove(i12);
            } else {
                frame = new Frame();
            }
            Bitmap bitmap = frame.bitmap;
            if (bitmap == null || bitmap.getWidth() != min || frame.bitmap.getHeight() != min2) {
                g0.z2(frame.bitmap);
                try {
                    frame.bitmap = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                } catch (OutOfMemoryError unused) {
                    a8.b("[VideoFramesRewinder] failed to create bitmap: out of memory");
                }
            }
            while (true) {
                c10 = c14;
                i7 = i11;
                i10 = i14;
                if (this.meta[c14] + ((long) Math.ceil(f10)) >= j11) {
                    break;
                }
                this.mDecoder.c(null, true, 0.0f, this.meta[c13], false);
                i11 = i7;
                c14 = c10;
                i14 = i10;
            }
            if (this.mDecoder.c(frame.bitmap, true, 0.0f, this.meta[c13], false) == 0) {
                i15++;
                if (i15 > 6) {
                    break;
                }
                j3 = j10;
            } else {
                long j12 = this.meta[c10];
                frame.position = j12;
                arrayList.add(frame);
                j3 = j12;
            }
            i14 = i10 + 1;
            c11 = c13;
            i11 = i7;
            c12 = c10;
            i12 = 0;
        }
        g0.h3(new d3(this, arrayList, currentTimeMillis, 12));
    }

    private void prepare(long j3) {
        if (this.isPreparing) {
            return;
        }
        a8.b("[VideoFramesRewinder] starting preparing " + j3 + "ms");
        this.isPreparing = true;
        this.prepareToMs = j3;
        this.prepareWithSpeed = this.lastSpeed;
        Utilities.f21336i.c(this.prepareRunnable);
    }

    public void clearCurrent() {
        if (this.currentFrame != null) {
            this.currentFrame = null;
            invalidate();
        }
    }

    public void draw(Canvas canvas, int i7, int i10) {
        this.f25983w = i7;
        this.h = i10;
        if (this.mDecoder != null && this.currentFrame != null) {
            canvas.save();
            canvas.scale(i7 / this.currentFrame.bitmap.getWidth(), i10 / this.currentFrame.bitmap.getHeight());
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
        int i7 = 0;
        this.destroyAfterPrepare = false;
        clearCurrent();
        this.until.set(0L);
        Iterator<Frame> it = this.frames.iterator();
        while (it.hasNext()) {
            g0.z2(it.next().bitmap);
        }
        this.frames.clear();
        ArrayList<Frame> arrayList = this.freeFrames;
        int size = arrayList.size();
        while (i7 < size) {
            Frame frame = arrayList.get(i7);
            i7++;
            g0.z2(frame.bitmap);
        }
        this.freeFrames.clear();
    }

    public void seek(long j3, float f10) {
        if (this.mDecoder == null) {
            return;
        }
        this.lastSeek = j3;
        this.lastSpeed = f10;
        this.until.set(j3);
        Iterator<Frame> it = this.frames.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            Frame next = it.next();
            arrayList.add(Long.valueOf(next.position));
            float f11 = 25.0f * f10;
            if (((float) Math.abs(next.position - j3)) < f11) {
                if (this.currentFrame != next) {
                    a8.b("[VideoFramesRewinder] found a frame " + next.position + "ms to fit to " + j3 + "ms from " + this.frames.size() + " frames");
                    this.currentFrame = next;
                    invalidate();
                    int i7 = 0;
                    while (it.hasNext()) {
                        it.next();
                        it.remove();
                        i7++;
                    }
                    if (i7 > 0) {
                        a8.b("[VideoFramesRewinder] also deleted " + i7 + " frames after this frame");
                    }
                }
                for (int size = arrayList.size() - 2; size >= 0; size--) {
                    long longValue = ((Long) arrayList.get(size + 1)).longValue();
                    long longValue2 = ((Long) arrayList.get(size)).longValue();
                    if (((float) Math.abs(longValue - longValue2)) > f11) {
                        prepare(longValue2);
                        return;
                    }
                }
                prepare(Math.max(0L, this.frames.first().position - 20));
                return;
            }
        }
        a8.b("[VideoFramesRewinder] didn't find a frame, wanting to prepare " + j3 + "ms");
        prepare(Math.max(0L, j3));
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
        this.mDecoder = AnimatedFileNative.a(file.getAbsolutePath(), this.meta, p10.f24459s0, 0L, null, true);
    }
}
