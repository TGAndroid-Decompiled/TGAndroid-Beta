package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class ml8 {
    public byte a;
    public final n41 b;
    public final lm e;
    public Drawable i;
    public Drawable j;
    public oy8 k;
    public tgb l;
    public r86 r;
    public boolean s;
    public boolean t;
    public int u;
    public long w;
    public short x;
    public final pl8 y;
    public final RectF c = new RectF();
    public final RectF d = new RectF();
    public final RectF f = new RectF();
    public final RectF g = new RectF();
    public final Rect h = new Rect();
    public float m = 1.0f;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public final float q = 1.0f;
    public short v = 0;

    public ml8(pl8 pl8Var, nl8 nl8Var) {
        this.y = pl8Var;
        this.b = new n41(pl8Var);
        this.e = new lm(pl8Var, 0L, 250L, s33.f);
        d(0, nl8Var.b, nl8Var.c);
        c(k96.M0(nl8Var.a, null));
    }

    public final void a() {
        float e = this.e.e(false, 1.0f);
        if (e != 1.0f) {
            RectF rectF = this.g;
            float f = rectF.left;
            RectF rectF2 = this.f;
            float R1 = gl.R1(f, rectF2.left, e);
            RectF rectF3 = this.d;
            rectF3.left = R1;
            rectF3.right = gl.R1(rectF.right, rectF2.right, e);
            return;
        }
        this.n = false;
        if (this.o) {
            this.p = true;
        }
    }

    public final float b() {
        boolean z = this.o;
        lm lmVar = this.e;
        if (z) {
            return 1.0f - lmVar.e(false, 1.0f);
        }
        if (!this.n) {
            return 1.0f;
        }
        return lmVar.e(false, 1.0f);
    }

    public final void c(String str) {
        tgb tgbVar = new tgb(str, 11.0f, gl.o());
        tgbVar.l(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        tgbVar.a();
        this.l = tgbVar;
    }

    public final void d(int i, int i2, int i3) {
        Drawable drawable;
        Drawable drawable2 = null;
        pl8 pl8Var = this.y;
        if (i != 0) {
            oy8 oy8Var = new oy8(i, gl.L(56.0f), gl.L(56.0f), false, null);
            oy8Var.M(pl8Var);
            oy8Var.start();
            this.k = oy8Var;
        } else {
            this.k = null;
        }
        if (i2 != 0) {
            drawable = pl8Var.getResources().getDrawable(i2).mutate();
        } else {
            drawable = null;
        }
        this.i = drawable;
        if (i3 != 0) {
            drawable2 = pl8Var.getResources().getDrawable(i3).mutate();
        }
        this.j = drawable2;
        oy8 oy8Var2 = this.k;
        Rect rect = this.h;
        if (oy8Var2 != null) {
            oy8Var2.setBounds(rect);
        }
        Drawable drawable3 = this.i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public ml8(pl8 pl8Var) {
        this.y = pl8Var;
        this.b = new n41(pl8Var);
        this.e = new lm(pl8Var, 0L, 250L, s33.f);
    }
}
