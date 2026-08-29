package a4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import f5.d0;
import java.nio.ByteBuffer;
public final class c implements n {
    public final MediaCodec f57a;
    public final h f58b;
    public final f f59c;
    public boolean d;
    public int f60e = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.f57a = mediaCodec;
        this.f58b = new h(handlerThread);
        this.f59c = new f(mediaCodec, handlerThread2);
    }

    public static void i(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        h hVar = cVar.f58b;
        MediaCodec mediaCodec = cVar.f57a;
        hVar.b(mediaCodec);
        f5.a.c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        f5.a.q();
        f fVar = cVar.f59c;
        HandlerThread handlerThread = fVar.f72b;
        if (!fVar.f75f) {
            handlerThread.start();
            fVar.f73c = new d(fVar, handlerThread.getLooper());
            fVar.f75f = true;
        }
        f5.a.c("startCodec");
        mediaCodec.start();
        f5.a.q();
        cVar.f60e = 1;
    }

    public static String j(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override
    public final void a(g5.i iVar, Handler handler) {
        this.f57a.setOnFrameRenderedListener(new a(this, iVar, 0), handler);
    }

    @Override
    public final void b(int i10, m3.d dVar, long j10) {
        this.f59c.c(i10, dVar, j10);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12) {
        f fVar = this.f59c;
        RuntimeException runtimeException = (RuntimeException) fVar.d.getAndSet(null);
        if (runtimeException == null) {
            e b10 = f.b();
            b10.f66a = i10;
            b10.f67b = i11;
            b10.d = j10;
            b10.f69e = i12;
            d dVar = fVar.f73c;
            int i13 = d0.f6579a;
            dVar.obtainMessage(0, b10).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    @Override
    public final void d(int i10, long j10) {
        this.f57a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final int e() {
        throw new UnsupportedOperationException("Method not decompiled: a4.c.e():int");
    }

    @Override
    public final int f(android.media.MediaCodec.BufferInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: a4.c.f(android.media.MediaCodec$BufferInfo):int");
    }

    @Override
    public final void flush() {
        this.f59c.a();
        this.f57a.flush();
        h hVar = this.f58b;
        synchronized (hVar.f78a) {
            hVar.f86k++;
            Handler handler = hVar.f80c;
            int i10 = d0.f6579a;
            handler.post(new g(hVar, 0));
        }
        this.f57a.start();
    }

    @Override
    public final void g(int i10) {
        this.f57a.setVideoScalingMode(i10);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f57a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f57a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        h hVar = this.f58b;
        synchronized (hVar.f78a) {
            try {
                mediaFormat = hVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override
    public final void h(Surface surface) {
        this.f57a.setOutputSurface(surface);
    }

    @Override
    public final void release() {
        try {
            if (this.f60e == 1) {
                f fVar = this.f59c;
                if (fVar.f75f) {
                    fVar.a();
                    fVar.f72b.quit();
                }
                fVar.f75f = false;
                h hVar = this.f58b;
                synchronized (hVar.f78a) {
                    hVar.f87l = true;
                    hVar.f79b.quit();
                    hVar.a();
                }
            }
            this.f60e = 2;
            if (!this.d) {
                this.f57a.release();
                this.d = true;
            }
        } catch (Throwable th2) {
            if (!this.d) {
                this.f57a.release();
                this.d = true;
            }
            throw th2;
        }
    }

    @Override
    public final void releaseOutputBuffer(int i10, boolean z10) {
        this.f57a.releaseOutputBuffer(i10, z10);
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f57a.setParameters(bundle);
    }
}
