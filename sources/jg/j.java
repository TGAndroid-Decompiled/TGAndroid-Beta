package jg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.oj0;
import w7.z8;
public abstract class j extends FrameLayout {
    public static final List f10030p0 = Arrays.asList(-90, 0, 90, 180);
    public boolean D;
    public boolean E;
    public h F;
    public PointF G;
    public i H;
    public final e I;
    public final UUID J;
    public boolean K;
    public int L;
    public int M;
    public ag.d3 N;
    public float O;
    public ValueAnimator P;
    public ValueAnimator Q;
    public int R;
    public int S;
    public final e T;
    public final e U;
    public int V;
    public int W;
    public final dc f10031a;
    public ValueAnimator f10032a0;
    public float f10033b;
    public ValueAnimator f10034b0;
    public float f10035c;
    public boolean f10036c0;
    public float d;
    public boolean f10037d0;
    public float e;
    public final float[] f10038e0;
    public float f10039f;
    public final float[] f10040f0;
    public final float[] f10041g0;
    public float h;
    public float f10042h0;
    public float f10043i0;
    public float f10044j0;
    public ValueAnimator f10045k0;
    public boolean f10046l0;
    public ViewGroup m0;
    public boolean f10047n;
    public float f10048n0;
    public ValueAnimator f10049o0;
    public boolean f10050r;
    public boolean f10051s;
    public boolean f10052w;
    public boolean f10053x;
    public boolean f10054y;

    public j(Context context, PointF pointF) {
        super(context);
        this.f10031a = new dc(this);
        this.f10047n = false;
        this.f10050r = false;
        this.f10051s = false;
        this.f10052w = false;
        this.f10053x = false;
        this.f10054y = false;
        this.D = false;
        this.E = false;
        this.I = new Runnable(this) {
            public final j f9942b;

            {
                this.f9942b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j jVar = this.f9942b;
                        jVar.E = true;
                        if (jVar.F != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.F.b(jVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f9942b.n();
                        return;
                    default:
                        this.f9942b.o();
                        return;
                }
            }
        };
        this.K = true;
        this.L = 0;
        this.M = -1;
        this.R = 0;
        this.S = 0;
        this.T = new Runnable(this) {
            public final j f9942b;

            {
                this.f9942b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j jVar = this.f9942b;
                        jVar.E = true;
                        if (jVar.F != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.F.b(jVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f9942b.n();
                        return;
                    default:
                        this.f9942b.o();
                        return;
                }
            }
        };
        this.U = new Runnable(this) {
            public final j f9942b;

            {
                this.f9942b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j jVar = this.f9942b;
                        jVar.E = true;
                        if (jVar.F != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.F.b(jVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f9942b.n();
                        return;
                    default:
                        this.f9942b.o();
                        return;
                }
            }
        };
        this.f10038e0 = new float[2];
        this.f10040f0 = new float[2];
        this.f10041g0 = new float[2];
        this.f10042h0 = 1.0f;
        this.f10046l0 = false;
        this.f10048n0 = 1.0f;
        this.J = UUID.randomUUID();
        this.G = pointF;
    }

    public abstract i a();

    public final float b() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()));
    }

    public final boolean c(float f7, float f10, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        float f15;
        boolean z11;
        float f16;
        boolean z12;
        boolean z13;
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        if (getParent() != null) {
            float scaleX = ((View) getParent()).getScaleX();
            if (z10) {
                f13 = (f7 + f11) / 2.0f;
            } else {
                f13 = f7;
            }
            if (z10) {
                f14 = (f10 + f12) / 2.0f;
            } else {
                f14 = f10;
            }
            float f17 = (f13 - this.f10039f) / scaleX;
            float f18 = (f14 - this.h) / scaleX;
            float hypot = (float) Math.hypot(f17, f18);
            if (this.f10047n) {
                f15 = 6.0f;
            } else {
                f15 = 16.0f;
            }
            if (hypot > f15 || z10) {
                org.telegram.messenger.i0.r(this.I);
                e(f17, f18);
                if (z10) {
                    float a2 = z8.a(f7, f10, f11, f12);
                    float a10 = z8.a(this.f10033b, this.f10035c, this.d, this.e);
                    if (a10 > 0.0f) {
                        j(a2 / a10);
                    }
                    f(this.f10043i0 + ((float) Math.toDegrees(Math.atan2(f10 - f12, f7 - f11) - Math.atan2(this.f10035c - this.e, this.f10033b - this.d))));
                }
                this.f10033b = f7;
                this.f10035c = f10;
                this.f10039f = f13;
                this.h = f14;
                if (z10) {
                    this.d = f11;
                    this.e = f12;
                }
                this.f10047n = true;
                if ((getParent() instanceof d) && (this.R != 0 || this.S != 0)) {
                    ((d) getParent()).invalidate();
                }
                if (!this.f10052w && (hVar4 = this.F) != null) {
                    this.f10052w = true;
                    hVar4.C();
                }
                if (!this.f10053x && z10 && (hVar3 = this.F) != null) {
                    this.f10053x = true;
                    hVar3.h();
                }
                if (this.f10053x && !z10 && (hVar2 = this.F) != null) {
                    this.f10053x = false;
                    hVar2.g();
                }
                if (!this.f10046l0 && !this.f10054y && (hVar = this.F) != null) {
                    hVar.y(this);
                    this.f10054y = true;
                }
                h hVar5 = this.F;
                if (hVar5 != null) {
                    if (z20.v(getHeight(), 2.0f, scaleX, this.G.y) < org.telegram.messenger.i0.L(66.0f)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    hVar5.B(z12);
                    h hVar6 = this.F;
                    if (a1.g.c(getHeight(), 2.0f, scaleX, this.G.y) > ((View) getParent()).getHeight() - org.telegram.messenger.i0.L(114.0f)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    hVar6.e(z13);
                }
                h hVar7 = this.F;
                if ((hVar7 == null || hVar7.o()) && !z10 && z8.a(f13, f14, ((View) getParent()).getWidth() / 2.0f, ((View) getParent()).getHeight() - org.telegram.messenger.i0.L(76.0f)) < org.telegram.messenger.i0.L(32.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.D != z11) {
                    ValueAnimator valueAnimator = this.f10049o0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f10049o0 = null;
                    }
                    float f19 = this.f10048n0;
                    if (z11) {
                        f16 = 0.5f;
                    } else {
                        f16 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f19, f16);
                    this.f10049o0 = ofFloat;
                    ofFloat.addUpdateListener(new f(this, 1));
                    this.f10049o0.setInterpolator(gr.h);
                    this.f10049o0.setDuration(280L);
                    this.f10049o0.start();
                    this.D = z11;
                    h hVar8 = this.F;
                    if (hVar8 != null) {
                        hVar8.j(z11);
                    }
                }
                this.f10031a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z10) {
        h hVar;
        h hVar2;
        if (this.f10052w) {
            this.F.f(this.D);
            this.f10052w = false;
        }
        this.f10053x = false;
        if (!z10 && !this.E && !this.f10047n && !this.f10051s && !this.f10054y && (hVar2 = this.F) != null) {
            hVar2.y(this);
        }
        if (this.f10047n && (hVar = this.F) != null) {
            hVar.B(false);
            this.F.e(false);
        }
        org.telegram.messenger.i0.r(this.I);
        this.E = false;
        this.f10047n = false;
        this.f10051s = false;
        this.f10050r = true;
        this.f10054y = false;
        this.M = this.L;
        ag.d3 d3Var = this.N;
        if (d3Var != null) {
            org.telegram.messenger.i0.r(d3Var);
            this.N = null;
        }
        this.V = this.R;
        org.telegram.messenger.i0.r(this.T);
        this.W = this.S;
        org.telegram.messenger.i0.r(this.U);
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float a2 = this.f10031a.a(getBounceScale());
        canvas.save();
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof i2) {
                float f7 = this.f10048n0;
                canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - org.telegram.messenger.i0.L(76.0f)) - getY();
                float f10 = this.f10048n0;
                canvas.scale(f10, f10, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: jg.j.e(float, float):void");
    }

    public final void f(float f7) {
        if (this.R != 0) {
            this.V = 0;
            n();
        }
        if (this.S != 0) {
            this.W = 0;
            o();
        }
        this.f10043i0 = f7;
        boolean z10 = this.K;
        if (!z10 && !this.f10036c0) {
            Iterator it = f10030p0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (Math.abs(intValue - f7) < 4.0f) {
                    if (this.M != intValue) {
                        this.M = intValue;
                        ag.d3 d3Var = this.N;
                        if (d3Var != null) {
                            org.telegram.messenger.i0.r(d3Var);
                        }
                        ag.d3 d3Var2 = new ag.d3(this, intValue, 6);
                        this.N = d3Var2;
                        org.telegram.messenger.i0.h3(d3Var2, 250L);
                    }
                }
            }
        } else if (z10) {
            if (Math.abs(this.L - f7) < 12.0f && !this.f10036c0) {
                if (this.P != null) {
                    f7 = this.O;
                } else {
                    f7 = this.L;
                }
            } else {
                this.M = -1;
                ag.d3 d3Var3 = this.N;
                if (d3Var3 != null) {
                    org.telegram.messenger.i0.r(d3Var3);
                    this.N = null;
                }
                ValueAnimator valueAnimator = this.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.Q;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                this.Q = duration;
                duration.setInterpolator(gr.f26495f);
                this.Q.addUpdateListener(new f(this, 0));
                this.Q.addListener(new g(this, 3));
                this.Q.start();
                this.K = false;
            }
        }
        ValueAnimator valueAnimator3 = this.Q;
        if (valueAnimator3 != null) {
            f7 = org.telegram.messenger.i0.b2(0.0f, f7, valueAnimator3.getAnimatedFraction());
        }
        g(f7);
    }

    public final void g(float f7) {
        setRotation(f7);
        if (this.R != 0 || this.S != 0) {
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
        return this.G;
    }

    public float getPositionX() {
        float f7;
        float f10 = this.G.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i10 = this.R;
            if (i10 == 1) {
                f7 = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + org.telegram.messenger.i0.L(8.0f);
            } else if (i10 == 2) {
                f7 = view.getMeasuredWidth() / 2.0f;
            } else if (i10 == 3) {
                f7 = (view.getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f7 = f10;
            }
            ValueAnimator valueAnimator = this.f10032a0;
            if (valueAnimator != null) {
                return org.telegram.messenger.i0.T1(f10, f7, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f7 != 0.0f) {
                return f7;
            }
        }
        return f10;
    }

    public float getPositionY() {
        float f7;
        float f10 = this.G.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i10 = this.S;
            if (i10 == 1) {
                f7 = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + org.telegram.messenger.i0.L(64.0f);
            } else if (i10 == 2) {
                f7 = view.getMeasuredHeight() / 2.0f;
            } else if (i10 == 3) {
                f7 = (view.getMeasuredHeight() - org.telegram.messenger.i0.L(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f7 = f10;
            }
            ValueAnimator valueAnimator = this.f10034b0;
            if (valueAnimator != null) {
                return org.telegram.messenger.i0.T1(f10, f7, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f7 != 0.0f) {
                return f7;
            }
        }
        return f10;
    }

    public float getScale() {
        return getScaleX();
    }

    public oj0 getSelectionBounds() {
        return new oj0(0.0f, 0.0f, 0.0f, 0.0f);
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
        return this.R;
    }

    public final int getStickyY() {
        return this.S;
    }

    public UUID getUUID() {
        return this.J;
    }

    public final void h(float... fArr) {
        ValueAnimator valueAnimator = this.f10032a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.f10032a0 = duration;
        duration.setInterpolator(gr.f26495f);
        this.f10032a0.addUpdateListener(new f(this, 3));
        this.f10032a0.addListener(new g(this, 0));
        this.f10032a0.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.f10034b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.f10034b0 = duration;
        duration.setInterpolator(gr.f26495f);
        this.f10034b0.addUpdateListener(new f(this, 4));
        this.f10034b0.addListener(new g(this, 1));
        this.f10034b0.start();
    }

    @Override
    public final boolean isSelected() {
        return this.f10046l0;
    }

    public final void j(float f7) {
        boolean z10;
        float f10 = this.f10042h0;
        float f11 = f7 * f10;
        this.f10042h0 = f11;
        float i10 = Utilities.i(Math.max(f11, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof h2)) {
            boolean z11 = false;
            if (i10 < getMaxScale() && i10 > getMinScale()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (f10 >= getMaxScale() || f10 <= getMinScale()) {
                z11 = true;
            }
            if (z10 != z11) {
                try {
                    performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
        setScaleX(i10);
        setScaleY(i10);
    }

    public void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
    }

    public final void l(ViewGroup viewGroup, boolean z10) {
        if (this.f10046l0 != z10) {
            this.f10046l0 = z10;
            ValueAnimator valueAnimator = this.f10045k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f10045k0 = null;
            }
            float f7 = 0.0f;
            if (this.H == null) {
                if (z10 || viewGroup != null) {
                    i a2 = a();
                    this.H = a2;
                    a2.f10014f = !this.f10036c0;
                    a2.invalidate();
                    viewGroup.addView(this.H);
                    this.f10044j0 = 0.0f;
                } else {
                    return;
                }
            }
            this.H.b();
            float f10 = this.f10044j0;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f10045k0 = ofFloat;
            ofFloat.addUpdateListener(new f(this, 2));
            this.f10045k0.addListener(new g(this, 4));
            this.f10045k0.setDuration(280L);
            this.f10045k0.setInterpolator(gr.h);
            this.f10045k0.start();
        }
    }

    public final void m() {
        i iVar = this.H;
        if (iVar != null) {
            iVar.b();
        }
    }

    public final void n() {
        org.telegram.messenger.i0.r(this.T);
        int i10 = this.R;
        int i11 = this.V;
        if (i10 == i11) {
            return;
        }
        this.R = i11;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.f10032a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.V == 0) {
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
        org.telegram.messenger.i0.r(this.U);
        int i10 = this.S;
        int i11 = this.W;
        if (i10 == i11) {
            return;
        }
        this.S = i11;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.f10034b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.W == 0) {
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
        return this.F.p();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: jg.j.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float p() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()));
    }

    public void setDelegate(h hVar) {
        this.F = hVar;
    }

    public void setPosition(PointF pointF) {
        this.G = pointF;
        k();
    }

    public void setScale(float f7) {
        this.f10042h0 = f7;
        setScaleX(f7);
        setScaleY(f7);
    }

    public void setSelectionVisibility(boolean z10) {
        int i10;
        i iVar = this.H;
        if (iVar == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        iVar.setVisibility(i10);
    }

    public void setStickyX(int i10) {
        this.V = i10;
        this.R = i10;
    }

    public void setStickyY(int i10) {
        this.W = i10;
        this.S = i10;
    }

    public void setIsVideo(boolean z10) {
    }
}
