package ii;

import a8.j7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.r41;
public final class y extends b0 {
    public final int h;
    public final d0 f15617n;

    public y(d0 d0Var, Context context, int i7) {
        super(d0Var, context);
        int i10;
        this.h = i7;
        switch (i7) {
            case 1:
                this.f15617n = d0Var;
                super(d0Var, context);
                r41 r41Var = new r41(context, d0Var.f28621a, 0, false, new t(d0Var, 5), new u(d0Var, 5), null, d0Var.I0);
                this.d = r41Var;
                r41Var.r1();
                r41 r41Var2 = this.d;
                r41Var2.f37556f3.f35945r = false;
                r41Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f22558n);
                this.d.j(new ai.b(this, 19));
                this.f15492c.addView(this.d, 0, ha.c(-1.0f, -1));
                org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.I0);
                this.f15490a = kVar;
                kVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.k kVar2 = this.f15490a;
                int i11 = l6.G6;
                s6.l(kVar2, 5, i11, d0Var.I0);
                s6.l(this.f15490a, 3, l6.f28277z8, d0Var.I0);
                this.f15490a.setBackButtonImage(2131231240);
                s6.l(this.f15490a, 1, l6.f28259y8, d0Var.I0);
                this.f15490a.setTitle(id.M0(2131751886, null));
                this.f15490a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f15490a.setActionBarMenuOnItemClick(new bi.s(this, 10));
                this.f15492c.addView(this.f15490a, ha.e(-1, 56, 48));
                LinearLayout f10 = k5.f(context, 0);
                f10.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
                fi.d dVar = new fi.d(context, d0Var.I0, true);
                dVar.e();
                int i12 = l6.f27865d6;
                dVar.setColor(i0.a.f(0.125f, l6.w0(i12, d0Var.I0), l6.w0(i11, d0Var.I0)));
                dVar.setText(id.M0(2131751900, null));
                dVar.f();
                if (dVar.getBackground() != null) {
                    Drawable background = dVar.getBackground();
                    g6 g6Var = d0Var.I0;
                    dVar.setBackground(background);
                    n6 o4 = s6.o(dVar, true);
                    o4.d = background;
                    o4.f28328e = null;
                    o4.f28329f = null;
                    if (background != null) {
                        m6 m6Var = new m6();
                        o4.f28328e = m6Var;
                        m6Var.c(i12, i11, 3, 0.125f, g6Var);
                        m6Var.f28306g = s6.t(background);
                    }
                }
                dVar.setOnClickListener(new View.OnClickListener(this) {
                    public final y f15498b;

                    {
                        this.f15498b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f15498b.f15617n.D1.f(false, true);
                                return;
                            default:
                                this.f15498b.f15617n.D1.f(true, true);
                                return;
                        }
                    }
                });
                f10.addView(dVar, ha.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                fi.d dVar2 = new fi.d(context, d0Var.I0, true);
                dVar2.setText(id.M0(2131751902, null));
                dVar2.f();
                dVar2.setOnClickListener(new View.OnClickListener(this) {
                    public final y f15498b;

                    {
                        this.f15498b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f15498b.f15617n.D1.f(false, true);
                                return;
                            default:
                                this.f15498b.f15617n.D1.f(true, true);
                                return;
                        }
                    }
                });
                f10.addView(dVar2, ha.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.f15492c.addView(f10, ha.f(-2.0f, -1, 80, 0, 0, 0, org.telegram.messenger.g0.f22558n));
                a();
                return;
            default:
                this.f15617n = d0Var;
                org.telegram.messenger.g0.E2(this.f15491b);
                r41 r41Var3 = new r41(context, d0Var.f28621a, 0, false, new t(d0Var, 3), new u(d0Var, 2), null, d0Var.I0);
                this.d = r41Var3;
                r41Var3.r1();
                r41 r41Var4 = this.d;
                r41Var4.f37556f3.f35945r = false;
                r41Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f22558n);
                this.f15492c.addView(d0Var.f15516x1, ha.g());
                this.f15492c.addView(this.d, 0, ha.c(-1.0f, -1));
                this.f15492c.addView(d0Var.f15518z1, ha.g());
                org.telegram.ui.ActionBar.k kVar3 = new org.telegram.ui.ActionBar.k(context, d0Var.I0);
                this.f15490a = kVar3;
                kVar3.setOccupyStatusBar(false);
                s6.l(this.f15490a, 5, l6.G6, d0Var.I0);
                s6.l(this.f15490a, 3, l6.f28277z8, d0Var.I0);
                org.telegram.ui.ActionBar.k kVar4 = this.f15490a;
                boolean z9 = d0Var.E1;
                if (z9) {
                    i10 = 2131231241;
                } else {
                    i10 = 2131231240;
                }
                kVar4.setBackButtonImage(i10);
                s6.l(this.f15490a, 1, l6.f28259y8, d0Var.I0);
                this.f15490a.setTitle(id.M0(2131751988, null));
                this.f15490a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f15490a.setActionBarMenuOnItemClick(new bi.s(this, 8));
                this.f15492c.addView(this.f15490a, ha.e(-1, 56, 48));
                this.f15492c.addView(d0Var.f15514v1, ha.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.y r10 = this.f15490a.r();
                r10.setGlassMode(true);
                r10.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
                r10.a(3, 2131232486);
                fi.d dVar3 = new fi.d(getContext(), d0Var.I0, true);
                d0Var.f15508p1 = dVar3;
                dVar3.f();
                d0Var.f15508p1.setText(id.M0(2131747831, null));
                d0Var.f15508p1.setOnClickListener(new g(this, 1));
                if (z9) {
                    d0Var.f15508p1.setVisibility(8);
                }
                this.f15492c.addView(d0Var.f15508p1, ha.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f22558n));
                a();
                return;
        }
    }

    @Override
    public float b() {
        switch (this.h) {
            case 0:
                return j7.a(this.f15617n.f15504j1.f55499e) * super.b();
            default:
                return super.b();
        }
    }

    @Override
    public void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.f15617n.f15514v1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f22557m, b() + org.telegram.messenger.g0.L(4.0f)));
                return;
            default:
                super.c();
                return;
        }
    }
}
