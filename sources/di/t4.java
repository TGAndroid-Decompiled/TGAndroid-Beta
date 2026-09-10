package di;

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
import bi.ec;
import bi.wc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.sv0;
public abstract class t4 extends FrameLayout {
    public static final sv0 f6914b0 = new sv0(new dh.a(13), new dh.a(14));
    public Runnable E;
    public s4 F;
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
    public Object f6915a;
    public float f6916a0;
    public final l2.h f6917b;
    public boolean f6918c;
    public boolean d;
    public float e;
    public float f6919f;
    public float h;
    public float f6920n;
    public float f6921r;
    public boolean f6922s;
    public o1.k v;
    public boolean f6923w;
    public org.telegram.ui.web.y0 f6924x;
    public Runnable f6925y;

    public t4(Context context) {
        super(context);
        float f7;
        this.e = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.f6919f = 0.0f;
        this.h = -1.0f;
        this.f6920n = -2.1474836E9f;
        this.I = new dh.a(15);
        this.M = true;
        this.R = 0.0f;
        this.S = false;
        this.T = AndroidUtilities.dp(60.0f);
        this.U = true;
        this.f6917b = new l2.h(context, new r4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0));
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
        org.telegram.ui.web.y0 y0Var = this.f6924x;
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
        setTranslationY(Math.max(this.e, this.f6919f + this.f6921r));
        AndroidUtilities.cancelRunOnUIThread(new wc(this, 21));
        AndroidUtilities.runOnUIThread(new wc(this, 21));
        Runnable runnable = this.f6925y;
        if (runnable != null) {
            runnable.run();
        }
        pc pcVar = pc.f26074w;
        if (pcVar != null) {
            pcVar.l();
        }
    }

    public final boolean d() {
        return this.f6918c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        if (canvas.isHardwareAccelerated()) {
            Object obj = this.f6915a;
            if (obj != null) {
                RenderNode c10 = org.telegram.messenger.b.c(obj);
                c10.setPosition(0, 0, getWidth(), getHeight());
                recordingCanvas = c10.beginRecording();
            } else {
                recordingCanvas = canvas;
            }
            super.dispatchDraw(recordingCanvas);
            Object obj2 = this.f6915a;
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
        if (!this.f6918c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.V = motionEvent.getEventTime();
                this.W = motionEvent.getX();
                this.f6916a0 = motionEvent.getY();
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
            boolean onTouchEvent = ((GestureDetector) this.f6917b.f12721b).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z10 = this.f6918c;
                this.d = false;
                this.f6918c = false;
                if (!this.J || this.L) {
                    if (this.f6923w) {
                        this.f6923w = false;
                    } else if (this.M && (!this.N || (this.f6921r != (-this.f6919f) + this.e && b(false)))) {
                        float f7 = this.f6921r;
                        int i10 = this.H;
                        float f10 = -i10;
                        boolean z11 = this.U;
                        if (f7 <= f10) {
                            if (z11) {
                                e((-this.f6919f) + this.e);
                            }
                        } else if (f7 > f10 && f7 <= i10) {
                            if (z11) {
                                e(0.0f);
                            }
                        } else {
                            float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), this.W, this.f6916a0);
                            long eventTime = motionEvent.getEventTime() - this.V;
                            if (this.F != null && (eventTime > 250 || distance > AndroidUtilities.dp(200.0f))) {
                                this.F.j(!z10);
                            } else if (z11) {
                                e((-this.f6919f) + this.e);
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
        if (this.f6921r != f7 && ((kVar = this.G) == null || ((float) kVar.f14134u.f14140i) != f7)) {
            this.f6920n = f7;
            o1.k kVar2 = this.v;
            if (kVar2 != null) {
                kVar2.c();
            }
            o1.k kVar3 = this.G;
            if (kVar3 != null) {
                kVar3.c();
            }
            o1.k kVar4 = new o1.k(this, f6914b0, f7);
            kVar4.f14134u = r6.l(f7, 1200.0f, 1.0f);
            kVar4.a(new q4(0, this, runnable));
            this.G = kVar4;
            kVar4.f();
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
        return this.f6919f;
    }

    public Object getRenderNode() {
        if (this.f6915a == null && Build.VERSION.SDK_INT >= 31) {
            this.f6915a = ah.b.c();
        }
        return this.f6915a;
    }

    public float getSwipeOffsetY() {
        return this.f6921r;
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
            this.f6918c = false;
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

    public void setDelegate(s4 s4Var) {
        this.F = s4Var;
    }

    public void setForceOffsetY(float f7) {
        this.f6919f = f7;
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
        final boolean z10;
        if (this.f6920n != -2.1474836E9f) {
            this.h = f7;
            return;
        }
        o1.k kVar = this.v;
        if (kVar != null) {
            kVar.c();
        }
        final float f10 = this.f6919f;
        final float f11 = f7 - f10;
        if (Math.abs((this.f6921r + f10) - this.e) <= AndroidUtilities.dp(1.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f6922s) {
            o1.k kVar2 = this.v;
            if (kVar2 != null) {
                kVar2.c();
            }
            o1.k kVar3 = new o1.k(new o1.j(f10));
            kVar3.f14134u = r6.l(f7, 1400.0f, 1.0f);
            kVar3.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f12, float f13) {
                    float f14;
                    t4 t4Var = t4.this;
                    t4Var.f6919f = f12;
                    float f15 = f11;
                    float f16 = f10;
                    if (f15 == 0.0f) {
                        f14 = 1.0f;
                    } else {
                        f14 = (f12 - f16) / f15;
                    }
                    if (z10) {
                        t4Var.f6921r = w7.q.a(t4Var.f6921r - (Math.max(0.0f, f15) * f14), (-t4Var.f6919f) + t4Var.e, (t4Var.getHeight() - t4Var.f6919f) + t4Var.e);
                    }
                    o1.k kVar4 = t4Var.G;
                    if (kVar4 != null) {
                        o1.l lVar = kVar4.f14134u;
                        float f17 = (float) lVar.f14140i;
                        float f18 = t4Var.e;
                        if (f17 == (-f16) + f18) {
                            lVar.f14140i = (-f7) + f18;
                        }
                    }
                    t4Var.c();
                }
            });
            kVar3.a(new ec(this, f7, 1));
            this.v = kVar3;
            kVar3.f();
            return;
        }
        this.f6919f = f7;
        if (z10) {
            this.f6921r = w7.q.a(this.f6921r - Math.max(0.0f, f11), (-this.f6919f) + this.e, (getHeight() - this.f6919f) + this.e);
        }
        c();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.f6925y = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z10) {
        this.N = z10;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z10) {
        this.f6922s = z10;
    }

    public void setSwipeOffsetY(float f7) {
        this.f6921r = f7;
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
        this.f6924x = y0Var;
    }
}
