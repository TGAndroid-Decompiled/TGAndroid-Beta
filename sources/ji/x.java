package ji;

import ai.g5;
import android.content.Context;
import android.text.SpannableStringBuilder;
import b8.mf;
import b8.v9;
import org.telegram.messenger.bd;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wp;
public final class x extends z {
    public final k9 h;
    public final u8 f16377n;
    public final b0 f16378r;

    public x(b0 b0Var, Context context) {
        super(b0Var, context);
        this.f16378r = b0Var;
        l41 l41Var = new l41(context, b0Var.f28583a, 0, false, new r(b0Var, 4), new s(b0Var, 3), new s(b0Var, 4), b0Var.J0);
        this.d = l41Var;
        l41Var.r1();
        l41 l41Var2 = this.d;
        l41Var2.f35594g3.f33698r = false;
        l41Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f22603n);
        org.telegram.messenger.g0.E2(this.f16380b);
        this.f16381c.addView(b0Var.f16276x1, mf.g());
        this.f16381c.addView(this.d, mf.g());
        this.f16381c.addView(b0Var.f16278z1, mf.g());
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, b0Var.J0);
        this.f16379a = kVar;
        kVar.setOccupyStatusBar(false);
        r6.m(this.f16379a, 5, k6.G6, b0Var.J0);
        r6.m(this.f16379a, 3, k6.f28292z8, b0Var.J0);
        this.f16379a.setBackButtonImage(2131231240);
        r6.m(this.f16379a, 1, k6.f28275y8, b0Var.J0);
        this.f16379a.setTitle(m5.m(b0Var.f16266n1));
        this.f16379a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
        this.f16379a.setActionBarMenuOnItemClick(new g5(this, 10));
        u8 u8Var = new u8(b0Var.f16266n1);
        this.f16377n = u8Var;
        k9 k9Var = new k9(getContext());
        this.h = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(9.0f));
        k9Var.e(b0Var.f16266n1, u8Var);
        this.f16379a.addView(k9Var, mf.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f16381c.addView(this.f16379a, mf.e(-1, 56, 48));
        this.f16381c.addView(b0Var.f16274v1, mf.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.x q10 = this.f16379a.q();
        q10.setGlassMode(true);
        q10.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
        q10.a(3, 2131232486);
        if (t3.N(b0Var.f16266n1)) {
            q10.a(2, 2131232115);
        }
        gi.d dVar = new gi.d(getContext(), b0Var.J0, true);
        dVar.f();
        if (t3.w(27, b0Var.f16266n1)) {
            wp wpVar = new wp(2131231078, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) bd.M0(2131751989, null));
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(bd.M0(2131747839, null));
        }
        b0Var.f16268p1 = dVar;
        dVar.setOnClickListener(new ii.m(this, 5));
        this.f16381c.addView(dVar, mf.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f22603n));
        a();
    }

    @Override
    public final float b() {
        return v9.a(this.f16378r.f16264j1.f53840e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f16378r.f16274v1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f22602m, b() + org.telegram.messenger.g0.L(4.0f)));
    }
}
