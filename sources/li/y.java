package li;

import a8.m7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import bi.x4;
import bi.z4;
import c8.ja;
import hi.p5;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.u41;
public final class y extends b0 {
    public final int h;
    public final d0 f19647n;

    public y(d0 d0Var, Context context, int i7) {
        super(d0Var, context);
        int i10;
        this.h = i7;
        switch (i7) {
            case 1:
                this.f19647n = d0Var;
                super(d0Var, context);
                u41 u41Var = new u41(context, d0Var.f29679a, 0, false, new s(d0Var, 5), new t(d0Var, 5), null, d0Var.J0);
                this.d = u41Var;
                u41Var.r1();
                u41 u41Var2 = this.d;
                u41Var2.f39895g3.f38201r = false;
                u41Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f23604n);
                this.d.j(new z4(this, 25));
                this.f19528c.addView(this.d, 0, ja.c(-1.0f, -1));
                org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
                this.f19526a = kVar;
                kVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.k kVar2 = this.f19526a;
                int i11 = j6.G6;
                q6.l(kVar2, 5, i11, d0Var.J0);
                q6.l(this.f19526a, 3, j6.f29262z8, d0Var.J0);
                this.f19526a.setBackButtonImage(2131231240);
                q6.l(this.f19526a, 1, j6.f29243y8, d0Var.J0);
                this.f19526a.setTitle(hd.M0(2131751886, null));
                this.f19526a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f19526a.setActionBarMenuOnItemClick(new x4(this, 20));
                this.f19528c.addView(this.f19526a, ja.e(-1, 56, 48));
                LinearLayout f10 = k5.f(context, 0);
                f10.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
                hi.d dVar = new hi.d(context, d0Var.J0, true);
                dVar.e();
                int i12 = j6.f28849d6;
                dVar.setColor(i0.a.f(0.125f, j6.w0(i12, d0Var.J0), j6.w0(i11, d0Var.J0)));
                dVar.setText(hd.M0(2131751900, null));
                dVar.f();
                if (dVar.getBackground() != null) {
                    Drawable background = dVar.getBackground();
                    e6 e6Var = d0Var.J0;
                    dVar.setBackground(background);
                    l6 o4 = q6.o(dVar, true);
                    o4.d = background;
                    o4.f29372e = null;
                    o4.f29373f = null;
                    if (background != null) {
                        k6 k6Var = new k6();
                        o4.f29372e = k6Var;
                        k6Var.c(i12, i11, 3, 0.125f, e6Var);
                        k6Var.f29348g = q6.t(background);
                    }
                }
                dVar.setOnClickListener(new View.OnClickListener(this) {
                    public final y f19536b;

                    {
                        this.f19536b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f19536b.f19647n.H1.f(false, true);
                                return;
                            default:
                                this.f19536b.f19647n.H1.f(true, true);
                                return;
                        }
                    }
                });
                f10.addView(dVar, ja.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                hi.d dVar2 = new hi.d(context, d0Var.J0, true);
                dVar2.setText(hd.M0(2131751902, null));
                dVar2.f();
                dVar2.setOnClickListener(new View.OnClickListener(this) {
                    public final y f19536b;

                    {
                        this.f19536b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f19536b.f19647n.H1.f(false, true);
                                return;
                            default:
                                this.f19536b.f19647n.H1.f(true, true);
                                return;
                        }
                    }
                });
                f10.addView(dVar2, ja.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.f19528c.addView(f10, ja.f(-2.0f, -1, 80, 0, 0, 0, org.telegram.messenger.g0.f23604n));
                a();
                return;
            default:
                this.f19647n = d0Var;
                org.telegram.messenger.g0.E2(this.f19527b);
                u41 u41Var3 = new u41(context, d0Var.f29679a, 0, false, new s(d0Var, 3), new t(d0Var, 2), null, d0Var.J0);
                this.d = u41Var3;
                u41Var3.r1();
                u41 u41Var4 = this.d;
                u41Var4.f39895g3.f38201r = false;
                u41Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f23604n);
                this.f19528c.addView(d0Var.B1, ja.g());
                this.f19528c.addView(this.d, 0, ja.c(-1.0f, -1));
                this.f19528c.addView(d0Var.D1, ja.g());
                org.telegram.ui.ActionBar.k kVar3 = new org.telegram.ui.ActionBar.k(context, d0Var.J0);
                this.f19526a = kVar3;
                kVar3.setOccupyStatusBar(false);
                q6.l(this.f19526a, 5, j6.G6, d0Var.J0);
                q6.l(this.f19526a, 3, j6.f29262z8, d0Var.J0);
                org.telegram.ui.ActionBar.k kVar4 = this.f19526a;
                boolean z10 = d0Var.I1;
                if (z10) {
                    i10 = 2131231241;
                } else {
                    i10 = 2131231240;
                }
                kVar4.setBackButtonImage(i10);
                q6.l(this.f19526a, 1, j6.f29243y8, d0Var.J0);
                this.f19526a.setTitle(hd.M0(2131751988, null));
                this.f19526a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f19526a.setActionBarMenuOnItemClick(new x4(this, 18));
                this.f19528c.addView(this.f19526a, ja.e(-1, 56, 48));
                this.f19528c.addView(d0Var.f19552z1, ja.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.y s5 = this.f19526a.s();
                s5.setGlassMode(true);
                s5.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
                s5.a(3, 2131232487);
                hi.d dVar3 = new hi.d(getContext(), d0Var.J0, true);
                d0Var.f19546t1 = dVar3;
                dVar3.f();
                d0Var.f19546t1.setText(hd.M0(2131747831, null));
                d0Var.f19546t1.setOnClickListener(new p5(this, 13));
                if (z10) {
                    d0Var.f19546t1.setVisibility(8);
                }
                this.f19528c.addView(d0Var.f19546t1, ja.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f23604n));
                a();
                return;
        }
    }

    @Override
    public float b() {
        switch (this.h) {
            case 0:
                return m7.a(this.f19647n.n1.f57081e) * super.b();
            default:
                return super.b();
        }
    }

    @Override
    public void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.f19647n.f19552z1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f23603m, b() + org.telegram.messenger.g0.L(4.0f)));
                return;
            default:
                super.c();
                return;
        }
    }
}
