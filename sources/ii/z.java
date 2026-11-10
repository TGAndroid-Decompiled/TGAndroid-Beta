package ii;

import a8.j7;
import android.content.Context;
import android.text.SpannableStringBuilder;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.wp;
public final class z extends b0 {
    public final k9 h;
    public final v8 f15617n;
    public final d0 f15618r;

    public z(d0 d0Var, Context context) {
        super(d0Var, context);
        this.f15618r = d0Var;
        r41 r41Var = new r41(context, d0Var.f28669a, 0, false, new t(d0Var, 4), new u(d0Var, 3), new u(d0Var, 4), d0Var.I0);
        this.d = r41Var;
        r41Var.r1();
        r41 r41Var2 = this.d;
        r41Var2.f37496f3.f35845r = false;
        r41Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f22562n);
        org.telegram.messenger.g0.E2(this.f15493b);
        this.f15494c.addView(d0Var.f15517z1, ha.g());
        this.f15494c.addView(this.d, ha.g());
        this.f15494c.addView(d0Var.B1, ha.g());
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, d0Var.I0);
        this.f15492a = lVar;
        lVar.setOccupyStatusBar(false);
        t6.l(this.f15492a, 5, m6.G6, d0Var.I0);
        t6.l(this.f15492a, 3, m6.f28302z8, d0Var.I0);
        this.f15492a.setBackButtonImage(2131231240);
        t6.l(this.f15492a, 1, m6.f28284y8, d0Var.I0);
        this.f15492a.setTitle(m5.m(d0Var.f15507p1));
        this.f15492a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        this.f15492a.setActionBarMenuOnItemClick(new bi.s(this, 9));
        v8 v8Var = new v8(d0Var.f15507p1);
        this.f15617n = v8Var;
        k9 k9Var = new k9(getContext());
        this.h = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
        k9Var.e(d0Var.f15507p1, v8Var);
        this.f15492a.addView(k9Var, ha.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f15494c.addView(this.f15492a, ha.e(-1, 56, 48));
        this.f15494c.addView(d0Var.f15515x1, ha.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y s5 = this.f15492a.s();
        s5.setGlassMode(true);
        s5.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
        s5.a(3, 2131232486);
        if (t3.N(d0Var.f15507p1)) {
            s5.a(2, 2131232115);
        }
        fi.d dVar = new fi.d(getContext(), d0Var.I0, true);
        dVar.f();
        if (t3.w(27, d0Var.f15507p1)) {
            wp wpVar = new wp(2131231078, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) id.M0(2131751989, null));
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(id.M0(2131747831, null));
        }
        d0Var.f15509r1 = dVar;
        dVar.setOnClickListener(new g(this, 2));
        this.f15494c.addView(dVar, ha.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f22562n));
        a();
    }

    @Override
    public final float b() {
        return j7.a(this.f15618r.l1.f55498e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f15618r.f15515x1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f22561m, b() + org.telegram.messenger.g0.L(4.0f)));
    }
}
