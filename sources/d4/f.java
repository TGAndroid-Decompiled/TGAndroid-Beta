package d4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import c2.a1;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f4146b;
    public Handler f4147c;
    public MediaFormat h;
    public MediaFormat f4150i;
    public MediaCodec.CodecException f4151j;
    public long f4152k;
    public boolean f4153l;
    public IllegalStateException f4154m;
    public final Object f4145a = new Object();
    public final a1 d = new a1();
    public final a1 e = new a1();
    public final ArrayDeque f4148f = new ArrayDeque();
    public final ArrayDeque f4149g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f4146b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f4149g;
        if (!arrayDeque.isEmpty()) {
            this.f4150i = (MediaFormat) arrayDeque.getLast();
        }
        a1 a1Var = this.d;
        a1Var.f1895a = 0;
        a1Var.f1896b = -1;
        a1Var.f1897c = 0;
        a1 a1Var2 = this.e;
        a1Var2.f1895a = 0;
        a1Var2.f1896b = -1;
        a1Var2.f1897c = 0;
        this.f4148f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z4;
        if (this.f4147c == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        HandlerThread handlerThread = this.f4146b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f4147c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f4145a) {
            this.f4154m = illegalStateException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f4145a) {
            this.f4151j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f4145a) {
            this.d.d(i10);
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f4145a) {
            try {
                MediaFormat mediaFormat = this.f4150i;
                if (mediaFormat != null) {
                    this.e.d(-2);
                    this.f4149g.add(mediaFormat);
                    this.f4150i = null;
                }
                this.e.d(i10);
                this.f4148f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f4145a) {
            this.e.d(-2);
            this.f4149g.add(mediaFormat);
            this.f4150i = null;
        }
    }
}
