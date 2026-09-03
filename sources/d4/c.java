package d4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import h5.d0;
import java.nio.ByteBuffer;
public final class c implements k {
    public final MediaCodec f4115a;
    public final f f4116b;
    public final e f4117c;
    public boolean d;
    public int e = 0;

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.f4115a = mediaCodec;
        this.f4116b = new f(handlerThread);
        this.f4117c = new e(mediaCodec, handlerThread2);
    }

    public static void i(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        f fVar = cVar.f4116b;
        MediaCodec mediaCodec = cVar.f4115a;
        fVar.b(mediaCodec);
        h5.a.c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        h5.a.q();
        e eVar = cVar.f4117c;
        HandlerThread handlerThread = eVar.f4123b;
        if (!eVar.f4125f) {
            handlerThread.start();
            eVar.f4124c = new androidx.mediarouter.app.d(eVar, handlerThread.getLooper(), 5);
            eVar.f4125f = true;
        }
        h5.a.c("startCodec");
        mediaCodec.start();
        h5.a.q();
        cVar.e = 1;
    }

    public static String j(int i10, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i10 == 1) {
            sb.append("Audio");
        } else if (i10 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i10);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override
    public final void a(long j10, int i10, int i11, int i12) {
        e eVar = this.f4117c;
        RuntimeException runtimeException = (RuntimeException) eVar.d.getAndSet(null);
        if (runtimeException == null) {
            d b10 = e.b();
            b10.f4118a = i10;
            b10.f4119b = i11;
            b10.d = j10;
            b10.e = i12;
            androidx.mediarouter.app.d dVar = eVar.f4124c;
            int i13 = d0.f6924a;
            dVar.obtainMessage(0, b10).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    @Override
    public final void b(int i10, long j10) {
        this.f4115a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public final void c(int i10, n3.d dVar, long j10) {
        this.f4117c.c(i10, dVar, j10);
    }

    @Override
    public final int d() {
        throw new UnsupportedOperationException("Method not decompiled: d4.c.d():int");
    }

    @Override
    public final void e(i5.i iVar, Handler handler) {
        this.f4115a.setOnFrameRenderedListener(new a(this, iVar, 0), handler);
    }

    @Override
    public final int f(android.media.MediaCodec.BufferInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: d4.c.f(android.media.MediaCodec$BufferInfo):int");
    }

    @Override
    public final void flush() {
        this.f4117c.a();
        this.f4115a.flush();
        f fVar = this.f4116b;
        synchronized (fVar.f4126a) {
            fVar.f4133k++;
            Handler handler = fVar.f4128c;
            int i10 = d0.f6924a;
            handler.post(new ag.d(fVar, 20));
        }
        this.f4115a.start();
    }

    @Override
    public final void g(int i10) {
        this.f4115a.setVideoScalingMode(i10);
    }

    @Override
    public final ByteBuffer getInputBuffer(int i10) {
        return this.f4115a.getInputBuffer(i10);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i10) {
        return this.f4115a.getOutputBuffer(i10);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        f fVar = this.f4116b;
        synchronized (fVar.f4126a) {
            try {
                mediaFormat = fVar.h;
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
        this.f4115a.setOutputSurface(surface);
    }

    @Override
    public final void release() {
        try {
            if (this.e == 1) {
                e eVar = this.f4117c;
                if (eVar.f4125f) {
                    eVar.a();
                    eVar.f4123b.quit();
                }
                eVar.f4125f = false;
                f fVar = this.f4116b;
                synchronized (fVar.f4126a) {
                    fVar.f4134l = true;
                    fVar.f4127b.quit();
                    fVar.a();
                }
            }
            this.e = 2;
            if (!this.d) {
                this.f4115a.release();
                this.d = true;
            }
        } catch (Throwable th2) {
            if (!this.d) {
                this.f4115a.release();
                this.d = true;
            }
            throw th2;
        }
    }

    @Override
    public final void releaseOutputBuffer(int i10, boolean z4) {
        this.f4115a.releaseOutputBuffer(i10, z4);
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.f4115a.setParameters(bundle);
    }
}
