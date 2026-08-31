package d4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import c2.a1;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f4215b;
    public Handler f4216c;
    public MediaFormat h;
    public MediaFormat f4220i;
    public MediaCodec.CodecException f4221j;
    public long f4222k;
    public boolean f4223l;
    public IllegalStateException f4224m;
    public final Object f4214a = new Object();
    public final a1 d = new a1();
    public final a1 f4217e = new a1();
    public final ArrayDeque f4218f = new ArrayDeque();
    public final ArrayDeque f4219g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f4215b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f4219g;
        if (!arrayDeque.isEmpty()) {
            this.f4220i = (MediaFormat) arrayDeque.getLast();
        }
        a1 a1Var = this.d;
        a1Var.f2058a = 0;
        a1Var.f2059b = -1;
        a1Var.f2060c = 0;
        a1 a1Var2 = this.f4217e;
        a1Var2.f2058a = 0;
        a1Var2.f2059b = -1;
        a1Var2.f2060c = 0;
        this.f4218f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z4;
        if (this.f4216c == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        HandlerThread handlerThread = this.f4215b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f4216c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f4214a) {
            this.f4224m = illegalStateException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f4214a) {
            this.f4221j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f4214a) {
            this.d.d(i10);
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f4214a) {
            try {
                MediaFormat mediaFormat = this.f4220i;
                if (mediaFormat != null) {
                    this.f4217e.d(-2);
                    this.f4219g.add(mediaFormat);
                    this.f4220i = null;
                }
                this.f4217e.d(i10);
                this.f4218f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f4214a) {
            this.f4217e.d(-2);
            this.f4219g.add(mediaFormat);
            this.f4220i = null;
        }
    }
}
