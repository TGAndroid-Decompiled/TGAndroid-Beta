package bg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import i7.z5;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;
public abstract class k extends FrameLayout {
    public static final List f2342l0 = Arrays.asList(-90, 0, 90, 180);
    public boolean A;
    public i B;
    public PointF C;
    public j D;
    public final e E;
    public final UUID F;
    public boolean G;
    public int H;
    public int I;
    public f J;
    public float K;
    public ValueAnimator L;
    public ValueAnimator M;
    public int N;
    public int O;
    public final e P;
    public final e Q;
    public int R;
    public int S;
    public ValueAnimator T;
    public ValueAnimator U;
    public boolean V;
    public boolean W;
    public final uc f2343a;
    public final float[] f2344a0;
    public float f2345b;
    public final float[] f2346b0;
    public float f2347c;
    public final float[] f2348c0;
    public float d;
    public float f2349d0;
    public float f2350e;
    public float f2351e0;
    public float f2352f;
    public float f2353f0;
    public ValueAnimator f2354g0;
    public float h;
    public boolean f2355h0;
    public ViewGroup f2356i0;
    public float f2357j0;
    public ValueAnimator f2358k0;
    public boolean f2359n;
    public boolean f2360r;
    public boolean f2361s;
    public boolean v;
    public boolean f2362w;
    public boolean f2363x;
    public boolean f2364y;

    public k(Context context, PointF pointF) {
        super(context);
        this.f2343a = new uc(this);
        this.f2359n = false;
        this.f2360r = false;
        this.f2361s = false;
        this.v = false;
        this.f2362w = false;
        this.f2363x = false;
        this.f2364y = false;
        this.A = false;
        this.E = new Runnable(this) {
            public final k f2164b;

            {
                this.f2164b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k kVar = this.f2164b;
                        kVar.A = true;
                        if (kVar.B != null) {
                            try {
                                kVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            kVar.B.b(kVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f2164b.n();
                        return;
                    default:
                        this.f2164b.o();
                        return;
                }
            }
        };
        this.G = true;
        this.H = 0;
        this.I = -1;
        this.N = 0;
        this.O = 0;
        this.P = new Runnable(this) {
            public final k f2164b;

            {
                this.f2164b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k kVar = this.f2164b;
                        kVar.A = true;
                        if (kVar.B != null) {
                            try {
                                kVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            kVar.B.b(kVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f2164b.n();
                        return;
                    default:
                        this.f2164b.o();
                        return;
                }
            }
        };
        this.Q = new Runnable(this) {
            public final k f2164b;

            {
                this.f2164b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k kVar = this.f2164b;
                        kVar.A = true;
                        if (kVar.B != null) {
                            try {
                                kVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            kVar.B.b(kVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f2164b.n();
                        return;
                    default:
                        this.f2164b.o();
                        return;
                }
            }
        };
        this.f2344a0 = new float[2];
        this.f2346b0 = new float[2];
        this.f2348c0 = new float[2];
        this.f2349d0 = 1.0f;
        this.f2355h0 = false;
        this.f2357j0 = 1.0f;
        this.F = UUID.randomUUID();
        this.C = pointF;
    }

    public abstract j a();

    public final float b() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()));
    }

    public final boolean c(float f9, float f10, boolean z10, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        boolean z11;
        float f16;
        boolean z12;
        boolean z13;
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        if (getParent() != null) {
            float scaleX = ((View) getParent()).getScaleX();
            if (z10) {
                f13 = (f9 + f11) / 2.0f;
            } else {
                f13 = f9;
            }
            if (z10) {
                f14 = (f10 + f12) / 2.0f;
            } else {
                f14 = f10;
            }
            float f17 = (f13 - this.f2352f) / scaleX;
            float f18 = (f14 - this.h) / scaleX;
            float hypot = (float) Math.hypot(f17, f18);
            if (this.f2359n) {
                f15 = 6.0f;
            } else {
                f15 = 16.0f;
            }
            if (hypot > f15 || z10) {
                AndroidUtilities.cancelRunOnUIThread(this.E);
                e(f17, f18);
                if (z10) {
                    float a2 = z5.a(f9, f10, f11, f12);
                    float a10 = z5.a(this.f2345b, this.f2347c, this.d, this.f2350e);
                    if (a10 > 0.0f) {
                        j(a2 / a10);
                    }
                    f(this.f2351e0 + ((float) Math.toDegrees(Math.atan2(f10 - f12, f9 - f11) - Math.atan2(this.f2347c - this.f2350e, this.f2345b - this.d))));
                }
                this.f2345b = f9;
                this.f2347c = f10;
                this.f2352f = f13;
                this.h = f14;
                if (z10) {
                    this.d = f11;
                    this.f2350e = f12;
                }
                this.f2359n = true;
                if ((getParent() instanceof d) && (this.N != 0 || this.O != 0)) {
                    ((d) getParent()).invalidate();
                }
                if (!this.v && (iVar4 = this.B) != null) {
                    this.v = true;
                    iVar4.C();
                }
                if (!this.f2362w && z10 && (iVar3 = this.B) != null) {
                    this.f2362w = true;
                    iVar3.k();
                }
                if (this.f2362w && !z10 && (iVar2 = this.B) != null) {
                    this.f2362w = false;
                    iVar2.j();
                }
                if (!this.f2355h0 && !this.f2363x && (iVar = this.B) != null) {
                    iVar.y(this);
                    this.f2363x = true;
                }
                i iVar5 = this.B;
                if (iVar5 != null) {
                    if (org.telegram.messenger.x3.A(getHeight(), 2.0f, scaleX, this.C.y) < AndroidUtilities.dp(66.0f)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    iVar5.B(z12);
                    i iVar6 = this.B;
                    if (u3.c.c(getHeight(), 2.0f, scaleX, this.C.y) > ((View) getParent()).getHeight() - AndroidUtilities.dp(114.0f)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    iVar6.g(z13);
                }
                i iVar7 = this.B;
                if ((iVar7 == null || iVar7.p()) && !z10 && z5.a(f13, f14, ((View) getParent()).getWidth() / 2.0f, ((View) getParent()).getHeight() - AndroidUtilities.dp(76.0f)) < AndroidUtilities.dp(32.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f2364y != z11) {
                    ValueAnimator valueAnimator = this.f2358k0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f2358k0 = null;
                    }
                    float f19 = this.f2357j0;
                    if (z11) {
                        f16 = 0.5f;
                    } else {
                        f16 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f19, f16);
                    this.f2358k0 = ofFloat;
                    ofFloat.addUpdateListener(new g(this, 1));
                    this.f2358k0.setInterpolator(jr.h);
                    this.f2358k0.setDuration(280L);
                    this.f2358k0.start();
                    this.f2364y = z11;
                    i iVar8 = this.B;
                    if (iVar8 != null) {
                        iVar8.m(z11);
                    }
                }
                this.f2343a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z10) {
        i iVar;
        i iVar2;
        if (this.v) {
            this.B.h(this.f2364y);
            this.v = false;
        }
        this.f2362w = false;
        if (!z10 && !this.A && !this.f2359n && !this.f2361s && !this.f2363x && (iVar2 = this.B) != null) {
            iVar2.y(this);
        }
        if (this.f2359n && (iVar = this.B) != null) {
            iVar.B(false);
            this.B.g(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.E);
        this.A = false;
        this.f2359n = false;
        this.f2361s = false;
        this.f2360r = true;
        this.f2363x = false;
        this.I = this.H;
        f fVar = this.J;
        if (fVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fVar);
            this.J = null;
        }
        this.R = this.N;
        AndroidUtilities.cancelRunOnUIThread(this.P);
        this.S = this.O;
        AndroidUtilities.cancelRunOnUIThread(this.Q);
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float a2 = this.f2343a.a(getBounceScale());
        canvas.save();
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof f3) {
                float f9 = this.f2357j0;
                canvas.scale(f9, f9, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - AndroidUtilities.dp(76.0f)) - getY();
                float f10 = this.f2357j0;
                canvas.scale(f10, f10, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: bg.k.e(float, float):void");
    }

    public final void f(float f9) {
        if (this.N != 0) {
            this.R = 0;
            n();
        }
        if (this.O != 0) {
            this.S = 0;
            o();
        }
        this.f2351e0 = f9;
        boolean z10 = this.G;
        if (!z10 && !this.V) {
            Iterator it = f2342l0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (Math.abs(intValue - f9) < 4.0f) {
                    if (this.I != intValue) {
                        this.I = intValue;
                        f fVar = this.J;
                        if (fVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(fVar);
                        }
                        f fVar2 = new f(this, intValue, 0);
                        this.J = fVar2;
                        AndroidUtilities.runOnUIThread(fVar2, 250L);
                    }
                }
            }
        } else if (z10) {
            if (Math.abs(this.H - f9) < 12.0f && !this.V) {
                if (this.L != null) {
                    f9 = this.K;
                } else {
                    f9 = this.H;
                }
            } else {
                this.I = -1;
                f fVar3 = this.J;
                if (fVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(fVar3);
                    this.J = null;
                }
                ValueAnimator valueAnimator = this.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.M;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                this.M = duration;
                duration.setInterpolator(jr.f29800f);
                this.M.addUpdateListener(new g(this, 0));
                this.M.addListener(new h(this, 3));
                this.M.start();
                this.G = false;
            }
        }
        ValueAnimator valueAnimator3 = this.M;
        if (valueAnimator3 != null) {
            f9 = AndroidUtilities.lerpAngle(0.0f, f9, valueAnimator3.getAnimatedFraction());
        }
        g(f9);
    }

    public final void g(float f9) {
        setRotation(f9);
        if (this.N != 0 || this.O != 0) {
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
        return this.C;
    }

    public float getPositionX() {
        float f9;
        float f10 = this.C.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i10 = this.N;
            if (i10 == 1) {
                f9 = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + AndroidUtilities.dp(8.0f);
            } else if (i10 == 2) {
                f9 = view.getMeasuredWidth() / 2.0f;
            } else if (i10 == 3) {
                f9 = (view.getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f9 = f10;
            }
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f10, f9, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f9 != 0.0f) {
                return f9;
            }
        }
        return f10;
    }

    public float getPositionY() {
        float f9;
        float f10 = this.C.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i10 = this.O;
            if (i10 == 1) {
                f9 = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + AndroidUtilities.dp(64.0f);
            } else if (i10 == 2) {
                f9 = view.getMeasuredHeight() / 2.0f;
            } else if (i10 == 3) {
                f9 = (view.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f9 = f10;
            }
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f10, f9, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f9 != 0.0f) {
                return f9;
            }
        }
        return f10;
    }

    public float getScale() {
        return getScaleX();
    }

    public hk0 getSelectionBounds() {
        return new hk0(0.0f, 0.0f, 0.0f, 0.0f);
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
        return this.N;
    }

    public final int getStickyY() {
        return this.O;
    }

    public UUID getUUID() {
        return this.F;
    }

    public final void h(float... fArr) {
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.T = duration;
        duration.setInterpolator(jr.f29800f);
        this.T.addUpdateListener(new g(this, 3));
        this.T.addListener(new h(this, 0));
        this.T.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.U = duration;
        duration.setInterpolator(jr.f29800f);
        this.U.addUpdateListener(new g(this, 4));
        this.U.addListener(new h(this, 1));
        this.U.start();
    }

    @Override
    public final boolean isSelected() {
        return this.f2355h0;
    }

    public final void j(float f9) {
        boolean z10;
        float f10 = this.f2349d0;
        float f11 = f9 * f10;
        this.f2349d0 = f11;
        float clamp = Utilities.clamp(Math.max(f11, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof e3)) {
            boolean z11 = false;
            if (clamp < getMaxScale() && clamp > getMinScale()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 != ((f10 >= getMaxScale() || f10 <= getMinScale()) ? true : true)) {
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

    public final void l(ViewGroup viewGroup, boolean z10) {
        if (this.f2355h0 != z10) {
            this.f2355h0 = z10;
            ValueAnimator valueAnimator = this.f2354g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f2354g0 = null;
            }
            float f9 = 0.0f;
            if (this.D == null) {
                if (z10 || viewGroup != null) {
                    j a2 = a();
                    this.D = a2;
                    a2.f2328f = !this.V;
                    a2.invalidate();
                    viewGroup.addView(this.D);
                    this.f2353f0 = 0.0f;
                } else {
                    return;
                }
            }
            this.D.b();
            float f10 = this.f2353f0;
            if (z10) {
                f9 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.f2354g0 = ofFloat;
            ofFloat.addUpdateListener(new g(this, 2));
            this.f2354g0.addListener(new h(this, 4));
            this.f2354g0.setDuration(280L);
            this.f2354g0.setInterpolator(jr.h);
            this.f2354g0.start();
        }
    }

    public final void m() {
        j jVar = this.D;
        if (jVar != null) {
            jVar.b();
        }
    }

    public final void n() {
        AndroidUtilities.cancelRunOnUIThread(this.P);
        int i10 = this.N;
        int i11 = this.R;
        if (i10 == i11) {
            return;
        }
        this.N = i11;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.R == 0) {
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
        return this.B.r();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: bg.k.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float p() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()));
    }

    public void setDelegate(i iVar) {
        this.B = iVar;
    }

    public void setPosition(PointF pointF) {
        this.C = pointF;
        k();
    }

    public void setScale(float f9) {
        this.f2349d0 = f9;
        setScaleX(f9);
        setScaleY(f9);
    }

    public void setSelectionVisibility(boolean z10) {
        int i10;
        j jVar = this.D;
        if (jVar == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        jVar.setVisibility(i10);
    }

    public void setStickyX(int i10) {
        this.R = i10;
        this.N = i10;
    }

    public void setStickyY(int i10) {
        this.S = i10;
        this.O = i10;
    }

    public void setIsVideo(boolean z10) {
    }
}
