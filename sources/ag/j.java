package ag;

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
import gh.pa;
import j3.r0;
import java.util.ArrayList;
import java.util.Collections;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import kh.g4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
import zf.w1;
public class j extends TextureView implements TextureView.SurfaceTextureListener {
    public boolean A;
    public boolean B;
    public i C;
    public final int D;
    public final long E;
    public final int F;
    public int G;
    public final ArrayList H;
    public boolean I;
    public w1 J;
    public final int K;
    public volatile boolean L;
    public volatile pa M;
    public final GestureDetector N;
    public ValueAnimator O;
    public AnimatorSet P;
    public final g Q;
    public final b R;
    public final b S;
    public final b T;
    public boolean f204a;
    public a f205b;
    public SurfaceTexture f206c;
    public EGLDisplay d;
    public EGLSurface f207e;
    public EGLContext f208f;
    public EGL10 h;
    public EGLConfig f209n;
    public GL10 f210r;
    public int f211s;
    public int v;
    public int f212w;
    public boolean f213x;
    public boolean f214y;

    public j(Context context, int i9, int i10) {
        super(context);
        int i11;
        long j10;
        int i12 = 0;
        this.f213x = false;
        this.f214y = true;
        this.A = false;
        this.B = false;
        this.H = new ArrayList();
        this.P = new AnimatorSet();
        this.Q = new g(this, 0);
        this.R = new ValueAnimator.AnimatorUpdateListener(this) {
            public final j f186b;

            {
                this.f186b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f186b.f205b.f165e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f186b.f205b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f186b.f205b.f167g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.S = new ValueAnimator.AnimatorUpdateListener(this) {
            public final j f186b;

            {
                this.f186b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f186b.f205b.f165e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f186b.f205b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f186b.f205b.f167g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.T = new ValueAnimator.AnimatorUpdateListener(this) {
            public final j f186b;

            {
                this.f186b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f186b.f205b.f165e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f186b.f205b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f186b.f205b.f167g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.K = i10;
        if (i10 != 1 && i10 != 4 && i10 != 3) {
            i11 = 5;
        } else {
            i11 = 1;
        }
        this.F = i11;
        if (i10 == 4) {
            j10 = 0;
        } else {
            j10 = 2000;
        }
        this.E = j10;
        setOpaque(false);
        setRenderer(new a(context, i9, i10));
        this.D = (int) AndroidUtilities.screenRefreshRate;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new f(0, this));
        this.N = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i12 < this.F) {
            i12 = r0.e(i12, i12, 1, this.H);
        }
        Collections.shuffle(this.H);
    }

    public static void a(j jVar) {
        int[] iArr;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        jVar.h = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        jVar.d = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (jVar.h.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr2 = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EmuDetector.with(jVar.getContext()).detect()) {
                    iArr = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12344};
                } else {
                    iArr = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12344};
                }
                jVar.f209n = null;
                if (jVar.h.eglChooseConfig(jVar.d, iArr, eGLConfigArr, 1, iArr2)) {
                    if (iArr2[0] > 0) {
                        jVar.f209n = eGLConfigArr[0];
                    }
                    EGLConfig eGLConfig = jVar.f209n;
                    if (eGLConfig != null) {
                        jVar.f208f = jVar.h.eglCreateContext(jVar.d, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                        jVar.f();
                        jVar.f207e = jVar.h.eglCreateWindowSurface(jVar.d, jVar.f209n, jVar.f206c, null);
                        jVar.f();
                        EGLSurface eGLSurface = jVar.f207e;
                        if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                            if (jVar.h.eglMakeCurrent(jVar.d, eGLSurface, eGLSurface, jVar.f208f)) {
                                jVar.f();
                                jVar.f210r = (GL10) jVar.f208f.getGL();
                                jVar.f();
                                return;
                            }
                            throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(jVar.h.eglGetError()));
                        }
                        int eglGetError = jVar.h.eglGetError();
                        if (eglGetError == 12299) {
                            FileLog.e("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
                            return;
                        }
                        throw new RuntimeException("eglCreateWindowSurface failed " + GLUtils.getEGLErrorString(eglGetError));
                    }
                    throw new RuntimeException("eglConfig not initialized");
                }
                throw new IllegalArgumentException("eglChooseConfig failed " + GLUtils.getEGLErrorString(jVar.h.eglGetError()));
            }
            throw new RuntimeException("eglInitialize failed " + GLUtils.getEGLErrorString(jVar.h.eglGetError()));
        }
        throw new RuntimeException("eglGetDisplay failed " + GLUtils.getEGLErrorString(jVar.h.eglGetError()));
    }

    public static boolean b(j jVar) {
        boolean z10;
        synchronized (jVar) {
            z10 = jVar.f214y;
        }
        if (!z10 && jVar.f205b != null) {
            return false;
        }
        return true;
    }

    public static void c(j jVar, float f10) {
        synchronized (jVar) {
            try {
                jVar.e();
                a aVar = jVar.f205b;
                if (aVar != null) {
                    aVar.D = f10;
                    aVar.onDrawFrame(jVar.f210r);
                }
                int glGetError = jVar.f210r.glGetError();
                if (glGetError != 0) {
                    FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                }
                jVar.h.eglSwapBuffers(jVar.d, jVar.f207e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.O.cancel();
            this.O = null;
        }
        AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.P.cancel();
            this.P = null;
        }
    }

    public final void e() {
        if (this.f208f.equals(this.h.eglGetCurrentContext()) && this.f207e.equals(this.h.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.h;
        EGLDisplay eGLDisplay = this.d;
        EGLSurface eGLSurface = this.f207e;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f208f)) {
            f();
            return;
        }
        throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.h.eglGetError()));
    }

    public final void f() {
        if (this.h.eglGetError() != 12288) {
            FileLog.e("cannot swap buffers!");
        }
    }

    public final void h(long j10) {
        g gVar = this.Q;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        if (this.B) {
            return;
        }
        AndroidUtilities.runOnUIThread(gVar, j10);
    }

    public final void i() {
        float f10;
        d();
        a aVar = this.f205b;
        float f11 = aVar.d;
        float f12 = aVar.f167g;
        float f13 = aVar.f165e;
        float f14 = f11 + f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new c(this, f11, f13, f12, 0));
        this.O.setDuration(600L);
        this.O.setInterpolator(new OvershootInterpolator());
        this.O.start();
        w1 w1Var = this.J;
        if (w1Var != null) {
            float abs = Math.abs(f14);
            if (abs < 60.0f) {
                f10 = 5.0f;
            } else if (abs < 180.0f) {
                f10 = 9.0f;
            } else {
                f10 = 15.0f;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            g4 g4Var = new g4(w1Var, 27);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, f10);
            ofFloat2.addUpdateListener(g4Var);
            ofFloat2.setDuration(600L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f10, 1.0f);
            ofFloat3.addUpdateListener(g4Var);
            ofFloat3.setDuration(2000L);
            animatorSet.playTogether(ofFloat2, ofFloat3);
            animatorSet.start();
        }
        h(this.E);
    }

    public final void j(long j10) {
        a aVar = this.f205b;
        if (aVar != null) {
            aVar.d = -180.0f;
            AndroidUtilities.runOnUIThread(new g(this, 1), j10);
        }
    }

    public void k() {
        int i9;
        if (!this.I) {
            return;
        }
        int i10 = this.G;
        ArrayList arrayList = this.H;
        int intValue = ((Integer) arrayList.get(i10)).intValue();
        int i11 = this.G + 1;
        this.G = i11;
        if (i11 >= arrayList.size()) {
            Collections.shuffle(arrayList);
            this.G = 0;
        }
        b bVar = this.T;
        b bVar2 = this.S;
        if (intValue == 0) {
            int abs = Math.abs(Utilities.random.nextInt() % 4);
            this.P = new AnimatorSet();
            int i12 = this.K;
            if (i12 == 4) {
                float f10 = this.f205b.d;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 360.0f + f10);
                ofFloat.addUpdateListener(bVar2);
                ofFloat.setDuration(12000L);
                ofFloat.setInterpolator(new LinearInterpolator());
                this.P.playTogether(ofFloat);
            } else if (abs == 0 && i12 != 1 && i12 != 3) {
                float f11 = 48;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f205b.f167g, f11);
                ofFloat2.addUpdateListener(bVar);
                ofFloat2.setDuration(2300L);
                ofFloat2.setInterpolator(gr.h);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f11, 0.0f);
                ofFloat3.addUpdateListener(bVar);
                ofFloat3.setDuration(500L);
                ofFloat3.setStartDelay(2300L);
                ofFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
                this.P.playTogether(ofFloat2, ofFloat3);
            } else {
                if (i12 != 1 && i12 != 3) {
                    i9 = 485;
                } else {
                    i9 = 360;
                }
                if (abs == 2) {
                    i9 = -i9;
                }
                float f12 = i9;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.f205b.f167g, f12);
                ofFloat4.addUpdateListener(bVar2);
                ofFloat4.setDuration(3000L);
                ofFloat4.setInterpolator(gr.h);
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f12, 0.0f);
                ofFloat5.addUpdateListener(bVar2);
                ofFloat5.setDuration(1000L);
                ofFloat5.setStartDelay(3000L);
                ofFloat5.setInterpolator(AndroidUtilities.overshootInterpolator);
                this.P.playTogether(ofFloat4, ofFloat5);
            }
            this.P.addListener(new h(this, 1));
            this.P.start();
        } else if (intValue == 1) {
            this.P = new AnimatorSet();
            ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.f205b.d, 360.0f);
            ofFloat6.addUpdateListener(bVar2);
            ofFloat6.setDuration(8000L);
            ofFloat6.setInterpolator(gr.f28844f);
            this.P.playTogether(ofFloat6);
            this.P.addListener(new h(this, 0));
            this.P.start();
        } else if (intValue == 2) {
            this.P = new AnimatorSet();
            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.f205b.d, 184.0f);
            ofFloat7.addUpdateListener(bVar2);
            ofFloat7.setDuration(600L);
            gr grVar = gr.f28845g;
            ofFloat7.setInterpolator(grVar);
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(this.f205b.f167g, 50.0f);
            ofFloat8.addUpdateListener(bVar);
            ofFloat8.setDuration(600L);
            ofFloat8.setInterpolator(grVar);
            ValueAnimator ofFloat9 = ValueAnimator.ofFloat(180.0f, 0.0f);
            ofFloat9.addUpdateListener(bVar2);
            ofFloat9.setDuration(800L);
            ofFloat9.setStartDelay(10000L);
            ofFloat9.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator ofFloat10 = ValueAnimator.ofFloat(60.0f, 0.0f);
            ofFloat10.addUpdateListener(bVar);
            ofFloat10.setDuration(800L);
            ofFloat10.setStartDelay(10000L);
            ofFloat10.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator ofFloat11 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
            ofFloat11.addUpdateListener(this.R);
            ofFloat11.setDuration(10000L);
            ofFloat11.setInterpolator(new LinearInterpolator());
            this.P.playTogether(ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11);
            this.P.addListener(new h(this, 3));
            this.P.start();
        } else {
            this.P = new AnimatorSet();
            ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f205b.d, 180.0f);
            ofFloat12.addUpdateListener(bVar2);
            ofFloat12.setDuration(600L);
            gr grVar2 = gr.f28844f;
            ofFloat12.setInterpolator(grVar2);
            ValueAnimator ofFloat13 = ValueAnimator.ofFloat(180.0f, 360.0f);
            ofFloat13.addUpdateListener(bVar2);
            ofFloat13.setDuration(600L);
            ofFloat13.setStartDelay(2000L);
            ofFloat13.setInterpolator(grVar2);
            this.P.playTogether(ofFloat12, ofFloat13);
            this.P.addListener(new h(this, 2));
            this.P.start();
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        this.A = true;
        h(this.E);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        a aVar = this.f205b;
        if (aVar != null) {
            aVar.d = 0.0f;
            aVar.f167g = 0.0f;
            aVar.f165e = 0.0f;
        }
        this.I = false;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        this.C = new i(this);
        this.f206c = surfaceTexture;
        this.f212w = i9;
        this.v = i10;
        this.f211s = Math.max(0, ((int) ((1.0f / this.D) * 1000.0f)) - 1);
        this.C.start();
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.L = false;
        if (this.C != null) {
            this.f213x = false;
            this.C = null;
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        this.f212w = i9;
        this.v = i10;
        a aVar = this.f205b;
        if (aVar != null) {
            aVar.onSurfaceChanged(this.f210r, i9, i10);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f204a = false;
            i();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.N.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        a aVar = this.f205b;
        k kVar = aVar.f164c;
        if (kVar != null) {
            kVar.V = bitmap;
        }
        aVar.f174o = bitmap;
    }

    public void setDialogVisible(boolean z10) {
        this.B = z10;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(this.Q);
            i();
            return;
        }
        h(this.E);
    }

    public synchronized void setPaused(boolean z10) {
        this.f214y = z10;
    }

    public synchronized void setRenderer(a aVar) {
        this.f205b = aVar;
        this.A = true;
    }

    public void setStarParticlesView(w1 w1Var) {
        this.J = w1Var;
    }

    public void g() {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
