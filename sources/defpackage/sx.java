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
public final class sx implements jm6 {
    public final MediaCodec a;
    public final vx b;
    public final lm6 c;
    public final fi6 d;
    public boolean e;
    public byte f = 0;

    public sx(MediaCodec mediaCodec, HandlerThread handlerThread, lm6 lm6Var, fi6 fi6Var) {
        this.a = mediaCodec;
        this.b = new vx(handlerThread);
        this.c = lm6Var;
        this.d = fi6Var;
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
    public final void a(int i, g43 g43Var, long j, int i2) {
        this.c.a(i, g43Var, j, i2);
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
    public final boolean d(aj3 aj3Var) {
        vx vxVar = this.b;
        synchronized (vxVar.a) {
            vxVar.o = aj3Var;
        }
        return true;
    }

    @Override
    public final void e() {
        this.a.detachOutputSurface();
    }

    @Override
    public final void f(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override
    public final void flush() {
        this.c.flush();
        this.a.flush();
        vx vxVar = this.b;
        synchronized (vxVar.a) {
            vxVar.l++;
            Handler handler = vxVar.c;
            String str = gcc.a;
            handler.post(new c1(vxVar, (byte) 26));
        }
        this.a.start();
    }

    @Override
    public final int g() {
        boolean z;
        this.c.c();
        vx vxVar = this.b;
        synchronized (vxVar.a) {
            vxVar.b();
            boolean z2 = false;
            if (vxVar.l <= 0 && !vxVar.m) {
                z = false;
            } else {
                z = true;
            }
            int i = -1;
            if (z) {
                return -1;
            }
            pn pnVar = vxVar.d;
            int i2 = pnVar.b;
            int i3 = pnVar.c;
            if (i2 == i3) {
                z2 = true;
            }
            if (!z2) {
                if (i2 != i3) {
                    i = pnVar.a[i2];
                    pnVar.b = (i2 + 1) & pnVar.d;
                } else {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
            return i;
        }
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
        vx vxVar = this.b;
        synchronized (vxVar.a) {
            mediaFormat = vxVar.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override
    public final int h(MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        this.c.c();
        vx vxVar = this.b;
        synchronized (vxVar.a) {
            vxVar.b();
            boolean z2 = false;
            if (vxVar.l <= 0 && !vxVar.m) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return -1;
            }
            pn pnVar = vxVar.e;
            int i = pnVar.b;
            int i2 = pnVar.c;
            if (i == i2) {
                z2 = true;
            }
            if (z2) {
                return -1;
            }
            if (i != i2) {
                int i3 = pnVar.a[i];
                pnVar.b = (i + 1) & pnVar.d;
                if (i3 >= 0) {
                    vxVar.h.getClass();
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) vxVar.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    vxVar.h = (MediaFormat) vxVar.g.remove();
                }
                return i3;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public final void i(jrb jrbVar) {
        vx vxVar = this.b;
        synchronized (vxVar.a) {
            vxVar.b();
            this.c.c();
            jrbVar.run();
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
    public final void m(an6 an6Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new px(this, an6Var, (byte) 0), handler);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    public final void p(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        boolean z;
        fi6 fi6Var;
        vx vxVar = this.b;
        HandlerThread handlerThread = vxVar.b;
        if (vxVar.c == null) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.a;
        mediaCodec.setCallback(vxVar, handler);
        vxVar.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        this.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (fi6Var = this.d) != null) {
            fi6Var.a(mediaCodec);
        }
        this.f = (byte) 1;
    }

    @Override
    public final void release() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx.release():void");
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.c.setParameters(bundle);
    }
}
