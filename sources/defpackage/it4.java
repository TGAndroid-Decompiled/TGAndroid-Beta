package defpackage;

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
import org.telegram.messenger.Utilities;
public class it4 extends TextureView implements TextureView.SurfaceTextureListener, snb {
    public volatile int E;
    public int F;
    public int G;
    public volatile boolean H;
    public volatile boolean I;
    public boolean J;
    public volatile ht4 K;
    public final int L;
    public final short M;
    public boolean N;
    public final byte O;
    public int P;
    public final ArrayList Q;
    public boolean R;
    public eva S;
    public final byte T;
    public volatile boolean U;
    public final int[] V;
    public final int[] W;
    public boolean a;
    public volatile boolean a0;
    public ys4 b;
    public volatile Runnable b0;
    public SurfaceTexture c;
    public final GestureDetector c0;
    public final Object d;
    public ValueAnimator d0;
    public ys4 e;
    public AnimatorSet e0;
    public EGLDisplay f;
    public final et4 f0;
    public final at4 g0;
    public EGLSurface h;
    public final at4 h0;
    public final at4 i0;
    public EGLContext n;
    public EGL10 r;
    public EGLConfig s;
    public GL10 w;
    public long x;
    public volatile int y;

    public it4(Context context, int i, int i2) {
        super(context);
        byte b;
        long j;
        this.d = new Object();
        this.H = true;
        int i3 = 0;
        this.I = false;
        this.J = false;
        this.N = true;
        this.Q = new ArrayList();
        this.V = new int[1];
        this.W = new int[1];
        this.e0 = new AnimatorSet();
        this.f0 = new et4(this, (byte) 0);
        this.g0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final it4 b;

            {
                this.b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b2 = r2;
                it4 it4Var = this.b;
                switch (b2) {
                    case 0:
                        it4Var.b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        it4Var.b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        it4Var.b.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.h0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final it4 b;

            {
                this.b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b2 = r2;
                it4 it4Var = this.b;
                switch (b2) {
                    case 0:
                        it4Var.b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        it4Var.b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        it4Var.b.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.i0 = new ValueAnimator.AnimatorUpdateListener(this) {
            public final it4 b;

            {
                this.b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                byte b2 = r2;
                it4 it4Var = this.b;
                switch (b2) {
                    case 0:
                        it4Var.b.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        it4Var.b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        it4Var.b.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.T = i2;
        if (i2 != 1 && i2 != 4 && i2 != 3) {
            b = 5;
        } else {
            b = 1;
        }
        this.O = b;
        if (i2 == 4) {
            j = 0;
        } else {
            j = 2000;
        }
        this.M = (int) j;
        setOpaque(false);
        setRenderer(new ys4(context, i, i2));
        this.L = (int) hl.r;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new dt4(this, i2));
        this.c0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (true) {
            byte b2 = this.O;
            ArrayList arrayList = this.Q;
            if (i3 < b2) {
                i3 = qd4.g(i3, i3, 1, arrayList);
            } else {
                Collections.shuffle(arrayList);
                return;
            }
        }
    }

    public final void a() {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.d0.cancel();
            this.d0 = null;
        }
        AnimatorSet animatorSet = this.e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.e0.cancel();
            this.e0 = null;
        }
    }

    public final void b() {
        if (this.n.equals(this.r.eglGetCurrentContext()) && this.h.equals(this.r.eglGetCurrentSurface(12377))) {
            return;
        }
        c();
        EGL10 egl10 = this.r;
        EGLDisplay eGLDisplay = this.f;
        EGLSurface eGLSurface = this.h;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.n)) {
            c();
        } else {
            grb.p(GLUtils.getEGLErrorString(this.r.eglGetError()), "eglMakeCurrent failed ");
        }
    }

    public final void c() {
        if (this.r.eglGetError() != 12288) {
            cc4.d("cannot swap buffers!");
        }
    }

    public final void d() {
        int glGetError = this.w.glGetError();
        if (glGetError != 0 && this.T == 4) {
            lq5.o(Integer.toHexString(glGetError), "Diamond GL error: 0x");
        }
    }

    public final synchronized void e(float f) {
        int i;
        b();
        if (this.b != null) {
            int i2 = this.E;
            int i3 = this.y;
            if (this.U) {
                this.r.eglQuerySurface(this.f, this.h, 12375, this.V);
                this.r.eglQuerySurface(this.f, this.h, 12374, this.W);
                int i4 = this.V[0];
                if (i4 > 0 && (i = this.W[0]) > 0 && (i4 != i2 || i != i3)) {
                    this.c.setDefaultBufferSize(i2, i3);
                    i2 = this.V[0];
                    i3 = this.W[0];
                }
            }
            if (i2 != this.F || i3 != this.G) {
                this.F = i2;
                this.G = i3;
                this.b.onSurfaceChanged(this.w, i2, i3);
            }
            ys4 ys4Var = this.b;
            ys4Var.G = f;
            ys4Var.onDrawFrame(this.w);
        }
        d();
        if (!this.r.eglSwapBuffers(this.f, this.h) && this.T == 4) {
            throw new IllegalStateException("Diamond buffer swap failed: " + this.r.eglGetError());
        }
    }

    public final synchronized void f(ys4 ys4Var) {
        if (ys4Var != null) {
            this.e = ys4Var;
            ys4Var.onSurfaceCreated(this.w, this.s);
            this.F = this.E;
            int i = this.y;
            this.G = i;
            ys4Var.onSurfaceChanged(this.w, this.F, i);
        }
    }

    public int getMaxFrameRate() {
        if (this.T == 4) {
            if (xea.o() == 2) {
                return 60;
            }
            return 30;
        }
        return this.L;
    }

    public int getMsaaSamples() {
        return 4;
    }

    public float getRenderScale() {
        return 1.0f;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it4.i():void");
    }

    public final void j(long j) {
        et4 et4Var = this.f0;
        hl.r(et4Var);
        if (!this.J && this.N) {
            hl.d3(et4Var, j);
        }
    }

    public final void k(SurfaceTexture surfaceTexture, int i, int i2) {
        boolean z;
        float renderScale = getRenderScale();
        int i3 = (renderScale > 1.0f ? 1 : (renderScale == 1.0f ? 0 : -1));
        if (i3 < 0) {
            z = true;
        } else {
            z = false;
        }
        this.U = z;
        if (i3 < 0 && i > 0 && i2 > 0) {
            i = Math.max(1, Math.round(i * renderScale));
            i2 = Math.max(1, Math.round(i2 * renderScale));
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        this.E = i;
        this.y = i2;
    }

    public final void l() {
        a();
        ys4 ys4Var = this.b;
        float f = ys4Var.d;
        float f2 = ys4Var.i;
        float f3 = ys4Var.e;
        float f4 = f + f2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.d0 = ofFloat;
        ofFloat.addUpdateListener(new bt4(this, f, f3, f2, (byte) 0));
        this.d0.setDuration(600L);
        this.d0.setInterpolator(new OvershootInterpolator());
        this.d0.start();
        eva evaVar = this.S;
        if (evaVar != null) {
            evaVar.b(Math.abs(f4));
        }
        j(this.M);
    }

    public final void m(long j) {
        ys4 ys4Var = this.b;
        if (ys4Var != null) {
            ys4Var.d = -180.0f;
            hl.d3(new et4(this, (byte) 1), j);
        }
    }

    public void n() {
        int i;
        if (this.R && this.N) {
            int i2 = this.P;
            ArrayList arrayList = this.Q;
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            int i3 = this.P + 1;
            this.P = i3;
            if (i3 >= arrayList.size()) {
                Collections.shuffle(arrayList);
                this.P = 0;
            }
            at4 at4Var = this.i0;
            at4 at4Var2 = this.h0;
            if (intValue == 0) {
                int abs = Math.abs(Utilities.b.nextInt() % 4);
                this.e0 = new AnimatorSet();
                byte b = this.T;
                if (b == 4) {
                    float f = this.b.d;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 360.0f + f);
                    ofFloat.addUpdateListener(at4Var2);
                    ofFloat.setDuration(12000L);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    this.e0.playTogether(ofFloat);
                } else if (abs == 0 && b != 1 && b != 3) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.b.i, 48.0f);
                    ofFloat2.addUpdateListener(at4Var);
                    ofFloat2.setDuration(2300L);
                    ofFloat2.setInterpolator(k43.h);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(48.0f, 0.0f);
                    ofFloat3.addUpdateListener(at4Var);
                    ofFloat3.setDuration(500L);
                    ofFloat3.setStartDelay(2300L);
                    ofFloat3.setInterpolator(hl.H);
                    this.e0.playTogether(ofFloat2, ofFloat3);
                } else {
                    if (b != 1 && b != 3) {
                        i = 485;
                    } else {
                        i = 360;
                    }
                    if (abs == 2) {
                        i = -i;
                    }
                    float f2 = i;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.b.i, f2);
                    ofFloat4.addUpdateListener(at4Var2);
                    ofFloat4.setDuration(3000L);
                    ofFloat4.setInterpolator(k43.h);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f2, 0.0f);
                    ofFloat5.addUpdateListener(at4Var2);
                    ofFloat5.setDuration(1000L);
                    ofFloat5.setStartDelay(3000L);
                    ofFloat5.setInterpolator(hl.H);
                    this.e0.playTogether(ofFloat4, ofFloat5);
                }
                this.e0.addListener(new ft4(this, (byte) 1));
                this.e0.start();
            } else if (intValue == 1) {
                this.e0 = new AnimatorSet();
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.b.d, 360.0f);
                ofFloat6.addUpdateListener(at4Var2);
                ofFloat6.setDuration(8000L);
                ofFloat6.setInterpolator(k43.f);
                this.e0.playTogether(ofFloat6);
                this.e0.addListener(new ft4(this, (byte) 0));
                this.e0.start();
            } else if (intValue == 2) {
                this.e0 = new AnimatorSet();
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.b.d, 184.0f);
                ofFloat7.addUpdateListener(at4Var2);
                ofFloat7.setDuration(600L);
                k43 k43Var = k43.g;
                ofFloat7.setInterpolator(k43Var);
                ValueAnimator ofFloat8 = ValueAnimator.ofFloat(this.b.i, 50.0f);
                ofFloat8.addUpdateListener(at4Var);
                ofFloat8.setDuration(600L);
                ofFloat8.setInterpolator(k43Var);
                ValueAnimator ofFloat9 = ValueAnimator.ofFloat(180.0f, 0.0f);
                ofFloat9.addUpdateListener(at4Var2);
                ofFloat9.setDuration(800L);
                ofFloat9.setStartDelay(10000L);
                OvershootInterpolator overshootInterpolator = hl.H;
                ofFloat9.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat10 = ValueAnimator.ofFloat(60.0f, 0.0f);
                ofFloat10.addUpdateListener(at4Var);
                ofFloat10.setDuration(800L);
                ofFloat10.setStartDelay(10000L);
                ofFloat10.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat11 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
                ofFloat11.addUpdateListener(this.g0);
                ofFloat11.setDuration(10000L);
                ofFloat11.setInterpolator(new LinearInterpolator());
                this.e0.playTogether(ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11);
                this.e0.addListener(new ft4(this, (byte) 3));
                this.e0.start();
            } else {
                this.e0 = new AnimatorSet();
                ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.b.d, 180.0f);
                ofFloat12.addUpdateListener(at4Var2);
                ofFloat12.setDuration(600L);
                k43 k43Var2 = k43.f;
                ofFloat12.setInterpolator(k43Var2);
                ValueAnimator ofFloat13 = ValueAnimator.ofFloat(180.0f, 360.0f);
                ofFloat13.addUpdateListener(at4Var2);
                ofFloat13.setDuration(600L);
                ofFloat13.setStartDelay(2000L);
                ofFloat13.setInterpolator(k43Var2);
                this.e0.playTogether(ofFloat12, ofFloat13);
                this.e0.addListener(new ft4(this, (byte) 2));
                this.e0.start();
            }
        }
    }

    public final void o() {
        ht4 ht4Var = this.K;
        this.K = null;
        this.a0 = false;
        if (ht4Var != null) {
            ht4Var.b = true;
            ht4Var.interrupt();
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
        this.I = true;
        j(this.M);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        ys4 ys4Var = this.b;
        if (ys4Var != null) {
            ys4Var.d = 0.0f;
            ys4Var.i = 0.0f;
            ys4Var.e = 0.0f;
        }
        this.R = false;
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        o();
        this.a0 = false;
        this.K = new ht4(this, surfaceTexture);
        k(surfaceTexture, i, i2);
        this.x = 1000000000 / Math.max(1, Math.min(this.L, getMaxFrameRate()));
        this.K.start();
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a0 = false;
        o();
        return true;
    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        k(surfaceTexture, i, i2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.a = false;
            l();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.c0.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        ys4 ys4Var = this.b;
        nl5 nl5Var = ys4Var.c;
        if (nl5Var != null && nl5Var.a == null) {
            nl5Var.Z = bitmap;
        }
        ys4Var.r = bitmap;
    }

    public void setDialogVisible(boolean z) {
        this.J = z;
        if (z) {
            hl.r(this.f0);
            l();
            return;
        }
        j(this.M);
    }

    public void setIdleAnimationEnabled(boolean z) {
        this.N = z;
        if (z) {
            j(this.M);
            return;
        }
        hl.r(this.f0);
        a();
    }

    public void setPaused(boolean z) {
        boolean z2 = this.H;
        this.H = z;
        if (z2 && !z && this.K != null) {
            this.K.interrupt();
        }
    }

    public synchronized void setRenderer(ys4 ys4Var) {
        this.b = ys4Var;
        this.I = true;
    }

    public void setStarParticlesView(eva evaVar) {
        this.S = evaVar;
    }

    @Override
    public final void updateColors() {
        try {
            ys4 ys4Var = this.b;
            if (ys4Var != null) {
                ys4Var.b();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public void g() {
    }

    public void h() {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
