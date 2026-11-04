package ii;

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
import b8.be;
import gi.f6;
import gi.g9;
import gi.i8;
import org.telegram.messenger.e9;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.y00;
public abstract class c4 extends FrameLayout {
    public static final kt0 f14871c0 = new kt0(new i8(29), new y3(0));
    public Runnable E;
    public Runnable F;
    public b4 G;
    public q1.g H;
    public int I;
    public e9 J;
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
    public Object f14872a;
    public float f14873a0;
    public final y00 f14874b;
    public float f14875b0;
    public boolean f14876c;
    public boolean d;
    public float f14877e;
    public float f14878f;
    public float h;
    public float f14879n;
    public float f14880r;
    public boolean f14881s;
    public q1.g f14882w;
    public boolean f14883x;
    public org.telegram.ui.web.t0 f14884y;

    public c4(Context context) {
        super(context);
        float f10;
        this.f14877e = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f14878f = 0.0f;
        this.h = -1.0f;
        this.f14879n = -2.1474836E9f;
        this.J = new y3(1);
        this.N = true;
        this.S = 0.0f;
        this.T = false;
        this.U = org.telegram.messenger.g0.L(60.0f);
        this.V = true;
        this.f14874b = new y00(context, new a4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0));
        Point point = org.telegram.messenger.g0.f22608q;
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
        org.telegram.ui.web.t0 t0Var = this.f14884y;
        if (t0Var != null && t0Var.O) {
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
        setTranslationY(Math.max(this.f14877e, this.f14878f + this.f14880r));
        org.telegram.messenger.g0.r(new f6(this, 23));
        org.telegram.messenger.g0.h3(new f6(this, 23));
        Runnable runnable = this.E;
        if (runnable != null) {
            runnable.run();
        }
        ac acVar = ac.f31784w;
        if (acVar != null) {
            acVar.l();
        }
    }

    public final boolean d() {
        return this.f14876c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        if (canvas.isHardwareAccelerated()) {
            Object obj = this.f14872a;
            if (obj != null) {
                RenderNode d = o4.v0.d(obj);
                d.setPosition(0, 0, getWidth(), getHeight());
                recordingCanvas = d.beginRecording();
            } else {
                recordingCanvas = canvas;
            }
            super.dispatchDraw(recordingCanvas);
            Object obj2 = this.f14872a;
            if (obj2 != null) {
                RenderNode d10 = o4.v0.d(obj2);
                d10.endRecording();
                canvas.drawRenderNode(d10);
                return;
            }
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f14876c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.W = motionEvent.getEventTime();
                this.f14873a0 = motionEvent.getX();
                this.f14875b0 = motionEvent.getY();
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
            boolean onTouchEvent = ((GestureDetector) this.f14874b.f40562a).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z10 = this.f14876c;
                this.d = false;
                this.f14876c = false;
                if (!this.K || this.M) {
                    if (this.f14883x) {
                        this.f14883x = false;
                    } else if (this.N && (!this.O || (this.f14880r != (-this.f14878f) + this.f14877e && b(false)))) {
                        float f10 = this.f14880r;
                        int i3 = this.I;
                        float f11 = -i3;
                        int i10 = (f10 > f11 ? 1 : (f10 == f11 ? 0 : -1));
                        boolean z11 = this.V;
                        if (i10 <= 0) {
                            if (z11) {
                                e((-this.f14878f) + this.f14877e);
                            }
                        } else if (f10 > f11 && f10 <= i3) {
                            if (z11) {
                                e(0.0f);
                            }
                        } else {
                            float x10 = motionEvent.getX();
                            float y9 = motionEvent.getY();
                            float f12 = this.f14873a0;
                            float f13 = this.f14875b0;
                            Typeface typeface = org.telegram.messenger.g0.f22580a;
                            float f14 = f12 - x10;
                            float f15 = f13 - y9;
                            float sqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
                            long eventTime = motionEvent.getEventTime() - this.W;
                            if (this.G != null && (eventTime > 250 || sqrt > org.telegram.messenger.g0.L(200.0f))) {
                                this.G.a(!z10);
                            } else if (z11) {
                                e((-this.f14878f) + this.f14877e);
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
        q1.g gVar;
        if (this.K && !z10) {
            f10 = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.f14880r != f10 && ((gVar = this.H) == null || ((float) gVar.f53653m.f53661i) != f10)) {
            this.f14879n = f10;
            q1.g gVar2 = this.f14882w;
            if (gVar2 != null) {
                gVar2.d();
            }
            q1.g gVar3 = this.H;
            if (gVar3 != null) {
                gVar3.d();
            }
            q1.g gVar4 = new q1.g(this, f14871c0, f10);
            gVar4.f53653m = org.telegram.ui.Cells.f1.s(f10, 1200.0f, 1.0f);
            gVar4.a(new z3(0, this, runnable));
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
        return this.f14878f;
    }

    public Object getRenderNode() {
        if (this.f14872a == null && Build.VERSION.SDK_INT >= 31) {
            this.f14872a = android.support.v4.media.session.w.k();
        }
        return this.f14872a;
    }

    public float getSwipeOffsetY() {
        return this.f14880r;
    }

    public float getTopActionBarOffsetY() {
        return this.f14877e;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        super.onConfigurationChanged(configuration);
        Point point = org.telegram.messenger.g0.f22608q;
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
            this.f14876c = false;
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

    public void setDelegate(b4 b4Var) {
        this.G = b4Var;
    }

    public void setForceOffsetY(float f10) {
        this.f14878f = f10;
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

    public void setIsKeyboardVisible(e9 e9Var) {
        this.J = e9Var;
    }

    public void setOffsetY(final float f10) {
        boolean z10;
        if (this.f14879n != -2.1474836E9f) {
            this.h = f10;
            return;
        }
        q1.g gVar = this.f14882w;
        if (gVar != null) {
            gVar.d();
        }
        final float f11 = this.f14878f;
        final float f12 = f10 - f11;
        if (Math.abs((this.f14880r + f11) - this.f14877e) <= org.telegram.messenger.g0.L(1.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        final boolean z11 = z10;
        if (!this.f14881s) {
            q1.g gVar2 = this.f14882w;
            if (gVar2 != null) {
                gVar2.d();
            }
            q1.g gVar3 = new q1.g(new q1.f(f11));
            gVar3.f53653m = org.telegram.ui.Cells.f1.s(f10, 1400.0f, 1.0f);
            gVar3.b(new q1.d() {
                @Override
                public final void a(q1.g gVar4, float f13, float f14) {
                    float f15;
                    c4 c4Var = c4.this;
                    c4Var.f14878f = f13;
                    float f16 = f12;
                    int i3 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
                    float f17 = f11;
                    if (i3 == 0) {
                        f15 = 1.0f;
                    } else {
                        f15 = (f13 - f17) / f16;
                    }
                    if (z11) {
                        c4Var.f14880r = be.a(c4Var.f14880r - (Math.max(0.0f, f16) * f15), (-c4Var.f14878f) + c4Var.f14877e, (c4Var.getHeight() - c4Var.f14878f) + c4Var.f14877e);
                    }
                    q1.g gVar5 = c4Var.H;
                    if (gVar5 != null) {
                        q1.h hVar = gVar5.f53653m;
                        float f18 = c4Var.f14877e;
                        if (((float) hVar.f53661i) == (-f17) + f18) {
                            hVar.f53661i = (-f10) + f18;
                        }
                    }
                    c4Var.c();
                }
            });
            gVar3.a(new g9(this, f10, 1));
            this.f14882w = gVar3;
            gVar3.h();
            return;
        }
        this.f14878f = f10;
        if (z11) {
            this.f14880r = be.a(this.f14880r - Math.max(0.0f, f12), (-this.f14878f) + this.f14877e, (getHeight() - this.f14878f) + this.f14877e);
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
        this.f14881s = z10;
    }

    public void setSwipeOffsetY(float f10) {
        this.f14880r = f10;
        c();
    }

    public void setTopActionBarOffsetY(float f10) {
        this.f14877e = f10;
        c();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
    }

    public void setWebView(org.telegram.ui.web.t0 t0Var) {
        this.f14884y = t0Var;
    }
}
