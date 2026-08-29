package dg;

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
import bg.q1;
import cg.s2;
import java.util.ArrayList;
import java.util.Collections;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import jh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.th;
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
    public s2 J;
    public final int K;
    public volatile boolean L;
    public volatile ja M;
    public final GestureDetector N;
    public ValueAnimator O;
    public AnimatorSet P;
    public final f Q;
    public final b R;
    public final b S;
    public final b T;
    public boolean f5589a;
    public a f5590b;
    public SurfaceTexture f5591c;
    public EGLDisplay d;
    public EGLSurface f5592e;
    public EGLContext f5593f;
    public EGL10 h;
    public EGLConfig f5594n;
    public GL10 f5595r;
    public int f5596s;
    public int v;
    public int f5597w;
    public boolean f5598x;
    public boolean f5599y;

    public i(Context context, int i10, int i11) {
        super(context);
        int i12;
        long j10;
        int i13 = 0;
        this.f5598x = false;
        this.f5599y = true;
        this.A = false;
        this.B = false;
        this.H = new ArrayList();
        this.P = new AnimatorSet();
        this.Q = new f(this, 0);
        this.R = new ValueAnimator.AnimatorUpdateListener(this) {
            public final i f5573b;

            {
                this.f5573b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f5573b.f5590b.f5552e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f5573b.f5590b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f5573b.f5590b.f5554g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.S = new ValueAnimator.AnimatorUpdateListener(this) {
            public final i f5573b;

            {
                this.f5573b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f5573b.f5590b.f5552e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f5573b.f5590b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f5573b.f5590b.f5554g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.T = new ValueAnimator.AnimatorUpdateListener(this) {
            public final i f5573b;

            {
                this.f5573b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f5573b.f5590b.f5552e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f5573b.f5590b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f5573b.f5590b.f5554g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.K = i11;
        if (i11 != 1 && i11 != 4 && i11 != 3) {
            i12 = 5;
        } else {
            i12 = 1;
        }
        this.F = i12;
        if (i11 == 4) {
            j10 = 0;
        } else {
            j10 = 2000;
        }
        this.E = j10;
        setOpaque(false);
        setRenderer(new a(context, i10, i11));
        this.D = (int) AndroidUtilities.screenRefreshRate;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new e(0, this));
        this.N = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i13 < this.F) {
            i13 = th.d(i13, i13, 1, this.H);
        }
        Collections.shuffle(this.H);
    }

    public static void a(i iVar) {
        int[] iArr;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        iVar.h = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        iVar.d = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (iVar.h.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr2 = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EmuDetector.with(iVar.getContext()).detect()) {
                    iArr = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12344};
                } else {
                    iArr = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12344};
                }
                iVar.f5594n = null;
                if (iVar.h.eglChooseConfig(iVar.d, iArr, eGLConfigArr, 1, iArr2)) {
                    if (iArr2[0] > 0) {
                        iVar.f5594n = eGLConfigArr[0];
                    }
                    EGLConfig eGLConfig = iVar.f5594n;
                    if (eGLConfig != null) {
                        iVar.f5593f = iVar.h.eglCreateContext(iVar.d, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                        iVar.f();
                        iVar.f5592e = iVar.h.eglCreateWindowSurface(iVar.d, iVar.f5594n, iVar.f5591c, null);
                        iVar.f();
                        EGLSurface eGLSurface = iVar.f5592e;
                        if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                            if (iVar.h.eglMakeCurrent(iVar.d, eGLSurface, eGLSurface, iVar.f5593f)) {
                                iVar.f();
                                iVar.f5595r = (GL10) iVar.f5593f.getGL();
                                iVar.f();
                                return;
                            }
                            throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(iVar.h.eglGetError()));
                        }
                        int eglGetError = iVar.h.eglGetError();
                        if (eglGetError == 12299) {
                            FileLog.e("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
                            return;
                        }
                        throw new RuntimeException("eglCreateWindowSurface failed " + GLUtils.getEGLErrorString(eglGetError));
                    }
                    throw new RuntimeException("eglConfig not initialized");
                }
                throw new IllegalArgumentException("eglChooseConfig failed " + GLUtils.getEGLErrorString(iVar.h.eglGetError()));
            }
            throw new RuntimeException("eglInitialize failed " + GLUtils.getEGLErrorString(iVar.h.eglGetError()));
        }
        throw new RuntimeException("eglGetDisplay failed " + GLUtils.getEGLErrorString(iVar.h.eglGetError()));
    }

    public static boolean b(i iVar) {
        boolean z10;
        synchronized (iVar) {
            z10 = iVar.f5599y;
        }
        if (!z10 && iVar.f5590b != null) {
            return false;
        }
        return true;
    }

    public static void c(i iVar, float f9) {
        synchronized (iVar) {
            try {
                iVar.e();
                a aVar = iVar.f5590b;
                if (aVar != null) {
                    aVar.D = f9;
                    aVar.onDrawFrame(iVar.f5595r);
                }
                int glGetError = iVar.f5595r.glGetError();
                if (glGetError != 0) {
                    FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                }
                iVar.h.eglSwapBuffers(iVar.d, iVar.f5592e);
            } catch (Throwable th2) {
                throw th2;
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
        if (this.f5593f.equals(this.h.eglGetCurrentContext()) && this.f5592e.equals(this.h.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.h;
        EGLDisplay eGLDisplay = this.d;
        EGLSurface eGLSurface = this.f5592e;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f5593f)) {
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
        f fVar = this.Q;
        AndroidUtilities.cancelRunOnUIThread(fVar);
        if (this.B) {
            return;
        }
        AndroidUtilities.runOnUIThread(fVar, j10);
    }

    public final void i() {
        float f9;
        d();
        a aVar = this.f5590b;
        float f10 = aVar.d;
        float f11 = aVar.f5554g;
        float f12 = aVar.f5552e;
        float f13 = f10 + f11;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new c(this, f10, f12, f11, 0));
        this.O.setDuration(600L);
        this.O.setInterpolator(new OvershootInterpolator());
        this.O.start();
        s2 s2Var = this.J;
        if (s2Var != null) {
            float abs = Math.abs(f13);
            if (abs < 60.0f) {
                f9 = 5.0f;
            } else if (abs < 180.0f) {
                f9 = 9.0f;
            } else {
                f9 = 15.0f;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            q1 q1Var = new q1(s2Var, 8);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, f9);
            ofFloat2.addUpdateListener(q1Var);
            ofFloat2.setDuration(600L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f9, 1.0f);
            ofFloat3.addUpdateListener(q1Var);
            ofFloat3.setDuration(2000L);
            animatorSet.playTogether(ofFloat2, ofFloat3);
            animatorSet.start();
        }
        h(this.E);
    }

    public final void j(long j10) {
        a aVar = this.f5590b;
        if (aVar != null) {
            aVar.d = -180.0f;
            AndroidUtilities.runOnUIThread(new f(this, 1), j10);
        }
    }

    public void k() {
        int i10;
        if (!this.I) {
            return;
        }
        int i11 = this.G;
        ArrayList arrayList = this.H;
        int intValue = ((Integer) arrayList.get(i11)).intValue();
        int i12 = this.G + 1;
        this.G = i12;
        if (i12 >= arrayList.size()) {
            Collections.shuffle(arrayList);
            this.G = 0;
        }
        b bVar = this.T;
        b bVar2 = this.S;
        if (intValue == 0) {
            int abs = Math.abs(Utilities.random.nextInt() % 4);
            this.P = new AnimatorSet();
            int i13 = this.K;
            if (i13 == 4) {
                float f9 = this.f5590b.d;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, 360.0f + f9);
                ofFloat.addUpdateListener(bVar2);
                ofFloat.setDuration(12000L);
                ofFloat.setInterpolator(new LinearInterpolator());
                this.P.playTogether(ofFloat);
            } else if (abs == 0 && i13 != 1 && i13 != 3) {
                float f10 = 48;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f5590b.f5554g, f10);
                ofFloat2.addUpdateListener(bVar);
                ofFloat2.setDuration(2300L);
                ofFloat2.setInterpolator(jr.h);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat3.addUpdateListener(bVar);
                ofFloat3.setDuration(500L);
                ofFloat3.setStartDelay(2300L);
                ofFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
                this.P.playTogether(ofFloat2, ofFloat3);
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
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.f5590b.f5554g, f11);
                ofFloat4.addUpdateListener(bVar2);
                ofFloat4.setDuration(3000L);
                ofFloat4.setInterpolator(jr.h);
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f11, 0.0f);
                ofFloat5.addUpdateListener(bVar2);
                ofFloat5.setDuration(1000L);
                ofFloat5.setStartDelay(3000L);
                ofFloat5.setInterpolator(AndroidUtilities.overshootInterpolator);
                this.P.playTogether(ofFloat4, ofFloat5);
            }
            this.P.addListener(new g(this, 1));
            this.P.start();
        } else if (intValue == 1) {
            this.P = new AnimatorSet();
            ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.f5590b.d, 360.0f);
            ofFloat6.addUpdateListener(bVar2);
            ofFloat6.setDuration(8000L);
            ofFloat6.setInterpolator(jr.f29800f);
            this.P.playTogether(ofFloat6);
            this.P.addListener(new g(this, 0));
            this.P.start();
        } else if (intValue == 2) {
            this.P = new AnimatorSet();
            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.f5590b.d, 184.0f);
            ofFloat7.addUpdateListener(bVar2);
            ofFloat7.setDuration(600L);
            jr jrVar = jr.f29801g;
            ofFloat7.setInterpolator(jrVar);
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(this.f5590b.f5554g, 50.0f);
            ofFloat8.addUpdateListener(bVar);
            ofFloat8.setDuration(600L);
            ofFloat8.setInterpolator(jrVar);
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
            this.P.addListener(new g(this, 3));
            this.P.start();
        } else {
            this.P = new AnimatorSet();
            ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f5590b.d, 180.0f);
            ofFloat12.addUpdateListener(bVar2);
            ofFloat12.setDuration(600L);
            jr jrVar2 = jr.f29800f;
            ofFloat12.setInterpolator(jrVar2);
            ValueAnimator ofFloat13 = ValueAnimator.ofFloat(180.0f, 360.0f);
            ofFloat13.addUpdateListener(bVar2);
            ofFloat13.setDuration(600L);
            ofFloat13.setStartDelay(2000L);
            ofFloat13.setInterpolator(jrVar2);
            this.P.playTogether(ofFloat12, ofFloat13);
            this.P.addListener(new g(this, 2));
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
        a aVar = this.f5590b;
        if (aVar != null) {
            aVar.d = 0.0f;
            aVar.f5554g = 0.0f;
            aVar.f5552e = 0.0f;
        }
        this.I = false;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.C = new h(this);
        this.f5591c = surfaceTexture;
        this.f5597w = i10;
        this.v = i11;
        this.f5596s = Math.max(0, ((int) ((1.0f / this.D) * 1000.0f)) - 1);
        this.C.start();
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.L = false;
        if (this.C != null) {
            this.f5598x = false;
            this.C = null;
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f5597w = i10;
        this.v = i11;
        a aVar = this.f5590b;
        if (aVar != null) {
            aVar.onSurfaceChanged(this.f5595r, i10, i11);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f5589a = false;
            i();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.N.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        a aVar = this.f5590b;
        j jVar = aVar.f5551c;
        if (jVar != null) {
            jVar.V = bitmap;
        }
        aVar.f5561o = bitmap;
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
        this.f5599y = z10;
    }

    public synchronized void setRenderer(a aVar) {
        this.f5590b = aVar;
        this.A = true;
    }

    public void setStarParticlesView(s2 s2Var) {
        this.J = s2Var;
    }

    public void g() {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
