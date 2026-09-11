package fi;

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
import di.nb;
import di.va;
import di.w9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.qc;
public abstract class q4 extends FrameLayout {
    public static final hv0 f9902b0 = new hv0(new w9(21), new w9(22));
    public Runnable E;
    public p4 F;
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
    public Object f9903a;
    public float f9904a0;
    public final l.d f9905b;
    public boolean f9906c;
    public boolean d;
    public float f9907e;
    public float f9908f;
    public float h;
    public float f9909n;
    public float f9910r;
    public boolean f9911s;
    public o1.k v;
    public boolean f9912w;
    public org.telegram.ui.web.z0 f9913x;
    public Runnable f9914y;

    public q4(Context context) {
        super(context);
        float f7;
        this.f9907e = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f9908f = 0.0f;
        this.h = -1.0f;
        this.f9909n = -2.1474836E9f;
        this.I = new w9(23);
        this.M = true;
        this.R = 0.0f;
        this.S = false;
        this.T = AndroidUtilities.dp(60.0f);
        this.U = true;
        this.f9905b = new l.d(context, new o4(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0));
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
        org.telegram.ui.web.z0 z0Var = this.f9913x;
        if (z0Var != null && z0Var.N) {
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
        setTranslationY(Math.max(this.f9907e, this.f9908f + this.f9910r));
        AndroidUtilities.cancelRunOnUIThread(new nb(this, 19));
        AndroidUtilities.runOnUIThread(new nb(this, 19));
        Runnable runnable = this.f9914y;
        if (runnable != null) {
            runnable.run();
        }
        qc qcVar = qc.f29671w;
        if (qcVar != null) {
            qcVar.l();
        }
    }

    public final boolean d() {
        return this.f9906c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        if (canvas.isHardwareAccelerated()) {
            Object obj = this.f9903a;
            if (obj != null) {
                RenderNode c10 = org.telegram.messenger.b.c(obj);
                c10.setPosition(0, 0, getWidth(), getHeight());
                recordingCanvas = c10.beginRecording();
            } else {
                recordingCanvas = canvas;
            }
            super.dispatchDraw(recordingCanvas);
            Object obj2 = this.f9903a;
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
        if (!this.f9906c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.V = motionEvent.getEventTime();
                this.W = motionEvent.getX();
                this.f9904a0 = motionEvent.getY();
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
            boolean onTouchEvent = ((GestureDetector) this.f9905b.f15072b).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z10 = this.f9906c;
                this.d = false;
                this.f9906c = false;
                if (!this.J || this.L) {
                    if (this.f9912w) {
                        this.f9912w = false;
                    } else if (this.M && (!this.N || (this.f9910r != (-this.f9908f) + this.f9907e && b(false)))) {
                        float f7 = this.f9910r;
                        int i10 = this.H;
                        float f10 = -i10;
                        boolean z11 = this.U;
                        if (f7 <= f10) {
                            if (z11) {
                                e((-this.f9908f) + this.f9907e);
                            }
                        } else if (f7 > f10 && f7 <= i10) {
                            if (z11) {
                                e(0.0f);
                            }
                        } else {
                            float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), this.W, this.f9904a0);
                            long eventTime = motionEvent.getEventTime() - this.V;
                            if (this.F != null && (eventTime > 250 || distance > AndroidUtilities.dp(200.0f))) {
                                this.F.f(!z10);
                            } else if (z11) {
                                e((-this.f9908f) + this.f9907e);
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
        if (this.f9910r != f7 && ((kVar = this.G) == null || ((float) kVar.f16825u.f16832i) != f7)) {
            this.f9909n = f7;
            o1.k kVar2 = this.v;
            if (kVar2 != null) {
                kVar2.c();
            }
            o1.k kVar3 = this.G;
            if (kVar3 != null) {
                kVar3.c();
            }
            o1.k kVar4 = new o1.k(this, f9902b0, f7);
            kVar4.f16825u = p6.l(f7, 1200.0f, 1.0f);
            kVar4.a(new n4(0, this, runnable));
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
        return this.f9908f;
    }

    public Object getRenderNode() {
        if (this.f9903a == null && Build.VERSION.SDK_INT >= 31) {
            this.f9903a = android.support.v4.media.session.y.k();
        }
        return this.f9903a;
    }

    public float getSwipeOffsetY() {
        return this.f9910r;
    }

    public float getTopActionBarOffsetY() {
        return this.f9907e;
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
            this.f9906c = false;
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

    public void setDelegate(p4 p4Var) {
        this.F = p4Var;
    }

    public void setForceOffsetY(float f7) {
        this.f9908f = f7;
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
        if (this.f9909n != -2.1474836E9f) {
            this.h = f7;
            return;
        }
        o1.k kVar = this.v;
        if (kVar != null) {
            kVar.c();
        }
        final float f10 = this.f9908f;
        final float f11 = f7 - f10;
        if (Math.abs((this.f9910r + f10) - this.f9907e) <= AndroidUtilities.dp(1.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f9911s) {
            o1.k kVar2 = this.v;
            if (kVar2 != null) {
                kVar2.c();
            }
            o1.k kVar3 = new o1.k(new o1.j(f10));
            kVar3.f16825u = p6.l(f7, 1400.0f, 1.0f);
            kVar3.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f12, float f13) {
                    float f14;
                    q4 q4Var = q4.this;
                    q4Var.f9908f = f12;
                    float f15 = f11;
                    float f16 = f10;
                    if (f15 == 0.0f) {
                        f14 = 1.0f;
                    } else {
                        f14 = (f12 - f16) / f15;
                    }
                    if (z10) {
                        q4Var.f9910r = w7.p.a(q4Var.f9910r - (Math.max(0.0f, f15) * f14), (-q4Var.f9908f) + q4Var.f9907e, (q4Var.getHeight() - q4Var.f9908f) + q4Var.f9907e);
                    }
                    o1.k kVar4 = q4Var.G;
                    if (kVar4 != null) {
                        o1.l lVar = kVar4.f16825u;
                        float f17 = (float) lVar.f16832i;
                        float f18 = q4Var.f9907e;
                        if (f17 == (-f16) + f18) {
                            lVar.f16832i = (-f7) + f18;
                        }
                    }
                    q4Var.c();
                }
            });
            kVar3.a(new va(this, f7, 1));
            this.v = kVar3;
            kVar3.f();
            return;
        }
        this.f9908f = f7;
        if (z10) {
            this.f9910r = w7.p.a(this.f9910r - Math.max(0.0f, f11), (-this.f9908f) + this.f9907e, (getHeight() - this.f9908f) + this.f9907e);
        }
        c();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.f9914y = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z10) {
        this.N = z10;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z10) {
        this.f9911s = z10;
    }

    public void setSwipeOffsetY(float f7) {
        this.f9910r = f7;
        c();
    }

    public void setTopActionBarOffsetY(float f7) {
        this.f9907e = f7;
        c();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
    }

    public void setWebView(org.telegram.ui.web.z0 z0Var) {
        this.f9913x = z0Var;
    }
}
