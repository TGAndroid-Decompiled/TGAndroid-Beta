package gg;

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
import eg.m1;
import fg.p2;
import java.util.ArrayList;
import java.util.Collections;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import mh.ka;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.yh;
public class i extends TextureView implements TextureView.SurfaceTextureListener {
    public boolean B;
    public boolean C;
    public h D;
    public final int E;
    public final long F;
    public final int G;
    public int H;
    public final ArrayList I;
    public boolean J;
    public p2 K;
    public final int L;
    public volatile boolean M;
    public volatile ka N;
    public final GestureDetector O;
    public ValueAnimator P;
    public AnimatorSet Q;
    public final f R;
    public final b S;
    public final b T;
    public final b U;
    public boolean f7086a;
    public a f7087b;
    public SurfaceTexture f7088c;
    public EGLDisplay d;
    public EGLSurface f7089e;
    public EGLContext f7090f;
    public EGL10 h;
    public EGLConfig f7091n;
    public GL10 f7092r;
    public int f7093s;
    public int v;
    public int f7094w;
    public boolean f7095x;
    public boolean f7096y;

    public i(Context context, int i10, int i11) {
        super(context);
        int i12;
        long j10;
        int i13 = 0;
        this.f7095x = false;
        this.f7096y = true;
        this.B = false;
        this.C = false;
        this.I = new ArrayList();
        this.Q = new AnimatorSet();
        this.R = new f(this, 0);
        this.S = new ValueAnimator.AnimatorUpdateListener(this) {
            public final i f7070b;

            {
                this.f7070b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f7070b.f7087b.f7049e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f7070b.f7087b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f7070b.f7087b.f7051g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.T = new ValueAnimator.AnimatorUpdateListener(this) {
            public final i f7070b;

            {
                this.f7070b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f7070b.f7087b.f7049e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f7070b.f7087b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f7070b.f7087b.f7051g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.U = new ValueAnimator.AnimatorUpdateListener(this) {
            public final i f7070b;

            {
                this.f7070b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        this.f7070b.f7087b.f7049e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    case 1:
                        this.f7070b.f7087b.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                    default:
                        this.f7070b.f7087b.f7051g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        return;
                }
            }
        };
        this.L = i11;
        if (i11 != 1 && i11 != 4 && i11 != 3) {
            i12 = 5;
        } else {
            i12 = 1;
        }
        this.G = i12;
        if (i11 == 4) {
            j10 = 0;
        } else {
            j10 = 2000;
        }
        this.F = j10;
        setOpaque(false);
        setRenderer(new a(context, i10, i11));
        this.E = (int) AndroidUtilities.screenRefreshRate;
        setSurfaceTextureListener(this);
        GestureDetector gestureDetector = new GestureDetector(context, new e(0, this));
        this.O = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
        while (i13 < this.G) {
            i13 = yh.d(i13, i13, 1, this.I);
        }
        Collections.shuffle(this.I);
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
                iVar.f7091n = null;
                if (iVar.h.eglChooseConfig(iVar.d, iArr, eGLConfigArr, 1, iArr2)) {
                    if (iArr2[0] > 0) {
                        iVar.f7091n = eGLConfigArr[0];
                    }
                    EGLConfig eGLConfig = iVar.f7091n;
                    if (eGLConfig != null) {
                        iVar.f7090f = iVar.h.eglCreateContext(iVar.d, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                        iVar.f();
                        iVar.f7089e = iVar.h.eglCreateWindowSurface(iVar.d, iVar.f7091n, iVar.f7088c, null);
                        iVar.f();
                        EGLSurface eGLSurface = iVar.f7089e;
                        if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                            if (iVar.h.eglMakeCurrent(iVar.d, eGLSurface, eGLSurface, iVar.f7090f)) {
                                iVar.f();
                                iVar.f7092r = (GL10) iVar.f7090f.getGL();
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
        boolean z4;
        synchronized (iVar) {
            z4 = iVar.f7096y;
        }
        if (!z4 && iVar.f7087b != null) {
            return false;
        }
        return true;
    }

    public static void c(i iVar, float f10) {
        synchronized (iVar) {
            try {
                iVar.e();
                a aVar = iVar.f7087b;
                if (aVar != null) {
                    aVar.D = f10;
                    aVar.onDrawFrame(iVar.f7092r);
                }
                int glGetError = iVar.f7092r.glGetError();
                if (glGetError != 0) {
                    FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                }
                iVar.h.eglSwapBuffers(iVar.d, iVar.f7089e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.P.cancel();
            this.P = null;
        }
        AnimatorSet animatorSet = this.Q;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.Q.cancel();
            this.Q = null;
        }
    }

    public final void e() {
        if (this.f7090f.equals(this.h.eglGetCurrentContext()) && this.f7089e.equals(this.h.eglGetCurrentSurface(12377))) {
            return;
        }
        f();
        EGL10 egl10 = this.h;
        EGLDisplay eGLDisplay = this.d;
        EGLSurface eGLSurface = this.f7089e;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f7090f)) {
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
        f fVar = this.R;
        AndroidUtilities.cancelRunOnUIThread(fVar);
        if (this.C) {
            return;
        }
        AndroidUtilities.runOnUIThread(fVar, j10);
    }

    public final void i() {
        float f10;
        d();
        a aVar = this.f7087b;
        float f11 = aVar.d;
        float f12 = aVar.f7051g;
        float f13 = aVar.f7049e;
        float f14 = f11 + f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.P = ofFloat;
        ofFloat.addUpdateListener(new c(this, f11, f13, f12, 0));
        this.P.setDuration(600L);
        this.P.setInterpolator(new OvershootInterpolator());
        this.P.start();
        p2 p2Var = this.K;
        if (p2Var != null) {
            float abs = Math.abs(f14);
            if (abs < 60.0f) {
                f10 = 5.0f;
            } else if (abs < 180.0f) {
                f10 = 9.0f;
            } else {
                f10 = 15.0f;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            m1 m1Var = new m1(p2Var, 8);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, f10);
            ofFloat2.addUpdateListener(m1Var);
            ofFloat2.setDuration(600L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f10, 1.0f);
            ofFloat3.addUpdateListener(m1Var);
            ofFloat3.setDuration(2000L);
            animatorSet.playTogether(ofFloat2, ofFloat3);
            animatorSet.start();
        }
        h(this.F);
    }

    public final void j(long j10) {
        a aVar = this.f7087b;
        if (aVar != null) {
            aVar.d = -180.0f;
            AndroidUtilities.runOnUIThread(new f(this, 1), j10);
        }
    }

    public void k() {
        int i10;
        if (!this.J) {
            return;
        }
        int i11 = this.H;
        ArrayList arrayList = this.I;
        int intValue = ((Integer) arrayList.get(i11)).intValue();
        int i12 = this.H + 1;
        this.H = i12;
        if (i12 >= arrayList.size()) {
            Collections.shuffle(arrayList);
            this.H = 0;
        }
        b bVar = this.U;
        b bVar2 = this.T;
        if (intValue == 0) {
            int abs = Math.abs(Utilities.random.nextInt() % 4);
            this.Q = new AnimatorSet();
            int i13 = this.L;
            if (i13 == 4) {
                float f10 = this.f7087b.d;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 360.0f + f10);
                ofFloat.addUpdateListener(bVar2);
                ofFloat.setDuration(12000L);
                ofFloat.setInterpolator(new LinearInterpolator());
                this.Q.playTogether(ofFloat);
            } else if (abs == 0 && i13 != 1 && i13 != 3) {
                float f11 = 48;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f7087b.f7051g, f11);
                ofFloat2.addUpdateListener(bVar);
                ofFloat2.setDuration(2300L);
                ofFloat2.setInterpolator(pr.h);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f11, 0.0f);
                ofFloat3.addUpdateListener(bVar);
                ofFloat3.setDuration(500L);
                ofFloat3.setStartDelay(2300L);
                ofFloat3.setInterpolator(AndroidUtilities.overshootInterpolator);
                this.Q.playTogether(ofFloat2, ofFloat3);
            } else {
                if (i13 != 1 && i13 != 3) {
                    i10 = 485;
                } else {
                    i10 = 360;
                }
                if (abs == 2) {
                    i10 = -i10;
                }
                float f12 = i10;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.f7087b.f7051g, f12);
                ofFloat4.addUpdateListener(bVar2);
                ofFloat4.setDuration(3000L);
                ofFloat4.setInterpolator(pr.h);
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f12, 0.0f);
                ofFloat5.addUpdateListener(bVar2);
                ofFloat5.setDuration(1000L);
                ofFloat5.setStartDelay(3000L);
                ofFloat5.setInterpolator(AndroidUtilities.overshootInterpolator);
                this.Q.playTogether(ofFloat4, ofFloat5);
            }
            this.Q.addListener(new g(this, 1));
            this.Q.start();
        } else if (intValue == 1) {
            this.Q = new AnimatorSet();
            ValueAnimator ofFloat6 = ValueAnimator.ofFloat(this.f7087b.d, 360.0f);
            ofFloat6.addUpdateListener(bVar2);
            ofFloat6.setDuration(8000L);
            ofFloat6.setInterpolator(pr.f30183f);
            this.Q.playTogether(ofFloat6);
            this.Q.addListener(new g(this, 0));
            this.Q.start();
        } else if (intValue == 2) {
            this.Q = new AnimatorSet();
            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(this.f7087b.d, 184.0f);
            ofFloat7.addUpdateListener(bVar2);
            ofFloat7.setDuration(600L);
            pr prVar = pr.f30184g;
            ofFloat7.setInterpolator(prVar);
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(this.f7087b.f7051g, 50.0f);
            ofFloat8.addUpdateListener(bVar);
            ofFloat8.setDuration(600L);
            ofFloat8.setInterpolator(prVar);
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
            ofFloat11.addUpdateListener(this.S);
            ofFloat11.setDuration(10000L);
            ofFloat11.setInterpolator(new LinearInterpolator());
            this.Q.playTogether(ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11);
            this.Q.addListener(new g(this, 3));
            this.Q.start();
        } else {
            this.Q = new AnimatorSet();
            ValueAnimator ofFloat12 = ValueAnimator.ofFloat(this.f7087b.d, 180.0f);
            ofFloat12.addUpdateListener(bVar2);
            ofFloat12.setDuration(600L);
            pr prVar2 = pr.f30183f;
            ofFloat12.setInterpolator(prVar2);
            ValueAnimator ofFloat13 = ValueAnimator.ofFloat(180.0f, 360.0f);
            ofFloat13.addUpdateListener(bVar2);
            ofFloat13.setDuration(600L);
            ofFloat13.setStartDelay(2000L);
            ofFloat13.setInterpolator(prVar2);
            this.Q.playTogether(ofFloat12, ofFloat13);
            this.Q.addListener(new g(this, 2));
            this.Q.start();
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        this.B = true;
        h(this.F);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        a aVar = this.f7087b;
        if (aVar != null) {
            aVar.d = 0.0f;
            aVar.f7051g = 0.0f;
            aVar.f7049e = 0.0f;
        }
        this.J = false;
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.D = new h(this);
        this.f7088c = surfaceTexture;
        this.f7094w = i10;
        this.v = i11;
        this.f7093s = Math.max(0, ((int) ((1.0f / this.E) * 1000.0f)) - 1);
        this.D.start();
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.M = false;
        if (this.D != null) {
            this.f7095x = false;
            this.D = null;
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f7094w = i10;
        this.v = i11;
        a aVar = this.f7087b;
        if (aVar != null) {
            aVar.onSurfaceChanged(this.f7092r, i10, i11);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f7086a = false;
            i();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return this.O.onTouchEvent(motionEvent);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        a aVar = this.f7087b;
        j jVar = aVar.f7048c;
        if (jVar != null) {
            jVar.V = bitmap;
        }
        aVar.f7058o = bitmap;
    }

    public void setDialogVisible(boolean z4) {
        this.C = z4;
        if (z4) {
            AndroidUtilities.cancelRunOnUIThread(this.R);
            i();
            return;
        }
        h(this.F);
    }

    public synchronized void setPaused(boolean z4) {
        this.f7096y = z4;
    }

    public synchronized void setRenderer(a aVar) {
        this.f7087b = aVar;
        this.B = true;
    }

    public void setStarParticlesView(p2 p2Var) {
        this.K = p2Var;
    }

    public void g() {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
