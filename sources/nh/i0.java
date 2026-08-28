package nh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import bg.o2;
import fh.w4;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
public final class i0 extends g0 {
    public final j0 h;

    public i0(j0 j0Var, Context context) {
        super(j0Var, context);
        int i9;
        b6 b6Var;
        b6 b6Var2;
        b6 b6Var3;
        b6 b6Var4;
        this.h = j0Var;
        i9 = ((f3) j0Var).currentAccount;
        s sVar = new s(j0Var, 5);
        t tVar = new t(j0Var, 5);
        b6Var = ((f3) j0Var).resourcesProvider;
        i51 i51Var = new i51(context, i9, 0, false, sVar, tVar, null, b6Var);
        this.d = i51Var;
        i51Var.p1();
        i51 i51Var2 = this.d;
        i51Var2.U2.f35188r = false;
        i51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new o2(this, 18));
        this.f18639c.addView(this.d, 0, e6.c(-1.0f, -1));
        b6Var2 = ((f3) j0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, b6Var2);
        this.f18637a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f18637a;
        int i10 = f6.G6;
        kVar2.setTitleColor(j0Var.getThemedColor(i10));
        this.f18637a.A(j0Var.getThemedColor(f6.f23388z8), false);
        this.f18637a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f18637a.C(j0Var.getThemedColor(f6.f23371y8), false);
        this.f18637a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.f18637a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f18637a.setActionBarMenuOnItemClick(new w4(this, 11));
        this.f18639c.addView(this.f18637a, e6.e(-1, 56, 48));
        LinearLayout f10 = ll.f(context, 0);
        f10.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        b6Var3 = ((f3) j0Var).resourcesProvider;
        kh.d dVar = new kh.d(context, b6Var3, true);
        dVar.d();
        dVar.setColor(i0.a.d(0.125f, j0Var.getThemedColor(f6.f23001d6), j0Var.getThemedColor(i10)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f18645b;

            {
                this.f18645b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f18645b.h.I.f(false, true);
                        return;
                    default:
                        this.f18645b.h.I.f(true, true);
                        return;
                }
            }
        });
        f10.addView(dVar, e6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        b6Var4 = ((f3) j0Var).resourcesProvider;
        kh.d dVar2 = new kh.d(context, b6Var4, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f18645b;

            {
                this.f18645b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f18645b.h.I.f(false, true);
                        return;
                    default:
                        this.f18645b.h.I.f(true, true);
                        return;
                }
            }
        });
        f10.addView(dVar2, e6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f18639c.addView(f10, e6.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
