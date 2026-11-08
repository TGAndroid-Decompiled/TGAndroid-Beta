package hi;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import c8.j9;
import fi.f9;
import fi.h9;
import org.telegram.messenger.k9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.vy;
public abstract class b4 extends FrameLayout {
    public static final lt0 f14559b0 = new lt0(new g2.c(29), new x3(0));
    public Runnable D;
    public Runnable E;
    public a4 F;
    public r1.g G;
    public int H;
    public k9 I;
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
    public Object f14560a;
    public float f14561a0;
    public final vy f14562b;
    public boolean f14563c;
    public boolean d;
    public float f14564e;
    public float f14565f;
    public float h;
    public float f14566n;
    public float f14567r;
    public boolean f14568s;
    public r1.g f14569w;
    public boolean f14570x;
    public org.telegram.ui.web.u0 f14571y;

    public b4(Context context) {
        super(context);
        float f10;
        this.f14564e = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f14565f = 0.0f;
        this.h = -1.0f;
        this.f14566n = -2.1474836E9f;
        this.I = new x3(1);
        this.M = true;
        this.R = 0.0f;
        this.S = false;
        this.T = org.telegram.messenger.g0.L(60.0f);
        this.U = true;
        this.f14562b = new vy(context, new z3(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0));
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            f10 = 8.0f;
        } else {
            f10 = 64.0f;
        }
        this.H = org.telegram.messenger.g0.L(f10);
    }

    public final void a(boolean z9, boolean z10) {
        this.O = z9;
        this.P = z10;
    }

    public final boolean b(boolean z9) {
        org.telegram.ui.web.u0 u0Var = this.f14571y;
        if (u0Var != null && u0Var.N) {
            if (z9) {
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
        setTranslationY(Math.max(this.f14564e, this.f14565f + this.f14567r));
        org.telegram.messenger.g0.r(new h9(this, 20));
        org.telegram.messenger.g0.h3(new h9(this, 20));
        Runnable runnable = this.D;
        if (runnable != null) {
            runnable.run();
        }
        cc ccVar = cc.f32537w;
        if (ccVar != null) {
            ccVar.l();
        }
    }

    public final boolean d() {
        return this.f14563c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        if (canvas.isHardwareAccelerated()) {
            Object obj = this.f14560a;
            if (obj != null) {
                RenderNode e10 = ni.a.e(obj);
                e10.setPosition(0, 0, getWidth(), getHeight());
                recordingCanvas = e10.beginRecording();
            } else {
                recordingCanvas = canvas;
            }
            super.dispatchDraw(recordingCanvas);
            Object obj2 = this.f14560a;
            if (obj2 != null) {
                RenderNode e11 = ni.a.e(obj2);
                e11.endRecording();
                canvas.drawRenderNode(e11);
                return;
            }
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f14563c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.V = motionEvent.getEventTime();
                this.W = motionEvent.getX();
                this.f14561a0 = motionEvent.getY();
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
            boolean onTouchEvent = ((GestureDetector) this.f14562b.f39747b).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z9 = this.f14563c;
                this.d = false;
                this.f14563c = false;
                if (!this.J || this.L) {
                    if (this.f14570x) {
                        this.f14570x = false;
                    } else if (this.M && (!this.N || (this.f14567r != (-this.f14565f) + this.f14564e && b(false)))) {
                        float f10 = this.f14567r;
                        int i7 = this.H;
                        float f11 = -i7;
                        int i10 = (f10 > f11 ? 1 : (f10 == f11 ? 0 : -1));
                        boolean z10 = this.U;
                        if (i10 <= 0) {
                            if (z10) {
                                e((-this.f14565f) + this.f14564e);
                            }
                        } else if (f10 > f11 && f10 <= i7) {
                            if (z10) {
                                e(0.0f);
                            }
                        } else {
                            float x10 = motionEvent.getX();
                            float y10 = motionEvent.getY();
                            float f12 = this.W;
                            float f13 = this.f14561a0;
                            Typeface typeface = org.telegram.messenger.g0.f22535a;
                            float f14 = f12 - x10;
                            float f15 = f13 - y10;
                            float sqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
                            long eventTime = motionEvent.getEventTime() - this.V;
                            if (this.F != null && (eventTime > 250 || sqrt > org.telegram.messenger.g0.L(200.0f))) {
                                this.F.q(!z9);
                            } else if (z10) {
                                e((-this.f14565f) + this.f14564e);
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

    public final void f(float f10, boolean z9, Runnable runnable) {
        r1.g gVar;
        if (this.J && !z9) {
            f10 = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.f14567r != f10 && ((gVar = this.G) == null || ((float) gVar.f54267m.f54275i) != f10)) {
            this.f14566n = f10;
            r1.g gVar2 = this.f14569w;
            if (gVar2 != null) {
                gVar2.d();
            }
            r1.g gVar3 = this.G;
            if (gVar3 != null) {
                gVar3.d();
            }
            r1.g gVar4 = new r1.g(this, f14559b0, f10);
            gVar4.f54267m = org.telegram.ui.Cells.f1.o(f10, 1200.0f, 1.0f);
            gVar4.a(new y3(0, this, runnable));
            this.G = gVar4;
            gVar4.h();
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
        return this.f14565f;
    }

    public Object getRenderNode() {
        if (this.f14560a == null && Build.VERSION.SDK_INT >= 31) {
            this.f14560a = android.support.v4.media.session.w.k();
        }
        return this.f14560a;
    }

    public float getSwipeOffsetY() {
        return this.f14567r;
    }

    public float getTopActionBarOffsetY() {
        return this.f14564e;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        super.onConfigurationChanged(configuration);
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            f10 = 8.0f;
        } else {
            f10 = 64.0f;
        }
        this.H = org.telegram.messenger.g0.L(f10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        if (z9) {
            this.d = true;
            this.f14563c = false;
        }
    }

    public void setAllowFullSizeSwipe(boolean z9) {
        this.L = z9;
    }

    public void setAllowSwipes(boolean z9) {
        if (this.M != z9) {
            this.M = z9;
        }
    }

    public void setDelegate(a4 a4Var) {
        this.F = a4Var;
    }

    public void setForceOffsetY(float f10) {
        this.f14565f = f10;
        c();
    }

    public void setFullSize(boolean z9) {
        if (this.J != z9) {
            this.J = z9;
            if (z9) {
                if (this.K) {
                    e(getTopActionBarOffsetY() + (-getOffsetY()));
                    return;
                }
                return;
            }
            e(0.0f);
        }
    }

    public void setIsKeyboardVisible(k9 k9Var) {
        this.I = k9Var;
    }

    public void setOffsetY(final float f10) {
        boolean z9;
        if (this.f14566n != -2.1474836E9f) {
            this.h = f10;
            return;
        }
        r1.g gVar = this.f14569w;
        if (gVar != null) {
            gVar.d();
        }
        final float f11 = this.f14565f;
        final float f12 = f10 - f11;
        if (Math.abs((this.f14567r + f11) - this.f14564e) <= org.telegram.messenger.g0.L(1.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        final boolean z10 = z9;
        if (!this.f14568s) {
            r1.g gVar2 = this.f14569w;
            if (gVar2 != null) {
                gVar2.d();
            }
            r1.g gVar3 = new r1.g(new r1.f(f11));
            gVar3.f54267m = org.telegram.ui.Cells.f1.o(f10, 1400.0f, 1.0f);
            gVar3.b(new r1.d() {
                @Override
                public final void a(r1.g gVar4, float f13, float f14) {
                    float f15;
                    b4 b4Var = b4.this;
                    b4Var.f14565f = f13;
                    float f16 = f12;
                    int i7 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
                    float f17 = f11;
                    if (i7 == 0) {
                        f15 = 1.0f;
                    } else {
                        f15 = (f13 - f17) / f16;
                    }
                    if (z10) {
                        b4Var.f14567r = j9.a(b4Var.f14567r - (Math.max(0.0f, f16) * f15), (-b4Var.f14565f) + b4Var.f14564e, (b4Var.getHeight() - b4Var.f14565f) + b4Var.f14564e);
                    }
                    r1.g gVar5 = b4Var.G;
                    if (gVar5 != null) {
                        r1.h hVar = gVar5.f54267m;
                        float f18 = b4Var.f14564e;
                        if (((float) hVar.f54275i) == (-f17) + f18) {
                            hVar.f54275i = (-f10) + f18;
                        }
                    }
                    b4Var.c();
                }
            });
            gVar3.a(new f9(this, f10, 1));
            this.f14569w = gVar3;
            gVar3.h();
            return;
        }
        this.f14565f = f10;
        if (z10) {
            this.f14567r = j9.a(this.f14567r - Math.max(0.0f, f12), (-this.f14565f) + this.f14564e, (getHeight() - this.f14565f) + this.f14564e);
        }
        c();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.D = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z9) {
        this.N = z9;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z9) {
        this.f14568s = z9;
    }

    public void setSwipeOffsetY(float f10) {
        this.f14567r = f10;
        c();
    }

    public void setTopActionBarOffsetY(float f10) {
        this.f14564e = f10;
        c();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
    }

    public void setWebView(org.telegram.ui.web.u0 u0Var) {
        this.f14571y = u0Var;
    }
}
