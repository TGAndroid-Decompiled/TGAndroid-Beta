package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.Utilities;
public abstract class h44 extends FrameLayout {
    public static final List r0 = Arrays.asList(-90, 0, 90, 180);
    public boolean E;
    public boolean F;
    public boolean G;
    public f44 H;
    public PointF I;
    public g44 J;
    public final c44 K;
    public final UUID L;
    public boolean M;
    public int N;
    public int O;
    public hl3 P;
    public float Q;
    public ValueAnimator R;
    public ValueAnimator S;
    public int T;
    public int U;
    public final c44 V;
    public final c44 W;
    public final v41 a;
    public int a0;
    public float b;
    public int b0;
    public float c;
    public ValueAnimator c0;
    public float d;
    public ValueAnimator d0;
    public float e;
    public boolean e0;
    public float f;
    public boolean f0;
    public final float[] g0;
    public float h;
    public final float[] h0;
    public final float[] i0;
    public float j0;
    public float k0;
    public float l0;
    public ValueAnimator m0;
    public boolean n;
    public boolean n0;
    public FrameLayout o0;
    public float p0;
    public ValueAnimator q0;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    public h44(Context context, PointF pointF) {
        super(context);
        this.a = new v41(this);
        this.n = false;
        this.r = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.K = new Runnable(this) {
            public final h44 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                h44 h44Var = this.b;
                switch (b) {
                    case 0:
                        h44Var.G = true;
                        if (h44Var.H != null) {
                            try {
                                h44Var.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            h44Var.H.A(h44Var);
                            return;
                        }
                        return;
                    case 1:
                        h44Var.n();
                        return;
                    default:
                        h44Var.o();
                        return;
                }
            }
        };
        this.M = true;
        this.N = 0;
        this.O = -1;
        this.T = 0;
        this.U = 0;
        this.V = new Runnable(this) {
            public final h44 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                h44 h44Var = this.b;
                switch (b) {
                    case 0:
                        h44Var.G = true;
                        if (h44Var.H != null) {
                            try {
                                h44Var.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            h44Var.H.A(h44Var);
                            return;
                        }
                        return;
                    case 1:
                        h44Var.n();
                        return;
                    default:
                        h44Var.o();
                        return;
                }
            }
        };
        this.W = new Runnable(this) {
            public final h44 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                h44 h44Var = this.b;
                switch (b) {
                    case 0:
                        h44Var.G = true;
                        if (h44Var.H != null) {
                            try {
                                h44Var.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            h44Var.H.A(h44Var);
                            return;
                        }
                        return;
                    case 1:
                        h44Var.n();
                        return;
                    default:
                        h44Var.o();
                        return;
                }
            }
        };
        this.g0 = new float[2];
        this.h0 = new float[2];
        this.i0 = new float[2];
        this.j0 = 1.0f;
        this.n0 = false;
        this.p0 = 1.0f;
        this.L = UUID.randomUUID();
        this.I = pointF;
    }

    public g44 a() {
        r39 r39Var = new r39(this, getContext(), (byte) 0);
        r39Var.r = new RectF();
        return r39Var;
    }

    public final float b() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()));
    }

    public final boolean c(float f, float f2, float f3, float f4, boolean z) {
        float f5;
        float f6;
        float f7;
        boolean z2;
        float f8;
        boolean z3;
        boolean z4;
        f44 f44Var;
        f44 f44Var2;
        f44 f44Var3;
        f44 f44Var4;
        if (getParent() != null) {
            float scaleX = ((View) getParent()).getScaleX();
            if (z) {
                f5 = (f + f3) / 2.0f;
                f6 = (f2 + f4) / 2.0f;
            } else {
                f5 = f;
                f6 = f2;
            }
            float f9 = (f5 - this.f) / scaleX;
            float f10 = (f6 - this.h) / scaleX;
            float hypot = (float) Math.hypot(f9, f10);
            if (this.n) {
                f7 = 6.0f;
            } else {
                f7 = 16.0f;
            }
            if (hypot > f7 || z) {
                hl.r(this.K);
                e(f9, f10);
                if (z) {
                    float a = dte.a(f, f2, f3, f4);
                    float a2 = dte.a(this.b, this.c, this.d, this.e);
                    if (a2 > 0.0f) {
                        j(a / a2);
                    }
                    f(this.k0 + ((float) Math.toDegrees(Math.atan2(f2 - f4, f - f3) - Math.atan2(this.c - this.e, this.b - this.d))));
                }
                this.b = f;
                this.c = f2;
                this.f = f5;
                this.h = f6;
                if (z) {
                    this.d = f3;
                    this.e = f4;
                }
                this.n = true;
                if ((getParent() instanceof a44) && (this.T != 0 || this.U != 0)) {
                    ((a44) getParent()).invalidate();
                }
                if (!this.x && (f44Var4 = this.H) != null) {
                    this.x = true;
                    f44Var4.C();
                }
                if (!this.y && z && (f44Var3 = this.H) != null) {
                    this.y = true;
                    f44Var3.g();
                }
                if (this.y && !z && (f44Var2 = this.H) != null) {
                    this.y = false;
                    f44Var2.f();
                }
                if (!this.n0 && !this.E && (f44Var = this.H) != null) {
                    f44Var.i(this);
                    this.E = true;
                }
                f44 f44Var5 = this.H;
                if (f44Var5 != null) {
                    if (uh9.x(getHeight(), 2.0f, scaleX, this.I.y) < hl.L(66.0f)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    f44Var5.B(z3);
                    f44 f44Var6 = this.H;
                    if (c00.B(getHeight(), 2.0f, scaleX, this.I.y) > ((View) getParent()).getHeight() - hl.L(114.0f)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    f44Var6.d(z4);
                }
                f44 f44Var7 = this.H;
                if ((f44Var7 == null || f44Var7.o()) && !z && dte.a(f5, f6, ((View) getParent()).getWidth() / 2.0f, ((View) getParent()).getHeight() - hl.L(76.0f)) < hl.L(32.0f)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.F != z2) {
                    ValueAnimator valueAnimator = this.q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.q0 = null;
                    }
                    float f11 = this.p0;
                    if (z2) {
                        f8 = 0.5f;
                    } else {
                        f8 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f8);
                    this.q0 = ofFloat;
                    ofFloat.addUpdateListener(new d44(this, (byte) 1));
                    this.q0.setInterpolator(k43.h);
                    this.q0.setDuration(280L);
                    this.q0.start();
                    this.F = z2;
                    f44 f44Var8 = this.H;
                    if (f44Var8 != null) {
                        f44Var8.j(z2);
                    }
                }
                this.a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z) {
        f44 f44Var;
        f44 f44Var2;
        if (this.x) {
            this.H.e(this.F);
            this.x = false;
        }
        this.y = false;
        if (!z && !this.G && !this.n && !this.w && !this.E && (f44Var2 = this.H) != null) {
            f44Var2.i(this);
        }
        if (this.n && (f44Var = this.H) != null) {
            f44Var.B(false);
            this.H.d(false);
        }
        hl.r(this.K);
        this.G = false;
        this.n = false;
        this.w = false;
        this.r = true;
        this.s = false;
        this.E = false;
        this.O = this.N;
        hl3 hl3Var = this.P;
        if (hl3Var != null) {
            hl.r(hl3Var);
            this.P = null;
        }
        this.a0 = this.T;
        hl.r(this.V);
        this.b0 = this.U;
        hl.r(this.W);
        if (getParent() instanceof a44) {
            ((a44) getParent()).invalidate();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float a = this.a.a(getBounceScale());
        canvas.save();
        canvas.scale(a, a, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof pp9) {
                float f = this.p0;
                canvas.scale(f, f, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - hl.L(76.0f)) - getY();
                float f2 = this.p0;
                canvas.scale(f2, f2, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h44.e(float, float):void");
    }

    public final void f(float f) {
        if (this.T != 0) {
            this.a0 = 0;
            n();
        }
        if (this.U != 0) {
            this.b0 = 0;
            o();
        }
        this.k0 = f;
        if (!this.M) {
            if (!this.e0) {
                Iterator it = r0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    int intValue = ((Integer) it.next()).intValue();
                    if (Math.abs(intValue - f) < 4.0f) {
                        if (this.O != intValue) {
                            this.O = intValue;
                            hl3 hl3Var = this.P;
                            if (hl3Var != null) {
                                hl.r(hl3Var);
                            }
                            hl3 hl3Var2 = new hl3(this, intValue, (byte) 5);
                            this.P = hl3Var2;
                            hl.d3(hl3Var2, 250L);
                        }
                    }
                }
            }
        } else if (Math.abs(this.N - f) < 12.0f && !this.e0) {
            if (this.R != null) {
                f = this.Q;
            } else {
                f = this.N;
            }
        } else {
            this.O = -1;
            hl3 hl3Var3 = this.P;
            if (hl3Var3 != null) {
                hl.r(hl3Var3);
                this.P = null;
            }
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.S;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.S = duration;
            duration.setInterpolator(k43.f);
            this.S.addUpdateListener(new d44(this, (byte) 0));
            this.S.addListener(new e44(this, (byte) 3));
            this.S.start();
            this.M = false;
        }
        ValueAnimator valueAnimator3 = this.S;
        if (valueAnimator3 != null) {
            f = hl.Z1(0.0f, f, valueAnimator3.getAnimatedFraction());
        }
        g(f);
    }

    public final void g(float f) {
        setRotation(f);
        if (this.T != 0 || this.U != 0) {
            k();
        }
        m();
    }

    public float getBounceScale() {
        return 0.04f;
    }

    public float getMaxScale() {
        return 100.0f;
    }

    public float getMinScale() {
        return 0.0f;
    }

    public PointF getPosition() {
        return this.I;
    }

    public float getPositionX() {
        float f;
        float f2 = this.I.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i = this.T;
            if (i == 1) {
                f = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + hl.L(8.0f);
            } else if (i == 2) {
                f = view.getMeasuredWidth() / 2.0f;
            } else if (i == 3) {
                f = (view.getMeasuredWidth() - hl.L(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f = f2;
            }
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                return hl.R1(f2, f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f != 0.0f) {
                return f;
            }
        }
        return f2;
    }

    public float getPositionY() {
        float f;
        float f2 = this.I.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i = this.U;
            if (i == 1) {
                f = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + hl.L(64.0f);
            } else if (i == 2) {
                f = view.getMeasuredHeight() / 2.0f;
            } else if (i == 3) {
                f = (view.getMeasuredHeight() - hl.L(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f = f2;
            }
            ValueAnimator valueAnimator = this.d0;
            if (valueAnimator != null) {
                return hl.R1(f2, f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f != 0.0f) {
                return f;
            }
        }
        return f2;
    }

    public float getScale() {
        return getScaleX();
    }

    public a69 getSelectionBounds() {
        return new a69(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public float getStickyPaddingBottom() {
        return 0.0f;
    }

    public float getStickyPaddingLeft() {
        return 0.0f;
    }

    public float getStickyPaddingRight() {
        return 0.0f;
    }

    public float getStickyPaddingTop() {
        return 0.0f;
    }

    public final int getStickyX() {
        return this.T;
    }

    public final int getStickyY() {
        return this.U;
    }

    public UUID getUUID() {
        return this.L;
    }

    public final void h(float... fArr) {
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.c0 = duration;
        duration.setInterpolator(k43.f);
        this.c0.addUpdateListener(new d44(this, (byte) 3));
        this.c0.addListener(new e44(this, (byte) 0));
        this.c0.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.d0 = duration;
        duration.setInterpolator(k43.f);
        this.d0.addUpdateListener(new d44(this, (byte) 4));
        this.d0.addListener(new e44(this, (byte) 1));
        this.d0.start();
    }

    @Override
    public final boolean isSelected() {
        return this.n0;
    }

    public final void j(float f) {
        boolean z;
        float f2 = this.j0;
        float f3 = f * f2;
        this.j0 = f3;
        float i = Utilities.i(Math.max(f3, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof s39)) {
            boolean z2 = false;
            if (i < getMaxScale() && i > getMinScale()) {
                z = false;
            } else {
                z = true;
            }
            if (f2 >= getMaxScale() || f2 <= getMinScale()) {
                z2 = true;
            }
            if (z != z2) {
                try {
                    performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
        setScaleX(i);
        setScaleY(i);
    }

    public void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
    }

    public final void l(FrameLayout frameLayout, boolean z) {
        if (this.n0 != z) {
            this.n0 = z;
            ValueAnimator valueAnimator = this.m0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.m0 = null;
            }
            float f = 0.0f;
            if (this.J == null) {
                if (z || frameLayout != null) {
                    g44 a = a();
                    this.J = a;
                    a.f = !this.e0;
                    a.invalidate();
                    frameLayout.addView(this.J);
                    this.l0 = 0.0f;
                } else {
                    return;
                }
            }
            this.J.b();
            float f2 = this.l0;
            if (z) {
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.m0 = ofFloat;
            ofFloat.addUpdateListener(new d44(this, (byte) 2));
            this.m0.addListener(new e44(this, (byte) 4));
            this.m0.setDuration(280L);
            this.m0.setInterpolator(k43.h);
            this.m0.start();
        }
    }

    public final void m() {
        g44 g44Var = this.J;
        if (g44Var != null) {
            g44Var.b();
        }
    }

    public final void n() {
        hl.r(this.V);
        int i = this.T;
        int i2 = this.a0;
        if (i == i2) {
            return;
        }
        this.T = i2;
        if (getParent() instanceof a44) {
            ((a44) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.a0 == 0) {
            h(1.0f, 0.0f);
            return;
        }
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        h(0.0f, 1.0f);
    }

    public final void o() {
        hl.r(this.W);
        int i = this.U;
        int i2 = this.b0;
        if (i == i2) {
            return;
        }
        this.U = i2;
        if (getParent() instanceof a44) {
            ((a44) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.b0 == 0) {
            i(1.0f, 0.0f);
            return;
        }
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        i(0.0f, 1.0f);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.H.p();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h44.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float p() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()));
    }

    public void setDelegate(f44 f44Var) {
        this.H = f44Var;
    }

    public void setPosition(PointF pointF) {
        this.I = pointF;
        k();
    }

    public void setScale(float f) {
        this.j0 = f;
        setScaleX(f);
        setScaleY(f);
    }

    public void setSelectionVisibility(boolean z) {
        int i;
        g44 g44Var = this.J;
        if (g44Var == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        g44Var.setVisibility(i);
    }

    public void setStickyX(int i) {
        this.a0 = i;
        this.T = i;
    }

    public void setStickyY(int i) {
        this.b0 = i;
        this.U = i;
    }

    public void setIsVideo(boolean z) {
    }
}
