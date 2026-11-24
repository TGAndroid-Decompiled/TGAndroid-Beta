package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.ui.ActionBar.a;
public final class kp2 extends np2 {
    public final bf0 h;
    public final pc0 n;
    public final pp2 r;

    public kp2(pp2 pp2Var, Context context) {
        super(pp2Var, context);
        this.r = pp2Var;
        q7c q7cVar = new q7c(context, pp2Var.a, 0, false, new dp2(pp2Var, (byte) 4), new ep2(pp2Var, (byte) 3), new ep2(pp2Var, (byte) 4), pp2Var.J0);
        this.d = q7cVar;
        q7cVar.r1();
        q7c q7cVar2 = this.d;
        q7cVar2.g3.r = false;
        q7cVar2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, gm.L(60.0f) + gm.n);
        gm.B2(this.b);
        this.c.addView(pp2Var.z1, qoe.g());
        this.c.addView(this.d, qoe.g());
        this.c.addView(pp2Var.B1, qoe.g());
        a aVar = new a(context, pp2Var.J0);
        this.a = aVar;
        aVar.setOccupyStatusBar(false);
        anb.l(this.a, 5, cmb.F6, pp2Var.J0);
        anb.l(this.a, 3, cmb.y8, pp2Var.J0);
        this.a.setBackButtonImage(2131231244);
        anb.l(this.a, 1, cmb.x8, pp2Var.J0);
        this.a.setTitle(pg3.l(pp2Var.p1));
        this.a.getTitleTextView().setTranslationX(-gm.L(18.0f));
        this.a.setActionBarMenuOnItemClick(new fh2(this, (byte) 5));
        pc0 pc0Var = new pc0(pp2Var.p1);
        this.n = pc0Var;
        bf0 bf0Var = new bf0(getContext());
        this.h = bf0Var;
        bf0Var.setRoundRadius(gm.L(9.0f));
        bf0Var.f(pp2Var.p1, pc0Var);
        this.a.addView(bf0Var, qoe.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, qoe.e(-1, 56, 48));
        this.c.addView(pp2Var.x1, qoe.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        r6 t = this.a.t();
        t.setGlassMode(true);
        t.setTranslationX(-gm.L(7.0f));
        t.a(3, 2131232503);
        if (sd2.N(pp2Var.p1)) {
            t.a(2, 2131232121);
        }
        b61 b61Var = new b61(pp2Var.J0, getContext(), true);
        b61Var.f();
        if (sd2.w(27, pp2Var.p1)) {
            pn2 pn2Var = new pn2(2131231081, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) jb6.M0(2131751926, null));
            spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
            b61Var.setText(spannableStringBuilder);
        } else {
            b61Var.setText(jb6.M0(2131747564, null));
        }
        pp2Var.r1 = b61Var;
        b61Var.setOnClickListener(new k81(this, (byte) 21));
        this.c.addView(b61Var, qoe.f(48.0f, -1, 80, gm.L(12.0f), 0, gm.L(12.0f), gm.L(12.0f) + gm.n));
        a();
    }

    @Override
    public final float b() {
        return aie.a(this.r.l1.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.r.x1.setTranslationY(Math.max(gm.L(8.0f) + gm.m, b() + gm.L(4.0f)));
    }
}
