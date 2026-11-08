package ii;

import a8.j7;
import android.content.Context;
import android.text.SpannableStringBuilder;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wp;
public final class z extends b0 {
    public final l9 h;
    public final w8 f15618n;
    public final d0 f15619r;

    public z(d0 d0Var, Context context) {
        super(d0Var, context);
        this.f15619r = d0Var;
        q41 q41Var = new q41(context, d0Var.f28616a, 0, false, new t(d0Var, 4), new u(d0Var, 3), new u(d0Var, 4), d0Var.I0);
        this.d = q41Var;
        q41Var.r1();
        q41 q41Var2 = this.d;
        q41Var2.f37190f3.f35528r = false;
        q41Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f22558n);
        org.telegram.messenger.g0.E2(this.f15491b);
        this.f15492c.addView(d0Var.f15515w1, ha.g());
        this.f15492c.addView(this.d, ha.g());
        this.f15492c.addView(d0Var.f15517y1, ha.g());
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.I0);
        this.f15490a = kVar;
        kVar.setOccupyStatusBar(false);
        r6.m(this.f15490a, 5, k6.G6, d0Var.I0);
        r6.m(this.f15490a, 3, k6.f28264z8, d0Var.I0);
        this.f15490a.setBackButtonImage(2131231240);
        r6.m(this.f15490a, 1, k6.f28246y8, d0Var.I0);
        this.f15490a.setTitle(m5.m(d0Var.f15506m1));
        this.f15490a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        this.f15490a.setActionBarMenuOnItemClick(new bi.s(this, 9));
        w8 w8Var = new w8(d0Var.f15506m1);
        this.f15618n = w8Var;
        l9 l9Var = new l9(getContext());
        this.h = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
        l9Var.e(d0Var.f15506m1, w8Var);
        this.f15490a.addView(l9Var, ha.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f15492c.addView(this.f15490a, ha.e(-1, 56, 48));
        this.f15492c.addView(d0Var.f15513u1, ha.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y q10 = this.f15490a.q();
        q10.setGlassMode(true);
        q10.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
        q10.a(3, 2131232486);
        if (t3.N(d0Var.f15506m1)) {
            q10.a(2, 2131232115);
        }
        fi.d dVar = new fi.d(getContext(), d0Var.I0, true);
        dVar.f();
        if (t3.w(27, d0Var.f15506m1)) {
            wp wpVar = new wp(2131231078, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) id.M0(2131751989, null));
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(id.M0(2131747832, null));
        }
        d0Var.f15507o1 = dVar;
        dVar.setOnClickListener(new g(this, 2));
        this.f15492c.addView(dVar, ha.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f22558n));
        a();
    }

    @Override
    public final float b() {
        return j7.a(this.f15619r.f15503i1.f55486e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f15619r.f15513u1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f22557m, b() + org.telegram.messenger.g0.L(4.0f)));
    }
}
