package fi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
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
        c71 c71Var = new c71(context, i10, 0, false, tVar, uVar, null, d6Var);
        this.d = c71Var;
        c71Var.s1();
        c71 c71Var2 = this.d;
        c71Var2.f25244f3.f31306r = false;
        c71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new ai.r(this, 8));
        this.f9899c.addView(this.d, 0, z5.c(-1.0f, -1));
        d6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var2);
        this.f9897a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f9897a;
        int i11 = i6.G6;
        kVar2.setTitleColor(k0Var.getThemedColor(i11));
        this.f9897a.A(k0Var.getThemedColor(i6.f21225z8), false);
        this.f9897a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f9897a.B(k0Var.getThemedColor(i6.f21206y8), false);
        this.f9897a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.f9897a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9897a.setActionBarMenuOnItemClick(new ei.u(this, 8));
        this.f9899c.addView(this.f9897a, z5.e(-1, 56, 48));
        LinearLayout f7 = ok.f(context, 0);
        f7.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        d6Var3 = ((f3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context, d6Var3, true);
        dVar.d();
        dVar.setColor(i0.a.d(0.125f, k0Var.getThemedColor(i6.f20817d6), k0Var.getThemedColor(i11)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f9905b;

            {
                this.f9905b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f9905b.h.M.f(false, true);
                        return;
                    default:
                        this.f9905b.h.M.f(true, true);
                        return;
                }
            }
        });
        f7.addView(dVar, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        d6Var4 = ((f3) k0Var).resourcesProvider;
        ci.d dVar2 = new ci.d(context, d6Var4, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f9905b;

            {
                this.f9905b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f9905b.h.M.f(false, true);
                        return;
                    default:
                        this.f9905b.h.M.f(true, true);
                        return;
                }
            }
        });
        f7.addView(dVar2, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f9899c.addView(f7, z5.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
