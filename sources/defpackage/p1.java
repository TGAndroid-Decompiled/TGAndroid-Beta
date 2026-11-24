package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import android.text.style.ClickableSpan;
import org.telegram.ui.ProfileActivity;
public final class p1 extends c01 {
    public r86 d;
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
        gl.e3(b1Var, j);
    }

    @Override
    public final void d() {
        s1 s1Var = this.h;
        i46 i46Var = s1Var.F;
        r86 r86Var = s1Var.H;
        if (r86Var != null) {
            i46Var.m(r86Var, true);
        }
        r86 j = i46.j(this.e, this.f, this.g);
        this.d = j;
        s1Var.H = j;
        int v0 = bkb.v0(bkb.Be, s1Var.J);
        RectF rectF = ProfileActivity.Z6;
        this.d.g(bkb.p1(0.8f, v0), bkb.p1(1.3f, v0), bkb.p1(1.0f, v0), bkb.p1(4.0f, v0));
        this.d.x.setStrokeWidth(gl.N(1.25f));
        i46Var.b(this.d, null);
    }
}
