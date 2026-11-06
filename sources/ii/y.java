package ii;

import a8.j7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import c8.ha;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.p41;
public final class y extends b0 {
    public final int h;
    public final d0 f15614n;

    public y(d0 d0Var, Context context, int i7) {
        super(d0Var, context);
        int i10;
        this.h = i7;
        switch (i7) {
            case 1:
                this.f15614n = d0Var;
                super(d0Var, context);
                p41 p41Var = new p41(context, d0Var.f28612a, 0, false, new t(d0Var, 5), new u(d0Var, 5), null, d0Var.I0);
                this.d = p41Var;
                p41Var.r1();
                p41 p41Var2 = this.d;
                p41Var2.f36781f3.f35132r = false;
                p41Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f22532n);
                this.d.j(new ai.b(this, 19));
                this.f15489c.addView(this.d, 0, ha.c(-1.0f, -1));
                org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d0Var.I0);
                this.f15487a = kVar;
                kVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.k kVar2 = this.f15487a;
                int i11 = k6.G6;
                r6.m(kVar2, 5, i11, d0Var.I0);
                r6.m(this.f15487a, 3, k6.f28260z8, d0Var.I0);
                this.f15487a.setBackButtonImage(2131231240);
                r6.m(this.f15487a, 1, k6.f28242y8, d0Var.I0);
                this.f15487a.setTitle(hd.M0(2131751886, null));
                this.f15487a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f15487a.setActionBarMenuOnItemClick(new bi.s(this, 10));
                this.f15489c.addView(this.f15487a, ha.e(-1, 56, 48));
                LinearLayout f10 = k5.f(context, 0);
                f10.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
                fi.d dVar = new fi.d(context, d0Var.I0, true);
                dVar.e();
                int i12 = k6.f27848d6;
                dVar.setColor(i0.a.f(0.125f, k6.w0(i12, d0Var.I0), k6.w0(i11, d0Var.I0)));
                dVar.setText(hd.M0(2131751900, null));
                dVar.f();
                if (dVar.getBackground() != null) {
                    Drawable background = dVar.getBackground();
                    f6 f6Var = d0Var.I0;
                    dVar.setBackground(background);
                    m6 p10 = r6.p(dVar, true);
                    p10.d = background;
                    p10.f28310e = null;
                    p10.f28311f = null;
                    if (background != null) {
                        l6 l6Var = new l6();
                        p10.f28310e = l6Var;
                        l6Var.c(i12, i11, 3, 0.125f, f6Var);
                        l6Var.f28285g = r6.u(background);
                    }
                }
                dVar.setOnClickListener(new View.OnClickListener(this) {
                    public final y f15495b;

                    {
                        this.f15495b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f15495b.f15614n.D1.f(false, true);
                                return;
                            default:
                                this.f15495b.f15614n.D1.f(true, true);
                                return;
                        }
                    }
                });
                f10.addView(dVar, ha.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                fi.d dVar2 = new fi.d(context, d0Var.I0, true);
                dVar2.setText(hd.M0(2131751902, null));
                dVar2.f();
                dVar2.setOnClickListener(new View.OnClickListener(this) {
                    public final y f15495b;

                    {
                        this.f15495b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f15495b.f15614n.D1.f(false, true);
                                return;
                            default:
                                this.f15495b.f15614n.D1.f(true, true);
                                return;
                        }
                    }
                });
                f10.addView(dVar2, ha.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.f15489c.addView(f10, ha.f(-2.0f, -1, 80, 0, 0, 0, org.telegram.messenger.g0.f22532n));
                a();
                return;
            default:
                this.f15614n = d0Var;
                org.telegram.messenger.g0.E2(this.f15488b);
                p41 p41Var3 = new p41(context, d0Var.f28612a, 0, false, new t(d0Var, 3), new u(d0Var, 2), null, d0Var.I0);
                this.d = p41Var3;
                p41Var3.r1();
                p41 p41Var4 = this.d;
                p41Var4.f36781f3.f35132r = false;
                p41Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f22532n);
                this.f15489c.addView(d0Var.f15513x1, ha.g());
                this.f15489c.addView(this.d, 0, ha.c(-1.0f, -1));
                this.f15489c.addView(d0Var.f15515z1, ha.g());
                org.telegram.ui.ActionBar.k kVar3 = new org.telegram.ui.ActionBar.k(context, d0Var.I0);
                this.f15487a = kVar3;
                kVar3.setOccupyStatusBar(false);
                r6.m(this.f15487a, 5, k6.G6, d0Var.I0);
                r6.m(this.f15487a, 3, k6.f28260z8, d0Var.I0);
                org.telegram.ui.ActionBar.k kVar4 = this.f15487a;
                boolean z9 = d0Var.E1;
                if (z9) {
                    i10 = 2131231241;
                } else {
                    i10 = 2131231240;
                }
                kVar4.setBackButtonImage(i10);
                r6.m(this.f15487a, 1, k6.f28242y8, d0Var.I0);
                this.f15487a.setTitle(hd.M0(2131751988, null));
                this.f15487a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f15487a.setActionBarMenuOnItemClick(new bi.s(this, 8));
                this.f15489c.addView(this.f15487a, ha.e(-1, 56, 48));
                this.f15489c.addView(d0Var.f15511v1, ha.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.y q10 = this.f15487a.q();
                q10.setGlassMode(true);
                q10.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
                q10.a(3, 2131232486);
                fi.d dVar3 = new fi.d(getContext(), d0Var.I0, true);
                d0Var.f15505p1 = dVar3;
                dVar3.f();
                d0Var.f15505p1.setText(hd.M0(2131747830, null));
                d0Var.f15505p1.setOnClickListener(new g(this, 1));
                if (z9) {
                    d0Var.f15505p1.setVisibility(8);
                }
                this.f15489c.addView(d0Var.f15505p1, ha.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f22532n));
                a();
                return;
        }
    }

    @Override
    public float b() {
        switch (this.h) {
            case 0:
                return j7.a(this.f15614n.f15501j1.f55395e) * super.b();
            default:
                return super.b();
        }
    }

    @Override
    public void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.f15614n.f15511v1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f22531m, b() + org.telegram.messenger.g0.L(4.0f)));
                return;
            default:
                super.c();
                return;
        }
    }
}
