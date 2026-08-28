package mh;

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
import kh.ga;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.pu0;
public abstract class f4 extends FrameLayout {
    public static final pu0 U = new pu0(new mg.b(10), new mg.b(11));
    public Runnable A;
    public e4 B;
    public o1.j C;
    public int D;
    public GenericProvider E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public float M;
    public float N;
    public boolean O;
    public final float P;
    public final boolean Q;
    public long R;
    public float S;
    public float T;
    public Object f17837a;
    public final m5.c0 f17838b;
    public boolean f17839c;
    public boolean d;
    public float f17840e;
    public float f17841f;
    public float h;
    public float f17842n;
    public float f17843r;
    public boolean f17844s;
    public o1.j v;
    public boolean f17845w;
    public org.telegram.ui.web.v0 f17846x;
    public Runnable f17847y;

    public f4(Context context) {
        super(context);
        float f10;
        this.f17840e = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f17841f = 0.0f;
        this.h = -1.0f;
        this.f17842n = -2.1474836E9f;
        this.E = new mg.b(12);
        this.I = true;
        this.N = 0.0f;
        this.O = false;
        this.P = AndroidUtilities.dp(60.0f);
        this.Q = true;
        this.f17838b = new m5.c0(context, new d4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0));
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            f10 = 8.0f;
        } else {
            f10 = 64.0f;
        }
        this.D = AndroidUtilities.dp(f10);
    }

    public final void a(boolean z10, boolean z11) {
        this.K = z10;
        this.L = z11;
    }

    public final boolean b(boolean z10) {
        org.telegram.ui.web.v0 v0Var = this.f17846x;
        if (v0Var != null && v0Var.J) {
            if (z10) {
                if (!this.K) {
                    return false;
                }
                return true;
            } else if (!this.L) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void c() {
        setTranslationY(Math.max(this.f17840e, this.f17841f + this.f17843r));
        AndroidUtilities.cancelRunOnUIThread(new m2(this, 1));
        AndroidUtilities.runOnUIThread(new m2(this, 1));
        Runnable runnable = this.f17847y;
        if (runnable != null) {
            runnable.run();
        }
        gc gcVar = gc.f28729w;
        if (gcVar != null) {
            gcVar.l();
        }
    }

    public final boolean d() {
        return this.f17839c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        if (canvas.isHardwareAccelerated()) {
            Object obj = this.f17837a;
            if (obj != null) {
                RenderNode c10 = org.telegram.messenger.b.c(obj);
                c10.setPosition(0, 0, getWidth(), getHeight());
                recordingCanvas = c10.beginRecording();
            } else {
                recordingCanvas = canvas;
            }
            super.dispatchDraw(recordingCanvas);
            Object obj2 = this.f17837a;
            if (obj2 != null) {
                RenderNode c11 = org.telegram.messenger.b.c(obj2);
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
        if (!this.f17839c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.R = motionEvent.getEventTime();
                this.S = motionEvent.getX();
                this.T = motionEvent.getY();
                this.O = false;
                this.N = 0.0f;
                if (this.J) {
                    this.K = false;
                    this.L = false;
                }
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionIndex = motionEvent.getActionIndex();
            if (Build.VERSION.SDK_INT >= 29) {
                obtain.setLocation(motionEvent.getRawX(actionIndex), motionEvent.getRawY(actionIndex));
            } else {
                obtain.setLocation(motionEvent.getX(actionIndex) + (motionEvent.getRawX() - motionEvent.getX()), motionEvent.getY(actionIndex) + (motionEvent.getRawY() - motionEvent.getY()));
            }
            boolean onTouchEvent = ((GestureDetector) this.f17838b.f17378b).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z10 = this.f17839c;
                this.d = false;
                this.f17839c = false;
                if (!this.F || this.H) {
                    if (this.f17845w) {
                        this.f17845w = false;
                    } else if (this.I && (!this.J || (this.f17843r != (-this.f17841f) + this.f17840e && b(false)))) {
                        float f10 = this.f17843r;
                        int i9 = this.D;
                        float f11 = -i9;
                        boolean z11 = this.Q;
                        if (f10 <= f11) {
                            if (z11) {
                                e((-this.f17841f) + this.f17840e);
                            }
                        } else if (f10 > f11 && f10 <= i9) {
                            if (z11) {
                                e(0.0f);
                            }
                        } else {
                            float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), this.S, this.T);
                            long eventTime = motionEvent.getEventTime() - this.R;
                            if (this.B != null && (eventTime > 250 || distance > AndroidUtilities.dp(200.0f))) {
                                this.B.j(!z10);
                            } else if (z11) {
                                e((-this.f17841f) + this.f17840e);
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

    public final void e(float f10) {
        f(f10, false, null);
    }

    public final void f(float f10, boolean z10, Runnable runnable) {
        o1.j jVar;
        if (this.F && !z10) {
            f10 = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.f17843r != f10 && ((jVar = this.C) == null || ((float) jVar.f18800u.f18807i) != f10)) {
            this.f17842n = f10;
            o1.j jVar2 = this.v;
            if (jVar2 != null) {
                jVar2.c();
            }
            o1.j jVar3 = this.C;
            if (jVar3 != null) {
                jVar3.c();
            }
            o1.j jVar4 = new o1.j(this, U, f10);
            jVar4.f18800u = org.telegram.ui.Cells.j2.i(f10, 1200.0f, 1.0f);
            jVar4.a(new c4(0, this, runnable));
            this.C = jVar4;
            jVar4.f();
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.A;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public float getOffsetY() {
        return this.f17841f;
    }

    public Object getRenderNode() {
        if (this.f17837a == null && Build.VERSION.SDK_INT >= 31) {
            this.f17837a = android.support.v4.media.session.z.j();
        }
        return this.f17837a;
    }

    public float getSwipeOffsetY() {
        return this.f17843r;
    }

    public float getTopActionBarOffsetY() {
        return this.f17840e;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        super.onConfigurationChanged(configuration);
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            f10 = 8.0f;
        } else {
            f10 = 64.0f;
        }
        this.D = AndroidUtilities.dp(f10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            this.d = true;
            this.f17839c = false;
        }
    }

    public void setAllowFullSizeSwipe(boolean z10) {
        this.H = z10;
    }

    public void setAllowSwipes(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
        }
    }

    public void setDelegate(e4 e4Var) {
        this.B = e4Var;
    }

    public void setForceOffsetY(float f10) {
        this.f17841f = f10;
        c();
    }

    public void setFullSize(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            if (z10) {
                if (this.G) {
                    e(getTopActionBarOffsetY() + (-getOffsetY()));
                    return;
                }
                return;
            }
            e(0.0f);
        }
    }

    public void setIsKeyboardVisible(GenericProvider<Void, Boolean> genericProvider) {
        this.E = genericProvider;
    }

    public void setOffsetY(final float f10) {
        final boolean z10;
        if (this.f17842n != -2.1474836E9f) {
            this.h = f10;
            return;
        }
        o1.j jVar = this.v;
        if (jVar != null) {
            jVar.c();
        }
        final float f11 = this.f17841f;
        final float f12 = f10 - f11;
        if (Math.abs((this.f17843r + f11) - this.f17840e) <= AndroidUtilities.dp(1.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f17844s) {
            o1.j jVar2 = this.v;
            if (jVar2 != null) {
                jVar2.c();
            }
            o1.j jVar3 = new o1.j(new gb.a(f11));
            jVar3.f18800u = org.telegram.ui.Cells.j2.i(f10, 1400.0f, 1.0f);
            jVar3.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f13, float f14) {
                    float f15;
                    f4 f4Var = f4.this;
                    f4Var.f17841f = f13;
                    float f16 = f12;
                    float f17 = f11;
                    if (f16 == 0.0f) {
                        f15 = 1.0f;
                    } else {
                        f15 = (f13 - f17) / f16;
                    }
                    if (z10) {
                        f4Var.f17843r = g7.n.a(f4Var.f17843r - (Math.max(0.0f, f16) * f15), (-f4Var.f17841f) + f4Var.f17840e, (f4Var.getHeight() - f4Var.f17841f) + f4Var.f17840e);
                    }
                    o1.j jVar4 = f4Var.C;
                    if (jVar4 != null) {
                        o1.k kVar = jVar4.f18800u;
                        float f18 = (float) kVar.f18807i;
                        float f19 = f4Var.f17840e;
                        if (f18 == (-f17) + f19) {
                            kVar.f18807i = (-f10) + f19;
                        }
                    }
                    f4Var.c();
                }
            });
            jVar3.a(new ga(this, f10, 1));
            this.v = jVar3;
            jVar3.f();
            return;
        }
        this.f17841f = f10;
        if (z10) {
            this.f17843r = g7.n.a(this.f17843r - Math.max(0.0f, f12), (-this.f17841f) + this.f17840e, (getHeight() - this.f17841f) + this.f17840e);
        }
        c();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.A = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.f17847y = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z10) {
        this.J = z10;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z10) {
        this.f17844s = z10;
    }

    public void setSwipeOffsetY(float f10) {
        this.f17843r = f10;
        c();
    }

    public void setTopActionBarOffsetY(float f10) {
        this.f17840e = f10;
        c();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
    }

    public void setWebView(org.telegram.ui.web.v0 v0Var) {
        this.f17846x = v0Var;
    }
}
