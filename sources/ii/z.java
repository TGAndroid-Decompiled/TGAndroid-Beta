package ii;

import a8.j7;
import android.content.Context;
import android.text.SpannableStringBuilder;
import c8.ha;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wp;
public final class z extends b0 {
    public final l9 h;
    public final w8 f15615n;
    public final d0 f15616r;

    public z(d0 d0Var, Context context) {
        super(d0Var, context);
        this.f15616r = d0Var;
        p41 p41Var = new p41(context, d0Var.f28612a, 0, false, new t(d0Var, 4), new u(d0Var, 3), new u(d0Var, 4), d0Var.I0);
        this.d = p41Var;
        p41Var.r1();
        p41 p41Var2 = this.d;
        p41Var2.f36781f3.f35132r = false;
        p41Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f22532n);
        org.telegram.messenger.g0.E2(this.f15488b);
        this.f15489c.addView(d0Var.f15512w1, ha.g());
        this.f15489c.addView(this.d, ha.g());
        this.f15489c.addView(d0Var.f15514y1, ha.g());
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.I0);
        this.f15487a = kVar;
        kVar.setOccupyStatusBar(false);
        r6.m(this.f15487a, 5, k6.G6, d0Var.I0);
        r6.m(this.f15487a, 3, k6.f28260z8, d0Var.I0);
        this.f15487a.setBackButtonImage(2131231240);
        r6.m(this.f15487a, 1, k6.f28242y8, d0Var.I0);
        this.f15487a.setTitle(m5.m(d0Var.f15503m1));
        this.f15487a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        this.f15487a.setActionBarMenuOnItemClick(new bi.s(this, 9));
        w8 w8Var = new w8(d0Var.f15503m1);
        this.f15615n = w8Var;
        l9 l9Var = new l9(getContext());
        this.h = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
        l9Var.e(d0Var.f15503m1, w8Var);
        this.f15487a.addView(l9Var, ha.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f15489c.addView(this.f15487a, ha.e(-1, 56, 48));
        this.f15489c.addView(d0Var.f15510u1, ha.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y q10 = this.f15487a.q();
        q10.setGlassMode(true);
        q10.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
        q10.a(3, 2131232486);
        if (t3.N(d0Var.f15503m1)) {
            q10.a(2, 2131232115);
        }
        fi.d dVar = new fi.d(getContext(), d0Var.I0, true);
        dVar.f();
        if (t3.w(27, d0Var.f15503m1)) {
            wp wpVar = new wp(2131231078, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) hd.M0(2131751989, null));
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(hd.M0(2131747830, null));
        }
        d0Var.f15504o1 = dVar;
        dVar.setOnClickListener(new g(this, 2));
        this.f15489c.addView(dVar, ha.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f22532n));
        a();
    }

    @Override
    public final float b() {
        return j7.a(this.f15616r.f15500i1.f55395e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f15616r.f15510u1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f22531m, b() + org.telegram.messenger.g0.L(4.0f)));
    }
}
