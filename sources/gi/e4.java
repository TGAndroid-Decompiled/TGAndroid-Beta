package gi;

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
import ei.bc;
import ei.ea;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.qc;
public abstract class e4 extends FrameLayout {
    public static final cw0 f11181b0 = new cw0(new fh.b(11), new fh.b(12));
    public Runnable E;
    public d4 F;
    public o1.k G;
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
    public Object f11182a;
    public float f11183a0;
    public final k0.b f11184b;
    public boolean f11185c;
    public boolean d;
    public float e;
    public float f11186f;
    public float h;
    public float f11187n;
    public float f11188r;
    public boolean f11189s;
    public o1.k v;
    public boolean f11190w;
    public org.telegram.ui.web.y0 f11191x;
    public Runnable f11192y;

    public e4(Context context) {
        super(context);
        float f7;
        this.e = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f11186f = 0.0f;
        this.h = -1.0f;
        this.f11187n = -2.1474836E9f;
        this.I = new fh.b(13);
        this.M = true;
        this.R = 0.0f;
        this.S = false;
        this.T = AndroidUtilities.dp(60.0f);
        this.U = true;
        this.f11184b = new k0.b(context, new c4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0));
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
        org.telegram.ui.web.y0 y0Var = this.f11191x;
        if (y0Var != null && y0Var.N) {
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
        setTranslationY(Math.max(this.e, this.f11186f + this.f11188r));
        AndroidUtilities.cancelRunOnUIThread(new bc(this, 11));
        AndroidUtilities.runOnUIThread(new bc(this, 11));
        Runnable runnable = this.f11192y;
        if (runnable != null) {
            runnable.run();
        }
        qc qcVar = qc.f29631w;
        if (qcVar != null) {
            qcVar.l();
        }
    }

    public final boolean d() {
        return this.f11185c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        if (canvas.isHardwareAccelerated()) {
            Object obj = this.f11182a;
            if (obj != null) {
                RenderNode c10 = org.telegram.messenger.b.c(obj);
                c10.setPosition(0, 0, getWidth(), getHeight());
                recordingCanvas = c10.beginRecording();
            } else {
                recordingCanvas = canvas;
            }
            super.dispatchDraw(recordingCanvas);
            Object obj2 = this.f11182a;
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
        if (!this.f11185c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.V = motionEvent.getEventTime();
                this.W = motionEvent.getX();
                this.f11183a0 = motionEvent.getY();
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
            boolean onTouchEvent = ((GestureDetector) this.f11184b.f14564b).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z10 = this.f11185c;
                this.d = false;
                this.f11185c = false;
                if (!this.J || this.L) {
                    if (this.f11190w) {
                        this.f11190w = false;
                    } else if (this.M && (!this.N || (this.f11188r != (-this.f11186f) + this.e && b(false)))) {
                        float f7 = this.f11188r;
                        int i10 = this.H;
                        float f10 = -i10;
                        int i11 = (f7 > f10 ? 1 : (f7 == f10 ? 0 : -1));
                        boolean z11 = this.U;
                        if (i11 <= 0) {
                            if (z11) {
                                e((-this.f11186f) + this.e);
                            }
                        } else if (f7 > f10 && f7 <= i10) {
                            if (z11) {
                                e(0.0f);
                            }
                        } else {
                            float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), this.W, this.f11183a0);
                            long eventTime = motionEvent.getEventTime() - this.V;
                            if (this.F != null && (eventTime > 250 || distance > AndroidUtilities.dp(200.0f))) {
                                this.F.f(!z10);
                            } else if (z11) {
                                e((-this.f11186f) + this.e);
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
        o1.k kVar;
        if (this.J && !z10) {
            f7 = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.f11188r != f7 && ((kVar = this.G) == null || ((float) kVar.f17558u.f17564i) != f7)) {
            this.f11187n = f7;
            o1.k kVar2 = this.v;
            if (kVar2 != null) {
                kVar2.c();
            }
            o1.k kVar3 = this.G;
            if (kVar3 != null) {
                kVar3.c();
            }
            o1.k kVar4 = new o1.k(this, f11181b0, f7);
            kVar4.f17558u = org.telegram.ui.Cells.c1.l(f7, 1200.0f, 1.0f);
            kVar4.a(new b4(0, this, runnable));
            this.G = kVar4;
            kVar4.h();
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
        return this.f11186f;
    }

    public Object getRenderNode() {
        if (this.f11182a == null && Build.VERSION.SDK_INT >= 31) {
            this.f11182a = android.support.v4.media.session.x.k();
        }
        return this.f11182a;
    }

    public float getSwipeOffsetY() {
        return this.f11188r;
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
            this.f11185c = false;
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

    public void setDelegate(d4 d4Var) {
        this.F = d4Var;
    }

    public void setForceOffsetY(float f7) {
        this.f11186f = f7;
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
        if (this.f11187n != -2.1474836E9f) {
            this.h = f7;
            return;
        }
        o1.k kVar = this.v;
        if (kVar != null) {
            kVar.c();
        }
        final float f10 = this.f11186f;
        final float f11 = f7 - f10;
        if (Math.abs((this.f11188r + f10) - this.e) <= AndroidUtilities.dp(1.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        final boolean z11 = z10;
        if (!this.f11189s) {
            o1.k kVar2 = this.v;
            if (kVar2 != null) {
                kVar2.c();
            }
            o1.k kVar3 = new o1.k(new o1.j(f10));
            kVar3.f17558u = org.telegram.ui.Cells.c1.l(f7, 1400.0f, 1.0f);
            kVar3.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f12, float f13) {
                    float f14;
                    e4 e4Var = e4.this;
                    e4Var.f11186f = f12;
                    float f15 = f11;
                    int i10 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
                    float f16 = f10;
                    if (i10 == 0) {
                        f14 = 1.0f;
                    } else {
                        f14 = (f12 - f16) / f15;
                    }
                    if (z11) {
                        e4Var.f11188r = w7.r.a(e4Var.f11188r - (Math.max(0.0f, f15) * f14), (-e4Var.f11186f) + e4Var.e, (e4Var.getHeight() - e4Var.f11186f) + e4Var.e);
                    }
                    o1.k kVar4 = e4Var.G;
                    if (kVar4 != null) {
                        o1.l lVar = kVar4.f17558u;
                        float f17 = e4Var.e;
                        if (((float) lVar.f17564i) == (-f16) + f17) {
                            lVar.f17564i = (-f7) + f17;
                        }
                    }
                    e4Var.c();
                }
            });
            kVar3.a(new ea(this, f7, 1));
            this.v = kVar3;
            kVar3.h();
            return;
        }
        this.f11186f = f7;
        if (z11) {
            this.f11188r = w7.r.a(this.f11188r - Math.max(0.0f, f11), (-this.f11186f) + this.e, (getHeight() - this.f11186f) + this.e);
        }
        c();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.f11192y = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z10) {
        this.N = z10;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z10) {
        this.f11189s = z10;
    }

    public void setSwipeOffsetY(float f7) {
        this.f11188r = f7;
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

    public void setWebView(org.telegram.ui.web.y0 y0Var) {
        this.f11191x = y0Var;
    }
}
