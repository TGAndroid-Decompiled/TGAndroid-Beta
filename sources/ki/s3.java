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
import c8.l9;
import hi.d9;
import hi.f9;
import org.telegram.messenger.i9;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.ut0;
public abstract class s3 extends FrameLayout {
    public static final ut0 f18888c0 = new ut0(new f9(20), new f9(21));
    public Runnable E;
    public Runnable F;
    public r3 G;
    public r1.g H;
    public int I;
    public i9 J;
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
    public Object f18889a;
    public float f18890a0;
    public final hn f18891b;
    public float f18892b0;
    public boolean f18893c;
    public boolean d;
    public float f18894e;
    public float f18895f;
    public float h;
    public float f18896n;
    public float f18897r;
    public boolean f18898s;
    public r1.g f18899w;
    public boolean f18900x;
    public org.telegram.ui.web.s0 f18901y;

    public s3(Context context) {
        super(context);
        float f10;
        this.f18894e = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f18895f = 0.0f;
        this.h = -1.0f;
        this.f18896n = -2.1474836E9f;
        this.J = new f9(22);
        this.N = true;
        this.S = 0.0f;
        this.T = false;
        this.U = org.telegram.messenger.g0.L(60.0f);
        this.V = true;
        this.f18891b = new hn(context, new q3(this, ViewConfiguration.get(context).getScaledTouchSlop(), 0));
        Point point = org.telegram.messenger.g0.f24118q;
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
        org.telegram.ui.web.s0 s0Var = this.f18901y;
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
        setTranslationY(Math.max(this.f18894e, this.f18895f + this.f18897r));
        org.telegram.messenger.g0.r(new kg.j0(this, 15));
        org.telegram.messenger.g0.g3(new kg.j0(this, 15));
        Runnable runnable = this.E;
        if (runnable != null) {
            runnable.run();
        }
        gc gcVar = gc.f35453w;
        if (gcVar != null) {
            gcVar.l();
        }
    }

    public final boolean d() {
        return this.f18893c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        if (canvas.isHardwareAccelerated()) {
            Object obj = this.f18889a;
            if (obj != null) {
                RenderNode d = n2.a0.d(obj);
                d.setPosition(0, 0, getWidth(), getHeight());
                recordingCanvas = d.beginRecording();
            } else {
                recordingCanvas = canvas;
            }
            super.dispatchDraw(recordingCanvas);
            Object obj2 = this.f18889a;
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
        if (!this.f18893c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.W = motionEvent.getEventTime();
                this.f18890a0 = motionEvent.getX();
                this.f18892b0 = motionEvent.getY();
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
            boolean onTouchEvent = ((GestureDetector) this.f18891b.f35933b).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z10 = this.f18893c;
                this.d = false;
                this.f18893c = false;
                if (!this.K || this.M) {
                    if (this.f18900x) {
                        this.f18900x = false;
                    } else if (this.N && (!this.O || (this.f18897r != (-this.f18895f) + this.f18894e && b(false)))) {
                        float f10 = this.f18897r;
                        int i7 = this.I;
                        float f11 = -i7;
                        int i10 = (f10 > f11 ? 1 : (f10 == f11 ? 0 : -1));
                        boolean z11 = this.V;
                        if (i10 <= 0) {
                            if (z11) {
                                e((-this.f18895f) + this.f18894e);
                            }
                        } else if (f10 > f11 && f10 <= i7) {
                            if (z11) {
                                e(0.0f);
                            }
                        } else {
                            float x10 = motionEvent.getX();
                            float y10 = motionEvent.getY();
                            float f12 = this.f18890a0;
                            float f13 = this.f18892b0;
                            Typeface typeface = org.telegram.messenger.g0.f24090a;
                            float f14 = f12 - x10;
                            float f15 = f13 - y10;
                            float sqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
                            long eventTime = motionEvent.getEventTime() - this.W;
                            if (this.G != null && (eventTime > 250 || sqrt > org.telegram.messenger.g0.L(200.0f))) {
                                this.G.s(!z10);
                            } else if (z11) {
                                e((-this.f18895f) + this.f18894e);
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
        if (this.f18897r != f10 && ((gVar = this.H) == null || ((float) gVar.f56323m.f56331i) != f10)) {
            this.f18896n = f10;
            r1.g gVar2 = this.f18899w;
            if (gVar2 != null) {
                gVar2.d();
            }
            r1.g gVar3 = this.H;
            if (gVar3 != null) {
                gVar3.d();
            }
            r1.g gVar4 = new r1.g(this, f18888c0, f10);
            gVar4.f56323m = org.telegram.ui.Cells.c0.p(f10, 1200.0f, 1.0f);
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
        return this.f18895f;
    }

    public Object getRenderNode() {
        if (this.f18889a == null && Build.VERSION.SDK_INT >= 31) {
            this.f18889a = android.support.v4.media.session.w.k();
        }
        return this.f18889a;
    }

    public float getSwipeOffsetY() {
        return this.f18897r;
    }

    public float getTopActionBarOffsetY() {
        return this.f18894e;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        super.onConfigurationChanged(configuration);
        Point point = org.telegram.messenger.g0.f24118q;
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
            this.f18893c = false;
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

    public void setDelegate(r3 r3Var) {
        this.G = r3Var;
    }

    public void setForceOffsetY(float f10) {
        this.f18895f = f10;
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

    public void setIsKeyboardVisible(i9 i9Var) {
        this.J = i9Var;
    }

    public void setOffsetY(final float f10) {
        boolean z10;
        if (this.f18896n != -2.1474836E9f) {
            this.h = f10;
            return;
        }
        r1.g gVar = this.f18899w;
        if (gVar != null) {
            gVar.d();
        }
        final float f11 = this.f18895f;
        final float f12 = f10 - f11;
        if (Math.abs((this.f18897r + f11) - this.f18894e) <= org.telegram.messenger.g0.L(1.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        final boolean z11 = z10;
        if (!this.f18898s) {
            r1.g gVar2 = this.f18899w;
            if (gVar2 != null) {
                gVar2.d();
            }
            r1.g gVar3 = new r1.g(new r1.f(f11));
            gVar3.f56323m = org.telegram.ui.Cells.c0.p(f10, 1400.0f, 1.0f);
            gVar3.b(new r1.d() {
                @Override
                public final void a(r1.g gVar4, float f13, float f14) {
                    float f15;
                    s3 s3Var = s3.this;
                    s3Var.f18895f = f13;
                    float f16 = f12;
                    int i7 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
                    float f17 = f11;
                    if (i7 == 0) {
                        f15 = 1.0f;
                    } else {
                        f15 = (f13 - f17) / f16;
                    }
                    if (z11) {
                        s3Var.f18897r = l9.a(s3Var.f18897r - (Math.max(0.0f, f16) * f15), (-s3Var.f18895f) + s3Var.f18894e, (s3Var.getHeight() - s3Var.f18895f) + s3Var.f18894e);
                    }
                    r1.g gVar5 = s3Var.H;
                    if (gVar5 != null) {
                        r1.h hVar = gVar5.f56323m;
                        float f18 = s3Var.f18894e;
                        if (((float) hVar.f56331i) == (-f17) + f18) {
                            hVar.f56331i = (-f10) + f18;
                        }
                    }
                    s3Var.c();
                }
            });
            gVar3.a(new d9(this, f10, 1));
            this.f18899w = gVar3;
            gVar3.h();
            return;
        }
        this.f18895f = f10;
        if (z11) {
            this.f18897r = l9.a(this.f18897r - Math.max(0.0f, f12), (-this.f18895f) + this.f18894e, (getHeight() - this.f18895f) + this.f18894e);
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
        this.f18898s = z10;
    }

    public void setSwipeOffsetY(float f10) {
        this.f18897r = f10;
        c();
    }

    public void setTopActionBarOffsetY(float f10) {
        this.f18894e = f10;
        c();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
    }

    public void setWebView(org.telegram.ui.web.s0 s0Var) {
        this.f18901y = s0Var;
    }
}
