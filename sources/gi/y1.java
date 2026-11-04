package gi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import b8.mf;
import org.telegram.messenger.li;
import org.telegram.ui.Components.xq;
public final class y1 extends u1 {
    public final m1 f13914b;
    public final x1 f13915c;
    public final u4.s d;
    public final w1 f13916e;
    public final d2 f13917f;
    public int h;
    public float f13918n;
    public boolean f13919r;
    public final i2 f13920s;

    public y1(i2 i2Var, Context context) {
        super(context);
        this.f13920s = i2Var;
        this.h = 8;
        this.f13918n = -1.0f;
        this.f13919r = false;
        m1 m1Var = new m1(context);
        this.f13914b = m1Var;
        x1 x1Var = new x1(this);
        this.f13915c = x1Var;
        m1Var.setAdapter(x1Var);
        u4.s sVar = new u4.s(this.h);
        this.d = sVar;
        m1Var.setLayoutManager(sVar);
        m1Var.setClipToPadding(true);
        m1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new ai.g2(this, 6);
        m1Var.setOnItemClickListener(new ai.j6(this, 10));
        m1Var.setOnScrollListener(new ai.j5(this, 14));
        u4.k kVar = new u4.k();
        kVar.f55616c = 220L;
        kVar.f55617e = 220L;
        kVar.f55618f = 160L;
        kVar.f55619g = 160L;
        kVar.f55620i = xq.f40453g;
        m1Var.setItemAnimator(kVar);
        addView(m1Var, mf.c(-1.0f, -1));
        int i3 = i2.f12950z1;
        d2 d2Var = new d2(context, i2Var.J0);
        this.f13917f = d2Var;
        d2Var.f12557x = new ai.c(this, 27);
        addView(d2Var, mf.e(-1, -2, 48));
        w1 w1Var = new w1(this, context, i2Var.J0);
        this.f13916e = w1Var;
        addView(w1Var, mf.c(36.0f, -1));
    }

    @Override
    public final void a(int i3) {
        boolean z10;
        int i10;
        this.f13653a = i3;
        int i11 = 0;
        if (i3 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13914b.f13183g3 = z10;
        if (i3 == 0) {
            i10 = 8;
        } else {
            i10 = 5;
        }
        this.h = i10;
        this.d.y1(i10);
        boolean z11 = this.f13919r;
        x1 x1Var = this.f13915c;
        if (!z11) {
            x1Var.D(null);
        }
        i2 i2Var = this.f13920s;
        int i12 = i2Var.k1;
        d2 d2Var = this.f13917f;
        if (i12 >= 0) {
            d2Var.f12555s = true;
            d2Var.f12551e.setText("");
            d2Var.f12555s = false;
            c2 c2Var = d2Var.h;
            if (c2Var != null) {
                c2Var.H1(i2Var.k1);
                d2Var.h.F1();
                if (d2Var.h.getSelectedCategory() != null) {
                    x1Var.I = d2Var.h.getSelectedCategory().f38555a;
                    ei.z5 z5Var = x1Var.N;
                    org.telegram.messenger.g0.r(z5Var);
                    org.telegram.messenger.g0.h3(z5Var);
                }
            }
        } else if (!TextUtils.isEmpty(i2Var.f12951j1)) {
            d2Var.f12551e.setText(i2Var.f12951j1);
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
        d2Var.a(i3, i2Var.f12957r1);
        li b02 = li.b0(i2Var.f28583a);
        if (i3 == 0) {
            i11 = 5;
        }
        b02.B(i11);
    }

    @Override
    public final float b() {
        View childAt;
        float f10 = this.f13918n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i3 = 0;
        while (true) {
            m1 m1Var = this.f13914b;
            if (i3 >= m1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = m1Var.getChildAt(i3).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return k2.p1.d(102.0f, childAt.getBottom(), 0);
            }
            i3++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.f13916e.setTranslationY(org.telegram.messenger.g0.L(16.0f) + max);
        this.f13917f.setTranslationY(org.telegram.messenger.g0.L(52.0f) + max);
        m1 m1Var = this.f13914b;
        m1Var.f13184h3 = max + m1Var.getPaddingTop();
        m1Var.i3 = m1Var.getHeight() - m1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        int i11 = i2.f12950z1;
        i2 i2Var = this.f13920s;
        int i12 = i2Var.f28618u0;
        setPadding(i12, 0, i12, 0);
        this.f13916e.setTranslationY(org.telegram.messenger.g0.L(16.0f));
        this.f13917f.setTranslationY(org.telegram.messenger.g0.L(52.0f));
        int L = org.telegram.messenger.g0.L(5.0f);
        int L2 = org.telegram.messenger.g0.L(102.0f);
        int L3 = org.telegram.messenger.g0.L(5.0f);
        int i13 = org.telegram.messenger.g0.f22603n;
        if (i2Var.f12956q1) {
            f10 = 0.0f;
        } else {
            f10 = 40.0f;
        }
        this.f13914b.setPadding(L, L2, L3, org.telegram.messenger.g0.L(f10) + i13);
        super.onMeasure(i3, i10);
    }
}
