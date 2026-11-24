package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.ui.ActionBar.a;
public final class yn2 extends co2 {
    public final be0 h;
    public final pb0 n;
    public final eo2 r;

    public yn2(eo2 eo2Var, Context context) {
        super(eo2Var, context);
        this.r = eo2Var;
        q5c q5cVar = new q5c(context, eo2Var.a, 0, false, new sn2(eo2Var, (byte) 4), new tn2(eo2Var, (byte) 3), new tn2(eo2Var, (byte) 4), eo2Var.J0);
        this.d = q5cVar;
        q5cVar.r1();
        q5c q5cVar2 = this.d;
        q5cVar2.g3.r = false;
        q5cVar2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, gl.L(60.0f) + gl.n);
        gl.B2(this.b);
        this.c.addView(eo2Var.z1, nme.g());
        this.c.addView(this.d, nme.g());
        this.c.addView(eo2Var.B1, nme.g());
        a aVar = new a(context, eo2Var.J0);
        this.a = aVar;
        aVar.setOccupyStatusBar(false);
        zkb.l(this.a, 5, bkb.F6, eo2Var.J0);
        zkb.l(this.a, 3, bkb.y8, eo2Var.J0);
        this.a.setBackButtonImage(2131231243);
        zkb.l(this.a, 1, bkb.x8, eo2Var.J0);
        this.a.setTitle(cf3.l(eo2Var.p1));
        this.a.getTitleTextView().setTranslationX(-gl.L(18.0f));
        this.a.setActionBarMenuOnItemClick(new vm2(this, (byte) 4));
        pb0 pb0Var = new pb0(eo2Var.p1);
        this.n = pb0Var;
        be0 be0Var = new be0(getContext());
        this.h = be0Var;
        be0Var.setRoundRadius(gl.L(9.0f));
        be0Var.f(eo2Var.p1, pb0Var);
        this.a.addView(be0Var, nme.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, nme.e(-1, 56, 48));
        this.c.addView(eo2Var.x1, nme.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        r6 t = this.a.t();
        t.setGlassMode(true);
        t.setTranslationX(-gl.L(7.0f));
        t.a(3, 2131232491);
        if (hc2.N(eo2Var.p1)) {
            t.a(2, 2131232120);
        }
        u41 u41Var = new u41(eo2Var.J0, getContext(), true);
        u41Var.f();
        if (hc2.w(27, eo2Var.p1)) {
            cm2 cm2Var = new cm2(2131231080, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) k96.M0(2131751977, null));
            spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
            u41Var.setText(spannableStringBuilder);
        } else {
            u41Var.setText(k96.M0(2131747638, null));
        }
        eo2Var.r1 = u41Var;
        u41Var.setOnClickListener(new x91(this, (byte) 18));
        this.c.addView(u41Var, nme.f(48.0f, -1, 80, gl.L(12.0f), 0, gl.L(12.0f), gl.L(12.0f) + gl.n));
        a();
    }

    @Override
    public final float b() {
        return zfe.a(this.r.l1.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.r.x1.setTranslationY(Math.max(gl.L(8.0f) + gl.m, b() + gl.L(4.0f)));
    }
}
