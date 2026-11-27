package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.ui.ActionBar.a;
public final class ro2 extends vo2 {
    public final de0 h;
    public final rb0 n;
    public final xo2 r;

    public ro2(xo2 xo2Var, Context context) {
        super(xo2Var, context);
        this.r = xo2Var;
        q9c q9cVar = new q9c(context, xo2Var.a, 0, false, new lo2(xo2Var, (byte) 4), new mo2(xo2Var, (byte) 3), new mo2(xo2Var, (byte) 4), xo2Var.J0);
        this.d = q9cVar;
        q9cVar.s1();
        q9c q9cVar2 = this.d;
        q9cVar2.g3.r = false;
        q9cVar2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, hl.L(60.0f) + hl.n);
        hl.B2(this.b);
        this.c.addView(xo2Var.z1, tre.g());
        this.c.addView(this.d, tre.g());
        this.c.addView(xo2Var.B1, tre.g());
        a aVar = new a(context, xo2Var.J0);
        this.a = aVar;
        aVar.setOccupyStatusBar(false);
        yob.l(this.a, 5, aob.G6, xo2Var.J0);
        yob.l(this.a, 3, aob.z8, xo2Var.J0);
        this.a.setBackButtonImage(2131231243);
        yob.l(this.a, 1, aob.y8, xo2Var.J0);
        this.a.setTitle(wf3.l(xo2Var.p1));
        this.a.getTitleTextView().setTranslationX(-hl.L(18.0f));
        this.a.setActionBarMenuOnItemClick(new kg2(this, (byte) 5));
        rb0 rb0Var = new rb0(xo2Var.p1);
        this.n = rb0Var;
        de0 de0Var = new de0(getContext());
        this.h = de0Var;
        de0Var.setRoundRadius(hl.L(9.0f));
        de0Var.f(xo2Var.p1, rb0Var);
        this.a.addView(de0Var, tre.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, tre.e(-1, 56, 48));
        this.c.addView(xo2Var.x1, tre.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        s6 u = this.a.u();
        u.setGlassMode(true);
        u.setTranslationX(-hl.L(7.0f));
        u.a(3, 2131232502);
        if (xc2.N(xo2Var.p1)) {
            u.a(2, 2131232120);
        }
        c51 c51Var = new c51(xo2Var.J0, getContext(), true);
        c51Var.f();
        if (xc2.w(27, xo2Var.p1)) {
            wm2 wm2Var = new wm2(2131231080, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) ob6.M0(2131751954, null));
            spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
            c51Var.setText(spannableStringBuilder);
        } else {
            c51Var.setText(ob6.M0(2131747558, null));
        }
        xo2Var.r1 = c51Var;
        c51Var.setOnClickListener(new r81(this, (byte) 20));
        this.c.addView(c51Var, tre.f(48.0f, -1, 80, hl.L(12.0f), 0, hl.L(12.0f), hl.L(12.0f) + hl.n));
        a();
    }

    @Override
    public final float b() {
        return qke.a(this.r.l1.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.r.x1.setTranslationY(Math.max(hl.L(8.0f) + hl.m, b() + hl.L(4.0f)));
    }
}
