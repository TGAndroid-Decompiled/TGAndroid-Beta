package a4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
public final class h extends MediaCodec.Callback {
    public final HandlerThread f79b;
    public Handler f80c;
    public MediaFormat h;
    public MediaFormat f84i;
    public MediaCodec.CodecException f85j;
    public long f86k;
    public boolean f87l;
    public IllegalStateException f88m;
    public final Object f78a = new Object();
    public final k d = new k();
    public final k f81e = new k();
    public final ArrayDeque f82f = new ArrayDeque();
    public final ArrayDeque f83g = new ArrayDeque();

    public h(HandlerThread handlerThread) {
        this.f79b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f83g;
        if (!arrayDeque.isEmpty()) {
            this.f84i = (MediaFormat) arrayDeque.getLast();
        }
        k kVar = this.d;
        kVar.f95a = 0;
        kVar.f96b = -1;
        kVar.f97c = 0;
        k kVar2 = this.f81e;
        kVar2.f95a = 0;
        kVar2.f96b = -1;
        kVar2.f97c = 0;
        this.f82f.clear();
        arrayDeque.clear();
        this.f85j = null;
    }

    public final void b(MediaCodec mediaCodec) {
        boolean z10;
        if (this.f80c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.i(z10);
        HandlerThread handlerThread = this.f79b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f80c = handler;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f78a) {
            this.f88m = illegalStateException;
        }
    }

    @Override
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f78a) {
            this.f85j = codecException;
        }
    }

    @Override
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f78a) {
            this.d.d(i10);
        }
    }

    @Override
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f78a) {
            try {
                MediaFormat mediaFormat = this.f84i;
                if (mediaFormat != null) {
                    this.f81e.d(-2);
                    this.f83g.add(mediaFormat);
                    this.f84i = null;
                }
                this.f81e.d(i10);
                this.f82f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f78a) {
            this.f81e.d(-2);
            this.f83g.add(mediaFormat);
            this.f84i = null;
        }
    }
}
