package lg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import kg.g2;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.tz;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.gr;
public class q extends TextureView implements TextureView.SurfaceTextureListener, k6 {
    public volatile int D;
    public int E;
    public int F;
    public volatile boolean G;
    public volatile boolean H;
    public boolean I;
    public volatile p J;
    public final int K;
    public final long L;
    public boolean M;
    public final int N;
    public int O;
    public final ArrayList P;
    public boolean Q;
    public g2 R;
    public final int S;
    public volatile boolean T;
    public final int[] U;
    public final int[] V;
    public volatile boolean W;
    public boolean f11917a;
    public volatile Runnable f11918a0;
    public h f11919b;
    public final GestureDetector f11920b0;
    public SurfaceTexture f11921c;
    public ValueAnimator f11922c0;
    public final Object d;
    public AnimatorSet f11923d0;
    public h e;
    public final m f11924e0;
    public EGLDisplay f11925f;
    public final i f11926f0;
    public final i f11927g0;
    public EGLSurface h;
    public final i f11928h0;
    public EGLContext f11929n;
    public EGL10 f11930r;
    public EGLConfig f11931s;
    public GL10 f11932w;
    public long f11933x;
    public volatile int f11934y;

    public q(Context context, int i10, int i11) {
        super(context);
        int i12;
        long j10;
        this.d = new Object();
        this.G = true;
        int i13 = 0;
        this.H = false;
        this.I = false;
        this.M = true;
        this.P = new ArrayList();
        this.U = new int[1];
        this.V = new int[1];
        this.f11923d0 = new AnimatorSet();
        this.f11924e0 = new m(this, 0);
        this.f11926f0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final q f11899b;

            {
                this.f11899b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f11899b.f11919b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f11899b.f11919b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f11899b.f11919b.f11881i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f11927g0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final q f11899b;

            {
                this.f11899b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f11899b.f11919b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f11899b.f11919b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f11899b.f11919b.f11881i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.f11928h0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final q f11899b;

            {
                this.f11899b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f11899b.f11919b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f11899b.f11919b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f11899b.f11919b.f11881i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.S = i11;
        if (i11 != 1 && i11 != 4 && i11 != 3) {
            i12 = 5;
        } else {
            i12 = 1;
        }
        this.N = i12;
        if (i11 == 4) {
            j10 = 0;
        } else {
            j10 = 2000;
        }
        this.L = j10;
        setOpaque(false);
        setRenderer(new h(context, i10, i11));
        this.K = (int) i0.f16027r;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new l(this, i11));
        this.f11920b0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i13 < this.N) {
            i13 = c3.i0.j(i13, i13, 1, this.P);
        }
        Collections.shuffle(this.P);
    }

    public static void a(q qVar, float f7) {
        int i10;
        synchronized (qVar) {
            try {
                qVar.e();
                if (qVar.f11919b != null) {
                    int i11 = qVar.D;
                    int i12 = qVar.f11934y;
                    if (qVar.T) {
                        qVar.f11930r.eglQuerySurface(qVar.f11925f, qVar.h, 12375, qVar.U);
                        qVar.f11930r.eglQuerySurface(qVar.f11925f, qVar.h, 12374, qVar.V);
                        int i13 = qVar.U[0];
                        if (i13 > 0 && (i10 = qVar.V[0]) > 0 && (i13 != i11 || i10 != i12)) {
                            qVar.f11921c.setDefaultBufferSize(i11, i12);
                            i11 = qVar.U[0];
                            i12 = qVar.V[0];
                        }
                    }
                    if (i11 != qVar.E || i12 != qVar.F) {
                        qVar.E = i11;
                        qVar.F = i12;
                        qVar.f11919b.onSurfaceChanged(qVar.f11932w, i11, i12);
                    }
                    h hVar = qVar.f11919b;
                    hVar.G = f7;
                    hVar.onDrawFrame(qVar.f11932w);
                }
                qVar.g();
                if (!qVar.f11930r.eglSwapBuffers(qVar.f11925f, qVar.h) && qVar.S == 4) {
                    throw new IllegalStateException("Diamond buffer swap failed: " + qVar.f11930r.eglGetError());
                }
            } finally {
            }
        }
    }

    public static void b(lg.q r6) {
        throw new UnsupportedOperationException("Method not decompiled: lg.q.b(lg.q):void");
    }

    public static void c(q qVar, h hVar) {
        synchronized (qVar) {
            if (hVar != null) {
                qVar.e = hVar;
                hVar.onSurfaceCreated(qVar.f11932w, qVar.f11931s);
                qVar.E = qVar.D;
                int i10 = qVar.f11934y;
                qVar.F = i10;
                hVar.onSurfaceChanged(qVar.f11932w, qVar.E, i10);
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f11922c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f11922c0.cancel();
            this.f11922c0 = null;
        }
        AnimatorSet animatorSet = this.f11923d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f11923d0.cancel();
            this.f11923d0 = null;
        }
    }

    public final void e() {
        if (this.f11929n.equals(this.f11930r.eglGetCurrentContext()) && this.h.equals(this.f11930r.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.f11930r;
        EGLDisplay eGLDisplay = this.f11925f;
        EGLSurface eGLSurface = this.h;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f11929n)) {
            f();
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.f11930r.eglGetError()));
    }

    public final void f() {
        if (this.f11930r.eglGetError() != 12288) {
            f8.d("cannot swap buffers!");
        }
    }

    public final void g() {
        int glGetError = this.f11932w.glGetError();
        if (glGetError != 0 && this.S == 4) {
            throw new IllegalStateException("Diamond GL error: 0x" + Integer.toHexString(glGetError));
        }
    }

    public int getMaxFrameRate() {
        if (this.S == 4) {
            if (tz.o() == 2) {
                return 60;
            }
            return 30;
        }
        return this.K;
    }

    public int getMsaaSamples() {
        return 4;
    }

    public float getRenderScale() {
        return 1.0f;
    }

    public final void j(long j10) {
        m mVar = this.f11924e0;
        i0.r(mVar);
        if (!this.I && this.M) {
            i0.h3(mVar, j10);
        }
    }

    public final void k(SurfaceTexture surfaceTexture, int i10, int i11) {
        boolean z10;
        float renderScale = getRenderScale();
        int i12 = (renderScale > 1.0f ? 1 : (renderScale == 1.0f ? 0 : -1));
        if (i12 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.T = z10;
        if (i12 < 0 && i10 > 0 && i11 > 0) {
            i10 = Math.max(1, Math.round(i10 * renderScale));
            i11 = Math.max(1, Math.round(i11 * renderScale));
            surfaceTexture.setDefaultBufferSize(i10, i11);
        }
        this.D = i10;
        this.f11934y = i11;
    }

    public final void l() {
        d();
        h hVar = this.f11919b;
        float f7 = hVar.d;
        float f10 = hVar.f11881i;
        float f11 = hVar.e;
        float f12 = f7 + f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f11922c0 = ofFloat;
        ofFloat.addUpdateListener(new j(this, f7, f11, f10, 0));
        this.f11922c0.setDuration(600L);
        this.f11922c0.setInterpolator(new OvershootInterpolator());
        this.f11922c0.start();
        g2 g2Var = this.R;
        if (g2Var != null) {
            g2Var.b(Math.abs(f12));
        }
        j(this.L);
    }

    public final void m(long j10) {
        h hVar = this.f11919b;
        if (hVar != null) {
            hVar.d = -180.0f;
            i0.h3(new m(this, 1), j10);
        }
    }

    public void n() {
        int i10;
        if (this.Q && this.M) {
            int i11 = this.O;
            ArrayList arrayList = this.P;
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            int i12 = this.O + 1;
            this.O = i12;
            if (i12 >= arrayList.size()) {
                Collections.shuffle(arrayList);
                this.O = 0;
            }
            i iVar = this.f11928h0;
            i iVar2 = this.f11927g0;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.f14519b.nextInt() % 4);
                this.f11923d0 = new AnimatorSet();
                int i13 = this.S;
                if (i13 == 4) {
                    float f7 = this.f11919b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 360.0f + f7);
                    ofFloat.addUpdateListener(iVar2);
                    ofFloat.setDuration(12000L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    this.f11923d0.playTogether(ofFloat);
                } else if (abs == 0 && i13 != 1 && i13 != 3) {
                    float f10 = 48;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f11919b.f11881i, f10);
                    ofFloat2.addUpdateListener(iVar);
                    ofFloat2.setDuration(2300L);
                    ofFloat2.setInterpolator(gr.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f10, 0.0f);
                    ofFloat3.addUpdateListener(iVar);
                    ofFloat3.setDuration(500L);
                    ofFloat3.setStartDelay(2300L);
                    ofFloat3.setInterpolator(i0.H);
                    this.f11923d0.playTogether(ofFloat2, ofFloat3);
                } else {
                    if (i13 != 1 && i13 != 3) {
                        i10 = 485;
                    } else {
                        i10 = 360;
                    }
                    if (abs == 2) {
                        i10 = -i10;
                    }
                    float f11 = i10;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.f11919b.f11881i, f11);
                    ofFloat4.addUpdateListener(iVar2);
                    ofFloat4.setDuration(3000L);
                    ofFloat4.setInterpolator(gr.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f11, 0.0f);
                    ofFloat5.addUpdateListener(iVar2);
                    ofFloat5.setDuration(1000L);
                    ofFloat5.setStartDelay(3000L);
                    ofFloat5.setInterpolator(i0.H);
                    this.f11923d0.playTogether(ofFloat4, ofFloat5);
                }
                this.f11923d0.addListener(new n(this, 1));
                this.f11923d0.start();
            } else if (intValue == 1) {
                this.f11923d0 = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.f11919b.d, 360.0f);
                ofFloat6.addUpdateListener(iVar2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(gr.f26495f);
                this.f11923d0.playTogether(ofFloat6);
                this.f11923d0.addListener(new n(this, 0));
                this.f11923d0.start();
            } else if (intValue == 2) {
                this.f11923d0 = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.f11919b.d, 184.0f);
                ofFloat7.addUpdateListener(iVar2);
                ofFloat7.setDuration(600L);
                gr grVar = gr.f26496g;
                ofFloat7.setInterpolator(grVar);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(this.f11919b.f11881i, 50.0f);
                ofFloat8.addUpdateListener(iVar);
                ofFloat8.setDuration(600L);
                ofFloat8.setInterpolator(grVar);
                ValueAnimator ofFloat9 = ValueAnimator.ofFloat(180.0f, 0.0f);
                ofFloat9.addUpdateListener(iVar2);
                ofFloat9.setDuration(800L);
                ofFloat9.setStartDelay(10000L);
                OvershootInterpolator overshootInterpolator = i0.H;
                ofFloat9.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat10 = ValueAnimator.ofFloat(60.0f, 0.0f);
                ofFloat10.addUpdateListener(iVar);
                ofFloat10.setDuration(800L);
                ofFloat10.setStartDelay(10000L);
                ofFloat10.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat11 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
                ofFloat11.addUpdateListener(this.f11926f0);
                ofFloat11.setDuration(10000L);
                ofFloat11.setInterpolator(new LinearInterpolator());
                this.f11923d0.playTogether(ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11);
                this.f11923d0.addListener(new n(this, 3));
                this.f11923d0.start();
            } else {
                this.f11923d0 = new AnimatorSet();
                ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f11919b.d, 180.0f);
                ofFloat12.addUpdateListener(iVar2);
                ofFloat12.setDuration(600L);
                gr grVar2 = gr.f26495f;
                ofFloat12.setInterpolator(grVar2);
                ValueAnimator ofFloat13 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat13.addUpdateListener(iVar2);
                ofFloat13.setDuration(600L);
                ofFloat13.setStartDelay(2000L);
                ofFloat13.setInterpolator(grVar2);
                this.f11923d0.playTogether(ofFloat12, ofFloat13);
                this.f11923d0.addListener(new n(this, 2));
                this.f11923d0.start();
            }
        }
    }

    public final void o() {
        p pVar = this.J;
        this.J = null;
        this.W = false;
        if (pVar != null) {
            pVar.f11915b = true;
            pVar.interrupt();
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
        this.H = true;
        j(this.L);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        h hVar = this.f11919b;
        if (hVar != null) {
            hVar.d = 0.0f;
            hVar.f11881i = 0.0f;
            hVar.e = 0.0f;
        }
        this.Q = false;
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        o();
        this.W = false;
        this.J = new p(this, surfaceTexture);
        k(surfaceTexture, i10, i11);
        this.f11933x = 1000000000 / Math.max(1, Math.min(this.K, getMaxFrameRate()));
        this.J.start();
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.W = false;
        o();
        return true;
    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        k(surfaceTexture, i10, i11);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f11917a = false;
            l();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.f11920b0.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        h hVar = this.f11919b;
        r rVar = hVar.f11878c;
        if (rVar != null && rVar.f11938a == null) {
            rVar.Z = bitmap;
        }
        hVar.f11890r = bitmap;
    }

    public void setDialogVisible(boolean z10) {
        this.I = z10;
        if (z10) {
            i0.r(this.f11924e0);
            l();
            return;
        }
        j(this.L);
    }

    public void setIdleAnimationEnabled(boolean z10) {
        this.M = z10;
        if (z10) {
            j(this.L);
            return;
        }
        i0.r(this.f11924e0);
        d();
    }

    public void setPaused(boolean z10) {
        boolean z11 = this.G;
        this.G = z10;
        if (z11 && !z10 && this.J != null) {
            this.J.interrupt();
        }
    }

    public synchronized void setRenderer(h hVar) {
        this.f11919b = hVar;
        this.H = true;
    }

    public void setStarParticlesView(g2 g2Var) {
        this.R = g2Var;
    }

    @Override
    public final void updateColors() {
        try {
            h hVar = this.f11919b;
            if (hVar != null) {
                hVar.b();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void h() {
    }

    public void i() {
    }
}
