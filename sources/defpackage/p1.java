package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.ui.ProfileActivity;
public final class p1 extends k11 {
    public qa6 d;
    public final Layout e;
    public final ClickableSpan f;
    public final float g;
    public final s1 h;

    public p1(s1 s1Var, Layout layout, ClickableSpan clickableSpan, float f) {
        this.h = s1Var;
        this.e = layout;
        this.f = clickableSpan;
        this.g = f;
    }

    @Override
    public final void c(boolean z) {
        long j;
        b1 b1Var = new b1(this, (byte) 1);
        if (z) {
            j = 0;
        } else {
            j = 350;
        }
        gm.d3(b1Var, j);
    }

    @Override
    public final void d() {
        s1 s1Var = this.h;
        i66 i66Var = s1Var.F;
        qa6 qa6Var = s1Var.H;
        if (qa6Var != null) {
            i66Var.m(qa6Var, true);
        }
        qa6 j = i66.j(this.e, this.f, this.g);
        this.d = j;
        s1Var.H = j;
        int v0 = cmb.v0(cmb.Be, s1Var.J);
        RectF rectF = ProfileActivity.e7;
        this.d.g(cmb.p1(0.8f, v0), cmb.p1(1.3f, v0), cmb.p1(1.0f, v0), cmb.p1(4.0f, v0));
        this.d.x.setStrokeWidth(gm.N(1.25f));
        i66Var.b(this.d, null);
    }
}
