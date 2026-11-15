package li;

import a8.m7;
import android.content.Context;
import android.text.SpannableStringBuilder;
import bi.x4;
import c8.ja;
import hi.p5;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.u41;
public final class z extends b0 {
    public final i9 h;
    public final t8 f19648n;
    public final d0 f19649r;

    public z(d0 d0Var, Context context) {
        super(d0Var, context);
        this.f19649r = d0Var;
        u41 u41Var = new u41(context, d0Var.f29679a, 0, false, new s(d0Var, 4), new t(d0Var, 3), new t(d0Var, 4), d0Var.J0);
        this.d = u41Var;
        u41Var.r1();
        u41 u41Var2 = this.d;
        u41Var2.f39895g3.f38201r = false;
        u41Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f23604n);
        org.telegram.messenger.g0.E2(this.f19527b);
        this.f19528c.addView(d0Var.A1, ja.g());
        this.f19528c.addView(this.d, ja.g());
        this.f19528c.addView(d0Var.C1, ja.g());
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
        this.f19526a = kVar;
        kVar.setOccupyStatusBar(false);
        q6.l(this.f19526a, 5, j6.G6, d0Var.J0);
        q6.l(this.f19526a, 3, j6.f29262z8, d0Var.J0);
        this.f19526a.setBackButtonImage(2131231240);
        q6.l(this.f19526a, 1, j6.f29243y8, d0Var.J0);
        this.f19526a.setTitle(m5.m(d0Var.f19543q1));
        this.f19526a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        this.f19526a.setActionBarMenuOnItemClick(new x4(this, 19));
        t8 t8Var = new t8(d0Var.f19543q1);
        this.f19648n = t8Var;
        i9 i9Var = new i9(getContext());
        this.h = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
        i9Var.f(d0Var.f19543q1, t8Var);
        this.f19526a.addView(i9Var, ja.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f19528c.addView(this.f19526a, ja.e(-1, 56, 48));
        this.f19528c.addView(d0Var.f19551y1, ja.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y s5 = this.f19526a.s();
        s5.setGlassMode(true);
        s5.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
        s5.a(3, 2131232487);
        if (t3.N(d0Var.f19543q1)) {
            s5.a(2, 2131232116);
        }
        hi.d dVar = new hi.d(getContext(), d0Var.J0, true);
        dVar.f();
        if (t3.w(27, d0Var.f19543q1)) {
            eq eqVar = new eq(2131231078, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) hd.M0(2131751989, null));
            spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(hd.M0(2131747831, null));
        }
        d0Var.f19545s1 = dVar;
        dVar.setOnClickListener(new p5(this, 14));
        this.f19528c.addView(dVar, ja.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f23604n));
        a();
    }

    @Override
    public final float b() {
        return m7.a(this.f19649r.f19540m1.f57081e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f19649r.f19551y1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f23603m, b() + org.telegram.messenger.g0.L(4.0f)));
    }
}
