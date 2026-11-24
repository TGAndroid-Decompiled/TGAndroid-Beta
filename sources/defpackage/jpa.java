package defpackage;

import android.content.Context;
import android.graphics.Rect;
public final class jpa extends rz4 implements g94 {
    public static final int w = 0;
    public final h94 f;
    public final eg9 h;
    public final qz4[] n;
    public final ylb r;
    public int s;

    public jpa(Context context, ylb ylbVar, eg9 eg9Var) {
        super(context);
        this.f = new h94(0, this, d53.h, 1600L);
        this.h = eg9Var;
        this.r = ylbVar;
        int i = cmb.Ml;
        int p1 = cmb.p1(0.09411765f, cmb.v0(i, ylbVar));
        cmb.p1(0.1254902f, cmb.v0(i, ylbVar));
        this.e.setColor(p1);
        this.n = new qz4[]{qz4.c(context, ylbVar, pz4.G, 2131749402), qz4.c(context, ylbVar, pz4.s, 2131749419), qz4.c(context, ylbVar, pz4.J, 2131749400)};
        int i2 = 0;
        while (true) {
            qz4[] qz4VarArr = this.n;
            if (i2 < qz4VarArr.length) {
                this.a.addView(qz4VarArr[i2], qoe.l(1.0f, 0, -1));
                this.n[i2].setOnClickListener(new v0(this, i2, (byte) 24));
                i2++;
            } else {
                qz4VarArr[0].f(true, false);
                return;
            }
        }
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        b();
        invalidate();
    }

    public final void a(int i) {
        int i2 = this.s;
        if (i2 != i) {
            qz4[] qz4VarArr = this.n;
            qz4VarArr[i2].f(false, true);
            qz4VarArr[i].f(true, true);
            this.s = i;
            this.f.a(i);
            this.h.a(Integer.valueOf(i));
        }
    }

    public final void b() {
        float f = this.f.f;
        int measuredHeight = getMeasuredHeight() - gm.L(8.0f);
        Rect rect = this.c;
        rect.set(gm.U1(f / 3.0f, gm.L(8.0f), getMeasuredWidth() - gm.L(8.0f)), gm.L(8.0f), gm.U1((f + 1.0f) / 3.0f, gm.L(8.0f), getMeasuredWidth() - gm.L(8.0f)), measuredHeight);
        int L = gm.L(this.b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i = -L;
        rect2.inset(i, i);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }

    @Override
    public final void V(float f, int i) {
    }
}
