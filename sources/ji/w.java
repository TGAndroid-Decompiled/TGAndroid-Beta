package ji;

import ai.g5;
import ai.j5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import b8.mf;
import b8.v9;
import org.telegram.messenger.bd;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l41;
public final class w extends z {
    public final int h;
    public final b0 f16376n;

    public w(b0 b0Var, Context context, int i3) {
        super(b0Var, context);
        int i10;
        this.h = i3;
        switch (i3) {
            case 1:
                this.f16376n = b0Var;
                super(b0Var, context);
                l41 l41Var = new l41(context, b0Var.f28583a, 0, false, new r(b0Var, 5), new s(b0Var, 5), null, b0Var.J0);
                this.d = l41Var;
                l41Var.r1();
                l41 l41Var2 = this.d;
                l41Var2.f35594g3.f33698r = false;
                l41Var2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f22603n);
                this.d.j(new j5(this, 22));
                this.f16381c.addView(this.d, 0, mf.c(-1.0f, -1));
                org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, b0Var.J0);
                this.f16379a = kVar;
                kVar.setOccupyStatusBar(false);
                org.telegram.ui.ActionBar.k kVar2 = this.f16379a;
                int i11 = k6.G6;
                r6.m(kVar2, 5, i11, b0Var.J0);
                r6.m(this.f16379a, 3, k6.f28292z8, b0Var.J0);
                this.f16379a.setBackButtonImage(2131231240);
                r6.m(this.f16379a, 1, k6.f28275y8, b0Var.J0);
                this.f16379a.setTitle(bd.M0(2131751886, null));
                this.f16379a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f16379a.setActionBarMenuOnItemClick(new g5(this, 11));
                this.f16381c.addView(this.f16379a, mf.e(-1, 56, 48));
                LinearLayout f10 = k5.f(context, 0);
                f10.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
                gi.d dVar = new gi.d(context, b0Var.J0, true);
                dVar.e();
                int i12 = k6.f27878d6;
                dVar.setColor(i0.a.f(0.125f, k6.w0(i12, b0Var.J0), k6.w0(i11, b0Var.J0)));
                dVar.setText(bd.M0(2131751900, null));
                dVar.f();
                if (dVar.getBackground() != null) {
                    Drawable background = dVar.getBackground();
                    e6 e6Var = b0Var.J0;
                    dVar.setBackground(background);
                    m6 p10 = r6.p(dVar, true);
                    p10.d = background;
                    p10.f28349e = null;
                    p10.f28350f = null;
                    if (background != null) {
                        l6 l6Var = new l6();
                        p10.f28349e = l6Var;
                        l6Var.c(i12, i11, 3, 0.125f, e6Var);
                        l6Var.f28319g = r6.u(background);
                    }
                }
                dVar.setOnClickListener(new View.OnClickListener(this) {
                    public final w f16262b;

                    {
                        this.f16262b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f16262b.f16376n.E1.f(false, true);
                                return;
                            default:
                                this.f16262b.f16376n.E1.f(true, true);
                                return;
                        }
                    }
                });
                f10.addView(dVar, mf.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                gi.d dVar2 = new gi.d(context, b0Var.J0, true);
                dVar2.setText(bd.M0(2131751902, null));
                dVar2.f();
                dVar2.setOnClickListener(new View.OnClickListener(this) {
                    public final w f16262b;

                    {
                        this.f16262b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f16262b.f16376n.E1.f(false, true);
                                return;
                            default:
                                this.f16262b.f16376n.E1.f(true, true);
                                return;
                        }
                    }
                });
                f10.addView(dVar2, mf.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.f16381c.addView(f10, mf.f(-2.0f, -1, 80, 0, 0, 0, org.telegram.messenger.g0.f22603n));
                a();
                return;
            default:
                this.f16376n = b0Var;
                org.telegram.messenger.g0.E2(this.f16380b);
                l41 l41Var3 = new l41(context, b0Var.f28583a, 0, false, new r(b0Var, 3), new s(b0Var, 2), null, b0Var.J0);
                this.d = l41Var3;
                l41Var3.r1();
                l41 l41Var4 = this.d;
                l41Var4.f35594g3.f33698r = false;
                l41Var4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + org.telegram.messenger.g0.f22603n);
                this.f16381c.addView(b0Var.f16277y1, mf.g());
                this.f16381c.addView(this.d, 0, mf.c(-1.0f, -1));
                this.f16381c.addView(b0Var.A1, mf.g());
                org.telegram.ui.ActionBar.k kVar3 = new org.telegram.ui.ActionBar.k(context, b0Var.J0);
                this.f16379a = kVar3;
                kVar3.setOccupyStatusBar(false);
                r6.m(this.f16379a, 5, k6.G6, b0Var.J0);
                r6.m(this.f16379a, 3, k6.f28292z8, b0Var.J0);
                org.telegram.ui.ActionBar.k kVar4 = this.f16379a;
                boolean z10 = b0Var.F1;
                if (z10) {
                    i10 = 2131231241;
                } else {
                    i10 = 2131231240;
                }
                kVar4.setBackButtonImage(i10);
                r6.m(this.f16379a, 1, k6.f28275y8, b0Var.J0);
                this.f16379a.setTitle(bd.M0(2131751988, null));
                this.f16379a.getTitleTextView().setTranslationX(-org.telegram.messenger.g0.L(18.0f));
                this.f16379a.setActionBarMenuOnItemClick(new g5(this, 9));
                this.f16381c.addView(this.f16379a, mf.e(-1, 56, 48));
                this.f16381c.addView(b0Var.f16275w1, mf.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                org.telegram.ui.ActionBar.x q10 = this.f16379a.q();
                q10.setGlassMode(true);
                q10.setTranslationX(-org.telegram.messenger.g0.L(7.0f));
                q10.a(3, 2131232486);
                gi.d dVar3 = new gi.d(getContext(), b0Var.J0, true);
                b0Var.f16269q1 = dVar3;
                dVar3.f();
                b0Var.f16269q1.setText(bd.M0(2131747839, null));
                b0Var.f16269q1.setOnClickListener(new ii.m(this, 4));
                if (z10) {
                    b0Var.f16269q1.setVisibility(8);
                }
                this.f16381c.addView(b0Var.f16269q1, mf.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f22603n));
                a();
                return;
        }
    }

    @Override
    public float b() {
        switch (this.h) {
            case 0:
                return v9.a(this.f16376n.k1.f53840e) * super.b();
            default:
                return super.b();
        }
    }

    @Override
    public void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.f16376n.f16275w1.setTranslationY(Math.max(org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f22602m, b() + org.telegram.messenger.g0.L(4.0f)));
                return;
            default:
                super.c();
                return;
        }
    }
}
