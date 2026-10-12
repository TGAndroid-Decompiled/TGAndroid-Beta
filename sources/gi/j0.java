package gi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.yh;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.h71;
import w7.a6;
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
        h71 h71Var = new h71(context, i10, 0, false, tVar, uVar, null, c6Var);
        this.d = h71Var;
        h71Var.p1();
        h71 h71Var2 = this.d;
        h71Var2.W2.f31780r = false;
        h71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new ah.d0(this, 8));
        this.f10187c.addView(this.d, 0, a6.d(-1.0f, -1));
        c6Var2 = ((e3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var2);
        this.f10185a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f10185a;
        int i11 = g6.G6;
        kVar2.setTitleColor(k0Var.getThemedColor(i11));
        this.f10185a.B(k0Var.getThemedColor(g6.f20307z8), false);
        this.f10185a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f10185a.D(k0Var.getThemedColor(g6.f20290y8), false);
        this.f10185a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.f10185a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f10185a.setActionBarMenuOnItemClick(new ah.s(this, 9));
        this.f10187c.addView(this.f10185a, a6.e(-1, 56, 48));
        LinearLayout e = yh.e(context, 0);
        e.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        c6Var3 = ((e3) k0Var).resourcesProvider;
        di.d dVar = new di.d(context, c6Var3, true);
        dVar.d();
        dVar.setColor(i0.a.d(0.125f, k0Var.getThemedColor(g6.f19901d6), k0Var.getThemedColor(i11)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f10192b;

            {
                this.f10192b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f10192b.h.M.f(false, true);
                        return;
                    default:
                        this.f10192b.h.M.f(true, true);
                        return;
                }
            }
        });
        e.addView(dVar, a6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        c6Var4 = ((e3) k0Var).resourcesProvider;
        di.d dVar2 = new di.d(context, c6Var4, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f10192b;

            {
                this.f10192b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f10192b.h.M.f(false, true);
                        return;
                    default:
                        this.f10192b.h.M.f(true, true);
                        return;
                }
            }
        });
        e.addView(dVar2, a6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f10187c.addView(e, a6.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
