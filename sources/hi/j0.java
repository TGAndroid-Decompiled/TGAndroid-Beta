package hi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
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
        s sVar = new s(k0Var, 5);
        u uVar = new u(k0Var, 5);
        d6Var = ((f3) k0Var).resourcesProvider;
        c71 c71Var = new c71(context, i10, 0, false, sVar, uVar, null, d6Var);
        this.d = c71Var;
        c71Var.p1();
        c71 c71Var2 = this.d;
        c71Var2.W2.f30864r = false;
        c71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new ah.d0(this, 12));
        this.f12155c.addView(this.d, 0, z5.c(-1.0f, -1));
        d6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var2);
        this.f12153a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f12153a;
        int i11 = h6.G6;
        kVar2.setTitleColor(k0Var.getThemedColor(i11));
        this.f12153a.B(k0Var.getThemedColor(h6.f21400z8), false);
        this.f12153a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f12153a.C(k0Var.getThemedColor(h6.f21383y8), false);
        this.f12153a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.f12153a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f12153a.setActionBarMenuOnItemClick(new ah.s(this, 10));
        this.f12155c.addView(this.f12153a, z5.e(-1, 56, 48));
        LinearLayout e = ok.e(context, 0);
        e.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        d6Var3 = ((f3) k0Var).resourcesProvider;
        ei.d dVar = new ei.d(context, d6Var3, true);
        dVar.d();
        dVar.setColor(i0.a.f(0.125f, k0Var.getThemedColor(h6.f20993d6), k0Var.getThemedColor(i11)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f12160b;

            {
                this.f12160b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f12160b.h.M.f(false, true);
                        return;
                    default:
                        this.f12160b.h.M.f(true, true);
                        return;
                }
            }
        });
        e.addView(dVar, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        d6Var4 = ((f3) k0Var).resourcesProvider;
        ei.d dVar2 = new ei.d(context, d6Var4, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f12160b;

            {
                this.f12160b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f12160b.h.M.f(false, true);
                        return;
                    default:
                        this.f12160b.h.M.f(true, true);
                        return;
                }
            }
        });
        e.addView(dVar2, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f12155c.addView(e, z5.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
