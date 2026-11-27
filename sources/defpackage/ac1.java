package defpackage;

import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
public final class ac1 {
    public final int a;
    public final Drawable b;
    public final v41 c;
    public final mm d;
    public final mm e;
    public final RectF f;
    public String g;
    public pkb h;
    public pkb i;
    public float j;
    public boolean k;
    public final bc1 l;

    public ac1(bc1 bc1Var, int i) {
        int i2;
        this.l = bc1Var;
        this.c = new v41(bc1Var);
        k43 k43Var = k43.h;
        this.d = new mm(bc1Var, 0L, 260L, k43Var);
        this.e = new mm(bc1Var, 0L, 260L, k43Var);
        this.f = new RectF();
        this.a = i;
        Resources resources = bc1Var.getContext().getResources();
        if (i < 0) {
            i2 = 2131230933;
        } else {
            i2 = 2131230932;
        }
        this.b = resources.getDrawable(i2).mutate();
    }

    public final float a() {
        float L = hl.L(30.0f);
        int i = this.a;
        bc1 bc1Var = this.l;
        if (i < 0) {
            float f = L / 2.0f;
            return Math.max(hl.L(8.0f) + f, (bc1Var.h - hl.L(8.0f)) - f);
        }
        return (L / 2.0f) + bc1Var.n + hl.L(8.0f);
    }

    public final void b(String str) {
        pkb pkbVar;
        if (TextUtils.equals(str, this.g)) {
            return;
        }
        this.g = str;
        bc1 bc1Var = this.l;
        if (str == null) {
            pkbVar = null;
        } else {
            pkb pkbVar2 = new pkb(str, 14.0f, hl.o());
            pkbVar2.p = c00.d(110.0f, bc1Var.getWidth(), hl.L(40.0f));
            pkbVar = pkbVar2;
        }
        this.h = pkbVar;
        bc1Var.invalidate();
    }
}
