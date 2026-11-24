package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class ex3 extends zw3 {
    public final uw3 b;
    public final dx3 c;
    public final q55 d;
    public final bx3 e;
    public final ix3 f;
    public byte h;
    public float n;
    public boolean r;
    public final px3 s;

    public ex3(px3 px3Var, Context context) {
        super(context);
        this.s = px3Var;
        this.h = (byte) 8;
        this.n = -1.0f;
        this.r = false;
        uw3 uw3Var = new uw3(context);
        this.b = uw3Var;
        dx3 dx3Var = new dx3(this);
        this.c = dx3Var;
        uw3Var.setAdapter(dx3Var);
        q55 q55Var = new q55(this.h);
        this.d = q55Var;
        uw3Var.setLayoutManager(q55Var);
        uw3Var.setClipToPadding(true);
        uw3Var.setVerticalScrollBarEnabled(false);
        q55Var.O = new zr1(this, (byte) 4);
        uw3Var.setOnItemClickListener(new u(this, (byte) 24));
        uw3Var.setOnScrollListener(new ip2(this, (byte) 8));
        sc3 sc3Var = new sc3();
        sc3Var.c = (short) 220;
        sc3Var.e = (short) 220;
        sc3Var.f = (short) 160;
        sc3Var.g = (short) 160;
        sc3Var.i = d53.g;
        uw3Var.setItemAnimator(sc3Var);
        addView(uw3Var, qoe.c(-1.0f, -1));
        int i = px3.C1;
        ix3 ix3Var = new ix3(context, px3Var.J0);
        this.f = ix3Var;
        ix3Var.x = new h92(this, (byte) 23);
        addView(ix3Var, qoe.e(-1, -2, 48));
        bx3 bx3Var = new bx3(this, context, px3Var.J0);
        this.e = bx3Var;
        addView(bx3Var, qoe.c(36.0f, -1));
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
        dx3 dx3Var = this.c;
        if (!z2) {
            dx3Var.D(null);
        }
        px3 px3Var = this.s;
        int i3 = px3Var.m1;
        ix3 ix3Var = this.f;
        if (i3 >= 0) {
            ix3Var.s = true;
            ix3Var.e.setText("");
            ix3Var.s = false;
            hx3 hx3Var = ix3Var.h;
            if (hx3Var != null) {
                hx3Var.H1(px3Var.m1);
                ix3Var.h.F1();
                if (ix3Var.h.getSelectedCategory() != null) {
                    dx3Var.I = ix3Var.h.getSelectedCategory().a;
                    bi3 bi3Var = dx3Var.N;
                    gm.r(bi3Var);
                    gm.c3(bi3Var);
                }
            }
        } else if (!TextUtils.isEmpty(px3Var.l1)) {
            ix3Var.e.setText(px3Var.l1);
            hx3 hx3Var2 = ix3Var.h;
            if (hx3Var2 != null) {
                hx3Var2.I1(null);
                ix3Var.h.G1();
            }
            gm.r(dx3Var.N);
            gm.c3(dx3Var.N);
        } else {
            ix3Var.b();
        }
        ix3Var.a(i, px3Var.t1);
        hs6 d0 = hs6.d0(px3Var.a);
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
            uw3 uw3Var = this.b;
            if (i >= uw3Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = uw3Var.getChildAt(i).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return b10.c(102.0f, childAt.getBottom(), 0);
            }
            i++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(gm.L(16.0f) + max);
        this.f.setTranslationY(gm.L(52.0f) + max);
        uw3 uw3Var = this.b;
        uw3Var.h3 = max + uw3Var.getPaddingTop();
        uw3Var.i3 = uw3Var.getHeight() - uw3Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int i3 = px3.C1;
        px3 px3Var = this.s;
        int i4 = px3Var.u0;
        setPadding(i4, 0, i4, 0);
        this.e.setTranslationY(gm.L(16.0f));
        this.f.setTranslationY(gm.L(52.0f));
        int L = gm.L(5.0f);
        int L2 = gm.L(102.0f);
        int L3 = gm.L(5.0f);
        int i5 = gm.n;
        if (px3Var.s1) {
            f = 0.0f;
        } else {
            f = 40.0f;
        }
        this.b.setPadding(L, L2, L3, gm.L(f) + i5);
        super.onMeasure(i, i2);
    }
}
