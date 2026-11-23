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
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.h51;
public final class y extends b0 {
    public final int h;
    public final d0 f20042n;

    public y(d0 d0Var, Context context, int i7) {
        super(d0Var, context);
        int i10;
        this.h = i7;
        switch (i7) {
            case 1:
                this.f20042n = d0Var;
                super(d0Var, context);
                h51 h51Var = new h51(context, d0Var.f30173a, 0, false, new t(d0Var, 5), new u(d0Var, 5), null, d0Var.J0);
                this.d = h51Var;
                h51Var.r1();
                h51 h51Var2 = this.d;
                h51Var2.f35790g3.f34062r = false;
                h51Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f24041n);
                this.d.j(new u1(this, 26));
                this.f19923c.addView(this.d, 0, ma.c(-1.0f, -1));
                org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
                this.f19921a = kVar;
                kVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.k kVar2 = this.f19921a;
                int i11 = m6.G6;
                t6.l(kVar2, 5, i11, d0Var.J0);
                t6.l(this.f19921a, 3, m6.f29794z8, d0Var.J0);
                this.f19921a.setBackButtonImage(2131231240);
                t6.l(this.f19921a, 1, m6.f29775y8, d0Var.J0);
                this.f19921a.setTitle(hd.N0(2131751874, null));
                this.f19921a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f19921a.setActionBarMenuOnItemClick(new v1(this, 22));
                this.f19923c.addView(this.f19921a, ma.e(-1, 56, 48));
                LinearLayout g10 = f3.g(context, 0);
                g10.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
                hi.e eVar = new hi.e(context, d0Var.J0, true);
                eVar.e();
                int i12 = m6.f29381d6;
                eVar.setColor(i0.a.f(0.125f, m6.w0(i12, d0Var.J0), m6.w0(i11, d0Var.J0)));
                eVar.setText(hd.N0(2131751888, null));
                eVar.f();
                if (eVar.getBackground() != null) {
                    Drawable background = eVar.getBackground();
                    h6 h6Var = d0Var.J0;
                    eVar.setBackground(background);
                    o6 o4 = t6.o(eVar, true);
                    o4.d = background;
                    o4.f29858e = null;
                    o4.f29859f = null;
                    if (background != null) {
                        n6 n6Var = new n6();
                        o4.f29858e = n6Var;
                        n6Var.c(i12, i11, 3, 0.125f, h6Var);
                        n6Var.f29821g = t6.t(background);
                    }
                }
                eVar.setOnClickListener(new View.OnClickListener(this) {
                    public final y f19928b;

                    {
                        this.f19928b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f19928b.f20042n.H1.f(false, true);
                                return;
                            default:
                                this.f19928b.f20042n.H1.f(true, true);
                                return;
                        }
                    }
                });
                g10.addView(eVar, ma.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                hi.e eVar2 = new hi.e(context, d0Var.J0, true);
                eVar2.setText(hd.N0(2131751890, null));
                eVar2.f();
                eVar2.setOnClickListener(new View.OnClickListener(this) {
                    public final y f19928b;

                    {
                        this.f19928b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f19928b.f20042n.H1.f(false, true);
                                return;
                            default:
                                this.f19928b.f20042n.H1.f(true, true);
                                return;
                        }
                    }
                });
                g10.addView(eVar2, ma.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.f19923c.addView(g10, ma.f(-2.0f, -1, 80, 0, 0, 0, org.telegram.messenger.g0.f24041n));
                a();
                return;
            default:
                this.f20042n = d0Var;
                org.telegram.messenger.g0.E2(this.f19922b);
                h51 h51Var3 = new h51(context, d0Var.f30173a, 0, false, new t(d0Var, 3), new u(d0Var, 2), null, d0Var.J0);
                this.d = h51Var3;
                h51Var3.r1();
                h51 h51Var4 = this.d;
                h51Var4.f35790g3.f34062r = false;
                h51Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f24041n);
                this.f19923c.addView(d0Var.B1, ma.g());
                this.f19923c.addView(this.d, 0, ma.c(-1.0f, -1));
                this.f19923c.addView(d0Var.D1, ma.g());
                org.telegram.ui.ActionBar.k kVar3 = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
                this.f19921a = kVar3;
                kVar3.setOccupyStatusBar(false);
                t6.l(this.f19921a, 5, m6.G6, d0Var.J0);
                t6.l(this.f19921a, 3, m6.f29794z8, d0Var.J0);
                org.telegram.ui.ActionBar.k kVar4 = this.f19921a;
                boolean z10 = d0Var.I1;
                if (z10) {
                    i10 = 2131231241;
                } else {
                    i10 = 2131231240;
                }
                kVar4.setBackButtonImage(i10);
                t6.l(this.f19921a, 1, m6.f29775y8, d0Var.J0);
                this.f19921a.setTitle(hd.N0(2131751976, null));
                this.f19921a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f19921a.setActionBarMenuOnItemClick(new v1(this, 20));
                this.f19923c.addView(this.f19921a, ma.e(-1, 56, 48));
                this.f19923c.addView(d0Var.f19944z1, ma.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.y s5 = this.f19921a.s();
                s5.setGlassMode(true);
                s5.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
                s5.a(3, 2131232488);
                hi.e eVar3 = new hi.e(getContext(), d0Var.J0, true);
                d0Var.f19938t1 = eVar3;
                eVar3.f();
                d0Var.f19938t1.setText(hd.N0(2131747637, null));
                d0Var.f19938t1.setOnClickListener(new o4(this, 14));
                if (z10) {
                    d0Var.f19938t1.setVisibility(8);
                }
                this.f19923c.addView(d0Var.f19938t1, ma.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f24041n));
                a();
                return;
        }
    }

    @Override
    public float b() {
        switch (this.h) {
            case 0:
                return m7.a(this.f20042n.n1.f57700e) * super.b();
            default:
                return super.b();
        }
    }

    @Override
    public void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.f20042n.f19944z1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f24040m, b() + org.telegram.messenger.g0.L(4.0f)));
                return;
            default:
                super.c();
                return;
        }
    }
}
