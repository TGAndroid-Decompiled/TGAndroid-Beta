package li;

import a8.m7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import bi.u1;
import bi.v1;
import c8.ma;
import hi.o4;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.h51;
public final class y extends b0 {
    public final int h;
    public final d0 f20039n;

    public y(d0 d0Var, Context context, int i7) {
        super(d0Var, context);
        int i10;
        this.h = i7;
        switch (i7) {
            case 1:
                this.f20039n = d0Var;
                super(d0Var, context);
                h51 h51Var = new h51(context, d0Var.f30170a, 0, false, new t(d0Var, 5), new u(d0Var, 5), null, d0Var.J0);
                this.d = h51Var;
                h51Var.r1();
                h51 h51Var2 = this.d;
                h51Var2.f35796g3.f34068r = false;
                h51Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f24141n);
                this.d.j(new u1(this, 26));
                this.f19920c.addView(this.d, 0, ma.c(-1.0f, -1));
                org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
                this.f19918a = kVar;
                kVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.k kVar2 = this.f19918a;
                int i11 = m6.G6;
                t6.l(kVar2, 5, i11, d0Var.J0);
                t6.l(this.f19918a, 3, m6.f29791z8, d0Var.J0);
                this.f19918a.setBackButtonImage(2131231240);
                t6.l(this.f19918a, 1, m6.f29772y8, d0Var.J0);
                this.f19918a.setTitle(gd.N0(2131751874, null));
                this.f19918a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f19918a.setActionBarMenuOnItemClick(new v1(this, 22));
                this.f19920c.addView(this.f19918a, ma.e(-1, 56, 48));
                LinearLayout g10 = f3.g(context, 0);
                g10.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
                hi.e eVar = new hi.e(context, d0Var.J0, true);
                eVar.e();
                int i12 = m6.f29378d6;
                eVar.setColor(i0.a.f(0.125f, m6.w0(i12, d0Var.J0), m6.w0(i11, d0Var.J0)));
                eVar.setText(gd.N0(2131751888, null));
                eVar.f();
                if (eVar.getBackground() != null) {
                    Drawable background = eVar.getBackground();
                    h6 h6Var = d0Var.J0;
                    eVar.setBackground(background);
                    o6 o4 = t6.o(eVar, true);
                    o4.d = background;
                    o4.f29855e = null;
                    o4.f29856f = null;
                    if (background != null) {
                        n6 n6Var = new n6();
                        o4.f29855e = n6Var;
                        n6Var.c(i12, i11, 3, 0.125f, h6Var);
                        n6Var.f29818g = t6.t(background);
                    }
                }
                eVar.setOnClickListener(new View.OnClickListener(this) {
                    public final y f19925b;

                    {
                        this.f19925b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f19925b.f20039n.H1.f(false, true);
                                return;
                            default:
                                this.f19925b.f20039n.H1.f(true, true);
                                return;
                        }
                    }
                });
                g10.addView(eVar, ma.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                hi.e eVar2 = new hi.e(context, d0Var.J0, true);
                eVar2.setText(gd.N0(2131751890, null));
                eVar2.f();
                eVar2.setOnClickListener(new View.OnClickListener(this) {
                    public final y f19925b;

                    {
                        this.f19925b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f19925b.f20039n.H1.f(false, true);
                                return;
                            default:
                                this.f19925b.f20039n.H1.f(true, true);
                                return;
                        }
                    }
                });
                g10.addView(eVar2, ma.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.f19920c.addView(g10, ma.f(-2.0f, -1, 80, 0, 0, 0, org.telegram.messenger.g0.f24141n));
                a();
                return;
            default:
                this.f20039n = d0Var;
                org.telegram.messenger.g0.E2(this.f19919b);
                h51 h51Var3 = new h51(context, d0Var.f30170a, 0, false, new t(d0Var, 3), new u(d0Var, 2), null, d0Var.J0);
                this.d = h51Var3;
                h51Var3.r1();
                h51 h51Var4 = this.d;
                h51Var4.f35796g3.f34068r = false;
                h51Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f24141n);
                this.f19920c.addView(d0Var.B1, ma.g());
                this.f19920c.addView(this.d, 0, ma.c(-1.0f, -1));
                this.f19920c.addView(d0Var.D1, ma.g());
                org.telegram.ui.ActionBar.k kVar3 = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
                this.f19918a = kVar3;
                kVar3.setOccupyStatusBar(false);
                t6.l(this.f19918a, 5, m6.G6, d0Var.J0);
                t6.l(this.f19918a, 3, m6.f29791z8, d0Var.J0);
                org.telegram.ui.ActionBar.k kVar4 = this.f19918a;
                boolean z10 = d0Var.I1;
                if (z10) {
                    i10 = 2131231241;
                } else {
                    i10 = 2131231240;
                }
                kVar4.setBackButtonImage(i10);
                t6.l(this.f19918a, 1, m6.f29772y8, d0Var.J0);
                this.f19918a.setTitle(gd.N0(2131751976, null));
                this.f19918a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f19918a.setActionBarMenuOnItemClick(new v1(this, 20));
                this.f19920c.addView(this.f19918a, ma.e(-1, 56, 48));
                this.f19920c.addView(d0Var.f19941z1, ma.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.y s5 = this.f19918a.s();
                s5.setGlassMode(true);
                s5.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
                s5.a(3, 2131232488);
                hi.e eVar3 = new hi.e(getContext(), d0Var.J0, true);
                d0Var.f19935t1 = eVar3;
                eVar3.f();
                d0Var.f19935t1.setText(gd.N0(2131747637, null));
                d0Var.f19935t1.setOnClickListener(new o4(this, 14));
                if (z10) {
                    d0Var.f19935t1.setVisibility(8);
                }
                this.f19920c.addView(d0Var.f19935t1, ma.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f24141n));
                a();
                return;
        }
    }

    @Override
    public float b() {
        switch (this.h) {
            case 0:
                return m7.a(this.f20039n.n1.f57696e) * super.b();
            default:
                return super.b();
        }
    }

    @Override
    public void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.f20039n.f19941z1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f24140m, b() + org.telegram.messenger.g0.L(4.0f)));
                return;
            default:
                super.c();
                return;
        }
    }
}
