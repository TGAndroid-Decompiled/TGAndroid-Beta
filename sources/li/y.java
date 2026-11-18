package li;

import a8.m7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import bi.q1;
import bi.r1;
import c8.ma;
import hi.o0;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.e51;
public final class y extends b0 {
    public final int h;
    public final d0 f20014n;

    public y(d0 d0Var, Context context, int i7) {
        super(d0Var, context);
        int i10;
        this.h = i7;
        switch (i7) {
            case 1:
                this.f20014n = d0Var;
                super(d0Var, context);
                e51 e51Var = new e51(context, d0Var.f30189a, 0, false, new t(d0Var, 5), new u(d0Var, 5), null, d0Var.J0);
                this.d = e51Var;
                e51Var.r1();
                e51 e51Var2 = this.d;
                e51Var2.f34607g3.f42809r = false;
                e51Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f24116n);
                this.d.j(new q1(this, 26));
                this.f19895c.addView(this.d, 0, ma.c(-1.0f, -1));
                org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
                this.f19893a = kVar;
                kVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.k kVar2 = this.f19893a;
                int i11 = n6.G6;
                u6.l(kVar2, 5, i11, d0Var.J0);
                u6.l(this.f19893a, 3, n6.f29809z8, d0Var.J0);
                this.f19893a.setBackButtonImage(2131231240);
                u6.l(this.f19893a, 1, n6.f29790y8, d0Var.J0);
                this.f19893a.setTitle(gd.M0(2131751875, null));
                this.f19893a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f19893a.setActionBarMenuOnItemClick(new r1(this, 22));
                this.f19895c.addView(this.f19893a, ma.e(-1, 56, 48));
                LinearLayout g10 = f3.g(context, 0);
                g10.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
                hi.d dVar = new hi.d(context, d0Var.J0, true);
                dVar.e();
                int i12 = n6.f29396d6;
                dVar.setColor(i0.a.f(0.125f, n6.w0(i12, d0Var.J0), n6.w0(i11, d0Var.J0)));
                dVar.setText(gd.M0(2131751889, null));
                dVar.f();
                if (dVar.getBackground() != null) {
                    Drawable background = dVar.getBackground();
                    i6 i6Var = d0Var.J0;
                    dVar.setBackground(background);
                    p6 o4 = u6.o(dVar, true);
                    o4.d = background;
                    o4.f29874e = null;
                    o4.f29875f = null;
                    if (background != null) {
                        o6 o6Var = new o6();
                        o4.f29874e = o6Var;
                        o6Var.c(i12, i11, 3, 0.125f, i6Var);
                        o6Var.f29837g = u6.t(background);
                    }
                }
                dVar.setOnClickListener(new View.OnClickListener(this) {
                    public final y f19900b;

                    {
                        this.f19900b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f19900b.f20014n.H1.f(false, true);
                                return;
                            default:
                                this.f19900b.f20014n.H1.f(true, true);
                                return;
                        }
                    }
                });
                g10.addView(dVar, ma.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                hi.d dVar2 = new hi.d(context, d0Var.J0, true);
                dVar2.setText(gd.M0(2131751891, null));
                dVar2.f();
                dVar2.setOnClickListener(new View.OnClickListener(this) {
                    public final y f19900b;

                    {
                        this.f19900b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f19900b.f20014n.H1.f(false, true);
                                return;
                            default:
                                this.f19900b.f20014n.H1.f(true, true);
                                return;
                        }
                    }
                });
                g10.addView(dVar2, ma.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.f19895c.addView(g10, ma.f(-2.0f, -1, 80, 0, 0, 0, org.telegram.messenger.g0.f24116n));
                a();
                return;
            default:
                this.f20014n = d0Var;
                org.telegram.messenger.g0.E2(this.f19894b);
                e51 e51Var3 = new e51(context, d0Var.f30189a, 0, false, new t(d0Var, 3), new u(d0Var, 2), null, d0Var.J0);
                this.d = e51Var3;
                e51Var3.r1();
                e51 e51Var4 = this.d;
                e51Var4.f34607g3.f42809r = false;
                e51Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f24116n);
                this.f19895c.addView(d0Var.B1, ma.g());
                this.f19895c.addView(this.d, 0, ma.c(-1.0f, -1));
                this.f19895c.addView(d0Var.D1, ma.g());
                org.telegram.ui.ActionBar.k kVar3 = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
                this.f19893a = kVar3;
                kVar3.setOccupyStatusBar(false);
                u6.l(this.f19893a, 5, n6.G6, d0Var.J0);
                u6.l(this.f19893a, 3, n6.f29809z8, d0Var.J0);
                org.telegram.ui.ActionBar.k kVar4 = this.f19893a;
                boolean z10 = d0Var.I1;
                if (z10) {
                    i10 = 2131231241;
                } else {
                    i10 = 2131231240;
                }
                kVar4.setBackButtonImage(i10);
                u6.l(this.f19893a, 1, n6.f29790y8, d0Var.J0);
                this.f19893a.setTitle(gd.M0(2131751977, null));
                this.f19893a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f19893a.setActionBarMenuOnItemClick(new r1(this, 20));
                this.f19895c.addView(this.f19893a, ma.e(-1, 56, 48));
                this.f19895c.addView(d0Var.f19916z1, ma.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.z t6 = this.f19893a.t();
                t6.setGlassMode(true);
                t6.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
                t6.a(3, 2131232488);
                hi.d dVar3 = new hi.d(getContext(), d0Var.J0, true);
                d0Var.f19910t1 = dVar3;
                dVar3.f();
                d0Var.f19910t1.setText(gd.M0(2131747638, null));
                d0Var.f19910t1.setOnClickListener(new o0(this, 15));
                if (z10) {
                    d0Var.f19910t1.setVisibility(8);
                }
                this.f19895c.addView(d0Var.f19910t1, ma.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f24116n));
                a();
                return;
        }
    }

    @Override
    public float b() {
        switch (this.h) {
            case 0:
                return m7.a(this.f20014n.n1.f57657e) * super.b();
            default:
                return super.b();
        }
    }

    @Override
    public void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.f20014n.f19916z1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f24115m, b() + org.telegram.messenger.g0.L(4.0f)));
                return;
            default:
                super.c();
                return;
        }
    }
}
