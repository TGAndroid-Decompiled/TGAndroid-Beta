package li;

import a8.n7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import bi.v1;
import bi.w1;
import c8.na;
import hi.p4;
import org.telegram.messenger.f3;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.h51;
public final class y extends b0 {
    public final int h;
    public final d0 f20008n;

    public y(d0 d0Var, Context context, int i7) {
        super(d0Var, context);
        int i10;
        this.h = i7;
        switch (i7) {
            case 1:
                this.f20008n = d0Var;
                super(d0Var, context);
                h51 h51Var = new h51(context, d0Var.f30139a, 0, false, new t(d0Var, 5), new u(d0Var, 5), null, d0Var.J0);
                this.d = h51Var;
                h51Var.r1();
                h51 h51Var2 = this.d;
                h51Var2.f35742g3.f34026r = false;
                h51Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f24005n);
                this.d.j(new v1(this, 26));
                this.f19889c.addView(this.d, 0, na.c(-1.0f, -1));
                org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
                this.f19887a = kVar;
                kVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.k kVar2 = this.f19887a;
                int i11 = m6.G6;
                t6.l(kVar2, 5, i11, d0Var.J0);
                t6.l(this.f19887a, 3, m6.f29760z8, d0Var.J0);
                this.f19887a.setBackButtonImage(2131231240);
                t6.l(this.f19887a, 1, m6.f29741y8, d0Var.J0);
                this.f19887a.setTitle(hd.N0(2131751874, null));
                this.f19887a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f19887a.setActionBarMenuOnItemClick(new w1(this, 22));
                this.f19889c.addView(this.f19887a, na.e(-1, 56, 48));
                LinearLayout g10 = f3.g(context, 0);
                g10.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
                hi.d dVar = new hi.d(context, d0Var.J0, true);
                dVar.e();
                int i12 = m6.f29347d6;
                dVar.setColor(i0.a.f(0.125f, m6.w0(i12, d0Var.J0), m6.w0(i11, d0Var.J0)));
                dVar.setText(hd.N0(2131751888, null));
                dVar.f();
                if (dVar.getBackground() != null) {
                    Drawable background = dVar.getBackground();
                    h6 h6Var = d0Var.J0;
                    dVar.setBackground(background);
                    o6 o4 = t6.o(dVar, true);
                    o4.d = background;
                    o4.f29824e = null;
                    o4.f29825f = null;
                    if (background != null) {
                        n6 n6Var = new n6();
                        o4.f29824e = n6Var;
                        n6Var.c(i12, i11, 3, 0.125f, h6Var);
                        n6Var.f29787g = t6.t(background);
                    }
                }
                dVar.setOnClickListener(new View.OnClickListener(this) {
                    public final y f19894b;

                    {
                        this.f19894b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f19894b.f20008n.H1.f(false, true);
                                return;
                            default:
                                this.f19894b.f20008n.H1.f(true, true);
                                return;
                        }
                    }
                });
                g10.addView(dVar, na.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                hi.d dVar2 = new hi.d(context, d0Var.J0, true);
                dVar2.setText(hd.N0(2131751890, null));
                dVar2.f();
                dVar2.setOnClickListener(new View.OnClickListener(this) {
                    public final y f19894b;

                    {
                        this.f19894b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f19894b.f20008n.H1.f(false, true);
                                return;
                            default:
                                this.f19894b.f20008n.H1.f(true, true);
                                return;
                        }
                    }
                });
                g10.addView(dVar2, na.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.f19889c.addView(g10, na.f(-2.0f, -1, 80, 0, 0, 0, org.telegram.messenger.g0.f24005n));
                a();
                return;
            default:
                this.f20008n = d0Var;
                org.telegram.messenger.g0.E2(this.f19888b);
                h51 h51Var3 = new h51(context, d0Var.f30139a, 0, false, new t(d0Var, 3), new u(d0Var, 2), null, d0Var.J0);
                this.d = h51Var3;
                h51Var3.r1();
                h51 h51Var4 = this.d;
                h51Var4.f35742g3.f34026r = false;
                h51Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f24005n);
                this.f19889c.addView(d0Var.B1, na.g());
                this.f19889c.addView(this.d, 0, na.c(-1.0f, -1));
                this.f19889c.addView(d0Var.D1, na.g());
                org.telegram.ui.ActionBar.k kVar3 = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
                this.f19887a = kVar3;
                kVar3.setOccupyStatusBar(false);
                t6.l(this.f19887a, 5, m6.G6, d0Var.J0);
                t6.l(this.f19887a, 3, m6.f29760z8, d0Var.J0);
                org.telegram.ui.ActionBar.k kVar4 = this.f19887a;
                boolean z10 = d0Var.I1;
                if (z10) {
                    i10 = 2131231241;
                } else {
                    i10 = 2131231240;
                }
                kVar4.setBackButtonImage(i10);
                t6.l(this.f19887a, 1, m6.f29741y8, d0Var.J0);
                this.f19887a.setTitle(hd.N0(2131751976, null));
                this.f19887a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f19887a.setActionBarMenuOnItemClick(new w1(this, 20));
                this.f19889c.addView(this.f19887a, na.e(-1, 56, 48));
                this.f19889c.addView(d0Var.f19910z1, na.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.y s5 = this.f19887a.s();
                s5.setGlassMode(true);
                s5.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
                s5.a(3, 2131232488);
                hi.d dVar3 = new hi.d(getContext(), d0Var.J0, true);
                d0Var.f19904t1 = dVar3;
                dVar3.f();
                d0Var.f19904t1.setText(hd.N0(2131747637, null));
                d0Var.f19904t1.setOnClickListener(new p4(this, 14));
                if (z10) {
                    d0Var.f19904t1.setVisibility(8);
                }
                this.f19889c.addView(d0Var.f19904t1, na.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f24005n));
                a();
                return;
        }
    }

    @Override
    public float b() {
        switch (this.h) {
            case 0:
                return n7.a(this.f20008n.n1.f57665e) * super.b();
            default:
                return super.b();
        }
    }

    @Override
    public void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.f20008n.f19910z1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f24004m, b() + org.telegram.messenger.g0.L(4.0f)));
                return;
            default:
                super.c();
                return;
        }
    }
}
