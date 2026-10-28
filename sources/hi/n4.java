package hi;

import a8.ee;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import fi.aa;
import fi.ua;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qw0;
public abstract class n4 extends FrameLayout {
    public static final qw0 f13152b0 = new qw0(new gh.a(16), new gh.a(17));
    public Runnable E;
    public m4 F;
    public o1.j G;
    public int H;
    public GenericProvider I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public float Q;
    public float R;
    public boolean S;
    public final float T;
    public final boolean U;
    public long V;
    public float W;
    public Object f13153a;
    public float f13154a0;
    public final jg.s0 f13155b;
    public boolean f13156c;
    public boolean d;
    public float e;
    public float f13157f;
    public float h;
    public float f13158n;
    public float f13159r;
    public boolean f13160s;
    public o1.j v;
    public boolean f13161w;
    public org.telegram.ui.web.x0 f13162x;
    public Runnable f13163y;

    public n4(Context context) {
        super(context);
        float f7;
        this.e = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f13157f = 0.0f;
        this.h = -1.0f;
        this.f13158n = -2.1474836E9f;
        this.I = new gh.a(18);
        this.M = true;
        this.R = 0.0f;
        this.S = false;
        this.T = AndroidUtilities.dp(60.0f);
        this.U = true;
        this.f13155b = new jg.s0(context, new l4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0));
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            f7 = 8.0f;
        } else {
            f7 = 64.0f;
        }
        this.H = AndroidUtilities.dp(f7);
    }

    public final void a(boolean z10, boolean z11) {
        this.O = z10;
        this.P = z11;
    }

    public final boolean b(boolean z10) {
        org.telegram.ui.web.x0 x0Var = this.f13162x;
        if (x0Var != null && x0Var.N) {
            if (z10) {
                if (!this.O) {
                    return false;
                }
                return true;
            } else if (!this.P) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void c() {
        setTranslationY(Math.max(this.e, this.f13157f + this.f13159r));
        AndroidUtilities.cancelRunOnUIThread(new ua(this, 16));
        AndroidUtilities.runOnUIThread(new ua(this, 16));
        Runnable runnable = this.f13163y;
        if (runnable != null) {
            runnable.run();
        }
        qc qcVar = qc.f31854x;
        if (qcVar != null) {
            qcVar.l();
        }
    }

    public final boolean d() {
        return this.f13156c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        if (canvas.isHardwareAccelerated()) {
            Object obj = this.f13153a;
            if (obj != null) {
                RenderNode c10 = org.telegram.messenger.d.c(obj);
                c10.setPosition(0, 0, getWidth(), getHeight());
                recordingCanvas = c10.beginRecording();
            } else {
                recordingCanvas = canvas;
            }
            super.dispatchDraw(recordingCanvas);
            Object obj2 = this.f13153a;
            if (obj2 != null) {
                RenderNode c11 = org.telegram.messenger.d.c(obj2);
                c11.endRecording();
                canvas.drawRenderNode(c11);
                return;
            }
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f13156c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.V = motionEvent.getEventTime();
                this.W = motionEvent.getX();
                this.f13154a0 = motionEvent.getY();
                this.S = false;
                this.R = 0.0f;
                if (this.N) {
                    this.O = false;
                    this.P = false;
                }
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionIndex = motionEvent.getActionIndex();
            if (Build.VERSION.SDK_INT >= 29) {
                obtain.setLocation(motionEvent.getRawX(actionIndex), motionEvent.getRawY(actionIndex));
            } else {
                obtain.setLocation(motionEvent.getX(actionIndex) + (motionEvent.getRawX() - motionEvent.getX()), motionEvent.getY(actionIndex) + (motionEvent.getRawY() - motionEvent.getY()));
            }
            boolean onTouchEvent = ((GestureDetector) this.f13155b.f15827b).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z10 = this.f13156c;
                this.d = false;
                this.f13156c = false;
                if (!this.J || this.L) {
                    if (this.f13161w) {
                        this.f13161w = false;
                    } else if (this.M && (!this.N || (this.f13159r != (-this.f13157f) + this.e && b(false)))) {
                        float f7 = this.f13159r;
                        int i10 = this.H;
                        float f10 = -i10;
                        int i11 = (f7 > f10 ? 1 : (f7 == f10 ? 0 : -1));
                        boolean z11 = this.U;
                        if (i11 <= 0) {
                            if (z11) {
                                e((-this.f13157f) + this.e);
                            }
                        } else if (f7 > f10 && f7 <= i10) {
                            if (z11) {
                                e(0.0f);
                            }
                        } else {
                            float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), this.W, this.f13154a0);
                            long eventTime = motionEvent.getEventTime() - this.V;
                            if (this.F != null && (eventTime > 250 || distance > AndroidUtilities.dp(200.0f))) {
                                this.F.o(!z10);
                            } else if (z11) {
                                e((-this.f13157f) + this.e);
                            }
                        }
                    }
                }
            }
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if ((!dispatchTouchEvent && !onTouchEvent && motionEvent.getAction() == 0) || dispatchTouchEvent || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    public final void e(float f7) {
        f(f7, false, null);
    }

    public final void f(float f7, boolean z10, Runnable runnable) {
        o1.j jVar;
        if (this.J && !z10) {
            f7 = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.f13159r != f7 && ((jVar = this.G) == null || ((float) jVar.f18968u.f18974i) != f7)) {
            this.f13158n = f7;
            o1.j jVar2 = this.v;
            if (jVar2 != null) {
                jVar2.c();
            }
            o1.j jVar3 = this.G;
            if (jVar3 != null) {
                jVar3.c();
            }
            o1.j jVar4 = new o1.j(this, f13152b0, f7);
            jVar4.f18968u = org.telegram.ui.d3.l(f7, 1200.0f, 1.0f);
            jVar4.a(new k4(0, this, runnable));
            this.G = jVar4;
            jVar4.h();
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.E;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public float getOffsetY() {
        return this.f13157f;
    }

    public Object getRenderNode() {
        if (this.f13153a == null && Build.VERSION.SDK_INT >= 31) {
            this.f13153a = android.support.v4.media.session.x.k();
        }
        return this.f13153a;
    }

    public float getSwipeOffsetY() {
        return this.f13159r;
    }

    public float getTopActionBarOffsetY() {
        return this.e;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f7;
        super.onConfigurationChanged(configuration);
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            f7 = 8.0f;
        } else {
            f7 = 64.0f;
        }
        this.H = AndroidUtilities.dp(f7);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            this.d = true;
            this.f13156c = false;
        }
    }

    public void setAllowFullSizeSwipe(boolean z10) {
        this.L = z10;
    }

    public void setAllowSwipes(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
        }
    }

    public void setDelegate(m4 m4Var) {
        this.F = m4Var;
    }

    public void setForceOffsetY(float f7) {
        this.f13157f = f7;
        c();
    }

    public void setFullSize(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            if (z10) {
                if (this.K) {
                    e(getTopActionBarOffsetY() + (-getOffsetY()));
                    return;
                }
                return;
            }
            e(0.0f);
        }
    }

    public void setIsKeyboardVisible(GenericProvider<Void, Boolean> genericProvider) {
        this.I = genericProvider;
    }

    public void setOffsetY(final float f7) {
        boolean z10;
        if (this.f13158n != -2.1474836E9f) {
            this.h = f7;
            return;
        }
        o1.j jVar = this.v;
        if (jVar != null) {
            jVar.c();
        }
        final float f10 = this.f13157f;
        final float f11 = f7 - f10;
        if (Math.abs((this.f13159r + f10) - this.e) <= AndroidUtilities.dp(1.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        final boolean z11 = z10;
        if (!this.f13160s) {
            o1.j jVar2 = this.v;
            if (jVar2 != null) {
                jVar2.c();
            }
            o1.j jVar3 = new o1.j(new ac.a(f10));
            jVar3.f18968u = org.telegram.ui.d3.l(f7, 1400.0f, 1.0f);
            jVar3.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f12, float f13) {
                    float f14;
                    n4 n4Var = n4.this;
                    n4Var.f13157f = f12;
                    float f15 = f11;
                    int i10 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
                    float f16 = f10;
                    if (i10 == 0) {
                        f14 = 1.0f;
                    } else {
                        f14 = (f12 - f16) / f15;
                    }
                    if (z11) {
                        n4Var.f13159r = ee.a(n4Var.f13159r - (Math.max(0.0f, f15) * f14), (-n4Var.f13157f) + n4Var.e, (n4Var.getHeight() - n4Var.f13157f) + n4Var.e);
                    }
                    o1.j jVar4 = n4Var.G;
                    if (jVar4 != null) {
                        o1.k kVar = jVar4.f18968u;
                        float f17 = n4Var.e;
                        if (((float) kVar.f18974i) == (-f16) + f17) {
                            kVar.f18974i = (-f7) + f17;
                        }
                    }
                    n4Var.c();
                }
            });
            jVar3.a(new aa(this, f7, 1));
            this.v = jVar3;
            jVar3.h();
            return;
        }
        this.f13157f = f7;
        if (z11) {
            this.f13159r = ee.a(this.f13159r - Math.max(0.0f, f11), (-this.f13157f) + this.e, (getHeight() - this.f13157f) + this.e);
        }
        c();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.f13163y = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z10) {
        this.N = z10;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z10) {
        this.f13160s = z10;
    }

    public void setSwipeOffsetY(float f7) {
        this.f13159r = f7;
        c();
    }

    public void setTopActionBarOffsetY(float f7) {
        this.e = f7;
        c();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
    }

    public void setWebView(org.telegram.ui.web.x0 x0Var) {
        this.f13162x = x0Var;
    }
}
