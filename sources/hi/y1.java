package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.si;
import org.telegram.ui.Components.nr;
public final class y1 extends u1 {
    public final o1 f15780b;
    public final x1 f15781c;
    public final v4.t d;
    public final w1 f15782e;
    public final d2 f15783f;
    public int h;
    public float f15784n;
    public boolean f15785r;
    public final i2 f15786s;

    public y1(i2 i2Var, Context context) {
        super(context);
        this.f15786s = i2Var;
        this.h = 8;
        this.f15784n = -1.0f;
        this.f15785r = false;
        o1 o1Var = new o1(context);
        this.f15780b = o1Var;
        x1 x1Var = new x1(this);
        this.f15781c = x1Var;
        o1Var.setAdapter(x1Var);
        v4.t tVar = new v4.t(this.h);
        this.d = tVar;
        o1Var.setLayoutManager(tVar);
        o1Var.setClipToPadding(true);
        o1Var.setVerticalScrollBarEnabled(false);
        tVar.O = new bi.w2(this, 6);
        o1Var.setOnItemClickListener(new bi.k8(this, 10));
        o1Var.setOnScrollListener(new bi.u1(this, 15));
        v4.k kVar = new v4.k();
        kVar.f59238c = 220L;
        kVar.f59239e = 220L;
        kVar.f59240f = 160L;
        kVar.f59241g = 160L;
        kVar.f59242i = nr.f37962g;
        o1Var.setItemAnimator(kVar);
        addView(o1Var, c8.ma.c(-1.0f, -1));
        int i7 = i2.C1;
        d2 d2Var = new d2(context, i2Var.J0);
        this.f15783f = d2Var;
        d2Var.f14485x = new bi.b(this, 26);
        addView(d2Var, c8.ma.e(-1, -2, 48));
        w1 w1Var = new w1(this, context, i2Var.J0);
        this.f15782e = w1Var;
        addView(w1Var, c8.ma.c(36.0f, -1));
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        int i10;
        this.f15536a = i7;
        int i11 = 0;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15780b.f15190g3 = z10;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 5;
        }
        this.h = i10;
        this.d.y1(i10);
        boolean z11 = this.f15785r;
        x1 x1Var = this.f15781c;
        if (!z11) {
            x1Var.D(null);
        }
        i2 i2Var = this.f15786s;
        int i12 = i2Var.n1;
        d2 d2Var = this.f15783f;
        if (i12 >= 0) {
            d2Var.f14483s = true;
            d2Var.f14479e.setText("");
            d2Var.f14483s = false;
            c2 c2Var = d2Var.h;
            if (c2Var != null) {
                c2Var.H1(i2Var.n1);
                d2Var.h.F1();
                if (d2Var.h.getSelectedCategory() != null) {
                    x1Var.I = d2Var.h.getSelectedCategory().f35978a;
                    l lVar = x1Var.N;
                    org.telegram.messenger.g0.r(lVar);
                    org.telegram.messenger.g0.g3(lVar);
                }
            }
        } else if (!TextUtils.isEmpty(i2Var.f14774m1)) {
            d2Var.f14479e.setText(i2Var.f14774m1);
            c2 c2Var2 = d2Var.h;
            if (c2Var2 != null) {
                c2Var2.I1(null);
                d2Var.h.G1();
            }
            org.telegram.messenger.g0.r(x1Var.N);
            org.telegram.messenger.g0.g3(x1Var.N);
        } else {
            d2Var.b();
        }
        d2Var.a(i7, i2Var.f14781u1);
        si d02 = si.d0(i2Var.f30173a);
        if (i7 == 0) {
            i11 = 5;
        }
        d02.D(i11);
    }

    @Override
    public final float b() {
        View childAt;
        float f10 = this.f15784n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i7 = 0;
        while (true) {
            o1 o1Var = this.f15780b;
            if (i7 >= o1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = o1Var.getChildAt(i7).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return i5.c.d(102.0f, childAt.getBottom(), 0);
            }
            i7++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.f15782e.setTranslationY(org.telegram.messenger.g0.L(16.0f) + max);
        this.f15783f.setTranslationY(org.telegram.messenger.g0.L(52.0f) + max);
        o1 o1Var = this.f15780b;
        o1Var.f15191h3 = max + o1Var.getPaddingTop();
        o1Var.f15192i3 = o1Var.getHeight() - o1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11 = i2.C1;
        i2 i2Var = this.f15786s;
        int i12 = i2Var.f30211u0;
        setPadding(i12, 0, i12, 0);
        this.f15782e.setTranslationY(org.telegram.messenger.g0.L(16.0f));
        this.f15783f.setTranslationY(org.telegram.messenger.g0.L(52.0f));
        int L = org.telegram.messenger.g0.L(5.0f);
        int L2 = org.telegram.messenger.g0.L(102.0f);
        int L3 = org.telegram.messenger.g0.L(5.0f);
        int i13 = org.telegram.messenger.g0.f24041n;
        if (i2Var.f14780t1) {
            f10 = 0.0f;
        } else {
            f10 = 40.0f;
        }
        this.f15780b.setPadding(L, L2, L3, org.telegram.messenger.g0.L(f10) + i13);
        super.onMeasure(i7, i10);
    }
}
