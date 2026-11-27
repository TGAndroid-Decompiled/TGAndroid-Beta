package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class ow3 extends iw3 {
    public final dw3 b;
    public final nw3 c;
    public final u55 d;
    public final kw3 e;
    public final sw3 f;
    public byte h;
    public float n;
    public boolean r;
    public final zw3 s;

    public ow3(zw3 zw3Var, Context context) {
        super(context);
        this.s = zw3Var;
        this.h = (byte) 8;
        this.n = -1.0f;
        this.r = false;
        dw3 dw3Var = new dw3(context);
        this.b = dw3Var;
        nw3 nw3Var = new nw3(this);
        this.c = nw3Var;
        dw3Var.setAdapter(nw3Var);
        u55 u55Var = new u55(this.h);
        this.d = u55Var;
        dw3Var.setLayoutManager(u55Var);
        dw3Var.setClipToPadding(true);
        dw3Var.setVerticalScrollBarEnabled(false);
        u55Var.O = new ar1(this, (byte) 4);
        dw3Var.setOnItemClickListener(new u(this, (byte) 23));
        dw3Var.setOnScrollListener(new to2(this, (byte) 7));
        zb3 zb3Var = new zb3();
        zb3Var.c = (short) 220;
        zb3Var.e = (short) 220;
        zb3Var.f = (short) 160;
        zb3Var.g = (short) 160;
        zb3Var.i = k43.g;
        dw3Var.setItemAnimator(zb3Var);
        addView(dw3Var, tre.c(-1.0f, -1));
        int i = zw3.C1;
        sw3 sw3Var = new sw3(context, zw3Var.J0);
        this.f = sw3Var;
        sw3Var.x = new n82(this, (byte) 23);
        addView(sw3Var, tre.e(-1, -2, 48));
        kw3 kw3Var = new kw3(this, context, zw3Var.J0);
        this.e = kw3Var;
        addView(kw3Var, tre.c(36.0f, -1));
    }

    @Override
    public final void a(int i) {
        boolean z;
        byte b;
        this.a = i;
        int i2 = 0;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.b.g3 = z;
        if (i == 0) {
            b = 8;
        } else {
            b = 5;
        }
        this.h = b;
        this.d.x1(b);
        boolean z2 = this.r;
        nw3 nw3Var = this.c;
        if (!z2) {
            nw3Var.D(null);
        }
        zw3 zw3Var = this.s;
        int i3 = zw3Var.m1;
        sw3 sw3Var = this.f;
        if (i3 >= 0) {
            sw3Var.s = true;
            sw3Var.e.setText("");
            sw3Var.s = false;
            rw3 rw3Var = sw3Var.h;
            if (rw3Var != null) {
                rw3Var.I1(zw3Var.m1);
                sw3Var.h.G1();
                if (sw3Var.h.getSelectedCategory() != null) {
                    nw3Var.I = sw3Var.h.getSelectedCategory().a;
                    lw3 lw3Var = nw3Var.N;
                    hl.r(lw3Var);
                    hl.c3(lw3Var);
                }
            }
        } else if (!TextUtils.isEmpty(zw3Var.l1)) {
            sw3Var.e.setText(zw3Var.l1);
            rw3 rw3Var2 = sw3Var.h;
            if (rw3Var2 != null) {
                rw3Var2.J1(null);
                sw3Var.h.H1();
            }
            hl.r(nw3Var.N);
            hl.c3(nw3Var.N);
        } else {
            sw3Var.b();
        }
        sw3Var.a(i, zw3Var.t1);
        ls6 d0 = ls6.d0(zw3Var.a);
        if (i == 0) {
            i2 = 5;
        }
        d0.D(i2);
    }

    @Override
    public final float b() {
        View childAt;
        float f = this.n;
        if (f >= 0.0f) {
            return f;
        }
        int i = 0;
        while (true) {
            dw3 dw3Var = this.b;
            if (i >= dw3Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = dw3Var.getChildAt(i).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return c00.d(102.0f, childAt.getBottom(), 0);
            }
            i++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(hl.L(16.0f) + max);
        this.f.setTranslationY(hl.L(52.0f) + max);
        dw3 dw3Var = this.b;
        dw3Var.h3 = max + dw3Var.getPaddingTop();
        dw3Var.i3 = dw3Var.getHeight() - dw3Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int i3 = zw3.C1;
        zw3 zw3Var = this.s;
        int i4 = zw3Var.u0;
        setPadding(i4, 0, i4, 0);
        this.e.setTranslationY(hl.L(16.0f));
        this.f.setTranslationY(hl.L(52.0f));
        int L = hl.L(5.0f);
        int L2 = hl.L(102.0f);
        int L3 = hl.L(5.0f);
        int i5 = hl.n;
        if (zw3Var.s1) {
            f = 0.0f;
        } else {
            f = 40.0f;
        }
        this.b.setPadding(L, L2, L3, hl.L(f) + i5);
        super.onMeasure(i, i2);
    }
}
