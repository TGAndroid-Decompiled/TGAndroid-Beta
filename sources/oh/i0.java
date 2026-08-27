package oh;

import ag.e2;
import ag.z2;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y1;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k51;

public final class i0 extends g0 {
    public final j0 h;

    public i0(j0 j0Var, Context context) {
        super(j0Var, context);
        this.h = j0Var;
        int i10 = 5;
        k51 k51Var = new k51(context, ((e3) j0Var).currentAccount, 0, false, new s(j0Var, i10), new t(j0Var, i10), null, ((e3) j0Var).resourcesProvider);
        this.d = k51Var;
        k51Var.p1();
        k51 k51Var2 = this.d;
        k51Var2.U2.f26942r = false;
        k51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new z2(this, 19));
        this.f19488c.addView(this.d, 0, z5.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, ((e3) j0Var).resourcesProvider);
        this.f19486a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f19486a;
        int i11 = g6.G6;
        kVar2.setTitleColor(j0Var.getThemedColor(i11));
        this.f19486a.C(j0Var.getThemedColor(g6.f23443z8), false);
        this.f19486a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f19486a.D(j0Var.getThemedColor(g6.f23425y8), false);
        this.f19486a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.f19486a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f19486a.setActionBarMenuOnItemClick(new e2(this, 12));
        this.f19488c.addView(this.f19486a, z5.e(-1, 56, 48));
        LinearLayout linearLayoutG = y1.g(context, 0);
        linearLayoutG.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        lh.d dVar = new lh.d(context, ((e3) j0Var).resourcesProvider, true);
        dVar.d();
        dVar.setColor(i0.b.d(0.125f, j0Var.getThemedColor(g6.f23053d6), j0Var.getThemedColor(i11)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.e();
        final int i12 = 0;
        dVar.setOnClickListener(new View.OnClickListener(this) {

            public final i0 f19494b;

            {
                this.f19494b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f19494b.h.I.f(false, true);
                        break;
                    default:
                        this.f19494b.h.I.f(true, true);
                        break;
                }
            }
        });
        linearLayoutG.addView(dVar, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        lh.d dVar2 = new lh.d(context, ((e3) j0Var).resourcesProvider, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.e();
        final int i13 = 1;
        dVar2.setOnClickListener(new View.OnClickListener(this) {

            public final i0 f19494b;

            {
                this.f19494b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f19494b.h.I.f(false, true);
                        break;
                    default:
                        this.f19494b.h.I.f(true, true);
                        break;
                }
            }
        });
        linearLayoutG.addView(dVar2, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f19488c.addView(linearLayoutG, z5.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
