package fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ui;
import org.telegram.ui.Components.xq;
public final class z1 extends u1 {
    public final m1 f13235b;
    public final y1 f13236c;
    public final v4.s d;
    public final w1 f13237e;
    public final e2 f13238f;
    public int h;
    public float f13239n;
    public boolean f13240r;
    public final k2 f13241s;

    public z1(k2 k2Var, Context context) {
        super(context);
        this.f13241s = k2Var;
        this.h = 8;
        this.f13239n = -1.0f;
        this.f13240r = false;
        m1 m1Var = new m1(context);
        this.f13235b = m1Var;
        y1 y1Var = new y1(this);
        this.f13236c = y1Var;
        m1Var.setAdapter(y1Var);
        v4.s sVar = new v4.s(this.h);
        this.d = sVar;
        m1Var.setLayoutManager(sVar);
        m1Var.setClipToPadding(true);
        m1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new ai.l(this, 3);
        m1Var.setOnItemClickListener(new ai.k(this, 9));
        m1Var.setOnScrollListener(new ai.b(this, 11));
        v4.k kVar = new v4.k();
        kVar.f57115c = 220L;
        kVar.f57116e = 220L;
        kVar.f57117f = 160L;
        kVar.f57118g = 160L;
        kVar.f57119i = xq.f40367g;
        m1Var.setItemAnimator(kVar);
        addView(m1Var, c8.ha.c(-1.0f, -1));
        int i7 = k2.f12251y1;
        e2 e2Var = new e2(context, k2Var.I0);
        this.f13238f = e2Var;
        e2Var.f11864x = new ai.e(this, 17);
        addView(e2Var, c8.ha.e(-1, -2, 48));
        w1 w1Var = new w1(this, context, k2Var.I0);
        this.f13237e = w1Var;
        addView(w1Var, c8.ha.c(36.0f, -1));
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        int i10;
        this.f12881a = i7;
        int i11 = 0;
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f13235b.f12404f3 = z9;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 5;
        }
        this.h = i10;
        this.d.y1(i10);
        boolean z10 = this.f13240r;
        y1 y1Var = this.f13236c;
        if (!z10) {
            y1Var.D(null);
        }
        k2 k2Var = this.f13241s;
        int i12 = k2Var.f12253j1;
        e2 e2Var = this.f13238f;
        if (i12 >= 0) {
            e2Var.f11862s = true;
            e2Var.f11858e.setText("");
            e2Var.f11862s = false;
            d2 d2Var = e2Var.h;
            if (d2Var != null) {
                d2Var.H1(k2Var.f12253j1);
                e2Var.h.F1();
                if (e2Var.h.getSelectedCategory() != null) {
                    y1Var.H = e2Var.h.getSelectedCategory().f38738a;
                    di.s7 s7Var = y1Var.M;
                    org.telegram.messenger.g0.r(s7Var);
                    org.telegram.messenger.g0.h3(s7Var);
                }
            }
        } else if (!TextUtils.isEmpty(k2Var.f12252i1)) {
            e2Var.f11858e.setText(k2Var.f12252i1);
            d2 d2Var2 = e2Var.h;
            if (d2Var2 != null) {
                d2Var2.I1(null);
                e2Var.h.G1();
            }
            org.telegram.messenger.g0.r(y1Var.M);
            org.telegram.messenger.g0.h3(y1Var.M);
        } else {
            e2Var.b();
        }
        e2Var.a(i7, k2Var.f12258q1);
        ui b02 = ui.b0(k2Var.f28616a);
        if (i7 == 0) {
            i11 = 5;
        }
        b02.B(i11);
    }

    @Override
    public final float b() {
        View childAt;
        float f10 = this.f13239n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i7 = 0;
        while (true) {
            m1 m1Var = this.f13235b;
            if (i7 >= m1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = m1Var.getChildAt(i7).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return jg.g.e(102.0f, childAt.getBottom(), 0);
            }
            i7++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.f13237e.setTranslationY(org.telegram.messenger.g0.L(16.0f) + max);
        this.f13238f.setTranslationY(org.telegram.messenger.g0.L(52.0f) + max);
        m1 m1Var = this.f13235b;
        m1Var.f12405g3 = max + m1Var.getPaddingTop();
        m1Var.f12406h3 = m1Var.getHeight() - m1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11 = k2.f12251y1;
        k2 k2Var = this.f13241s;
        int i12 = k2Var.f28649t0;
        setPadding(i12, 0, i12, 0);
        this.f13237e.setTranslationY(org.telegram.messenger.g0.L(16.0f));
        this.f13238f.setTranslationY(org.telegram.messenger.g0.L(52.0f));
        int L = org.telegram.messenger.g0.L(5.0f);
        int L2 = org.telegram.messenger.g0.L(102.0f);
        int L3 = org.telegram.messenger.g0.L(5.0f);
        int i13 = org.telegram.messenger.g0.f22558n;
        if (k2Var.f12257p1) {
            f10 = 0.0f;
        } else {
            f10 = 40.0f;
        }
        this.f13235b.setPadding(L, L2, L3, org.telegram.messenger.g0.L(f10) + i13);
        super.onMeasure(i7, i10);
    }
}
