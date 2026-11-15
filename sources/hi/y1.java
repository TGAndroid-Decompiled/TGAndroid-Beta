package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.si;
import org.telegram.ui.Components.er;
public final class y1 extends u1 {
    public final o1 f15408b;
    public final x1 f15409c;
    public final v4.s d;
    public final w1 f15410e;
    public final d2 f15411f;
    public int h;
    public float f15412n;
    public boolean f15413r;
    public final i2 f15414s;

    public y1(i2 i2Var, Context context) {
        super(context);
        this.f15414s = i2Var;
        this.h = 8;
        this.f15412n = -1.0f;
        this.f15413r = false;
        o1 o1Var = new o1(context);
        this.f15408b = o1Var;
        x1 x1Var = new x1(this);
        this.f15409c = x1Var;
        o1Var.setAdapter(x1Var);
        v4.s sVar = new v4.s(this.h);
        this.d = sVar;
        o1Var.setLayoutManager(sVar);
        o1Var.setClipToPadding(true);
        o1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new bi.y1(this, 6);
        o1Var.setOnItemClickListener(new bi.b6(this, 10));
        o1Var.setOnScrollListener(new bi.z4(this, 14));
        v4.k kVar = new v4.k();
        kVar.f58608c = 220L;
        kVar.f58609e = 220L;
        kVar.f58610f = 160L;
        kVar.f58611g = 160L;
        kVar.f58612i = er.f34421g;
        o1Var.setItemAnimator(kVar);
        addView(o1Var, c8.ja.c(-1.0f, -1));
        int i7 = i2.C1;
        d2 d2Var = new d2(context, i2Var.J0);
        this.f15411f = d2Var;
        d2Var.f14097x = new bi.b(this, 27);
        addView(d2Var, c8.ja.e(-1, -2, 48));
        w1 w1Var = new w1(this, context, i2Var.J0);
        this.f15410e = w1Var;
        addView(w1Var, c8.ja.c(36.0f, -1));
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        int i10;
        this.f15179a = i7;
        int i11 = 0;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15408b.f14793g3 = z10;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 5;
        }
        this.h = i10;
        this.d.y1(i10);
        boolean z11 = this.f15413r;
        x1 x1Var = this.f15409c;
        if (!z11) {
            x1Var.D(null);
        }
        i2 i2Var = this.f15414s;
        int i12 = i2Var.n1;
        d2 d2Var = this.f15411f;
        if (i12 >= 0) {
            d2Var.f14095s = true;
            d2Var.f14091e.setText("");
            d2Var.f14095s = false;
            c2 c2Var = d2Var.h;
            if (c2Var != null) {
                c2Var.H1(i2Var.n1);
                d2Var.h.F1();
                if (d2Var.h.getSelectedCategory() != null) {
                    x1Var.I = d2Var.h.getSelectedCategory().f41459a;
                    e1 e1Var = x1Var.N;
                    org.telegram.messenger.g0.r(e1Var);
                    org.telegram.messenger.g0.h3(e1Var);
                }
            }
        } else if (!TextUtils.isEmpty(i2Var.f14403m1)) {
            d2Var.f14091e.setText(i2Var.f14403m1);
            c2 c2Var2 = d2Var.h;
            if (c2Var2 != null) {
                c2Var2.I1(null);
                d2Var.h.G1();
            }
            org.telegram.messenger.g0.r(x1Var.N);
            org.telegram.messenger.g0.h3(x1Var.N);
        } else {
            d2Var.b();
        }
        d2Var.a(i7, i2Var.f14410u1);
        si b02 = si.b0(i2Var.f29679a);
        if (i7 == 0) {
            i11 = 5;
        }
        b02.B(i11);
    }

    @Override
    public final float b() {
        View childAt;
        float f10 = this.f15412n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i7 = 0;
        while (true) {
            o1 o1Var = this.f15408b;
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
        this.f15410e.setTranslationY(org.telegram.messenger.g0.L(16.0f) + max);
        this.f15411f.setTranslationY(org.telegram.messenger.g0.L(52.0f) + max);
        o1 o1Var = this.f15408b;
        o1Var.f14794h3 = max + o1Var.getPaddingTop();
        o1Var.f14795i3 = o1Var.getHeight() - o1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11 = i2.C1;
        i2 i2Var = this.f15414s;
        int i12 = i2Var.f29717u0;
        setPadding(i12, 0, i12, 0);
        this.f15410e.setTranslationY(org.telegram.messenger.g0.L(16.0f));
        this.f15411f.setTranslationY(org.telegram.messenger.g0.L(52.0f));
        int L = org.telegram.messenger.g0.L(5.0f);
        int L2 = org.telegram.messenger.g0.L(102.0f);
        int L3 = org.telegram.messenger.g0.L(5.0f);
        int i13 = org.telegram.messenger.g0.f23604n;
        if (i2Var.f14409t1) {
            f10 = 0.0f;
        } else {
            f10 = 40.0f;
        }
        this.f15408b.setPadding(L, L2, L3, org.telegram.messenger.g0.L(f10) + i13);
        super.onMeasure(i7, i10);
    }
}
