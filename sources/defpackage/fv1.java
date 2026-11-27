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
public class fv1 extends FrameLayout implements s84, snb {
    public static final int[] J = {2131232359, 2131231507, 2131231509, 2131232187, 2131232187};
    public static final int[] K = {0};
    public static final int[] L = {1, 2, 3, 4};
    public static final RectF M = new RectF();
    public float E;
    public float F;
    public float G;
    public final Paint H;
    public int I;
    public final rx[] a;
    public final View.OnClickListener[] b;
    public final el1[] c;
    public ev1 d;
    public final FrameLayout e;
    public final HashSet f;
    public final vnb h;
    public final ll0 n;
    public final bl0 r;
    public boolean s;
    public jl0 w;
    public final fm0 x;
    public final fm0 y;

    public fv1(Context context, vnb vnbVar, bl0 bl0Var, ll0 ll0Var) {
        super(context);
        this.a = new rx[5];
        this.b = new View.OnClickListener[5];
        this.c = new el1[5];
        this.f = new HashSet();
        k43 k43Var = k43.h;
        this.x = new fm0(99, this, k43Var, 320L, false);
        this.y = new fm0(100, this, k43Var, 320L, false);
        this.H = new Paint(1);
        this.I = 0;
        this.n = ll0Var;
        this.r = bl0Var;
        this.h = vnbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipToOutline(true);
        yi yiVar = yhc.a;
        frameLayout.setOutlineProvider(new whc(0, hl.L(22.0f)));
        addView(frameLayout, tre.e(-1, 44, 16));
    }

    public final void a() {
        int[] iArr;
        View childAt;
        int i;
        float f = 0.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        rx[] rxVarArr = this.a;
        for (rx rxVar : rxVarArr) {
            if (rxVar != null) {
                bv1 bv1Var = (bv1) rxVar.c;
                float f2 = ((fm0) rxVar.d).e * this.E;
                if (f2 > 0.0f) {
                    i = 0;
                } else {
                    i = 8;
                }
                bv1Var.setVisibility(i);
                bv1Var.setAlpha(f2);
                bv1Var.setScaleX(hl.R1(0.4f, 1.0f, f2));
                bv1Var.setScaleY(hl.R1(0.4f, 1.0f, f2));
            }
        }
        int[] iArr2 = K;
        rx rxVar2 = rxVarArr[iArr2[0]];
        if (rxVar2 != null) {
            float L2 = ((fm0) rxVar2.d).e * hl.L(54.0f);
            ((bv1) rxVar2.c).setTranslationX(hl.L(1.0f) + this.F);
            this.F += L2;
        }
        int i2 = 0;
        while (true) {
            iArr = L;
            if (i2 >= 4) {
                break;
            }
            rx rxVar3 = rxVarArr[iArr[i2]];
            if (rxVar3 != null) {
                bv1 bv1Var2 = (bv1) rxVar3.c;
                float L3 = ((fm0) rxVar3.d).e * hl.L(54.0f);
                bv1Var2.setTranslationX(((getMeasuredWidth() - bv1Var2.getMeasuredWidth()) - hl.L(1.0f)) - this.G);
                this.G += L3;
            }
            i2++;
        }
        if (this.E < 1.0f) {
            rx rxVar4 = rxVarArr[iArr2[0]];
            if (rxVar4 != null) {
                bv1 bv1Var3 = (bv1) rxVar4.c;
                bv1Var3.setTranslationX(bv1Var3.getTranslationX() - ((1.0f - this.E) * this.F));
            }
            for (int i3 = 0; i3 < 4; i3++) {
                rx rxVar5 = rxVarArr[iArr[i3]];
                if (rxVar5 != null) {
                    bv1 bv1Var4 = (bv1) rxVar5.c;
                    bv1Var4.setTranslationX(((1.0f - this.E) * this.G) + bv1Var4.getTranslationX());
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
            this.F = hl.R1(this.F, measuredWidth - hl.L(3.33f), f5);
            this.G = hl.R1(this.G, (getMeasuredWidth() - f) - hl.L(17.66f), f5);
        }
        ev1 ev1Var = this.d;
        if (ev1Var != null) {
            float f6 = this.F;
            float f7 = this.G;
            z92 z92Var = ((el1) ev1Var).b.U;
            z92Var.G = f6;
            z92Var.H = f7;
            z92Var.invalidate();
        }
    }

    public final void b(boolean z) {
        int i;
        int i2;
        int L2 = hl.L(7.0f);
        int L3 = hl.L(7.0f);
        int i3 = K[0];
        rx[] rxVarArr = this.a;
        rx rxVar = rxVarArr[i3];
        if (rxVar != null) {
            if (((fm0) rxVar.d).f) {
                i2 = hl.L(54.0f);
            } else {
                i2 = 0;
            }
            L2 += i2;
        }
        for (int i4 = 0; i4 < 4; i4++) {
            rx rxVar2 = rxVarArr[L[i4]];
            if (rxVar2 != null) {
                if (((fm0) rxVar2.d).f) {
                    i = hl.L(54.0f);
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
            rx[] rxVarArr = this.a;
            if (i < rxVarArr.length) {
                if (rxVarArr[i] == null) {
                    if (z) {
                        fm0 fm0Var = new fm0((i << 16) | 1, this, k43.h, 300L, false);
                        bv1 d = bv1.d(getContext(), this.n, this.r, this.h, J[i], 48);
                        if (i == 1) {
                            d.setContentDescription(ob6.M0(2131746464, null));
                        } else if (i == 2) {
                            d.setContentDescription(ob6.M0(2131752307, null));
                        } else if (i == 0) {
                            d.setContentDescription(ob6.M0(2131745564, null));
                        } else if (i == 3) {
                            d.setContentDescription(ob6.M0(2131752861, null));
                        }
                        iye.b(d, 0.13f, 2.0f);
                        d.setVisibility(8);
                        d.setOnClickListener(new ib(this, i, (byte) 1));
                        addView(d, tre.c(56.0f, 56));
                        rxVarArr[i] = new rx(d, fm0Var);
                        a();
                    } else {
                        return;
                    }
                }
                ((fm0) rxVarArr[i].d).a(z, z2);
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
            float measuredWidth = (getMeasuredWidth() - hl.L(10.0f)) - this.G;
            float measuredHeight = getMeasuredHeight() - hl.L(9.0f);
            RectF rectF = M;
            rectF.set(this.F + hl.L(10.0f), hl.L(9.0f), measuredWidth, measuredHeight);
            int i2 = this.I;
            Paint paint = this.H;
            paint.setColor(i2);
            paint.setAlpha(i);
            canvas.drawRoundRect(rectF, hl.L(19.0f), hl.L(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.e && this.w != null && !this.s) {
            RectF rectF = M;
            rectF.set(this.F + hl.L(1.0f), 0.0f, (getMeasuredWidth() - hl.L(1.0f)) - this.G, getMeasuredHeight());
            Rect rect = hl.Q;
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

    public void setOnButtonsTotalWidthChanged(ev1 ev1Var) {
        this.d = ev1Var;
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
    public final void t(int i, float f, float f2, t84 t84Var) {
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
            rx[] rxVarArr = this.a;
            if (i2 < rxVarArr.length && rxVarArr[i2] != null && i3 == 1) {
                b(true);
                a();
                invalidate();
            }
        }
    }

    @Override
    public final void updateColors() {
        rx[] rxVarArr;
        for (rx rxVar : this.a) {
            if (rxVar != null) {
                ((bv1) rxVar.c).updateColors();
            }
        }
    }

    @Override
    public final void v0(float f, int i) {
        rx rxVar;
        kg5 kg5Var;
        if (i == 99 || i == 100) {
            invalidate();
        }
        int i2 = i >> 16;
        int i3 = i & 65535;
        if (i2 >= 0) {
            rx[] rxVarArr = this.a;
            if (i2 < rxVarArr.length && (rxVar = rxVarArr[i2]) != null && i3 == 1 && ((fm0) rxVar.d).f) {
                el1 el1Var = this.c[i2];
                if (el1Var != null) {
                    final bv1 bv1Var = (bv1) rxVar.c;
                    boolean z = rxVar.b;
                    byte b = el1Var.a;
                    final zu1 zu1Var = el1Var.b;
                    switch (b) {
                        case 26:
                            if (zu1Var.Y0 == null && !z && (((kg5Var = zu1Var.a1) == null || !kg5Var.W) && mg5.h.c())) {
                                hl.d3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        bv1 bv1Var2 = bv1Var;
                                        zu1 zu1Var2 = zu1Var;
                                        switch (b2) {
                                            case 0:
                                                if (zu1Var2.getParentActivity() != null) {
                                                    float f2 = zu1Var2.w.f(2).d / hl.p;
                                                    float width = ((bv1Var2.getWidth() / 2.0f) + (zu1Var2.m1.getWidth() - (bv1Var2.getX() + bv1Var2.getWidth()))) / hl.p;
                                                    kg5 kg5Var2 = new kg5(zu1Var2.getParentActivity(), 3);
                                                    zu1Var2.a1 = kg5Var2;
                                                    kg5Var2.setPadding(hl.L(7.33f), 0, hl.L(7.33f), 0);
                                                    zu1Var2.a1.k(zu1Var2.L);
                                                    zu1Var2.a1.p(false);
                                                    kg5 kg5Var3 = zu1Var2.a1;
                                                    String M0 = ob6.M0(2131744077, null);
                                                    if (kg5Var3.getMeasuredWidth() < 0) {
                                                        kg5Var3.H = M0;
                                                    } else {
                                                        kg5Var3.I.t(M0, !ob6.a0, true);
                                                    }
                                                    zu1Var2.a1.n(1.0f, (-width) + 7.33f);
                                                    zu1Var2.m1.addView(zu1Var2.a1, tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f2 + 50.0f));
                                                    kg5 kg5Var4 = zu1Var2.a1;
                                                    kg5Var4.r0 = new hm1(zu1Var2, (byte) 26);
                                                    kg5Var4.v();
                                                    mg5.f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (zu1Var2.getParentActivity() != null) {
                                                    float f3 = zu1Var2.w.f(2).d / hl.p;
                                                    float width2 = ((bv1Var2.getWidth() / 2.0f) + (zu1Var2.m1.getWidth() - (bv1Var2.getX() + bv1Var2.getWidth()))) / hl.p;
                                                    kg5 kg5Var5 = new kg5(zu1Var2.getParentActivity(), 3);
                                                    zu1Var2.Y0 = kg5Var5;
                                                    kg5Var5.setPadding(hl.L(7.33f), 0, hl.L(7.33f), 0);
                                                    zu1Var2.Y0.k(zu1Var2.L);
                                                    zu1Var2.Y0.p(false);
                                                    zu1Var2.Y0.t(ob6.M0(2131750210, null));
                                                    zu1Var2.Y0.n(1.0f, (-width2) + 7.33f);
                                                    zu1Var2.m1.addView(zu1Var2.Y0, tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f3 + 50.0f));
                                                    kg5 kg5Var6 = zu1Var2.Y0;
                                                    kg5Var6.r0 = new hm1(zu1Var2, (byte) 10);
                                                    kg5Var6.v();
                                                    mg5.h.b();
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
                            if (zu1Var.a1 == null && !z && mg5.f.c()) {
                                hl.d3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b2 = r3;
                                        bv1 bv1Var2 = bv1Var;
                                        zu1 zu1Var2 = zu1Var;
                                        switch (b2) {
                                            case 0:
                                                if (zu1Var2.getParentActivity() != null) {
                                                    float f2 = zu1Var2.w.f(2).d / hl.p;
                                                    float width = ((bv1Var2.getWidth() / 2.0f) + (zu1Var2.m1.getWidth() - (bv1Var2.getX() + bv1Var2.getWidth()))) / hl.p;
                                                    kg5 kg5Var2 = new kg5(zu1Var2.getParentActivity(), 3);
                                                    zu1Var2.a1 = kg5Var2;
                                                    kg5Var2.setPadding(hl.L(7.33f), 0, hl.L(7.33f), 0);
                                                    zu1Var2.a1.k(zu1Var2.L);
                                                    zu1Var2.a1.p(false);
                                                    kg5 kg5Var3 = zu1Var2.a1;
                                                    String M0 = ob6.M0(2131744077, null);
                                                    if (kg5Var3.getMeasuredWidth() < 0) {
                                                        kg5Var3.H = M0;
                                                    } else {
                                                        kg5Var3.I.t(M0, !ob6.a0, true);
                                                    }
                                                    zu1Var2.a1.n(1.0f, (-width) + 7.33f);
                                                    zu1Var2.m1.addView(zu1Var2.a1, tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f2 + 50.0f));
                                                    kg5 kg5Var4 = zu1Var2.a1;
                                                    kg5Var4.r0 = new hm1(zu1Var2, (byte) 26);
                                                    kg5Var4.v();
                                                    mg5.f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (zu1Var2.getParentActivity() != null) {
                                                    float f3 = zu1Var2.w.f(2).d / hl.p;
                                                    float width2 = ((bv1Var2.getWidth() / 2.0f) + (zu1Var2.m1.getWidth() - (bv1Var2.getX() + bv1Var2.getWidth()))) / hl.p;
                                                    kg5 kg5Var5 = new kg5(zu1Var2.getParentActivity(), 3);
                                                    zu1Var2.Y0 = kg5Var5;
                                                    kg5Var5.setPadding(hl.L(7.33f), 0, hl.L(7.33f), 0);
                                                    zu1Var2.Y0.k(zu1Var2.L);
                                                    zu1Var2.Y0.p(false);
                                                    zu1Var2.Y0.t(ob6.M0(2131750210, null));
                                                    zu1Var2.Y0.n(1.0f, (-width2) + 7.33f);
                                                    zu1Var2.m1.addView(zu1Var2.Y0, tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f3 + 50.0f));
                                                    kg5 kg5Var6 = zu1Var2.Y0;
                                                    kg5Var6.r0 = new hm1(zu1Var2, (byte) 10);
                                                    kg5Var6.v();
                                                    mg5.h.b();
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
                rxVar.b = true;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
