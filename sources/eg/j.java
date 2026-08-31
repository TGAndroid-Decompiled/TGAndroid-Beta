package eg;

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
import k7.o6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.tk0;
public abstract class j extends FrameLayout {
    public static final List m0 = Arrays.asList(-90, 0, 90, 180);
    public boolean B;
    public h C;
    public PointF D;
    public i E;
    public final e F;
    public final UUID G;
    public boolean H;
    public int I;
    public int J;
    public af.b K;
    public float L;
    public ValueAnimator M;
    public ValueAnimator N;
    public int O;
    public int P;
    public final e Q;
    public final e R;
    public int S;
    public int T;
    public ValueAnimator U;
    public ValueAnimator V;
    public boolean W;
    public final rc f5268a;
    public boolean f5269a0;
    public float f5270b;
    public final float[] f5271b0;
    public float f5272c;
    public final float[] f5273c0;
    public float d;
    public final float[] f5274d0;
    public float f5275e;
    public float f5276e0;
    public float f5277f;
    public float f5278f0;
    public float f5279g0;
    public float h;
    public ValueAnimator f5280h0;
    public boolean f5281i0;
    public ViewGroup f5282j0;
    public float f5283k0;
    public ValueAnimator f5284l0;
    public boolean f5285n;
    public boolean f5286r;
    public boolean f5287s;
    public boolean v;
    public boolean f5288w;
    public boolean f5289x;
    public boolean f5290y;

    public j(Context context, PointF pointF) {
        super(context);
        this.f5268a = new rc(this);
        this.f5285n = false;
        this.f5286r = false;
        this.f5287s = false;
        this.v = false;
        this.f5288w = false;
        this.f5289x = false;
        this.f5290y = false;
        this.B = false;
        this.F = new Runnable(this) {
            public final j f5165b;

            {
                this.f5165b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j jVar = this.f5165b;
                        jVar.B = true;
                        if (jVar.C != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.C.t(jVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f5165b.n();
                        return;
                    default:
                        this.f5165b.o();
                        return;
                }
            }
        };
        this.H = true;
        this.I = 0;
        this.J = -1;
        this.O = 0;
        this.P = 0;
        this.Q = new Runnable(this) {
            public final j f5165b;

            {
                this.f5165b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j jVar = this.f5165b;
                        jVar.B = true;
                        if (jVar.C != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.C.t(jVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f5165b.n();
                        return;
                    default:
                        this.f5165b.o();
                        return;
                }
            }
        };
        this.R = new Runnable(this) {
            public final j f5165b;

            {
                this.f5165b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j jVar = this.f5165b;
                        jVar.B = true;
                        if (jVar.C != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.C.t(jVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f5165b.n();
                        return;
                    default:
                        this.f5165b.o();
                        return;
                }
            }
        };
        this.f5271b0 = new float[2];
        this.f5273c0 = new float[2];
        this.f5274d0 = new float[2];
        this.f5276e0 = 1.0f;
        this.f5281i0 = false;
        this.f5283k0 = 1.0f;
        this.G = UUID.randomUUID();
        this.D = pointF;
    }

    public abstract i a();

    public final float b() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()));
    }

    public final boolean c(float f10, float f11, boolean z4, float f12, float f13) {
        float f14;
        float f15;
        float f16;
        boolean z10;
        float f17;
        boolean z11;
        boolean z12;
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        if (getParent() != null) {
            float scaleX = ((View) getParent()).getScaleX();
            if (z4) {
                f14 = (f10 + f12) / 2.0f;
            } else {
                f14 = f10;
            }
            if (z4) {
                f15 = (f11 + f13) / 2.0f;
            } else {
                f15 = f11;
            }
            float f18 = (f14 - this.f5277f) / scaleX;
            float f19 = (f15 - this.h) / scaleX;
            float hypot = (float) Math.hypot(f18, f19);
            if (this.f5285n) {
                f16 = 6.0f;
            } else {
                f16 = 16.0f;
            }
            if (hypot > f16 || z4) {
                AndroidUtilities.cancelRunOnUIThread(this.F);
                e(f18, f19);
                if (z4) {
                    float a2 = o6.a(f10, f11, f12, f13);
                    float a10 = o6.a(this.f5270b, this.f5272c, this.d, this.f5275e);
                    if (a10 > 0.0f) {
                        j(a2 / a10);
                    }
                    f(this.f5278f0 + ((float) Math.toDegrees(Math.atan2(f11 - f13, f10 - f12) - Math.atan2(this.f5272c - this.f5275e, this.f5270b - this.d))));
                }
                this.f5270b = f10;
                this.f5272c = f11;
                this.f5277f = f14;
                this.h = f15;
                if (z4) {
                    this.d = f12;
                    this.f5275e = f13;
                }
                this.f5285n = true;
                if ((getParent() instanceof d) && (this.O != 0 || this.P != 0)) {
                    ((d) getParent()).invalidate();
                }
                if (!this.v && (hVar4 = this.C) != null) {
                    this.v = true;
                    hVar4.C();
                }
                if (!this.f5288w && z4 && (hVar3 = this.C) != null) {
                    this.f5288w = true;
                    hVar3.l();
                }
                if (this.f5288w && !z4 && (hVar2 = this.C) != null) {
                    this.f5288w = false;
                    hVar2.k();
                }
                if (!this.f5281i0 && !this.f5289x && (hVar = this.C) != null) {
                    hVar.x(this);
                    this.f5289x = true;
                }
                h hVar5 = this.C;
                if (hVar5 != null) {
                    if (org.telegram.messenger.y3.A(getHeight(), 2.0f, scaleX, this.D.y) < AndroidUtilities.dp(66.0f)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    hVar5.B(z11);
                    h hVar6 = this.C;
                    if (w.c.c(getHeight(), 2.0f, scaleX, this.D.y) > ((View) getParent()).getHeight() - AndroidUtilities.dp(114.0f)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    hVar6.h(z12);
                }
                h hVar7 = this.C;
                if ((hVar7 == null || hVar7.q()) && !z4 && o6.a(f14, f15, ((View) getParent()).getWidth() / 2.0f, ((View) getParent()).getHeight() - AndroidUtilities.dp(76.0f)) < AndroidUtilities.dp(32.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f5290y != z10) {
                    ValueAnimator valueAnimator = this.f5284l0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f5284l0 = null;
                    }
                    float f20 = this.f5283k0;
                    if (z10) {
                        f17 = 0.5f;
                    } else {
                        f17 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f20, f17);
                    this.f5284l0 = ofFloat;
                    ofFloat.addUpdateListener(new f(this, 1));
                    this.f5284l0.setInterpolator(pr.h);
                    this.f5284l0.setDuration(280L);
                    this.f5284l0.start();
                    this.f5290y = z10;
                    h hVar8 = this.C;
                    if (hVar8 != null) {
                        hVar8.n(z10);
                    }
                }
                this.f5268a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z4) {
        h hVar;
        h hVar2;
        if (this.v) {
            this.C.i(this.f5290y);
            this.v = false;
        }
        this.f5288w = false;
        if (!z4 && !this.B && !this.f5285n && !this.f5287s && !this.f5289x && (hVar2 = this.C) != null) {
            hVar2.x(this);
        }
        if (this.f5285n && (hVar = this.C) != null) {
            hVar.B(false);
            this.C.h(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.F);
        this.B = false;
        this.f5285n = false;
        this.f5287s = false;
        this.f5286r = true;
        this.f5289x = false;
        this.J = this.I;
        af.b bVar = this.K;
        if (bVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            this.K = null;
        }
        this.S = this.O;
        AndroidUtilities.cancelRunOnUIThread(this.Q);
        this.T = this.P;
        AndroidUtilities.cancelRunOnUIThread(this.R);
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float a2 = this.f5268a.a(getBounceScale());
        canvas.save();
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof z2) {
                float f10 = this.f5283k0;
                canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - AndroidUtilities.dp(76.0f)) - getY();
                float f11 = this.f5283k0;
                canvas.scale(f11, f11, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: eg.j.e(float, float):void");
    }

    public final void f(float f10) {
        if (this.O != 0) {
            this.S = 0;
            n();
        }
        if (this.P != 0) {
            this.T = 0;
            o();
        }
        this.f5278f0 = f10;
        boolean z4 = this.H;
        if (!z4 && !this.W) {
            Iterator it = m0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (Math.abs(intValue - f10) < 4.0f) {
                    if (this.J != intValue) {
                        this.J = intValue;
                        af.b bVar = this.K;
                        if (bVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(bVar);
                        }
                        af.b bVar2 = new af.b(this, intValue, 2);
                        this.K = bVar2;
                        AndroidUtilities.runOnUIThread(bVar2, 250L);
                    }
                }
            }
        } else if (z4) {
            if (Math.abs(this.I - f10) < 12.0f && !this.W) {
                if (this.M != null) {
                    f10 = this.L;
                } else {
                    f10 = this.I;
                }
            } else {
                this.J = -1;
                af.b bVar3 = this.K;
                if (bVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(bVar3);
                    this.K = null;
                }
                ValueAnimator valueAnimator = this.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.N;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                this.N = duration;
                duration.setInterpolator(pr.f30183f);
                this.N.addUpdateListener(new f(this, 0));
                this.N.addListener(new g(this, 3));
                this.N.start();
                this.H = false;
            }
        }
        ValueAnimator valueAnimator3 = this.N;
        if (valueAnimator3 != null) {
            f10 = AndroidUtilities.lerpAngle(0.0f, f10, valueAnimator3.getAnimatedFraction());
        }
        g(f10);
    }

    public final void g(float f10) {
        setRotation(f10);
        if (this.O != 0 || this.P != 0) {
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
        return this.D;
    }

    public float getPositionX() {
        float f10;
        float f11 = this.D.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i10 = this.O;
            if (i10 == 1) {
                f10 = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + AndroidUtilities.dp(8.0f);
            } else if (i10 == 2) {
                f10 = view.getMeasuredWidth() / 2.0f;
            } else if (i10 == 3) {
                f10 = (view.getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f11, f10, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f10 != 0.0f) {
                return f10;
            }
        }
        return f11;
    }

    public float getPositionY() {
        float f10;
        float f11 = this.D.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i10 = this.P;
            if (i10 == 1) {
                f10 = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + AndroidUtilities.dp(64.0f);
            } else if (i10 == 2) {
                f10 = view.getMeasuredHeight() / 2.0f;
            } else if (i10 == 3) {
                f10 = (view.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f11, f10, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f10 != 0.0f) {
                return f10;
            }
        }
        return f11;
    }

    public float getScale() {
        return getScaleX();
    }

    public tk0 getSelectionBounds() {
        return new tk0(0.0f, 0.0f, 0.0f, 0.0f);
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
        return this.O;
    }

    public final int getStickyY() {
        return this.P;
    }

    public UUID getUUID() {
        return this.G;
    }

    public final void h(float... fArr) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.U = duration;
        duration.setInterpolator(pr.f30183f);
        this.U.addUpdateListener(new f(this, 3));
        this.U.addListener(new g(this, 0));
        this.U.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.V = duration;
        duration.setInterpolator(pr.f30183f);
        this.V.addUpdateListener(new f(this, 4));
        this.V.addListener(new g(this, 1));
        this.V.start();
    }

    @Override
    public final boolean isSelected() {
        return this.f5281i0;
    }

    public final void j(float f10) {
        boolean z4;
        float f11 = this.f5276e0;
        float f12 = f10 * f11;
        this.f5276e0 = f12;
        float clamp = Utilities.clamp(Math.max(f12, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof y2)) {
            boolean z10 = false;
            if (clamp < getMaxScale() && clamp > getMinScale()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4 != ((f11 >= getMaxScale() || f11 <= getMinScale()) ? true : true)) {
                try {
                    performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
        setScaleX(clamp);
        setScaleY(clamp);
    }

    public void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
    }

    public final void l(ViewGroup viewGroup, boolean z4) {
        if (this.f5281i0 != z4) {
            this.f5281i0 = z4;
            ValueAnimator valueAnimator = this.f5280h0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f5280h0 = null;
            }
            float f10 = 0.0f;
            if (this.E == null) {
                if (z4 || viewGroup != null) {
                    i a2 = a();
                    this.E = a2;
                    a2.f5243f = !this.W;
                    a2.invalidate();
                    viewGroup.addView(this.E);
                    this.f5279g0 = 0.0f;
                } else {
                    return;
                }
            }
            this.E.b();
            float f11 = this.f5279g0;
            if (z4) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f5280h0 = ofFloat;
            ofFloat.addUpdateListener(new f(this, 2));
            this.f5280h0.addListener(new g(this, 4));
            this.f5280h0.setDuration(280L);
            this.f5280h0.setInterpolator(pr.h);
            this.f5280h0.start();
        }
    }

    public final void m() {
        i iVar = this.E;
        if (iVar != null) {
            iVar.b();
        }
    }

    public final void n() {
        AndroidUtilities.cancelRunOnUIThread(this.Q);
        int i10 = this.O;
        int i11 = this.S;
        if (i10 == i11) {
            return;
        }
        this.O = i11;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.S == 0) {
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
        AndroidUtilities.cancelRunOnUIThread(this.R);
        int i10 = this.P;
        int i11 = this.T;
        if (i10 == i11) {
            return;
        }
        this.P = i11;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.T == 0) {
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
        return this.C.r();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: eg.j.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float p() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()));
    }

    public void setDelegate(h hVar) {
        this.C = hVar;
    }

    public void setPosition(PointF pointF) {
        this.D = pointF;
        k();
    }

    public void setScale(float f10) {
        this.f5276e0 = f10;
        setScaleX(f10);
        setScaleY(f10);
    }

    public void setSelectionVisibility(boolean z4) {
        int i10;
        i iVar = this.E;
        if (iVar == null) {
            return;
        }
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        iVar.setVisibility(i10);
    }

    public void setStickyX(int i10) {
        this.S = i10;
        this.O = i10;
    }

    public void setStickyY(int i10) {
        this.T = i10;
        this.P = i10;
    }

    public void setIsVideo(boolean z4) {
    }
}
