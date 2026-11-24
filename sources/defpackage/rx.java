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
public final class rx implements ek6 {
    public final MediaCodec a;
    public final ux b;
    public final gk6 c;
    public final bg6 d;
    public boolean e;
    public byte f = 0;

    public rx(MediaCodec mediaCodec, HandlerThread handlerThread, gk6 gk6Var, bg6 bg6Var) {
        this.a = mediaCodec;
        this.b = new ux(handlerThread);
        this.c = gk6Var;
        this.d = bg6Var;
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
    public final void a(int i, o33 o33Var, long j, int i2) {
        this.c.a(i, o33Var, j, i2);
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
    public final boolean d(s34 s34Var) {
        ux uxVar = this.b;
        synchronized (uxVar.a) {
            uxVar.o = s34Var;
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
        ux uxVar = this.b;
        synchronized (uxVar.a) {
            uxVar.l++;
            Handler handler = uxVar.c;
            String str = g8c.a;
            handler.post(new b1(uxVar, (byte) 26));
        }
        this.a.start();
    }

    @Override
    public final int g() {
        boolean z;
        this.c.c();
        ux uxVar = this.b;
        synchronized (uxVar.a) {
            uxVar.b();
            boolean z2 = false;
            if (uxVar.l <= 0 && !uxVar.m) {
                z = false;
            } else {
                z = true;
            }
            int i = -1;
            if (z) {
                return -1;
            }
            on onVar = uxVar.d;
            int i2 = onVar.b;
            int i3 = onVar.c;
            if (i2 == i3) {
                z2 = true;
            }
            if (!z2) {
                if (i2 != i3) {
                    i = onVar.a[i2];
                    onVar.b = (i2 + 1) & onVar.d;
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
        ux uxVar = this.b;
        synchronized (uxVar.a) {
            mediaFormat = uxVar.h;
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
        ux uxVar = this.b;
        synchronized (uxVar.a) {
            uxVar.b();
            boolean z2 = false;
            if (uxVar.l <= 0 && !uxVar.m) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return -1;
            }
            on onVar = uxVar.e;
            int i = onVar.b;
            int i2 = onVar.c;
            if (i == i2) {
                z2 = true;
            }
            if (z2) {
                return -1;
            }
            if (i != i2) {
                int i3 = onVar.a[i];
                onVar.b = (i + 1) & onVar.d;
                if (i3 >= 0) {
                    uxVar.h.getClass();
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) uxVar.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    uxVar.h = (MediaFormat) uxVar.g.remove();
                }
                return i3;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public final void i(jnb jnbVar) {
        ux uxVar = this.b;
        synchronized (uxVar.a) {
            uxVar.b();
            this.c.c();
            jnbVar.run();
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
    public final void m(uk6 uk6Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new ox(this, uk6Var, (byte) 0), handler);
    }

    @Override
    public final void n(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    public final void p(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        boolean z;
        bg6 bg6Var;
        ux uxVar = this.b;
        HandlerThread handlerThread = uxVar.b;
        if (uxVar.c == null) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.a;
        mediaCodec.setCallback(uxVar, handler);
        uxVar.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        this.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (bg6Var = this.d) != null) {
            bg6Var.a(mediaCodec);
        }
        this.f = (byte) 1;
    }

    @Override
    public final void release() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx.release():void");
    }

    @Override
    public final void setParameters(Bundle bundle) {
        this.c.setParameters(bundle);
    }
}
