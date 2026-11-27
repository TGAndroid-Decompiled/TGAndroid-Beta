package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.a;
public final class qo2 extends vo2 {
    public final byte h;
    public final xo2 n;

    public qo2(xo2 xo2Var, Context context, byte b) {
        super(xo2Var, context);
        int i;
        this.h = b;
        switch (b) {
            case 1:
                this.n = xo2Var;
                super(xo2Var, context);
                q9c q9cVar = new q9c(context, xo2Var.a, 0, false, new lo2(xo2Var, (byte) 5), new mo2(xo2Var, (byte) 5), null, xo2Var.J0);
                this.d = q9cVar;
                q9cVar.s1();
                q9c q9cVar2 = this.d;
                q9cVar2.g3.r = false;
                q9cVar2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, hl.L(60.0f) + hl.n);
                this.d.j(new to2(this, (byte) 1));
                this.c.addView(this.d, 0, tre.c(-1.0f, -1));
                a aVar = new a(context, xo2Var.J0);
                this.a = aVar;
                aVar.setOccupyStatusBar(false);
                a aVar2 = this.a;
                int i2 = aob.G6;
                yob.l(aVar2, 5, i2, xo2Var.J0);
                yob.l(this.a, 3, aob.z8, xo2Var.J0);
                this.a.setBackButtonImage(2131231243);
                yob.l(this.a, 1, aob.y8, xo2Var.J0);
                this.a.setTitle(ob6.M0(2131751851, null));
                this.a.getTitleTextView().setTranslationX(-hl.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new kg2(this, (byte) 6));
                this.c.addView(this.a, tre.e(-1, 56, 48));
                LinearLayout j = uh9.j(context, 0);
                j.setPadding(hl.L(7.0f), 0, hl.L(7.0f), hl.L(12.0f));
                c51 c51Var = new c51(xo2Var.J0, context, true);
                c51Var.e();
                int i3 = aob.d6;
                c51Var.setColor(vm2.f(0.125f, aob.v0(i3, xo2Var.J0), aob.v0(i2, xo2Var.J0)));
                c51Var.setText(ob6.M0(2131751865, null));
                c51Var.f();
                if (c51Var.getBackground() != null) {
                    Drawable background = c51Var.getBackground();
                    vnb vnbVar = xo2Var.J0;
                    c51Var.setBackground(background);
                    tob o = yob.o(c51Var, true);
                    o.d = background;
                    o.e = null;
                    o.f = null;
                    if (background != null) {
                        sob sobVar = new sob();
                        o.e = sobVar;
                        sobVar.c(i3, i2, 3, 0.125f, vnbVar);
                        sobVar.g = yob.t(background);
                    }
                }
                c51Var.setOnClickListener(new View.OnClickListener(this) {
                    public final qo2 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b2 = r2;
                        qo2 qo2Var = this.b;
                        switch (b2) {
                            case 0:
                                qo2Var.n.G1.f(false, true);
                                return;
                            default:
                                qo2Var.n.G1.f(true, true);
                                return;
                        }
                    }
                });
                j.addView(c51Var, tre.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                c51 c51Var2 = new c51(xo2Var.J0, context, true);
                c51Var2.setText(ob6.M0(2131751867, null));
                c51Var2.f();
                c51Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final qo2 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b2 = r2;
                        qo2 qo2Var = this.b;
                        switch (b2) {
                            case 0:
                                qo2Var.n.G1.f(false, true);
                                return;
                            default:
                                qo2Var.n.G1.f(true, true);
                                return;
                        }
                    }
                });
                j.addView(c51Var2, tre.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.c.addView(j, tre.f(-2.0f, -1, 80, 0, 0, 0, hl.n));
                a();
                return;
            default:
                this.n = xo2Var;
                hl.B2(this.b);
                q9c q9cVar3 = new q9c(context, xo2Var.a, 0, false, new lo2(xo2Var, (byte) 3), new mo2(xo2Var, (byte) 2), null, xo2Var.J0);
                this.d = q9cVar3;
                q9cVar3.s1();
                q9c q9cVar4 = this.d;
                q9cVar4.g3.r = false;
                q9cVar4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, hl.L(60.0f) + hl.n);
                this.c.addView(xo2Var.A1, tre.g());
                this.c.addView(this.d, 0, tre.c(-1.0f, -1));
                this.c.addView(xo2Var.C1, tre.g());
                a aVar3 = new a(context, xo2Var.J0);
                this.a = aVar3;
                aVar3.setOccupyStatusBar(false);
                yob.l(this.a, 5, aob.G6, xo2Var.J0);
                yob.l(this.a, 3, aob.z8, xo2Var.J0);
                a aVar4 = this.a;
                boolean z = xo2Var.H1;
                if (z) {
                    i = 2131231244;
                } else {
                    i = 2131231243;
                }
                aVar4.setBackButtonImage(i);
                yob.l(this.a, 1, aob.y8, xo2Var.J0);
                this.a.setTitle(ob6.M0(2131751953, null));
                this.a.getTitleTextView().setTranslationX(-hl.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new kg2(this, (byte) 4));
                this.c.addView(this.a, tre.e(-1, 56, 48));
                this.c.addView(xo2Var.y1, tre.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                s6 u = this.a.u();
                u.setGlassMode(true);
                u.setTranslationX(-hl.L(7.0f));
                u.a(3, 2131232502);
                c51 c51Var3 = new c51(xo2Var.J0, getContext(), true);
                xo2Var.s1 = c51Var3;
                c51Var3.f();
                xo2Var.s1.setText(ob6.M0(2131747558, null));
                xo2Var.s1.setOnClickListener(new r81(this, (byte) 19));
                if (z) {
                    xo2Var.s1.setVisibility(8);
                }
                this.c.addView(xo2Var.s1, tre.f(48.0f, -1, 80, hl.L(12.0f), 0, hl.L(12.0f), hl.L(12.0f) + hl.n));
                a();
                return;
        }
    }

    @Override
    public final float b() {
        switch (this.h) {
            case 0:
                return qke.a(this.n.m1.e) * super.b();
            default:
                return super.b();
        }
    }

    @Override
    public final void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.n.y1.setTranslationY(Math.max(hl.L(8.0f) + hl.m, b() + hl.L(4.0f)));
                return;
            default:
                super.c();
                return;
        }
    }
}
