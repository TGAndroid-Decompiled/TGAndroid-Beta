package ki;

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
import c8.i9;
import hi.d9;
import org.telegram.messenger.j9;
import org.telegram.messenger.ou;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.xb;
public abstract class x3 extends FrameLayout {
    public static final mt0 f18688c0 = new mt0(new i0.b(19), new i0.b(20));
    public Runnable E;
    public Runnable F;
    public w3 G;
    public r1.g H;
    public int I;
    public j9 J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public float R;
    public float S;
    public boolean T;
    public final float U;
    public final boolean V;
    public long W;
    public Object f18689a;
    public float f18690a0;
    public final ou f18691b;
    public float f18692b0;
    public boolean f18693c;
    public boolean d;
    public float f18694e;
    public float f18695f;
    public float h;
    public float f18696n;
    public float f18697r;
    public boolean f18698s;
    public r1.g f18699w;
    public boolean f18700x;
    public org.telegram.ui.web.s0 f18701y;

    public x3(Context context) {
        super(context);
        float f10;
        this.f18694e = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f18695f = 0.0f;
        this.h = -1.0f;
        this.f18696n = -2.1474836E9f;
        this.J = new i0.b(21);
        this.N = true;
        this.S = 0.0f;
        this.T = false;
        this.U = org.telegram.messenger.g0.L(60.0f);
        this.V = true;
        this.f18691b = new ou(context, new v3(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0));
        Point point = org.telegram.messenger.g0.f23609q;
        if (point.x > point.y) {
            f10 = 8.0f;
        } else {
            f10 = 64.0f;
        }
        this.I = org.telegram.messenger.g0.L(f10);
    }

    public final void a(boolean z10, boolean z11) {
        this.P = z10;
        this.Q = z11;
    }

    public final boolean b(boolean z10) {
        org.telegram.ui.web.s0 s0Var = this.f18701y;
        if (s0Var != null && s0Var.O) {
            if (z10) {
                if (!this.P) {
                    return false;
                }
                return true;
            } else if (!this.Q) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void c() {
        setTranslationY(Math.max(this.f18694e, this.f18695f + this.f18697r));
        org.telegram.messenger.g0.r(new kg.j1(this, 11));
        org.telegram.messenger.g0.h3(new kg.j1(this, 11));
        Runnable runnable = this.E;
        if (runnable != null) {
            runnable.run();
        }
        xb xbVar = xb.f41635w;
        if (xbVar != null) {
            xbVar.l();
        }
    }

    public final boolean d() {
        return this.f18693c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        if (canvas.isHardwareAccelerated()) {
            Object obj = this.f18689a;
            if (obj != null) {
                RenderNode d = n2.a0.d(obj);
                d.setPosition(0, 0, getWidth(), getHeight());
                recordingCanvas = d.beginRecording();
            } else {
                recordingCanvas = canvas;
            }
            super.dispatchDraw(recordingCanvas);
            Object obj2 = this.f18689a;
            if (obj2 != null) {
                RenderNode d2 = n2.a0.d(obj2);
                d2.endRecording();
                canvas.drawRenderNode(d2);
                return;
            }
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f18693c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.W = motionEvent.getEventTime();
                this.f18690a0 = motionEvent.getX();
                this.f18692b0 = motionEvent.getY();
                this.T = false;
                this.S = 0.0f;
                if (this.O) {
                    this.P = false;
                    this.Q = false;
                }
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionIndex = motionEvent.getActionIndex();
            if (Build.VERSION.SDK_INT >= 29) {
                obtain.setLocation(motionEvent.getRawX(actionIndex), motionEvent.getRawY(actionIndex));
            } else {
                obtain.setLocation(motionEvent.getX(actionIndex) + (motionEvent.getRawX() - motionEvent.getX()), motionEvent.getY(actionIndex) + (motionEvent.getRawY() - motionEvent.getY()));
            }
            boolean onTouchEvent = ((GestureDetector) this.f18691b.f25804b).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z10 = this.f18693c;
                this.d = false;
                this.f18693c = false;
                if (!this.K || this.M) {
                    if (this.f18700x) {
                        this.f18700x = false;
                    } else if (this.N && (!this.O || (this.f18697r != (-this.f18695f) + this.f18694e && b(false)))) {
                        float f10 = this.f18697r;
                        int i7 = this.I;
                        float f11 = -i7;
                        int i10 = (f10 > f11 ? 1 : (f10 == f11 ? 0 : -1));
                        boolean z11 = this.V;
                        if (i10 <= 0) {
                            if (z11) {
                                e((-this.f18695f) + this.f18694e);
                            }
                        } else if (f10 > f11 && f10 <= i7) {
                            if (z11) {
                                e(0.0f);
                            }
                        } else {
                            float x10 = motionEvent.getX();
                            float y10 = motionEvent.getY();
                            float f12 = this.f18690a0;
                            float f13 = this.f18692b0;
                            Typeface typeface = org.telegram.messenger.g0.f23581a;
                            float f14 = f12 - x10;
                            float f15 = f13 - y10;
                            float sqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
                            long eventTime = motionEvent.getEventTime() - this.W;
                            if (this.G != null && (eventTime > 250 || sqrt > org.telegram.messenger.g0.L(200.0f))) {
                                this.G.b(!z10);
                            } else if (z11) {
                                e((-this.f18695f) + this.f18694e);
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
        r1.g gVar;
        if (this.K && !z10) {
            f10 = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.f18697r != f10 && ((gVar = this.H) == null || ((float) gVar.f55748m.f55756i) != f10)) {
            this.f18696n = f10;
            r1.g gVar2 = this.f18699w;
            if (gVar2 != null) {
                gVar2.d();
            }
            r1.g gVar3 = this.H;
            if (gVar3 != null) {
                gVar3.d();
            }
            r1.g gVar4 = new r1.g(this, f18688c0, f10);
            gVar4.f55748m = org.telegram.ui.Cells.y0.n(f10, 1200.0f, 1.0f);
            gVar4.a(new bi.v0(1, this, runnable));
            this.H = gVar4;
            gVar4.h();
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.F;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public float getOffsetY() {
        return this.f18695f;
    }

    public Object getRenderNode() {
        if (this.f18689a == null && Build.VERSION.SDK_INT >= 31) {
            this.f18689a = android.support.v4.media.session.w.k();
        }
        return this.f18689a;
    }

    public float getSwipeOffsetY() {
        return this.f18697r;
    }

    public float getTopActionBarOffsetY() {
        return this.f18694e;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        super.onConfigurationChanged(configuration);
        Point point = org.telegram.messenger.g0.f23609q;
        if (point.x > point.y) {
            f10 = 8.0f;
        } else {
            f10 = 64.0f;
        }
        this.I = org.telegram.messenger.g0.L(f10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            this.d = true;
            this.f18693c = false;
        }
    }

    public void setAllowFullSizeSwipe(boolean z10) {
        this.M = z10;
    }

    public void setAllowSwipes(boolean z10) {
        if (this.N != z10) {
            this.N = z10;
        }
    }

    public void setDelegate(w3 w3Var) {
        this.G = w3Var;
    }

    public void setForceOffsetY(float f10) {
        this.f18695f = f10;
        c();
    }

    public void setFullSize(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            if (z10) {
                if (this.L) {
                    e(getTopActionBarOffsetY() + (-getOffsetY()));
                    return;
                }
                return;
            }
            e(0.0f);
        }
    }

    public void setIsKeyboardVisible(j9 j9Var) {
        this.J = j9Var;
    }

    public void setOffsetY(final float f10) {
        boolean z10;
        if (this.f18696n != -2.1474836E9f) {
            this.h = f10;
            return;
        }
        r1.g gVar = this.f18699w;
        if (gVar != null) {
            gVar.d();
        }
        final float f11 = this.f18695f;
        final float f12 = f10 - f11;
        if (Math.abs((this.f18697r + f11) - this.f18694e) <= org.telegram.messenger.g0.L(1.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        final boolean z11 = z10;
        if (!this.f18698s) {
            r1.g gVar2 = this.f18699w;
            if (gVar2 != null) {
                gVar2.d();
            }
            r1.g gVar3 = new r1.g(new r1.f(f11));
            gVar3.f55748m = org.telegram.ui.Cells.y0.n(f10, 1400.0f, 1.0f);
            gVar3.b(new r1.d() {
                @Override
                public final void a(r1.g gVar4, float f13, float f14) {
                    float f15;
                    x3 x3Var = x3.this;
                    x3Var.f18695f = f13;
                    float f16 = f12;
                    int i7 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
                    float f17 = f11;
                    if (i7 == 0) {
                        f15 = 1.0f;
                    } else {
                        f15 = (f13 - f17) / f16;
                    }
                    if (z11) {
                        x3Var.f18697r = i9.a(x3Var.f18697r - (Math.max(0.0f, f16) * f15), (-x3Var.f18695f) + x3Var.f18694e, (x3Var.getHeight() - x3Var.f18695f) + x3Var.f18694e);
                    }
                    r1.g gVar5 = x3Var.H;
                    if (gVar5 != null) {
                        r1.h hVar = gVar5.f55748m;
                        float f18 = x3Var.f18694e;
                        if (((float) hVar.f55756i) == (-f17) + f18) {
                            hVar.f55756i = (-f10) + f18;
                        }
                    }
                    x3Var.c();
                }
            });
            gVar3.a(new d9(this, f10, 1));
            this.f18699w = gVar3;
            gVar3.h();
            return;
        }
        this.f18695f = f10;
        if (z11) {
            this.f18697r = i9.a(this.f18697r - Math.max(0.0f, f12), (-this.f18695f) + this.f18694e, (getHeight() - this.f18695f) + this.f18694e);
        }
        c();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.F = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z10) {
        this.O = z10;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z10) {
        this.f18698s = z10;
    }

    public void setSwipeOffsetY(float f10) {
        this.f18697r = f10;
        c();
    }

    public void setTopActionBarOffsetY(float f10) {
        this.f18694e = f10;
        c();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
    }

    public void setWebView(org.telegram.ui.web.s0 s0Var) {
        this.f18701y = s0Var;
    }
}
