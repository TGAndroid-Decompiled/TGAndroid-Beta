package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.o;
import bi.d2;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r30;
import org.telegram.ui.re;
import org.telegram.ui.un;
import rf.c0;
import rf.e0;
import vh.p2;
import w7.b6;
import w7.e6;
public class h extends FrameLayout implements fe.e, k6 {
    public static final int[] H = {2131232353, 2131231504, 2131231506, 2131232181, 2131232181};
    public static final int[] I = {0};
    public static final int[] J = {1, 2, 3, 4};
    public static final RectF K = new RectF();
    public float D;
    public float E;
    public final Paint F;
    public int G;
    public final o[] f2786a;
    public final View.OnClickListener[] f2787b;
    public final re[] f2788c;
    public g d;
    public final FrameLayout e;
    public final HashSet f2789f;
    public final p6 h;
    public final tg.b f2790n;
    public final wg.a f2791r;
    public vg.f f2792s;
    public final fe.b f2793w;
    public final fe.b f2794x;
    public float f2795y;

    public h(Context context, p6 p6Var, tg.b bVar, wg.a aVar) {
        super(context);
        this.f2786a = new o[5];
        this.f2787b = new View.OnClickListener[5];
        this.f2788c = new re[5];
        this.f2789f = new HashSet();
        gr grVar = gr.h;
        this.f2793w = new fe.b(99, this, grVar, 320L, false);
        this.f2794x = new fe.b(100, this, grVar, 320L, false);
        this.F = new Paint(1);
        this.G = 0;
        this.f2790n = bVar;
        this.f2791r = aVar;
        this.h = p6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipToOutline(true);
        d2 d2Var = e0.f46526a;
        frameLayout.setOutlineProvider(new c0(0, i0.L(22.0f)));
        addView(frameLayout, b6.e(-1, 44, 16));
    }

    @Override
    public final void E(float f7, int i10) {
        o oVar;
        p2 p2Var;
        if (i10 == 99 || i10 == 100) {
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            o[] oVarArr = this.f2786a;
            if (i11 < oVarArr.length && (oVar = oVarArr[i11]) != null && i12 == 1 && ((fe.b) oVar.d).f7021f) {
                re reVar = this.f2788c[i11];
                if (reVar != null) {
                    final ah.a aVar = (ah.a) oVar.f954c;
                    boolean z10 = oVar.f953b;
                    int i13 = reVar.f41207a;
                    final un unVar = reVar.f41208b;
                    switch (i13) {
                        case 27:
                            if (unVar.X0 == null && !z10 && (((p2Var = unVar.Z0) == null || !p2Var.V) && r30.h.c())) {
                                i0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i14 = r3;
                                        ah.a aVar2 = aVar;
                                        un unVar2 = unVar;
                                        switch (i14) {
                                            case 0:
                                                if (unVar2.getParentActivity() != null) {
                                                    float f10 = unVar2.f42453w.f(2).d / org.telegram.messenger.i0.f16025p;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (unVar2.l1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.i0.f16025p;
                                                    vh.p2 p2Var2 = new vh.p2(unVar2.getParentActivity(), 3);
                                                    unVar2.Z0 = p2Var2;
                                                    p2Var2.setPadding(org.telegram.messenger.i0.L(7.33f), 0, org.telegram.messenger.i0.L(7.33f), 0);
                                                    unVar2.Z0.p(false);
                                                    vh.p2 p2Var3 = unVar2.Z0;
                                                    String L0 = org.telegram.messenger.cd.L0(2131744450, null);
                                                    if (p2Var3.getMeasuredWidth() < 0) {
                                                        p2Var3.G = L0;
                                                    } else {
                                                        p2Var3.H.t(L0, !org.telegram.messenger.cd.X, true);
                                                    }
                                                    unVar2.Z0.l(1.0f, (-width) + 7.33f);
                                                    unVar2.l1.addView(unVar2.Z0, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f10 + 50.0f));
                                                    vh.p2 p2Var4 = unVar2.Z0;
                                                    p2Var4.f51740l0 = new lg(unVar2, 14);
                                                    p2Var4.u();
                                                    org.telegram.ui.Components.r30.f29810f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (unVar2.getParentActivity() != null) {
                                                    float f11 = unVar2.f42453w.f(2).d / org.telegram.messenger.i0.f16025p;
                                                    float width2 = ((aVar2.getWidth() / 2.0f) + (unVar2.l1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.i0.f16025p;
                                                    vh.p2 p2Var5 = new vh.p2(unVar2.getParentActivity(), 3);
                                                    unVar2.X0 = p2Var5;
                                                    p2Var5.setPadding(org.telegram.messenger.i0.L(7.33f), 0, org.telegram.messenger.i0.L(7.33f), 0);
                                                    unVar2.X0.p(false);
                                                    unVar2.X0.s(org.telegram.messenger.cd.L0(2131750260, null));
                                                    unVar2.X0.l(1.0f, (-width2) + 7.33f);
                                                    unVar2.l1.addView(unVar2.X0, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    vh.p2 p2Var6 = unVar2.X0;
                                                    p2Var6.f51740l0 = new mf(unVar2, 18);
                                                    p2Var6.u();
                                                    org.telegram.ui.Components.r30.h.b();
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
                            if (unVar.Z0 == null && !z10 && r30.f29810f.c()) {
                                i0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        int i14 = r3;
                                        ah.a aVar2 = aVar;
                                        un unVar2 = unVar;
                                        switch (i14) {
                                            case 0:
                                                if (unVar2.getParentActivity() != null) {
                                                    float f10 = unVar2.f42453w.f(2).d / org.telegram.messenger.i0.f16025p;
                                                    float width = ((aVar2.getWidth() / 2.0f) + (unVar2.l1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.i0.f16025p;
                                                    vh.p2 p2Var2 = new vh.p2(unVar2.getParentActivity(), 3);
                                                    unVar2.Z0 = p2Var2;
                                                    p2Var2.setPadding(org.telegram.messenger.i0.L(7.33f), 0, org.telegram.messenger.i0.L(7.33f), 0);
                                                    unVar2.Z0.p(false);
                                                    vh.p2 p2Var3 = unVar2.Z0;
                                                    String L0 = org.telegram.messenger.cd.L0(2131744450, null);
                                                    if (p2Var3.getMeasuredWidth() < 0) {
                                                        p2Var3.G = L0;
                                                    } else {
                                                        p2Var3.H.t(L0, !org.telegram.messenger.cd.X, true);
                                                    }
                                                    unVar2.Z0.l(1.0f, (-width) + 7.33f);
                                                    unVar2.l1.addView(unVar2.Z0, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f10 + 50.0f));
                                                    vh.p2 p2Var4 = unVar2.Z0;
                                                    p2Var4.f51740l0 = new lg(unVar2, 14);
                                                    p2Var4.u();
                                                    org.telegram.ui.Components.r30.f29810f.b();
                                                    return;
                                                }
                                                return;
                                            default:
                                                if (unVar2.getParentActivity() != null) {
                                                    float f11 = unVar2.f42453w.f(2).d / org.telegram.messenger.i0.f16025p;
                                                    float width2 = ((aVar2.getWidth() / 2.0f) + (unVar2.l1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.i0.f16025p;
                                                    vh.p2 p2Var5 = new vh.p2(unVar2.getParentActivity(), 3);
                                                    unVar2.X0 = p2Var5;
                                                    p2Var5.setPadding(org.telegram.messenger.i0.L(7.33f), 0, org.telegram.messenger.i0.L(7.33f), 0);
                                                    unVar2.X0.p(false);
                                                    unVar2.X0.s(org.telegram.messenger.cd.L0(2131750260, null));
                                                    unVar2.X0.l(1.0f, (-width2) + 7.33f);
                                                    unVar2.l1.addView(unVar2.X0, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                    vh.p2 p2Var6 = unVar2.X0;
                                                    p2Var6.f51740l0 = new mf(unVar2, 18);
                                                    p2Var6.u();
                                                    org.telegram.ui.Components.r30.h.b();
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
                oVar.f953b = true;
            }
        }
    }

    public final void a() {
        int[] iArr;
        View childAt;
        int i10;
        float f7 = 0.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        o[] oVarArr = this.f2786a;
        for (o oVar : oVarArr) {
            if (oVar != null) {
                ah.a aVar = (ah.a) oVar.f954c;
                float f10 = ((fe.b) oVar.d).e * this.f2795y;
                if (f10 > 0.0f) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                aVar.setVisibility(i10);
                aVar.setAlpha(f10);
                aVar.setScaleX(i0.T1(0.4f, 1.0f, f10));
                aVar.setScaleY(i0.T1(0.4f, 1.0f, f10));
            }
        }
        int[] iArr2 = I;
        o oVar2 = oVarArr[iArr2[0]];
        if (oVar2 != null) {
            float L = ((fe.b) oVar2.d).e * i0.L(54.0f);
            ((ah.a) oVar2.f954c).setTranslationX(i0.L(1.0f) + this.D);
            this.D += L;
        }
        int i11 = 0;
        while (true) {
            iArr = J;
            if (i11 >= 4) {
                break;
            }
            o oVar3 = oVarArr[iArr[i11]];
            if (oVar3 != null) {
                ah.a aVar2 = (ah.a) oVar3.f954c;
                float L2 = ((fe.b) oVar3.d).e * i0.L(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - i0.L(1.0f)) - this.E);
                this.E += L2;
            }
            i11++;
        }
        if (this.f2795y < 1.0f) {
            o oVar4 = oVarArr[iArr2[0]];
            if (oVar4 != null) {
                ah.a aVar3 = (ah.a) oVar4.f954c;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.f2795y) * this.D));
            }
            for (int i12 = 0; i12 < 4; i12++) {
                o oVar5 = oVarArr[iArr[i12]];
                if (oVar5 != null) {
                    ah.a aVar4 = (ah.a) oVar5.f954c;
                    aVar4.setTranslationX(((1.0f - this.f2795y) * this.E) + aVar4.getTranslationX());
                }
            }
            float f11 = this.D;
            float f12 = this.f2795y;
            this.D = f11 * f12;
            this.E *= f12;
        }
        float f13 = this.f2794x.e;
        if (f13 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i13 = 0; i13 < getContainer().getChildCount(); i13++) {
                if (this.f2789f.contains(getContainer().getChildAt(i13))) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    f7 = Math.max(f7, childAt.getRight());
                }
            }
            if (measuredWidth > f7) {
                f7 = (measuredWidth + f7) / 2.0f;
                measuredWidth = f7;
            }
            this.D = i0.T1(this.D, measuredWidth - i0.L(3.33f), f13);
            this.E = i0.T1(this.E, (getMeasuredWidth() - f7) - i0.L(17.66f), f13);
        }
        g gVar = this.d;
        if (gVar != null) {
            float f14 = this.D;
            float f15 = this.E;
            zg.e eVar = ((re) gVar).f41208b.T;
            eVar.f55750y = f14;
            eVar.D = f15;
            eVar.invalidate();
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        int L = i0.L(7.0f);
        int L2 = i0.L(7.0f);
        int i12 = I[0];
        o[] oVarArr = this.f2786a;
        o oVar = oVarArr[i12];
        if (oVar != null) {
            if (((fe.b) oVar.d).f7021f) {
                i11 = i0.L(54.0f);
            } else {
                i11 = 0;
            }
            L += i11;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            o oVar2 = oVarArr[J[i13]];
            if (oVar2 != null) {
                if (((fe.b) oVar2.d).f7021f) {
                    i10 = i0.L(54.0f);
                } else {
                    i10 = 0;
                }
                L2 += i10;
            }
        }
        FrameLayout frameLayout = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.leftMargin != L || marginLayoutParams.rightMargin != L2) {
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L2;
            if (z10) {
                frameLayout.requestLayout();
            }
        }
    }

    public final void c(int i10, boolean z10, boolean z11) {
        o oVar;
        if (i10 >= 0) {
            o[] oVarArr = this.f2786a;
            if (i10 < oVarArr.length && ((oVar = oVarArr[i10]) != null || z10)) {
                if (oVar == null) {
                    fe.b bVar = new fe.b((i10 << 16) | 1, this, gr.h, 300L, false);
                    ah.a d = ah.a.d(getContext(), this.f2790n, this.f2791r, this.h, H[i10], 48);
                    if (i10 == 1) {
                        d.setContentDescription(cd.L0(2131746750, null));
                    } else if (i10 == 2) {
                        d.setContentDescription(cd.L0(2131752337, null));
                    } else if (i10 == 0) {
                        d.setContentDescription(cd.L0(2131745853, null));
                    } else if (i10 == 3) {
                        d.setContentDescription(cd.L0(2131752880, null));
                    }
                    e6.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new f(this, i10, 0));
                    addView(d, b6.c(56.0f, 56));
                    oVarArr[i10] = new o(d, bVar);
                    a();
                }
                ((fe.b) oVarArr[i10].d).a(z10, z11);
            }
        }
    }

    public final void d(boolean z10) {
        boolean z11 = false;
        z11 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z12 = false;
            for (int i10 = 0; i10 < getContainer().getChildCount(); i10++) {
                View childAt = getContainer().getChildAt(i10);
                if (this.f2789f.contains(childAt) && childAt.getVisibility() == 0) {
                    z12 = true;
                }
            }
            z11 = z12;
        }
        this.f2794x.a(z11, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = (int) (this.f2795y * 255.0f * this.f2793w.e);
        if (i10 > 0) {
            float measuredWidth = (getMeasuredWidth() - i0.L(10.0f)) - this.E;
            float measuredHeight = getMeasuredHeight() - i0.L(9.0f);
            RectF rectF = K;
            rectF.set(this.D + i0.L(10.0f), i0.L(9.0f), measuredWidth, measuredHeight);
            int i11 = this.G;
            Paint paint = this.F;
            paint.setColor(i11);
            paint.setAlpha(i10);
            canvas.drawRoundRect(rectF, i0.L(19.0f), i0.L(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.e && this.f2792s != null) {
            RectF rectF = K;
            rectF.set(this.D + i0.L(1.0f), 0.0f, (getMeasuredWidth() - i0.L(1.0f)) - this.E, getMeasuredHeight());
            Rect rect = i0.Q;
            rectF.round(rect);
            this.f2792s.setBounds(rect);
            this.f2792s.draw(canvas);
        }
        return super.drawChild(canvas, view, j10);
    }

    public FrameLayout getContainer() {
        return this.e;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        b(false);
        super.onMeasure(i10, i11);
        a();
    }

    public void setAccentColor(int i10) {
        this.G = i10;
    }

    public void setOnButtonsTotalWidthChanged(g gVar) {
        this.d = gVar;
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.f2795y != f7) {
            this.f2795y = f7;
            a();
            invalidate();
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d(false);
    }

    @Override
    public final void updateColors() {
        o[] oVarArr;
        ah.a aVar;
        for (o oVar : this.f2786a) {
            if (oVar != null && (aVar = (ah.a) oVar.f954c) != null) {
                aVar.updateColors();
            }
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 99) {
            invalidate();
            return;
        }
        if (i10 == 100) {
            a();
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            o[] oVarArr = this.f2786a;
            if (i11 < oVarArr.length && oVarArr[i11] != null && i12 == 1) {
                b(true);
                a();
                invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
