package li;

import a8.n7;
import android.content.Context;
import android.text.SpannableStringBuilder;
import bi.w1;
import c8.na;
import hi.z4;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.p9;
public final class y extends a0 {
    public final p9 h;
    public final a9 f20106n;
    public final c0 f20107r;

    public y(c0 c0Var, Context context) {
        super(c0Var, context);
        this.f20107r = c0Var;
        g51 g51Var = new g51(context, c0Var.f30223a, 0, false, new s(c0Var, 4), new t(c0Var, 3), new t(c0Var, 4), c0Var.J0);
        this.d = g51Var;
        g51Var.r1();
        g51 g51Var2 = this.d;
        g51Var2.f35323g3.f33631r = false;
        g51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f24221n);
        org.telegram.messenger.g0.E2(this.f19987b);
        this.f19988c.addView(c0Var.A1, na.g());
        this.f19988c.addView(this.d, na.g());
        this.f19988c.addView(c0Var.C1, na.g());
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c0Var.J0);
        this.f19986a = kVar;
        kVar.setOccupyStatusBar(false);
        u6.l(this.f19986a, 5, n6.G6, c0Var.J0);
        u6.l(this.f19986a, 3, n6.f29864z8, c0Var.J0);
        this.f19986a.setBackButtonImage(2131231243);
        u6.l(this.f19986a, 1, n6.f29845y8, c0Var.J0);
        this.f19986a.setTitle(n5.m(c0Var.f19998q1));
        this.f19986a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        this.f19986a.setActionBarMenuOnItemClick(new w1(this, 21));
        a9 a9Var = new a9(c0Var.f19998q1);
        this.f20106n = a9Var;
        p9 p9Var = new p9(getContext());
        this.h = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
        p9Var.f(c0Var.f19998q1, a9Var);
        this.f19986a.addView(p9Var, na.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f19988c.addView(this.f19986a, na.e(-1, 56, 48));
        this.f19988c.addView(c0Var.f20006y1, na.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y s5 = this.f19986a.s();
        s5.setGlassMode(true);
        s5.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
        s5.a(3, 2131232491);
        if (v3.N(c0Var.f19998q1)) {
            s5.a(2, 2131232120);
        }
        hi.e eVar = new hi.e(getContext(), c0Var.J0, true);
        eVar.f();
        if (v3.w(27, c0Var.f19998q1)) {
            kq kqVar = new kq(2131231080, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) gd.N0(2131751977, null));
            spannableStringBuilder.setSpan(kqVar, 0, 1, 33);
            eVar.setText(spannableStringBuilder);
        } else {
            eVar.setText(gd.N0(2131747637, null));
        }
        c0Var.f20000s1 = eVar;
        eVar.setOnClickListener(new z4(this, 15));
        this.f19988c.addView(eVar, na.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f24221n));
        a();
    }

    @Override
    public final float b() {
        return n7.a(this.f20107r.f19995m1.f57779e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f20107r.f20006y1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f24220m, b() + org.telegram.messenger.g0.L(4.0f)));
    }
}
