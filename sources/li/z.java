package li;

import a8.m7;
import android.content.Context;
import android.text.SpannableStringBuilder;
import bi.v1;
import c8.ma;
import hi.o4;
import org.telegram.messenger.hd;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.q9;
public final class z extends b0 {
    public final q9 h;
    public final b9 f20043n;
    public final d0 f20044r;

    public z(d0 d0Var, Context context) {
        super(d0Var, context);
        this.f20044r = d0Var;
        h51 h51Var = new h51(context, d0Var.f30173a, 0, false, new t(d0Var, 4), new u(d0Var, 3), new u(d0Var, 4), d0Var.J0);
        this.d = h51Var;
        h51Var.r1();
        h51 h51Var2 = this.d;
        h51Var2.f35790g3.f34062r = false;
        h51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f24041n);
        org.telegram.messenger.g0.E2(this.f19922b);
        this.f19923c.addView(d0Var.A1, ma.g());
        this.f19923c.addView(this.d, ma.g());
        this.f19923c.addView(d0Var.C1, ma.g());
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
        this.f19921a = kVar;
        kVar.setOccupyStatusBar(false);
        t6.l(this.f19921a, 5, m6.G6, d0Var.J0);
        t6.l(this.f19921a, 3, m6.f29794z8, d0Var.J0);
        this.f19921a.setBackButtonImage(2131231240);
        t6.l(this.f19921a, 1, m6.f29775y8, d0Var.J0);
        this.f19921a.setTitle(n5.m(d0Var.f19935q1));
        this.f19921a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        this.f19921a.setActionBarMenuOnItemClick(new v1(this, 21));
        b9 b9Var = new b9(d0Var.f19935q1);
        this.f20043n = b9Var;
        q9 q9Var = new q9(getContext());
        this.h = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
        q9Var.f(d0Var.f19935q1, b9Var);
        this.f19921a.addView(q9Var, ma.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f19923c.addView(this.f19921a, ma.e(-1, 56, 48));
        this.f19923c.addView(d0Var.f19943y1, ma.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y s5 = this.f19921a.s();
        s5.setGlassMode(true);
        s5.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
        s5.a(3, 2131232488);
        if (v3.N(d0Var.f19935q1)) {
            s5.a(2, 2131232117);
        }
        hi.e eVar = new hi.e(getContext(), d0Var.J0, true);
        eVar.f();
        if (v3.w(27, d0Var.f19935q1)) {
            nq nqVar = new nq(2131231078, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) hd.N0(2131751977, null));
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            eVar.setText(spannableStringBuilder);
        } else {
            eVar.setText(hd.N0(2131747637, null));
        }
        d0Var.f19937s1 = eVar;
        eVar.setOnClickListener(new o4(this, 15));
        this.f19923c.addView(eVar, ma.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f24041n));
        a();
    }

    @Override
    public final float b() {
        return m7.a(this.f20044r.f19932m1.f57700e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f20044r.f19943y1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f24040m, b() + org.telegram.messenger.g0.L(4.0f)));
    }
}
