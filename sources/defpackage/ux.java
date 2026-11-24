package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
public final class ux extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public MediaCodec.CryptoException k;
    public long l;
    public boolean m;
    public IllegalStateException n;
    public s34 o;
    public final Object a = new Object();
    public final on d = new on();
    public final on e = new on();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public ux(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        on onVar = this.d;
        onVar.c = onVar.b;
        on onVar2 = this.e;
        onVar2.c = onVar2.b;
        this.f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.n;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.j;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.k;
                if (cryptoException == null) {
                    return;
                }
                this.k = null;
                throw cryptoException;
            }
            this.j = null;
            throw codecException;
        }
        this.n = null;
        throw illegalStateException;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.a) {
            this.n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.k = cryptoException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        c64 c64Var;
        synchronized (this.a) {
            this.d.a(i);
            s34 s34Var = this.o;
            if (s34Var != null && (c64Var = ((lk6) s34Var.b).Y) != null) {
                c64Var.a();
            }
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        c64 c64Var;
        synchronized (this.a) {
            MediaFormat mediaFormat = this.i;
            if (mediaFormat != null) {
                this.e.a(-2);
                this.g.add(mediaFormat);
                this.i = null;
            }
            this.e.a(i);
            this.f.add(bufferInfo);
            s34 s34Var = this.o;
            if (s34Var != null && (c64Var = ((lk6) s34Var.b).Y) != null) {
                c64Var.a();
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.e.a(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
