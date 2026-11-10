package fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ui;
import org.telegram.ui.Components.wq;
public final class z1 extends u1 {
    public final m1 f13237b;
    public final y1 f13238c;
    public final v4.s d;
    public final w1 f13239e;
    public final e2 f13240f;
    public int h;
    public float f13241n;
    public boolean f13242r;
    public final k2 f13243s;

    public z1(k2 k2Var, Context context) {
        super(context);
        this.f13243s = k2Var;
        this.h = 8;
        this.f13241n = -1.0f;
        this.f13242r = false;
        m1 m1Var = new m1(context);
        this.f13237b = m1Var;
        y1 y1Var = new y1(this);
        this.f13238c = y1Var;
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
        kVar.f57124c = 220L;
        kVar.f57125e = 220L;
        kVar.f57126f = 160L;
        kVar.f57127g = 160L;
        kVar.f57128i = wq.f40047g;
        m1Var.setItemAnimator(kVar);
        addView(m1Var, c8.ha.c(-1.0f, -1));
        int i7 = k2.B1;
        e2 e2Var = new e2(context, k2Var.I0);
        this.f13240f = e2Var;
        e2Var.f11868x = new ai.e(this, 17);
        addView(e2Var, c8.ha.e(-1, -2, 48));
        w1 w1Var = new w1(this, context, k2Var.I0);
        this.f13239e = w1Var;
        addView(w1Var, c8.ha.c(36.0f, -1));
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        int i10;
        this.f12883a = i7;
        int i11 = 0;
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f13237b.f12406f3 = z9;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 5;
        }
        this.h = i10;
        this.d.y1(i10);
        boolean z10 = this.f13242r;
        y1 y1Var = this.f13238c;
        if (!z10) {
            y1Var.D(null);
        }
        k2 k2Var = this.f13243s;
        int i12 = k2Var.f12254m1;
        e2 e2Var = this.f13240f;
        if (i12 >= 0) {
            e2Var.f11866s = true;
            e2Var.f11862e.setText("");
            e2Var.f11866s = false;
            d2 d2Var = e2Var.h;
            if (d2Var != null) {
                d2Var.H1(k2Var.f12254m1);
                e2Var.h.F1();
                if (e2Var.h.getSelectedCategory() != null) {
                    y1Var.H = e2Var.h.getSelectedCategory().f39747a;
                    di.f8 f8Var = y1Var.M;
                    org.telegram.messenger.g0.r(f8Var);
                    org.telegram.messenger.g0.h3(f8Var);
                }
            }
        } else if (!TextUtils.isEmpty(k2Var.l1)) {
            e2Var.f11862e.setText(k2Var.l1);
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
        e2Var.a(i7, k2Var.f12260t1);
        ui b02 = ui.b0(k2Var.f28669a);
        if (i7 == 0) {
            i11 = 5;
        }
        b02.B(i11);
    }

    @Override
    public final float b() {
        View childAt;
        float f10 = this.f13241n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i7 = 0;
        while (true) {
            m1 m1Var = this.f13237b;
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
        this.f13239e.setTranslationY(org.telegram.messenger.g0.L(16.0f) + max);
        this.f13240f.setTranslationY(org.telegram.messenger.g0.L(52.0f) + max);
        m1 m1Var = this.f13237b;
        m1Var.f12407g3 = max + m1Var.getPaddingTop();
        m1Var.f12408h3 = m1Var.getHeight() - m1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11 = k2.B1;
        k2 k2Var = this.f13243s;
        int i12 = k2Var.f28705t0;
        setPadding(i12, 0, i12, 0);
        this.f13239e.setTranslationY(org.telegram.messenger.g0.L(16.0f));
        this.f13240f.setTranslationY(org.telegram.messenger.g0.L(52.0f));
        int L = org.telegram.messenger.g0.L(5.0f);
        int L2 = org.telegram.messenger.g0.L(102.0f);
        int L3 = org.telegram.messenger.g0.L(5.0f);
        int i13 = org.telegram.messenger.g0.f22562n;
        if (k2Var.f12259s1) {
            f10 = 0.0f;
        } else {
            f10 = 40.0f;
        }
        this.f13237b.setPadding(L, L2, L3, org.telegram.messenger.g0.L(f10) + i13);
        super.onMeasure(i7, i10);
    }
}
