package gi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vl;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d61;
import w7.x5;
public final class j0 extends h0 {
    public final k0 h;

    public j0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        f6 f6Var;
        f6 f6Var2;
        f6 f6Var3;
        f6 f6Var4;
        this.h = k0Var;
        i10 = ((f3) k0Var).currentAccount;
        t tVar = new t(k0Var, 5);
        u uVar = new u(k0Var, 5);
        f6Var = ((f3) k0Var).resourcesProvider;
        d61 d61Var = new d61(context, i10, 0, false, tVar, uVar, null, f6Var);
        this.d = d61Var;
        d61Var.o1();
        d61 d61Var2 = this.d;
        d61Var2.Y2.f31135r = false;
        d61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new ah.e0(this, 9));
        this.f10694c.addView(this.d, 0, x5.c(-1.0f, -1));
        f6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var2);
        this.f10692a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f10692a;
        int i11 = j6.G6;
        kVar2.setTitleColor(k0Var.getThemedColor(i11));
        this.f10692a.B(k0Var.getThemedColor(j6.f21063z8), false);
        this.f10692a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f10692a.C(k0Var.getThemedColor(j6.f21044y8), false);
        this.f10692a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.f10692a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f10692a.setActionBarMenuOnItemClick(new ah.t(this, 9));
        this.f10694c.addView(this.f10692a, x5.e(-1, 56, 48));
        LinearLayout f7 = vl.f(context, 0);
        f7.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        f6Var3 = ((f3) k0Var).resourcesProvider;
        di.d dVar = new di.d(context, f6Var3, true);
        dVar.d();
        dVar.setColor(i0.a.d(0.125f, k0Var.getThemedColor(j6.f20663d6), k0Var.getThemedColor(i11)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f10700b;

            {
                this.f10700b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f10700b.h.M.f(false, true);
                        return;
                    default:
                        this.f10700b.h.M.f(true, true);
                        return;
                }
            }
        });
        f7.addView(dVar, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        f6Var4 = ((f3) k0Var).resourcesProvider;
        di.d dVar2 = new di.d(context, f6Var4, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f10700b;

            {
                this.f10700b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f10700b.h.M.f(false, true);
                        return;
                    default:
                        this.f10700b.h.M.f(true, true);
                        return;
                }
            }
        });
        f7.addView(dVar2, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f10694c.addView(f7, x5.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
