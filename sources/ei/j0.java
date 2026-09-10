package ei;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import bi.a2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.r61;
import w7.a6;
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
        i10 = ((h3) k0Var).currentAccount;
        t tVar = new t(k0Var, 5);
        u uVar = new u(k0Var, 5);
        f6Var = ((h3) k0Var).resourcesProvider;
        r61 r61Var = new r61(context, i10, 0, false, tVar, uVar, null, f6Var);
        this.d = r61Var;
        r61Var.o1();
        r61 r61Var2 = this.d;
        r61Var2.Y2.f24250r = false;
        r61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new a2(this, 6));
        this.f7556c.addView(this.d, 0, a6.c(-1.0f, -1));
        f6Var2 = ((h3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, f6Var2);
        this.f7554a = lVar;
        lVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.l lVar2 = this.f7554a;
        int i11 = j6.G6;
        lVar2.setTitleColor(k0Var.getThemedColor(i11));
        this.f7554a.A(k0Var.getThemedColor(j6.f18327z8), false);
        this.f7554a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f7554a.C(k0Var.getThemedColor(j6.f18308y8), false);
        this.f7554a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.f7554a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f7554a.setActionBarMenuOnItemClick(new di.w(this, 8));
        this.f7556c.addView(this.f7554a, a6.e(-1, 56, 48));
        LinearLayout f7 = em.f(context, 0);
        f7.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        f6Var3 = ((h3) k0Var).resourcesProvider;
        bi.d dVar = new bi.d(context, f6Var3, true);
        dVar.d();
        dVar.setColor(i0.a.d(0.125f, k0Var.getThemedColor(j6.f17928d6), k0Var.getThemedColor(i11)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f7561b;

            {
                this.f7561b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f7561b.h.M.f(false, true);
                        return;
                    default:
                        this.f7561b.h.M.f(true, true);
                        return;
                }
            }
        });
        f7.addView(dVar, a6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        f6Var4 = ((h3) k0Var).resourcesProvider;
        bi.d dVar2 = new bi.d(context, f6Var4, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f7561b;

            {
                this.f7561b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f7561b.h.M.f(false, true);
                        return;
                    default:
                        this.f7561b.h.M.f(true, true);
                        return;
                }
            }
        });
        f7.addView(dVar2, a6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f7556c.addView(f7, a6.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
