package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ri;
import org.telegram.ui.Components.lr;
public final class z1 extends v1 {
    public final o1 f15799b;
    public final y1 f15800c;
    public final v4.t d;
    public final x1 f15801e;
    public final e2 f15802f;
    public int h;
    public float f15803n;
    public boolean f15804r;
    public final j2 f15805s;

    public z1(j2 j2Var, Context context) {
        super(context);
        this.f15805s = j2Var;
        this.h = 8;
        this.f15803n = -1.0f;
        this.f15804r = false;
        o1 o1Var = new o1(context);
        this.f15799b = o1Var;
        y1 y1Var = new y1(this);
        this.f15800c = y1Var;
        o1Var.setAdapter(y1Var);
        v4.t tVar = new v4.t(this.h);
        this.d = tVar;
        o1Var.setLayoutManager(tVar);
        o1Var.setClipToPadding(true);
        o1Var.setVerticalScrollBarEnabled(false);
        tVar.O = new bi.s2(this, 6);
        o1Var.setOnItemClickListener(new bi.h8(this, 10));
        o1Var.setOnScrollListener(new bi.q1(this, 15));
        v4.k kVar = new v4.k();
        kVar.f59196c = 220L;
        kVar.f59197e = 220L;
        kVar.f59198f = 160L;
        kVar.f59199g = 160L;
        kVar.f59200i = lr.f37209g;
        o1Var.setItemAnimator(kVar);
        addView(o1Var, c8.ma.c(-1.0f, -1));
        int i7 = j2.C1;
        e2 e2Var = new e2(context, j2Var.J0);
        this.f15802f = e2Var;
        e2Var.f14531x = new bi.b(this, 26);
        addView(e2Var, c8.ma.e(-1, -2, 48));
        x1 x1Var = new x1(this, context, j2Var.J0);
        this.f15801e = x1Var;
        addView(x1Var, c8.ma.c(36.0f, -1));
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        int i10;
        this.f15567a = i7;
        int i11 = 0;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15799b.f15128g3 = z10;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 5;
        }
        this.h = i10;
        this.d.y1(i10);
        boolean z11 = this.f15804r;
        y1 y1Var = this.f15800c;
        if (!z11) {
            y1Var.D(null);
        }
        j2 j2Var = this.f15805s;
        int i12 = j2Var.n1;
        e2 e2Var = this.f15802f;
        if (i12 >= 0) {
            e2Var.f14529s = true;
            e2Var.f14525e.setText("");
            e2Var.f14529s = false;
            d2 d2Var = e2Var.h;
            if (d2Var != null) {
                d2Var.H1(j2Var.n1);
                e2Var.h.F1();
                if (e2Var.h.getSelectedCategory() != null) {
                    y1Var.I = e2Var.h.getSelectedCategory().f34808a;
                    k kVar = y1Var.N;
                    org.telegram.messenger.g0.r(kVar);
                    org.telegram.messenger.g0.g3(kVar);
                }
            }
        } else if (!TextUtils.isEmpty(j2Var.f14793m1)) {
            e2Var.f14525e.setText(j2Var.f14793m1);
            d2 d2Var2 = e2Var.h;
            if (d2Var2 != null) {
                d2Var2.I1(null);
                e2Var.h.G1();
            }
            org.telegram.messenger.g0.r(y1Var.N);
            org.telegram.messenger.g0.g3(y1Var.N);
        } else {
            e2Var.b();
        }
        e2Var.a(i7, j2Var.f14800u1);
        ri d02 = ri.d0(j2Var.f30187a);
        if (i7 == 0) {
            i11 = 5;
        }
        d02.D(i11);
    }

    @Override
    public final float b() {
        View childAt;
        float f10 = this.f15803n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i7 = 0;
        while (true) {
            o1 o1Var = this.f15799b;
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
        this.f15801e.setTranslationY(org.telegram.messenger.g0.L(16.0f) + max);
        this.f15802f.setTranslationY(org.telegram.messenger.g0.L(52.0f) + max);
        o1 o1Var = this.f15799b;
        o1Var.f15129h3 = max + o1Var.getPaddingTop();
        o1Var.f15130i3 = o1Var.getHeight() - o1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11 = j2.C1;
        j2 j2Var = this.f15805s;
        int i12 = j2Var.f30225u0;
        setPadding(i12, 0, i12, 0);
        this.f15801e.setTranslationY(org.telegram.messenger.g0.L(16.0f));
        this.f15802f.setTranslationY(org.telegram.messenger.g0.L(52.0f));
        int L = org.telegram.messenger.g0.L(5.0f);
        int L2 = org.telegram.messenger.g0.L(102.0f);
        int L3 = org.telegram.messenger.g0.L(5.0f);
        int i13 = org.telegram.messenger.g0.f24113n;
        if (j2Var.f14799t1) {
            f10 = 0.0f;
        } else {
            f10 = 40.0f;
        }
        this.f15799b.setPadding(L, L2, L3, org.telegram.messenger.g0.L(f10) + i13);
        super.onMeasure(i7, i10);
    }
}
