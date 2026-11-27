package defpackage;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Iterator;
import org.webrtc.EglBase;
import org.webrtc.GlTextureFrameBuffer;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public abstract class rjc implements VideoSink {
    public VideoFrame E;
    public final Object F;
    public float G;
    public boolean H;
    public int I;
    public final GlTextureFrameBuffer J;
    public final qjc K;
    public final qjc L;
    public boolean a;
    public final String b;
    public final Object c;
    public d1 d;
    public final ArrayList e;
    public final Object f;
    public long h;
    public long n;
    public njc r;
    public final nmc s;
    public nkc w;
    public final Matrix x;
    public final Object y;

    public rjc(String str) {
        nmc nmcVar = new nmc();
        this.c = new Object();
        this.e = new ArrayList();
        this.f = new Object();
        this.x = new Matrix();
        this.y = new Object();
        this.F = new Object();
        this.J = new GlTextureFrameBuffer(6408);
        this.K = new qjc(this, false);
        this.L = new qjc(this, true);
        this.b = str;
        this.s = nmcVar;
    }

    public final void a(SurfaceTexture surfaceTexture, boolean z) {
        if (z) {
            this.L.a(surfaceTexture);
            synchronized (this.c) {
                d1 d1Var = this.d;
                if (d1Var != null) {
                    d1Var.post(this.L);
                } else {
                    cc4.b("can't create background surface. render thread is null");
                }
            }
            return;
        }
        this.K.a(surfaceTexture);
        e(this.K);
    }

    public final void b(EglBase.Context context, int[] iArr, nkc nkcVar) {
        synchronized (this.c) {
            if (this.d == null) {
                c("Initializing VoIPEglRenderer");
                this.w = nkcVar;
                this.a = false;
                HandlerThread handlerThread = new HandlerThread(this.b + "VoIPEglRenderer");
                handlerThread.start();
                d1 d1Var = new d1(handlerThread.getLooper(), new pjc((anb) this), (byte) 14);
                this.d = d1Var;
                d1Var.post(new b6c((anb) this, context, iArr, (byte) 14));
                this.d.post(this.K);
            } else {
                throw new IllegalStateException(this.b + "Already initialized");
            }
        }
    }

    public final void c(String str) {
        Logging.d("VoIPEglRenderer", this.b + str);
    }

    public final void d(boolean z) {
        float f;
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            Matrix matrix = this.x;
            matrix.reset();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preRotate(this.I);
            if (this.H) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            matrix.preScale(f, 1.0f);
            matrix.preScale(1.0f, -1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    if (!z) {
                        throw null;
                    }
                    it.remove();
                    throw null;
                }
                grb.o();
            }
        }
    }

    public final void e(Runnable runnable) {
        synchronized (this.c) {
            d1 d1Var = this.d;
            if (d1Var != null) {
                d1Var.post(runnable);
            }
        }
    }

    public final void f(nn3 nn3Var, boolean z) {
        this.K.a(null);
        synchronized (this.c) {
            d1 d1Var = this.d;
            if (d1Var != null) {
                d1Var.removeCallbacks(this.K);
                this.d.postAtFrontOfQueue(new yn6(this, z, nn3Var, (byte) 28));
            } else if (nn3Var != null) {
                nn3Var.run();
            }
        }
    }

    public void g(float f) {
        long j;
        c("setFpsReduction: " + f);
        synchronized (this.f) {
            long j2 = this.n;
            if (f <= 0.0f) {
                j = Long.MAX_VALUE;
                this.n = Long.MAX_VALUE;
            } else {
                j = 1.0E9f / f;
                this.n = j;
            }
            if (j != j2) {
                this.h = System.nanoTime();
            }
        }
    }

    public final void h(boolean z) {
        c("setMirrorHorizontally: " + z);
        synchronized (this.F) {
            this.H = z;
        }
    }

    public final void i(int i) {
        synchronized (this.F) {
            this.I = i;
        }
    }

    @Override
    public void onFrame(VideoFrame videoFrame) {
        synchronized (this.c) {
            if (this.d == null) {
                c("Dropping frame - Not initialized or already released.");
                return;
            }
            synchronized (this.y) {
                VideoFrame videoFrame2 = this.E;
                if (videoFrame2 != null) {
                    videoFrame2.release();
                }
                this.E = videoFrame;
                videoFrame.retain();
                this.d.post(new ojc(this, (byte) 0));
            }
        }
    }
}
