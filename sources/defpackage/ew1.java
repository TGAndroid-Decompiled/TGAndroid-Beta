package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashSet;
public class ew1 extends FrameLayout implements g94, vlb {
    public static final int[] J = {2131232360, 2131231508, 2131231510, 2131232188, 2131232188};
    public static final int[] K = {0};
    public static final int[] L = {1, 2, 3, 4};
    public static final RectF M = new RectF();
    public float E;
    public float F;
    public float G;
    public final Paint H;
    public int I;
    public final ry[] a;
    public final View.OnClickListener[] b;
    public final gm1[] c;
    public dw1 d;
    public final FrameLayout e;
    public final HashSet f;
    public final ylb h;
    public final km0 n;
    public final am0 r;
    public boolean s;
    public im0 w;
    public final fn0 x;
    public final fn0 y;

    public ew1(Context context, ylb ylbVar, am0 am0Var, km0 km0Var) {
        super(context);
        this.a = new ry[5];
        this.b = new View.OnClickListener[5];
        this.c = new gm1[5];
        this.f = new HashSet();
        d53 d53Var = d53.h;
        this.x = new fn0(99, this, d53Var, 320L, false);
        this.y = new fn0(100, this, d53Var, 320L, false);
        this.H = new Paint(1);
        this.I = 0;
        this.n = km0Var;
        this.r = am0Var;
        this.h = ylbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipToOutline(true);
        xj xjVar = agc.a;
        frameLayout.setOutlineProvider(new yfc(0, gm.L(22.0f)));
        addView(frameLayout, qoe.e(-1, 44, 16));
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 99) {
            invalidate();
            return;
        }
        if (i == 100) {
            a();
            invalidate();
        }
        int i2 = i >> 16;
        int i3 = i & 65535;
        if (i2 >= 0) {
            ry[] ryVarArr = this.a;
            if (i2 < ryVarArr.length && ryVarArr[i2] != null && i3 == 1) {
                b(true);
                a();
                invalidate();
            }
        }
    }

    @Override
    public final void V(float f, int i) {
        ry ryVar;
        hg5 hg5Var;
        if (i == 99 || i == 100) {
            invalidate();
        }
        int i2 = i >> 16;
        int i3 = i & 65535;
        if (i2 >= 0) {
            ry[] ryVarArr = this.a;
            if (i2 < ryVarArr.length && (ryVar = ryVarArr[i2]) != null && i3 == 1 && ((fn0) ryVar.d).f) {
                gm1 gm1Var = this.c[i2];
                if (gm1Var != null) {
                    final aw1 aw1Var = (aw1) ryVar.c;
                    boolean z = ryVar.b;
                    byte b = gm1Var.a;
                    final yv1 yv1Var = gm1Var.b;
                    switch (b) {
                        case 28:
                            if (yv1Var.Y0 == null && !z && (((hg5Var = yv1Var.a1) == null || !hg5Var.W) && jg5.h.c())) {
                                gm.d3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        aw1 aw1Var2 = aw1Var;
                                        yv1 yv1Var2 = yv1Var;
                                        switch (b2) {
                                            case 0:
                                                if (yv1Var2.getParentActivity() != null) {
                                                    float f2 = yv1Var2.w.f(2).d / gm.p;
                                                    float width = ((aw1Var2.getWidth() / 2.0f) + (yv1Var2.m1.getWidth() - (aw1Var2.getX() + aw1Var2.getWidth()))) / gm.p;
                                                    hg5 hg5Var2 = new hg5(yv1Var2.getParentActivity(), 3);
                                                    yv1Var2.a1 = hg5Var2;
                                                    hg5Var2.setPadding(gm.L(7.33f), 0, gm.L(7.33f), 0);
                                                    yv1Var2.a1.k(yv1Var2.L);
                                                    yv1Var2.a1.p(false);
                                                    hg5 hg5Var3 = yv1Var2.a1;
                                                    String M0 = jb6.M0(2131744109, null);
                                                    if (hg5Var3.getMeasuredWidth() < 0) {
                                                        hg5Var3.H = M0;
                                                    } else {
                                                        hg5Var3.I.t(M0, !jb6.a0, true);
                                                    }
                                                    yv1Var2.a1.n(1.0f, (-width) + 7.33f);
                                                    yv1Var2.m1.addView(yv1Var2.a1, qoe.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f2 + 50.0f));
                                                    hg5 hg5Var4 = yv1Var2.a1;
                                                    hg5Var4.r0 = new ho1(yv1Var2, (byte) 21);
                                                    hg5Var4.v();
                                                    jg5.f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (yv1Var2.getParentActivity() != null) {
                                                    float f3 = yv1Var2.w.f(2).d / gm.p;
                                                    float width2 = ((aw1Var2.getWidth() / 2.0f) + (yv1Var2.m1.getWidth() - (aw1Var2.getX() + aw1Var2.getWidth()))) / gm.p;
                                                    hg5 hg5Var5 = new hg5(yv1Var2.getParentActivity(), 3);
                                                    yv1Var2.Y0 = hg5Var5;
                                                    hg5Var5.setPadding(gm.L(7.33f), 0, gm.L(7.33f), 0);
                                                    yv1Var2.Y0.k(yv1Var2.L);
                                                    yv1Var2.Y0.p(false);
                                                    yv1Var2.Y0.t(jb6.M0(2131750184, null));
                                                    yv1Var2.Y0.n(1.0f, (-width2) + 7.33f);
                                                    yv1Var2.m1.addView(yv1Var2.Y0, qoe.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f3 + 50.0f));
                                                    hg5 hg5Var6 = yv1Var2.Y0;
                                                    hg5Var6.r0 = new en1(yv1Var2, (byte) 27);
                                                    hg5Var6.v();
                                                    jg5.h.b();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, 400L);
                                break;
                            }
                            break;
                        default:
                            if (yv1Var.a1 == null && !z && jg5.f.c()) {
                                gm.d3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        aw1 aw1Var2 = aw1Var;
                                        yv1 yv1Var2 = yv1Var;
                                        switch (b2) {
                                            case 0:
                                                if (yv1Var2.getParentActivity() != null) {
                                                    float f2 = yv1Var2.w.f(2).d / gm.p;
                                                    float width = ((aw1Var2.getWidth() / 2.0f) + (yv1Var2.m1.getWidth() - (aw1Var2.getX() + aw1Var2.getWidth()))) / gm.p;
                                                    hg5 hg5Var2 = new hg5(yv1Var2.getParentActivity(), 3);
                                                    yv1Var2.a1 = hg5Var2;
                                                    hg5Var2.setPadding(gm.L(7.33f), 0, gm.L(7.33f), 0);
                                                    yv1Var2.a1.k(yv1Var2.L);
                                                    yv1Var2.a1.p(false);
                                                    hg5 hg5Var3 = yv1Var2.a1;
                                                    String M0 = jb6.M0(2131744109, null);
                                                    if (hg5Var3.getMeasuredWidth() < 0) {
                                                        hg5Var3.H = M0;
                                                    } else {
                                                        hg5Var3.I.t(M0, !jb6.a0, true);
                                                    }
                                                    yv1Var2.a1.n(1.0f, (-width) + 7.33f);
                                                    yv1Var2.m1.addView(yv1Var2.a1, qoe.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f2 + 50.0f));
                                                    hg5 hg5Var4 = yv1Var2.a1;
                                                    hg5Var4.r0 = new ho1(yv1Var2, (byte) 21);
                                                    hg5Var4.v();
                                                    jg5.f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (yv1Var2.getParentActivity() != null) {
                                                    float f3 = yv1Var2.w.f(2).d / gm.p;
                                                    float width2 = ((aw1Var2.getWidth() / 2.0f) + (yv1Var2.m1.getWidth() - (aw1Var2.getX() + aw1Var2.getWidth()))) / gm.p;
                                                    hg5 hg5Var5 = new hg5(yv1Var2.getParentActivity(), 3);
                                                    yv1Var2.Y0 = hg5Var5;
                                                    hg5Var5.setPadding(gm.L(7.33f), 0, gm.L(7.33f), 0);
                                                    yv1Var2.Y0.k(yv1Var2.L);
                                                    yv1Var2.Y0.p(false);
                                                    yv1Var2.Y0.t(jb6.M0(2131750184, null));
                                                    yv1Var2.Y0.n(1.0f, (-width2) + 7.33f);
                                                    yv1Var2.m1.addView(yv1Var2.Y0, qoe.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f3 + 50.0f));
                                                    hg5 hg5Var6 = yv1Var2.Y0;
                                                    hg5Var6.r0 = new en1(yv1Var2, (byte) 27);
                                                    hg5Var6.v();
                                                    jg5.h.b();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                }, 400L);
                                break;
                            }
                            break;
                    }
                }
                ryVar.b = true;
            }
        }
    }

    public final void a() {
        int[] iArr;
        View childAt;
        int i;
        float f = 0.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        ry[] ryVarArr = this.a;
        for (ry ryVar : ryVarArr) {
            if (ryVar != null) {
                aw1 aw1Var = (aw1) ryVar.c;
                float f2 = ((fn0) ryVar.d).e * this.E;
                if (f2 > 0.0f) {
                    i = 0;
                } else {
                    i = 8;
                }
                aw1Var.setVisibility(i);
                aw1Var.setAlpha(f2);
                aw1Var.setScaleX(gm.R1(0.4f, 1.0f, f2));
                aw1Var.setScaleY(gm.R1(0.4f, 1.0f, f2));
            }
        }
        int[] iArr2 = K;
        ry ryVar2 = ryVarArr[iArr2[0]];
        if (ryVar2 != null) {
            float L2 = ((fn0) ryVar2.d).e * gm.L(54.0f);
            ((aw1) ryVar2.c).setTranslationX(gm.L(1.0f) + this.F);
            this.F += L2;
        }
        int i2 = 0;
        while (true) {
            iArr = L;
            if (i2 >= 4) {
                break;
            }
            ry ryVar3 = ryVarArr[iArr[i2]];
            if (ryVar3 != null) {
                aw1 aw1Var2 = (aw1) ryVar3.c;
                float L3 = ((fn0) ryVar3.d).e * gm.L(54.0f);
                aw1Var2.setTranslationX(((getMeasuredWidth() - aw1Var2.getMeasuredWidth()) - gm.L(1.0f)) - this.G);
                this.G += L3;
            }
            i2++;
        }
        if (this.E < 1.0f) {
            ry ryVar4 = ryVarArr[iArr2[0]];
            if (ryVar4 != null) {
                aw1 aw1Var3 = (aw1) ryVar4.c;
                aw1Var3.setTranslationX(aw1Var3.getTranslationX() - ((1.0f - this.E) * this.F));
            }
            for (int i3 = 0; i3 < 4; i3++) {
                ry ryVar5 = ryVarArr[iArr[i3]];
                if (ryVar5 != null) {
                    aw1 aw1Var4 = (aw1) ryVar5.c;
                    aw1Var4.setTranslationX(((1.0f - this.E) * this.G) + aw1Var4.getTranslationX());
                }
            }
            float f3 = this.F;
            float f4 = this.E;
            this.F = f3 * f4;
            this.G *= f4;
        }
        float f5 = this.y.e;
        if (f5 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i4 = 0; i4 < getContainer().getChildCount(); i4++) {
                if (this.f.contains(getContainer().getChildAt(i4))) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    f = Math.max(f, childAt.getRight());
                }
            }
            if (measuredWidth > f) {
                f = (measuredWidth + f) / 2.0f;
                measuredWidth = f;
            }
            this.F = gm.R1(this.F, measuredWidth - gm.L(3.33f), f5);
            this.G = gm.R1(this.G, (getMeasuredWidth() - f) - gm.L(17.66f), f5);
        }
        dw1 dw1Var = this.d;
        if (dw1Var != null) {
            float f6 = this.F;
            float f7 = this.G;
            va2 va2Var = ((rp1) dw1Var).b.U;
            va2Var.F = f6;
            va2Var.G = f7;
            va2Var.invalidate();
        }
    }

    public final void b(boolean z) {
        int i;
        int i2;
        int L2 = gm.L(7.0f);
        int L3 = gm.L(7.0f);
        int i3 = K[0];
        ry[] ryVarArr = this.a;
        ry ryVar = ryVarArr[i3];
        if (ryVar != null) {
            if (((fn0) ryVar.d).f) {
                i2 = gm.L(54.0f);
            } else {
                i2 = 0;
            }
            L2 += i2;
        }
        for (int i4 = 0; i4 < 4; i4++) {
            ry ryVar2 = ryVarArr[L[i4]];
            if (ryVar2 != null) {
                if (((fn0) ryVar2.d).f) {
                    i = gm.L(54.0f);
                } else {
                    i = 0;
                }
                L3 += i;
            }
        }
        FrameLayout frameLayout = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.leftMargin != L2 || marginLayoutParams.rightMargin != L3) {
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L3;
            if (z) {
                frameLayout.requestLayout();
            }
        }
    }

    public final void c(int i, boolean z, boolean z2) {
        if (i >= 0) {
            ry[] ryVarArr = this.a;
            if (i < ryVarArr.length) {
                if (ryVarArr[i] == null) {
                    if (z) {
                        fn0 fn0Var = new fn0((i << 16) | 1, this, d53.h, 300L, false);
                        aw1 d = aw1.d(getContext(), this.n, this.r, this.h, J[i], 48);
                        if (i == 1) {
                            d.setContentDescription(jb6.M0(2131746470, null));
                        } else if (i == 2) {
                            d.setContentDescription(jb6.M0(2131752279, null));
                        } else if (i == 0) {
                            d.setContentDescription(jb6.M0(2131745570, null));
                        } else if (i == 3) {
                            d.setContentDescription(jb6.M0(2131752833, null));
                        }
                        rve.b(d, 0.13f, 2.0f);
                        d.setVisibility(8);
                        d.setOnClickListener(new hb(this, i, (byte) 1));
                        addView(d, qoe.c(56.0f, 56));
                        ryVarArr[i] = new ry(d, fn0Var);
                        a();
                    } else {
                        return;
                    }
                }
                ((fn0) ryVarArr[i].d).a(z, z2);
            }
        }
    }

    public final void d(boolean z) {
        boolean z2 = false;
        z2 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z3 = false;
            for (int i = 0; i < getContainer().getChildCount(); i++) {
                View childAt = getContainer().getChildAt(i);
                if (this.f.contains(childAt) && childAt.getVisibility() == 0) {
                    z3 = true;
                }
            }
            z2 = z3;
        }
        this.y.a(z2, z);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i = (int) (this.E * 255.0f * this.x.e);
        if (i > 0 && !this.s) {
            float measuredWidth = (getMeasuredWidth() - gm.L(10.0f)) - this.G;
            float measuredHeight = getMeasuredHeight() - gm.L(9.0f);
            RectF rectF = M;
            rectF.set(this.F + gm.L(10.0f), gm.L(9.0f), measuredWidth, measuredHeight);
            int i2 = this.I;
            Paint paint = this.H;
            paint.setColor(i2);
            paint.setAlpha(i);
            canvas.drawRoundRect(rectF, gm.L(19.0f), gm.L(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.e && this.w != null && !this.s) {
            RectF rectF = M;
            rectF.set(this.F + gm.L(1.0f), 0.0f, (getMeasuredWidth() - gm.L(1.0f)) - this.G, getMeasuredHeight());
            Rect rect = gm.Q;
            rectF.round(rect);
            this.w.setBounds(rect);
            this.w.draw(canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    public FrameLayout getContainer() {
        return this.e;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        b(false);
        super.onMeasure(i, i2);
        a();
    }

    public void setAccentColor(int i) {
        this.I = i;
    }

    public void setCenterMenuVisible(boolean z) {
        float f;
        this.s = z;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        this.e.setAlpha(f);
        invalidate();
    }

    public void setOnButtonsTotalWidthChanged(dw1 dw1Var) {
        this.d = dw1Var;
    }

    public void setTotalVisibilityFactor(float f) {
        if (this.E != f) {
            this.E = f;
            a();
            invalidate();
        }
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        d(false);
    }

    @Override
    public final void updateColors() {
        ry[] ryVarArr;
        for (ry ryVar : this.a) {
            if (ryVar != null) {
                ((aw1) ryVar.c).updateColors();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
