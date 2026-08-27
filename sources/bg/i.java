package bg;

import ag.k3;
import ag.u;
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
import hh.pa;
import java.util.ArrayList;
import java.util.Collections;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;

public class i extends TextureView implements TextureView.SurfaceTextureListener {
    public boolean A;
    public boolean B;
    public h C;
    public final int D;
    public final long E;
    public final int F;
    public int G;
    public final ArrayList H;
    public boolean I;
    public k3 J;
    public final int K;
    public volatile boolean L;
    public volatile pa M;
    public final GestureDetector N;
    public ValueAnimator O;
    public AnimatorSet P;
    public final f Q;
    public final b R;
    public final b S;
    public final b T;

    public boolean f2128a;

    public a f2129b;

    public SurfaceTexture f2130c;
    public EGLDisplay d;

    public EGLSurface f2131e;

    public EGLContext f2132f;
    public EGL10 h;

    public EGLConfig f2133n;

    public GL10 f2134r;

    public int f2135s;
    public int v;

    public int f2136w;

    public boolean f2137x;

    public boolean f2138y;

    public i(Context context, int i10, int i11) {
        super(context);
        int iF = 0;
        this.f2137x = false;
        this.f2138y = true;
        this.A = false;
        this.B = false;
        this.H = new ArrayList();
        this.P = new AnimatorSet();
        final int i12 = 0;
        this.Q = new f(this, 0);
        this.R = new ValueAnimator.AnimatorUpdateListener(this) {

            public final i f2112b;

            {
                this.f2112b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        this.f2112b.f2129b.f2091e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        this.f2112b.f2129b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        this.f2112b.f2129b.f2093g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        final int i13 = 1;
        this.S = new ValueAnimator.AnimatorUpdateListener(this) {

            public final i f2112b;

            {
                this.f2112b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i13) {
                    case 0:
                        this.f2112b.f2129b.f2091e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        this.f2112b.f2129b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        this.f2112b.f2129b.f2093g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        final int i14 = 2;
        this.T = new ValueAnimator.AnimatorUpdateListener(this) {

            public final i f2112b;

            {
                this.f2112b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i14) {
                    case 0:
                        this.f2112b.f2129b.f2091e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        this.f2112b.f2129b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        this.f2112b.f2129b.f2093g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                }
            }
        };
        this.K = i11;
        this.F = (i11 == 1 || i11 == 4 || i11 == 3) ? 1 : 5;
        this.E = i11 == 4 ? 0L : 2000L;
        setOpaque(false);
        setRenderer(new a(context, i10, i11));
        this.D = (int) AndroidUtilities.screenRefreshRate;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new e(0, this));
        this.N = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (iF < this.F) {
            iF = i0.a.f(iF, iF, 1, this.H);
        }
        Collections.shuffle(this.H);
    }

    public static void a(i iVar) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        iVar.h = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        iVar.d = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed " + GLUtils.getEGLErrorString(iVar.h.eglGetError()));
        }
        if (!iVar.h.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            throw new RuntimeException("eglInitialize failed " + GLUtils.getEGLErrorString(iVar.h.eglGetError()));
        }
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = EmuDetector.with(iVar.getContext()).detect() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12344};
        iVar.f2133n = null;
        if (!iVar.h.eglChooseConfig(iVar.d, iArr2, eGLConfigArr, 1, iArr)) {
            throw new IllegalArgumentException("eglChooseConfig failed " + GLUtils.getEGLErrorString(iVar.h.eglGetError()));
        }
        if (iArr[0] > 0) {
            iVar.f2133n = eGLConfigArr[0];
        }
        EGLConfig eGLConfig = iVar.f2133n;
        if (eGLConfig == null) {
            throw new RuntimeException("eglConfig not initialized");
        }
        iVar.f2132f = iVar.h.eglCreateContext(iVar.d, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        iVar.f();
        iVar.f2131e = iVar.h.eglCreateWindowSurface(iVar.d, iVar.f2133n, iVar.f2130c, null);
        iVar.f();
        EGLSurface eGLSurface = iVar.f2131e;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            int iEglGetError = iVar.h.eglGetError();
            if (iEglGetError == 12299) {
                FileLog.e("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
                return;
            } else {
                throw new RuntimeException("eglCreateWindowSurface failed " + GLUtils.getEGLErrorString(iEglGetError));
            }
        }
        if (!iVar.h.eglMakeCurrent(iVar.d, eGLSurface, eGLSurface, iVar.f2132f)) {
            throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(iVar.h.eglGetError()));
        }
        iVar.f();
        iVar.f2134r = (GL10) iVar.f2132f.getGL();
        iVar.f();
    }

    public static boolean b(i iVar) {
        boolean z10;
        synchronized (iVar) {
            z10 = iVar.f2138y;
        }
        return z10 || iVar.f2129b == null;
    }

    public static void c(i iVar, float f10) {
        synchronized (iVar) {
            try {
                iVar.e();
                a aVar = iVar.f2129b;
                if (aVar != null) {
                    aVar.D = f10;
                    aVar.onDrawFrame(iVar.f2134r);
                }
                int iGlGetError = iVar.f2134r.glGetError();
                if (iGlGetError != 0) {
                    FileLog.e("GL error = 0x" + Integer.toHexString(iGlGetError));
                }
                iVar.h.eglSwapBuffers(iVar.d, iVar.f2131e);
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
        if (this.f2132f.equals(this.h.eglGetCurrentContext()) && this.f2131e.equals(this.h.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.h;
        EGLDisplay eGLDisplay = this.d;
        EGLSurface eGLSurface = this.f2131e;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f2132f)) {
            f();
        } else {
            throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.h.eglGetError()));
        }
    }

    public final void f() {
        if (this.h.eglGetError() != 12288) {
            FileLog.e("cannot swap buffers!");
        }
    }

    public final void h(long j10) {
        f fVar = this.Q;
        AndroidUtilities.cancelRunOnUIThread(fVar);
        if (this.B) {
            return;
        }
        AndroidUtilities.runOnUIThread(fVar, j10);
    }

    public final void i() {
        float f10;
        d();
        a aVar = this.f2129b;
        float f11 = aVar.d;
        float f12 = aVar.f2093g;
        float f13 = aVar.f2091e;
        float f14 = f11 + f12;
        int i10 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.O = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new c(this, f11, f13, f12, 0));
        this.O.setDuration(600L);
        this.O.setInterpolator(new OvershootInterpolator());
        this.O.start();
        k3 k3Var = this.J;
        if (k3Var != null) {
            float fAbs = Math.abs(f14);
            if (fAbs < 60.0f) {
                f10 = 5.0f;
            } else {
                f10 = fAbs < 180.0f ? 9.0f : 15.0f;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            u uVar = new u(k3Var, i10);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, f10);
            valueAnimatorOfFloat2.addUpdateListener(uVar);
            valueAnimatorOfFloat2.setDuration(600L);
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f10, 1.0f);
            valueAnimatorOfFloat3.addUpdateListener(uVar);
            valueAnimatorOfFloat3.setDuration(2000L);
            animatorSet.playTogether(valueAnimatorOfFloat2, valueAnimatorOfFloat3);
            animatorSet.start();
        }
        h(this.E);
    }

    public final void j(long j10) {
        a aVar = this.f2129b;
        if (aVar != null) {
            aVar.d = -180.0f;
            AndroidUtilities.runOnUIThread(new f(this, 1), j10);
        }
    }

    public void k() {
        if (this.I) {
            int i10 = this.G;
            ArrayList arrayList = this.H;
            int iIntValue = ((Integer) arrayList.get(i10)).intValue();
            int i11 = this.G + 1;
            this.G = i11;
            if (i11 >= arrayList.size()) {
                Collections.shuffle(arrayList);
                this.G = 0;
            }
            b bVar = this.T;
            b bVar2 = this.S;
            if (iIntValue == 0) {
                int iAbs = Math.abs(Utilities.random.nextInt() % 4);
                this.P = new AnimatorSet();
                int i12 = this.K;
                if (i12 == 4) {
                    float f10 = this.f2129b.d;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 360.0f + f10);
                    valueAnimatorOfFloat.addUpdateListener(bVar2);
                    valueAnimatorOfFloat.setDuration(12000L);
                    valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    this.P.playTogether(valueAnimatorOfFloat);
                } else if (iAbs != 0 || i12 == 1 || i12 == 3) {
                    int i13 = (i12 == 1 || i12 == 3) ? 360 : 485;
                    if (iAbs == 2) {
                        i13 = -i13;
                    }
                    float f11 = i13;
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f2129b.f2093g, f11);
                    valueAnimatorOfFloat2.addUpdateListener(bVar2);
                    valueAnimatorOfFloat2.setDuration(3000L);
                    valueAnimatorOfFloat2.setInterpolator(er.h);
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f11, 0.0f);
                    valueAnimatorOfFloat3.addUpdateListener(bVar2);
                    valueAnimatorOfFloat3.setDuration(1000L);
                    valueAnimatorOfFloat3.setStartDelay(3000L);
                    valueAnimatorOfFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.P.playTogether(valueAnimatorOfFloat2, valueAnimatorOfFloat3);
                } else {
                    float f12 = 48;
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(this.f2129b.f2093g, f12);
                    valueAnimatorOfFloat4.addUpdateListener(bVar);
                    valueAnimatorOfFloat4.setDuration(2300L);
                    valueAnimatorOfFloat4.setInterpolator(er.h);
                    ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(f12, 0.0f);
                    valueAnimatorOfFloat5.addUpdateListener(bVar);
                    valueAnimatorOfFloat5.setDuration(500L);
                    valueAnimatorOfFloat5.setStartDelay(2300L);
                    valueAnimatorOfFloat5.setInterpolator(AndroidUtilities.overshootInterpolator);
                    this.P.playTogether(valueAnimatorOfFloat4, valueAnimatorOfFloat5);
                }
                this.P.addListener(new g(this, 1));
                this.P.start();
                return;
            }
            if (iIntValue == 1) {
                this.P = new AnimatorSet();
                ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(this.f2129b.d, 360.0f);
                valueAnimatorOfFloat6.addUpdateListener(bVar2);
                valueAnimatorOfFloat6.setDuration(8000L);
                valueAnimatorOfFloat6.setInterpolator(er.f28122f);
                this.P.playTogether(valueAnimatorOfFloat6);
                this.P.addListener(new g(this, 0));
                this.P.start();
                return;
            }
            if (iIntValue != 2) {
                this.P = new AnimatorSet();
                ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(this.f2129b.d, 180.0f);
                valueAnimatorOfFloat7.addUpdateListener(bVar2);
                valueAnimatorOfFloat7.setDuration(600L);
                er erVar = er.f28122f;
                valueAnimatorOfFloat7.setInterpolator(erVar);
                ValueAnimator valueAnimatorOfFloat8 = ValueAnimator.ofFloat(180.0f, 360.0f);
                valueAnimatorOfFloat8.addUpdateListener(bVar2);
                valueAnimatorOfFloat8.setDuration(600L);
                valueAnimatorOfFloat8.setStartDelay(2000L);
                valueAnimatorOfFloat8.setInterpolator(erVar);
                this.P.playTogether(valueAnimatorOfFloat7, valueAnimatorOfFloat8);
                this.P.addListener(new g(this, 2));
                this.P.start();
                return;
            }
            this.P = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat9 = ValueAnimator.ofFloat(this.f2129b.d, 184.0f);
            valueAnimatorOfFloat9.addUpdateListener(bVar2);
            valueAnimatorOfFloat9.setDuration(600L);
            er erVar2 = er.f28123g;
            valueAnimatorOfFloat9.setInterpolator(erVar2);
            ValueAnimator valueAnimatorOfFloat10 = ValueAnimator.ofFloat(this.f2129b.f2093g, 50.0f);
            valueAnimatorOfFloat10.addUpdateListener(bVar);
            valueAnimatorOfFloat10.setDuration(600L);
            valueAnimatorOfFloat10.setInterpolator(erVar2);
            ValueAnimator valueAnimatorOfFloat11 = ValueAnimator.ofFloat(180.0f, 0.0f);
            valueAnimatorOfFloat11.addUpdateListener(bVar2);
            valueAnimatorOfFloat11.setDuration(800L);
            valueAnimatorOfFloat11.setStartDelay(10000L);
            valueAnimatorOfFloat11.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator valueAnimatorOfFloat12 = ValueAnimator.ofFloat(60.0f, 0.0f);
            valueAnimatorOfFloat12.addUpdateListener(bVar);
            valueAnimatorOfFloat12.setDuration(800L);
            valueAnimatorOfFloat12.setStartDelay(10000L);
            valueAnimatorOfFloat12.setInterpolator(AndroidUtilities.overshootInterpolator);
            ValueAnimator valueAnimatorOfFloat13 = ValueAnimator.ofFloat(0.0f, 2.0f, -3.0f, 2.0f, -1.0f, 2.0f, -3.0f, 2.0f, -1.0f, 0.0f);
            valueAnimatorOfFloat13.addUpdateListener(this.R);
            valueAnimatorOfFloat13.setDuration(10000L);
            valueAnimatorOfFloat13.setInterpolator(new LinearInterpolator());
            this.P.playTogether(valueAnimatorOfFloat9, valueAnimatorOfFloat10, valueAnimatorOfFloat11, valueAnimatorOfFloat12, valueAnimatorOfFloat13);
            this.P.addListener(new g(this, 3));
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
        a aVar = this.f2129b;
        if (aVar != null) {
            aVar.d = 0.0f;
            aVar.f2093g = 0.0f;
            aVar.f2091e = 0.0f;
        }
        this.I = false;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.C = new h(this);
        this.f2130c = surfaceTexture;
        this.f2136w = i10;
        this.v = i11;
        this.f2135s = Math.max(0, ((int) ((1.0f / this.D) * 1000.0f)) - 1);
        this.C.start();
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.L = false;
        if (this.C != null) {
            this.f2137x = false;
            this.C = null;
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f2136w = i10;
        this.v = i11;
        a aVar = this.f2129b;
        if (aVar != null) {
            aVar.onSurfaceChanged(this.f2134r, i10, i11);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f2128a = false;
            i();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.N.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        a aVar = this.f2129b;
        j jVar = aVar.f2090c;
        if (jVar != null) {
            jVar.V = bitmap;
        }
        aVar.f2100o = bitmap;
    }

    public void setDialogVisible(boolean z10) {
        this.B = z10;
        if (!z10) {
            h(this.E);
        } else {
            AndroidUtilities.cancelRunOnUIThread(this.Q);
            i();
        }
    }

    public synchronized void setPaused(boolean z10) {
        this.f2138y = z10;
    }

    public synchronized void setRenderer(a aVar) {
        this.f2129b = aVar;
        this.A = true;
    }

    public void setStarParticlesView(k3 k3Var) {
        this.J = k3Var;
    }

    public void g() {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
