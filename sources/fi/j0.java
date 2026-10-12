package fi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.am;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.p71;
import w7.w5;
public final class j0 extends h0 {
    public final k0 h;

    public j0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        c6 c6Var;
        c6 c6Var2;
        c6 c6Var3;
        c6 c6Var4;
        this.h = k0Var;
        i10 = ((e3) k0Var).currentAccount;
        t tVar = new t(k0Var, 5);
        u uVar = new u(k0Var, 5);
        c6Var = ((e3) k0Var).resourcesProvider;
        p71 p71Var = new p71(context, i10, 0, false, tVar, uVar, null, c6Var);
        this.d = p71Var;
        p71Var.p1();
        p71 p71Var2 = this.d;
        p71Var2.W2.f26679r = false;
        p71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new ai.r(this, 7));
        this.f9973c.addView(this.d, 0, w5.d(-1.0f, -1));
        c6Var2 = ((e3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var2);
        this.f9971a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f9971a;
        int i11 = h6.G6;
        kVar2.setTitleColor(k0Var.getThemedColor(i11));
        this.f9971a.D(k0Var.getThemedColor(h6.f20966z8), false);
        this.f9971a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f9971a.E(k0Var.getThemedColor(h6.f20948y8), false);
        this.f9971a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.f9971a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9971a.setActionBarMenuOnItemClick(new ei.t(this, 8));
        this.f9973c.addView(this.f9971a, w5.e(-1, 56, 48));
        LinearLayout e7 = am.e(context, 0);
        e7.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        c6Var3 = ((e3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context, c6Var3, true);
        dVar.d();
        dVar.setColor(i0.a.d(0.125f, k0Var.getThemedColor(h6.f20560d6), k0Var.getThemedColor(i11)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f9979b;

            {
                this.f9979b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f9979b.h.M.f(false, true);
                        return;
                    default:
                        this.f9979b.h.M.f(true, true);
                        return;
                }
            }
        });
        e7.addView(dVar, w5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        c6Var4 = ((e3) k0Var).resourcesProvider;
        ci.d dVar2 = new ci.d(context, c6Var4, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f9979b;

            {
                this.f9979b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f9979b.h.M.f(false, true);
                        return;
                    default:
                        this.f9979b.h.M.f(true, true);
                        return;
                }
            }
        });
        e7.addView(dVar2, w5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f9973c.addView(e7, w5.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
