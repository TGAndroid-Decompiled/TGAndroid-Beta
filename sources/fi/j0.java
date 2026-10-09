package fi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.k71;
import w7.x5;
public final class j0 extends h0 {
    public final k0 h;

    public j0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        e6 e6Var;
        e6 e6Var2;
        e6 e6Var3;
        e6 e6Var4;
        this.h = k0Var;
        i10 = ((f3) k0Var).currentAccount;
        t tVar = new t(k0Var, 5);
        u uVar = new u(k0Var, 5);
        e6Var = ((f3) k0Var).resourcesProvider;
        k71 k71Var = new k71(context, i10, 0, false, tVar, uVar, null, e6Var);
        this.d = k71Var;
        k71Var.p1();
        k71 k71Var2 = this.d;
        k71Var2.W2.f25280r = false;
        k71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new ai.r(this, 7));
        this.f9975c.addView(this.d, 0, x5.d(-1.0f, -1));
        e6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var2);
        this.f9973a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f9973a;
        int i11 = i6.G6;
        kVar2.setTitleColor(k0Var.getThemedColor(i11));
        this.f9973a.C(k0Var.getThemedColor(i6.f21201z8), false);
        this.f9973a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f9973a.D(k0Var.getThemedColor(i6.f21183y8), false);
        this.f9973a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.f9973a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9973a.setActionBarMenuOnItemClick(new ei.t(this, 8));
        this.f9975c.addView(this.f9973a, x5.e(-1, 56, 48));
        LinearLayout e7 = bi.e(context, 0);
        e7.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        e6Var3 = ((f3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context, e6Var3, true);
        dVar.d();
        dVar.setColor(i0.a.d(0.125f, k0Var.getThemedColor(i6.f20797d6), k0Var.getThemedColor(i11)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f9981b;

            {
                this.f9981b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f9981b.h.M.f(false, true);
                        return;
                    default:
                        this.f9981b.h.M.f(true, true);
                        return;
                }
            }
        });
        e7.addView(dVar, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        e6Var4 = ((f3) k0Var).resourcesProvider;
        ci.d dVar2 = new ci.d(context, e6Var4, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f9981b;

            {
                this.f9981b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f9981b.h.M.f(false, true);
                        return;
                    default:
                        this.f9981b.h.M.f(true, true);
                        return;
                }
            }
        });
        e7.addView(dVar2, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f9975c.addView(e7, x5.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
