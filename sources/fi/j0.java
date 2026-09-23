package fi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ul;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.d61;
import w7.x5;
public final class j0 extends h0 {
    public final k0 h;

    public j0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        d6 d6Var;
        d6 d6Var2;
        d6 d6Var3;
        d6 d6Var4;
        this.h = k0Var;
        i10 = ((f3) k0Var).currentAccount;
        t tVar = new t(k0Var, 5);
        u uVar = new u(k0Var, 5);
        d6Var = ((f3) k0Var).resourcesProvider;
        d61 d61Var = new d61(context, i10, 0, false, tVar, uVar, null, d6Var);
        this.d = d61Var;
        d61Var.p1();
        d61 d61Var2 = this.d;
        d61Var2.Y2.f28662r = false;
        d61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new ai.r(this, 7));
        this.f9095c.addView(this.d, 0, x5.c(-1.0f, -1));
        d6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var2);
        this.f9093a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f9093a;
        int i11 = h6.G6;
        kVar2.setTitleColor(k0Var.getThemedColor(i11));
        this.f9093a.A(k0Var.getThemedColor(h6.f19191z8), false);
        this.f9093a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f9093a.B(k0Var.getThemedColor(h6.f19172y8), false);
        this.f9093a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.f9093a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9093a.setActionBarMenuOnItemClick(new ei.t(this, 8));
        this.f9095c.addView(this.f9093a, x5.e(-1, 56, 48));
        LinearLayout f7 = ul.f(context, 0);
        f7.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        d6Var3 = ((f3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context, d6Var3, true);
        dVar.d();
        dVar.setColor(i0.a.d(0.125f, k0Var.getThemedColor(h6.f18789d6), k0Var.getThemedColor(i11)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f9100b;

            {
                this.f9100b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f9100b.h.M.f(false, true);
                        return;
                    default:
                        this.f9100b.h.M.f(true, true);
                        return;
                }
            }
        });
        f7.addView(dVar, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        d6Var4 = ((f3) k0Var).resourcesProvider;
        ci.d dVar2 = new ci.d(context, d6Var4, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f9100b;

            {
                this.f9100b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f9100b.h.M.f(false, true);
                        return;
                    default:
                        this.f9100b.h.M.f(true, true);
                        return;
                }
            }
        });
        f7.addView(dVar2, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f9095c.addView(f7, x5.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
