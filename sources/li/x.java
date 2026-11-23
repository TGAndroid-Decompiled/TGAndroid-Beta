package li;

import a8.n7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import bi.v1;
import bi.w1;
import c8.na;
import hi.z4;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.g51;
public final class x extends a0 {
    public final int h;
    public final c0 f20105n;

    public x(c0 c0Var, Context context, int i7) {
        super(c0Var, context);
        int i10;
        this.h = i7;
        switch (i7) {
            case 1:
                this.f20105n = c0Var;
                super(c0Var, context);
                g51 g51Var = new g51(context, c0Var.f30223a, 0, false, new s(c0Var, 5), new t(c0Var, 5), null, c0Var.J0);
                this.d = g51Var;
                g51Var.r1();
                g51 g51Var2 = this.d;
                g51Var2.f35323g3.f33631r = false;
                g51Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f24221n);
                this.d.j(new v1(this, 26));
                this.f19988c.addView(this.d, 0, na.c(-1.0f, -1));
                org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c0Var.J0);
                this.f19986a = kVar;
                kVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.k kVar2 = this.f19986a;
                int i11 = n6.G6;
                u6.l(kVar2, 5, i11, c0Var.J0);
                u6.l(this.f19986a, 3, n6.f29864z8, c0Var.J0);
                this.f19986a.setBackButtonImage(2131231243);
                u6.l(this.f19986a, 1, n6.f29845y8, c0Var.J0);
                this.f19986a.setTitle(gd.N0(2131751874, null));
                this.f19986a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f19986a.setActionBarMenuOnItemClick(new w1(this, 22));
                this.f19988c.addView(this.f19986a, na.e(-1, 56, 48));
                LinearLayout g10 = f3.g(context, 0);
                g10.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
                hi.e eVar = new hi.e(context, c0Var.J0, true);
                eVar.e();
                int i12 = n6.f29451d6;
                eVar.setColor(i0.a.f(0.125f, n6.w0(i12, c0Var.J0), n6.w0(i11, c0Var.J0)));
                eVar.setText(gd.N0(2131751888, null));
                eVar.f();
                if (eVar.getBackground() != null) {
                    Drawable background = eVar.getBackground();
                    i6 i6Var = c0Var.J0;
                    eVar.setBackground(background);
                    p6 o4 = u6.o(eVar, true);
                    o4.d = background;
                    o4.f29953e = null;
                    o4.f29954f = null;
                    if (background != null) {
                        o6 o6Var = new o6();
                        o4.f29953e = o6Var;
                        o6Var.c(i12, i11, 3, 0.125f, i6Var);
                        o6Var.f29906g = u6.t(background);
                    }
                }
                eVar.setOnClickListener(new View.OnClickListener(this) {
                    public final x f19993b;

                    {
                        this.f19993b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f19993b.f20105n.H1.f(false, true);
                                return;
                            default:
                                this.f19993b.f20105n.H1.f(true, true);
                                return;
                        }
                    }
                });
                g10.addView(eVar, na.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                hi.e eVar2 = new hi.e(context, c0Var.J0, true);
                eVar2.setText(gd.N0(2131751890, null));
                eVar2.f();
                eVar2.setOnClickListener(new View.OnClickListener(this) {
                    public final x f19993b;

                    {
                        this.f19993b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f19993b.f20105n.H1.f(false, true);
                                return;
                            default:
                                this.f19993b.f20105n.H1.f(true, true);
                                return;
                        }
                    }
                });
                g10.addView(eVar2, na.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.f19988c.addView(g10, na.f(-2.0f, -1, 80, 0, 0, 0, org.telegram.messenger.g0.f24221n));
                a();
                return;
            default:
                this.f20105n = c0Var;
                org.telegram.messenger.g0.E2(this.f19987b);
                g51 g51Var3 = new g51(context, c0Var.f30223a, 0, false, new s(c0Var, 3), new t(c0Var, 2), null, c0Var.J0);
                this.d = g51Var3;
                g51Var3.r1();
                g51 g51Var4 = this.d;
                g51Var4.f35323g3.f33631r = false;
                g51Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f24221n);
                this.f19988c.addView(c0Var.B1, na.g());
                this.f19988c.addView(this.d, 0, na.c(-1.0f, -1));
                this.f19988c.addView(c0Var.D1, na.g());
                org.telegram.ui.ActionBar.k kVar3 = new org.telegram.ui.ActionBar.k(context, c0Var.J0);
                this.f19986a = kVar3;
                kVar3.setOccupyStatusBar(false);
                u6.l(this.f19986a, 5, n6.G6, c0Var.J0);
                u6.l(this.f19986a, 3, n6.f29864z8, c0Var.J0);
                org.telegram.ui.ActionBar.k kVar4 = this.f19986a;
                boolean z10 = c0Var.I1;
                if (z10) {
                    i10 = 2131231244;
                } else {
                    i10 = 2131231243;
                }
                kVar4.setBackButtonImage(i10);
                u6.l(this.f19986a, 1, n6.f29845y8, c0Var.J0);
                this.f19986a.setTitle(gd.N0(2131751976, null));
                this.f19986a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f19986a.setActionBarMenuOnItemClick(new w1(this, 20));
                this.f19988c.addView(this.f19986a, na.e(-1, 56, 48));
                this.f19988c.addView(c0Var.f20007z1, na.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.y s5 = this.f19986a.s();
                s5.setGlassMode(true);
                s5.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
                s5.a(3, 2131232491);
                hi.e eVar3 = new hi.e(getContext(), c0Var.J0, true);
                c0Var.f20001t1 = eVar3;
                eVar3.f();
                c0Var.f20001t1.setText(gd.N0(2131747637, null));
                c0Var.f20001t1.setOnClickListener(new z4(this, 14));
                if (z10) {
                    c0Var.f20001t1.setVisibility(8);
                }
                this.f19988c.addView(c0Var.f20001t1, na.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f24221n));
                a();
                return;
        }
    }

    @Override
    public float b() {
        switch (this.h) {
            case 0:
                return n7.a(this.f20105n.n1.f57779e) * super.b();
            default:
                return super.b();
        }
    }

    @Override
    public void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.f20105n.f20007z1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f24220m, b() + org.telegram.messenger.g0.L(4.0f)));
                return;
            default:
                super.c();
                return;
        }
    }
}
