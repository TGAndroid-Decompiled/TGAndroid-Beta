package fi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e71;
import w7.z5;
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
        e71 e71Var = new e71(context, i10, 0, false, tVar, uVar, null, d6Var);
        this.d = e71Var;
        e71Var.r1();
        e71 e71Var2 = this.d;
        e71Var2.f26034f3.f32531r = false;
        e71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new ai.r(this, 8));
        this.f9900c.addView(this.d, 0, z5.c(-1.0f, -1));
        d6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var2);
        this.f9898a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f9898a;
        int i11 = i6.G6;
        kVar2.setTitleColor(k0Var.getThemedColor(i11));
        this.f9898a.z(k0Var.getThemedColor(i6.f21235z8), false);
        this.f9898a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f9898a.A(k0Var.getThemedColor(i6.f21216y8), false);
        this.f9898a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.f9898a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9898a.setActionBarMenuOnItemClick(new ei.u(this, 8));
        this.f9900c.addView(this.f9898a, z5.e(-1, 56, 48));
        LinearLayout e7 = bi.e(context, 0);
        e7.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        d6Var3 = ((f3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context, d6Var3, true);
        dVar.d();
        dVar.setColor(i0.a.d(0.125f, k0Var.getThemedColor(i6.f20827d6), k0Var.getThemedColor(i11)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f9906b;

            {
                this.f9906b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f9906b.h.M.f(false, true);
                        return;
                    default:
                        this.f9906b.h.M.f(true, true);
                        return;
                }
            }
        });
        e7.addView(dVar, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        d6Var4 = ((f3) k0Var).resourcesProvider;
        ci.d dVar2 = new ci.d(context, d6Var4, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f9906b;

            {
                this.f9906b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f9906b.h.M.f(false, true);
                        return;
                    default:
                        this.f9906b.h.M.f(true, true);
                        return;
                }
            }
        });
        e7.addView(dVar2, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f9900c.addView(e7, z5.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
