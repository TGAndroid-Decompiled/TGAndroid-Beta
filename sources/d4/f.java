package d4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import c2.b1;
import java.util.ArrayDeque;
public final class f extends MediaCodec.Callback {
    public final HandlerThread f4127b;
    public Handler f4128c;
    public MediaFormat h;
    public MediaFormat f4131i;
    public MediaCodec.CodecException f4132j;
    public long f4133k;
    public boolean f4134l;
    public IllegalStateException f4135m;
    public final Object f4126a = new Object();
    public final b1 d = new b1();
    public final b1 e = new b1();
    public final ArrayDeque f4129f = new ArrayDeque();
    public final ArrayDeque f4130g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f4127b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f4130g;
        if (!arrayDeque.isEmpty()) {
            this.f4131i = (MediaFormat) arrayDeque.getLast();
        }
        b1 b1Var = this.d;
        b1Var.f1928a = 0;
        b1Var.f1929b = -1;
        b1Var.f1930c = 0;
        b1 b1Var2 = this.e;
        b1Var2.f1928a = 0;
        b1Var2.f1929b = -1;
        b1Var2.f1930c = 0;
        this.f4129f.clear();
        arrayDeque.clear();
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z4;
        if (this.f4128c == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        HandlerThread handlerThread = this.f4127b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f4128c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f4126a) {
            this.f4135m = illegalStateException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f4126a) {
            this.f4132j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f4126a) {
            this.d.d(i10);
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f4126a) {
            try {
                MediaFormat mediaFormat = this.f4131i;
                if (mediaFormat != null) {
                    this.e.d(-2);
                    this.f4130g.add(mediaFormat);
                    this.f4131i = null;
                }
                this.e.d(i10);
                this.f4129f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f4126a) {
            this.e.d(-2);
            this.f4130g.add(mediaFormat);
            this.f4131i = null;
        }
    }
}
