package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class sy implements hm6 {
    public final MediaCodec a;
    public final vy b;
    public final jm6 c;
    public final bi6 d;
    public boolean e;
    public byte f = 0;

    public sy(MediaCodec mediaCodec, HandlerThread handlerThread, jm6 jm6Var, bi6 bi6Var) {
        this.a = mediaCodec;
        this.b = new vy(handlerThread);
        this.c = jm6Var;
        this.d = bi6Var;
    }

    public static String o(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override
    public final void a(int i, z43 z43Var, long j, int i2) {
        this.c.a(i, z43Var, j, i2);
    }

    @Override
    public final void b(int i, int i2, int i3, long j) {
        this.c.b(i, i2, i3, j);
    }

    @Override
    public final void c(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override
    public final void d() {
        this.a.detachOutputSurface();
    }

    @Override
    public final void e(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override
    public final int f() {
        boolean z;
        this.c.d();
        vy vyVar = this.b;
        synchronized (vyVar.a) {
            vyVar.b();
            boolean z2 = false;
            if (vyVar.l <= 0 && !vyVar.m) {
                z = false;
            } else {
                z = true;
            }
            int i = -1;
            if (z) {
                return -1;
            }
            po poVar = vyVar.d;
            int i2 = poVar.b;
            int i3 = poVar.c;
            if (i2 == i3) {
                z2 = true;
            }
            if (!z2) {
                if (i2 != i3) {
                    i = poVar.a[i2];
                    poVar.b = (i2 + 1) & poVar.d;
                } else {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
            return i;
        }
    }

    @Override
    public final void flush() {
        this.c.flush();
        this.a.flush();
        vy vyVar = this.b;
        synchronized (vyVar.a) {
            vyVar.l++;
            Handler handler = vyVar.c;
            String str = hac.a;
            handler.post(new b1(vyVar, (byte) 28));
        }
        this.a.start();
    }

    @Override
    public final boolean g(fk3 fk3Var) {
        vy vyVar = this.b;
        synchronized (vyVar.a) {
            vyVar.o = fk3Var;
        }
        return true;
    }

    @Override
    public final ByteBuffer getInputBuffer(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override
    public final ByteBuffer getOutputBuffer(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        vy vyVar = this.b;
        synchronized (vyVar.a) {
            mediaFormat = vyVar.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        this.c.d();
        vy vyVar = this.b;
        synchronized (vyVar.a) {
            vyVar.b();
            boolean z2 = false;
            if (vyVar.l <= 0 && !vyVar.m) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return -1;
            }
            po poVar = vyVar.e;
            int i = poVar.b;
            int i2 = poVar.c;
            if (i == i2) {
                z2 = true;
            }
            if (z2) {
                return -1;
            }
            if (i != i2) {
                int i3 = poVar.a[i];
                poVar.b = (i + 1) & poVar.d;
                if (i3 >= 0) {
                    vyVar.h.getClass();
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) vyVar.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    vyVar.h = (MediaFormat) vyVar.g.remove();
                }
                return i3;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public final void i(kpb kpbVar) {
        vy vyVar = this.b;
        synchronized (vyVar.a) {
            vyVar.b();
            this.c.d();
            kpbVar.run();
        }
    }

    @Override
    public final void j(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override
    public final void k(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override
    public final void l(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override
    public final void m(xm6 xm6Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new py(this, xm6Var, (byte) 0), handler);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    public final void p(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        boolean z;
        bi6 bi6Var;
        vy vyVar = this.b;
        HandlerThread handlerThread = vyVar.b;
        if (vyVar.c == null) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.a;
        mediaCodec.setCallback(vyVar, handler);
        vyVar.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        this.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (bi6Var = this.d) != null) {
            bi6Var.a(mediaCodec);
        }
        this.f = (byte) 1;
    }

    @Override
    public final void release() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy.release():void");
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.c.setParameters(bundle);
    }
}
