package li;

import a8.m7;
import android.content.Context;
import android.text.SpannableStringBuilder;
import bi.r1;
import c8.ma;
import hi.o0;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.q9;
public final class z extends b0 {
    public final q9 h;
    public final b9 f20012n;
    public final d0 f20013r;

    public z(d0 d0Var, Context context) {
        super(d0Var, context);
        this.f20013r = d0Var;
        e51 e51Var = new e51(context, d0Var.f30187a, 0, false, new t(d0Var, 4), new u(d0Var, 3), new u(d0Var, 4), d0Var.J0);
        this.d = e51Var;
        e51Var.r1();
        e51 e51Var2 = this.d;
        e51Var2.f34607g3.f42809r = false;
        e51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f24113n);
        org.telegram.messenger.g0.E2(this.f19891b);
        this.f19892c.addView(d0Var.A1, ma.g());
        this.f19892c.addView(this.d, ma.g());
        this.f19892c.addView(d0Var.C1, ma.g());
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
        this.f19890a = kVar;
        kVar.setOccupyStatusBar(false);
        u6.l(this.f19890a, 5, n6.G6, d0Var.J0);
        u6.l(this.f19890a, 3, n6.f29807z8, d0Var.J0);
        this.f19890a.setBackButtonImage(2131231240);
        u6.l(this.f19890a, 1, n6.f29788y8, d0Var.J0);
        this.f19890a.setTitle(n5.m(d0Var.f19904q1));
        this.f19890a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        this.f19890a.setActionBarMenuOnItemClick(new r1(this, 21));
        b9 b9Var = new b9(d0Var.f19904q1);
        this.f20012n = b9Var;
        q9 q9Var = new q9(getContext());
        this.h = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
        q9Var.f(d0Var.f19904q1, b9Var);
        this.f19890a.addView(q9Var, ma.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f19892c.addView(this.f19890a, ma.e(-1, 56, 48));
        this.f19892c.addView(d0Var.f19912y1, ma.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z t6 = this.f19890a.t();
        t6.setGlassMode(true);
        t6.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
        t6.a(3, 2131232488);
        if (v3.N(d0Var.f19904q1)) {
            t6.a(2, 2131232117);
        }
        hi.d dVar = new hi.d(getContext(), d0Var.J0, true);
        dVar.f();
        if (v3.w(27, d0Var.f19904q1)) {
            lq lqVar = new lq(2131231078, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) gd.M0(2131751978, null));
            spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(gd.M0(2131747638, null));
        }
        d0Var.f19906s1 = dVar;
        dVar.setOnClickListener(new o0(this, 16));
        this.f19892c.addView(dVar, ma.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f24113n));
        a();
    }

    @Override
    public final float b() {
        return m7.a(this.f20013r.f19901m1.f57657e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f20013r.f19912y1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f24112m, b() + org.telegram.messenger.g0.L(4.0f)));
    }
}
