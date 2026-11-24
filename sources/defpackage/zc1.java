package defpackage;

import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
public final class zc1 {
    public final int a;
    public final Drawable b;
    public final u51 c;
    public final ln d;
    public final ln e;
    public final RectF f;
    public String g;
    public uib h;
    public uib i;
    public float j;
    public boolean k;
    public final ad1 l;

    public zc1(ad1 ad1Var, int i) {
        int i2;
        this.l = ad1Var;
        this.c = new u51(ad1Var);
        d53 d53Var = d53.h;
        this.d = new ln(ad1Var, 0L, 260L, d53Var);
        this.e = new ln(ad1Var, 0L, 260L, d53Var);
        this.f = new RectF();
        this.a = i;
        Resources resources = ad1Var.getContext().getResources();
        if (i < 0) {
            i2 = 2131230934;
        } else {
            i2 = 2131230933;
        }
        this.b = resources.getDrawable(i2).mutate();
    }

    public final float a() {
        float L = gm.L(30.0f);
        int i = this.a;
        ad1 ad1Var = this.l;
        if (i < 0) {
            float f = L / 2.0f;
            return Math.max(gm.L(8.0f) + f, (ad1Var.h - gm.L(8.0f)) - f);
        }
        return (L / 2.0f) + ad1Var.n + gm.L(8.0f);
    }

    public final void b(String str) {
        uib uibVar;
        if (TextUtils.equals(str, this.g)) {
            return;
        }
        this.g = str;
        ad1 ad1Var = this.l;
        if (str == null) {
            uibVar = null;
        } else {
            uib uibVar2 = new uib(str, 14.0f, gm.o());
            uibVar2.p = b10.c(110.0f, ad1Var.getWidth(), gm.L(40.0f));
            uibVar = uibVar2;
        }
        this.h = uibVar;
        ad1Var.invalidate();
    }
}
