package defpackage;

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
import org.telegram.ui.ActionBar.a;
public abstract class i22 extends FrameLayout {
    public static final bma c0 = new bma(new c22((byte) 2), new c22((byte) 3));
    public Runnable E;
    public Runnable F;
    public h22 G;
    public vpa H;
    public int I;
    public nu4 J;
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
    public Object a;
    public float a0;
    public final kj4 b;
    public float b0;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public boolean s;
    public vpa w;
    public boolean x;
    public nv0 y;

    public i22(Context context) {
        super(context);
        float f;
        this.e = a.getCurrentActionBarHeight();
        this.f = 0.0f;
        this.h = -1.0f;
        this.n = -2.1474836E9f;
        this.J = new c22((byte) 4);
        this.N = true;
        this.S = 0.0f;
        this.T = false;
        this.U = hl.L(60.0f);
        this.V = true;
        this.b = new kj4(context, new g22(this, ViewConfiguration.get(context).getScaledTouchSlop(), (byte) 0));
        Point point = hl.q;
        if (point.x > point.y) {
            f = 8.0f;
        } else {
            f = 64.0f;
        }
        this.I = hl.L(f);
    }

    public final void a(boolean z, boolean z2) {
        this.P = z;
        this.Q = z2;
    }

    public final boolean b(boolean z) {
        nv0 nv0Var = this.y;
        if (nv0Var != null && nv0Var.O) {
            if (z) {
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
        setTranslationY(Math.max(this.e, this.f + this.r));
        hl.r(new go1(this, (byte) 20));
        hl.c3(new go1(this, (byte) 20));
        Runnable runnable = this.E;
        if (runnable != null) {
            runnable.run();
        }
        v21 v21Var = v21.x;
        if (v21Var != null) {
            v21Var.l();
        }
    }

    public final void d(float f) {
        e(f, false, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        if (canvas.isHardwareAccelerated()) {
            Object obj = this.a;
            if (obj != null) {
                RenderNode g = rm0.g(obj);
                g.setPosition(0, 0, getWidth(), getHeight());
                recordingCanvas = g.beginRecording();
            } else {
                recordingCanvas = canvas;
            }
            super.dispatchDraw(recordingCanvas);
            Object obj2 = this.a;
            if (obj2 != null) {
                RenderNode g2 = rm0.g(obj2);
                g2.endRecording();
                canvas.drawRenderNode(g2);
                return;
            }
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.W = motionEvent.getEventTime();
                this.a0 = motionEvent.getX();
                this.b0 = motionEvent.getY();
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
            boolean onTouchEvent = ((GestureDetector) this.b.b).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z = this.c;
                this.d = false;
                this.c = false;
                if (!this.K || this.M) {
                    if (this.x) {
                        this.x = false;
                    } else if (this.N && (!this.O || (this.r != (-this.f) + this.e && b(false)))) {
                        float f = this.r;
                        int i = this.I;
                        float f2 = -i;
                        int i2 = (f > f2 ? 1 : (f == f2 ? 0 : -1));
                        boolean z2 = this.V;
                        if (i2 <= 0) {
                            if (z2) {
                                d((-this.f) + this.e);
                            }
                        } else if (f > f2 && f <= i) {
                            if (z2) {
                                d(0.0f);
                            }
                        } else {
                            float x = motionEvent.getX();
                            float y = motionEvent.getY();
                            float f3 = this.a0;
                            float f4 = this.b0;
                            Typeface typeface = hl.a;
                            float f5 = f3 - x;
                            float f6 = f4 - y;
                            float sqrt = (float) Math.sqrt((f6 * f6) + (f5 * f5));
                            long eventTime = motionEvent.getEventTime() - this.W;
                            if (this.G != null && (eventTime > 250 || sqrt > hl.L(200.0f))) {
                                this.G.e(!z);
                            } else if (z2) {
                                d((-this.f) + this.e);
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

    public final void e(float f, boolean z, Runnable runnable) {
        vpa vpaVar;
        if (this.K && !z) {
            f = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.r != f && ((vpaVar = this.H) == null || ((float) vpaVar.m.i) != f)) {
            this.n = f;
            vpa vpaVar2 = this.w;
            if (vpaVar2 != null) {
                vpaVar2.d();
            }
            vpa vpaVar3 = this.H;
            if (vpaVar3 != null) {
                vpaVar3.d();
            }
            vpa vpaVar4 = new vpa(this, c0, f);
            vpaVar4.m = bp1.j(f, 1200.0f, 1.0f);
            vpaVar4.a(new x11(this, runnable, (byte) 3));
            this.H = vpaVar4;
            vpaVar4.h();
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
        return this.f;
    }

    public Object getRenderNode() {
        if (this.a == null && Build.VERSION.SDK_INT >= 31) {
            this.a = vk1.c();
        }
        return this.a;
    }

    public float getSwipeOffsetY() {
        return this.r;
    }

    public float getTopActionBarOffsetY() {
        return this.e;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f;
        super.onConfigurationChanged(configuration);
        Point point = hl.q;
        if (point.x > point.y) {
            f = 8.0f;
        } else {
            f = 64.0f;
        }
        this.I = hl.L(f);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            this.d = true;
            this.c = false;
        }
    }

    public void setAllowFullSizeSwipe(boolean z) {
        this.M = z;
    }

    public void setAllowSwipes(boolean z) {
        if (this.N != z) {
            this.N = z;
        }
    }

    public void setDelegate(h22 h22Var) {
        this.G = h22Var;
    }

    public void setForceOffsetY(float f) {
        this.f = f;
        c();
    }

    public void setFullSize(boolean z) {
        if (this.K != z) {
            this.K = z;
            if (z) {
                if (this.L) {
                    d(getTopActionBarOffsetY() + (-getOffsetY()));
                    return;
                }
                return;
            }
            d(0.0f);
        }
    }

    public void setIsKeyboardVisible(nu4 nu4Var) {
        this.J = nu4Var;
    }

    public void setOffsetY(final float f) {
        final boolean z;
        if (this.n != -2.1474836E9f) {
            this.h = f;
            return;
        }
        vpa vpaVar = this.w;
        if (vpaVar != null) {
            vpaVar.d();
        }
        final float f2 = this.f;
        final float f3 = f - f2;
        if (Math.abs((this.r + f2) - this.e) <= hl.L(1.0f)) {
            z = true;
        } else {
            z = false;
        }
        if (!this.s) {
            vpa vpaVar2 = this.w;
            if (vpaVar2 != null) {
                vpaVar2.d();
            }
            vpa vpaVar3 = new vpa(new xk4(f2));
            vpaVar3.m = bp1.j(f, 1400.0f, 1.0f);
            vpaVar3.b(new qs3() {
                @Override
                public final void a(vpa vpaVar4, float f4, float f5) {
                    float f6;
                    i22 i22Var = i22.this;
                    i22Var.f = f4;
                    float f7 = f3;
                    int i = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    float f8 = f2;
                    if (i == 0) {
                        f6 = 1.0f;
                    } else {
                        f6 = (f4 - f8) / f7;
                    }
                    if (z) {
                        i22Var.r = ete.a(i22Var.r - (Math.max(0.0f, f7) * f6), (-i22Var.f) + i22Var.e, (i22Var.getHeight() - i22Var.f) + i22Var.e);
                    }
                    vpa vpaVar5 = i22Var.H;
                    if (vpaVar5 != null) {
                        wpa wpaVar = vpaVar5.m;
                        float f9 = i22Var.e;
                        if (((float) wpaVar.i) == (-f8) + f9) {
                            wpaVar.i = (-f) + f9;
                        }
                    }
                    i22Var.c();
                }
            });
            vpaVar3.a(new f22(this, f, (byte) 0));
            this.w = vpaVar3;
            vpaVar3.h();
            return;
        }
        this.f = f;
        if (z) {
            this.r = ete.a(this.r - Math.max(0.0f, f3), (-this.f) + this.e, (getHeight() - this.f) + this.e);
        }
        c();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.F = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z) {
        this.O = z;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z) {
        this.s = z;
    }

    public void setSwipeOffsetY(float f) {
        this.r = f;
        c();
    }

    public void setTopActionBarOffsetY(float f) {
        this.e = f;
        c();
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
    }

    public void setWebView(nv0 nv0Var) {
        this.y = nv0Var;
    }
}
