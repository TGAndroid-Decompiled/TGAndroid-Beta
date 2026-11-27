package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.view.Choreographer;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
public abstract class zl3 extends GLSurfaceView implements Choreographer.FrameCallback {
    public static final int L = 0;
    public volatile boolean E;
    public volatile int F;
    public long G;
    public volatile int H;
    public final ArrayList I;
    public float J;
    public float K;
    public final ys4 a;
    public final GestureDetector b;
    public eva c;
    public ValueAnimator d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public volatile boolean r;
    public boolean s;
    public Runnable w;
    public volatile float x;
    public volatile boolean y;

    public zl3(Context context) {
        super(context);
        this.f = true;
        this.x = 1.0f;
        this.I = new ArrayList();
        this.J = 1.0f;
        this.K = 1.0f;
        setEGLContextClientVersion(3);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-3);
        setZOrderOnTop(true);
        this.a = new ys4(context, 1, 4);
        setRenderer(new xl3(this));
        setRenderMode(0);
        this.b = new GestureDetector(context, new yl3(this, (byte) 0));
    }

    public final void a() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.removeAllListeners();
        this.d.cancel();
        this.d = null;
    }

    public final void b(ArrayList arrayList) {
        int i;
        ArrayList arrayList2 = new ArrayList();
        synchronized (this.I) {
            int size = arrayList.size();
            i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                Runnable runnable = (Runnable) obj;
                if (this.I.remove(runnable)) {
                    arrayList2.add(runnable);
                }
            }
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((Runnable) obj2).run();
        }
    }

    public final void c() {
        a();
        ys4 ys4Var = this.a;
        float f = ys4Var.d;
        float f2 = ys4Var.i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.d = ofFloat;
        ofFloat.setDuration(600L);
        this.d.setInterpolator(new OvershootInterpolator());
        this.d.addUpdateListener(new gy1(this, f, f2, (byte) 1));
        this.d.addListener(new cn2(this, (byte) 12));
        this.d.start();
        eva evaVar = this.c;
        if (evaVar != null) {
            evaVar.b(Math.abs(f + f2));
        }
    }

    public final void d(int i) {
        if (this.e && i == this.F) {
            vl3 vl3Var = new vl3(this, i, (byte) 0);
            if (Build.VERSION.SDK_INT >= 29 && isHardwareAccelerated()) {
                getViewTreeObserver().registerFrameCommitCallback(vl3Var);
                getRootView().invalidate();
                return;
            }
            postOnAnimation(vl3Var);
        }
    }

    @Override
    public final void doFrame(long j) {
        float f;
        if (this.e && !this.f && !this.r) {
            if (Build.VERSION.SDK_INT < 34) {
                f = getAlpha();
            } else {
                f = 1.0f;
            }
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                f *= ((View) parent).getAlpha();
            }
            this.x = f;
            long j2 = this.G;
            if (j2 != 0) {
                if (j >= j2) {
                    if (j - j2 <= 16666666) {
                        j = j2;
                        this.G = j + 16666666;
                        requestRender();
                    }
                }
                Choreographer.getInstance().postFrameCallback(this);
            }
            this.G = j;
            this.G = j + 16666666;
            requestRender();
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void e() {
        if (this.e && !this.f && this.h && !this.n && this.d == null) {
            float f = this.a.d;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 360.0f + f);
            this.d = ofFloat;
            ofFloat.setDuration(10540L);
            this.d.setRepeatCount(-1);
            this.d.setInterpolator(new LinearInterpolator());
            this.d.addUpdateListener(new az1(this, (byte) 18));
            this.d.start();
        }
    }

    public final void f() {
        if (this.K == 1.0f) {
            getHolder().setSizeFromLayout();
        } else if (getWidth() > 0 && getHeight() > 0) {
            getHolder().setFixedSize(Math.round(getWidth() * this.K), Math.round(getHeight() * this.K));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        setPaused(this.f);
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        this.e = false;
        this.s = false;
        this.H++;
        Choreographer.getInstance().removeFrameCallback(this);
        this.G = 0L;
        a();
        super.onDetachedFromWindow();
        synchronized (this.I) {
            arrayList = new ArrayList(this.I);
        }
        b(arrayList);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.K > 1.0f) {
            f();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.n = false;
            c();
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return this.b.onTouchEvent(motionEvent);
    }

    public void setIdleAnimationEnabled(boolean z) {
        this.h = z;
        if (z) {
            e();
        } else {
            a();
        }
    }

    public void setPaused(boolean z) {
        this.f = z;
        Choreographer.getInstance().removeFrameCallback(this);
        this.G = 0L;
        if (z) {
            a();
        } else if (this.e && !this.r) {
            e();
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void setRenderScale(float f) {
        float max = Math.max(1.0f, Math.min(this.K, f));
        if (this.J == max) {
            return;
        }
        this.J = max;
        this.a.h = max / this.K;
    }

    public void setStarParticlesView(eva evaVar) {
        this.c = evaVar;
    }

    @Override
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.F++;
        this.E = false;
        this.y = false;
        this.s = false;
        super.surfaceCreated(surfaceHolder);
    }

    @Override
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ArrayList arrayList;
        this.F++;
        this.E = false;
        this.y = false;
        this.s = false;
        super.surfaceDestroyed(surfaceHolder);
        synchronized (this.I) {
            arrayList = new ArrayList(this.I);
        }
        b(arrayList);
    }

    @Override
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        ArrayList arrayList;
        synchronized (this.I) {
            this.I.add(new dt2(runnable, (byte) 1));
            arrayList = new ArrayList(this.I);
        }
        super.surfaceRedrawNeededAsync(surfaceHolder, new wd3(this, arrayList, (byte) 12));
    }
}
