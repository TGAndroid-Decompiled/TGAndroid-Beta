package hi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.tl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.i71;
import w7.z5;
public final class j0 extends h0 {
    public final k0 h;

    public j0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        g6 g6Var;
        g6 g6Var2;
        g6 g6Var3;
        g6 g6Var4;
        g6 g6Var5;
        g6 g6Var6;
        g6 g6Var7;
        g6 g6Var8;
        this.h = k0Var;
        i10 = ((h3) k0Var).currentAccount;
        s sVar = new s(k0Var, 5);
        u uVar = new u(k0Var, 5);
        g6Var = ((h3) k0Var).resourcesProvider;
        i71 i71Var = new i71(context, i10, 0, false, sVar, uVar, null, g6Var);
        this.d = i71Var;
        i71Var.t1();
        i71 i71Var2 = this.d;
        i71Var2.Z2.f24646r = false;
        i71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new ah.d0(this, 12));
        this.f12186c.addView(this.d, 0, z5.c(-1.0f, -1));
        g6Var2 = ((h3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var2);
        this.f12184a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f12184a;
        int i11 = k6.G6;
        g6Var3 = ((h3) k0Var).resourcesProvider;
        r6.m(kVar2, 5, i11, g6Var3);
        org.telegram.ui.ActionBar.k kVar3 = this.f12184a;
        int i12 = k6.f21591z8;
        g6Var4 = ((h3) k0Var).resourcesProvider;
        r6.m(kVar3, 3, i12, g6Var4);
        this.f12184a.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar4 = this.f12184a;
        int i13 = k6.f21574y8;
        g6Var5 = ((h3) k0Var).resourcesProvider;
        r6.m(kVar4, 1, i13, g6Var5);
        this.f12184a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.f12184a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f12184a.setActionBarMenuOnItemClick(new ah.s(this, 10));
        this.f12186c.addView(this.f12184a, z5.e(-1, 56, 48));
        LinearLayout e = tl.e(context, 0);
        e.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        g6Var6 = ((h3) k0Var).resourcesProvider;
        ei.d dVar = new ei.d(context, g6Var6, true);
        dVar.e();
        int i14 = k6.f21184d6;
        dVar.setColor(i0.a.f(0.125f, k0Var.getThemedColor(i14), k0Var.getThemedColor(i11)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.f();
        if (dVar.getBackground() != null) {
            Drawable background = dVar.getBackground();
            g6Var8 = ((h3) k0Var).resourcesProvider;
            dVar.setBackground(background);
            m6 p5 = r6.p(dVar, true);
            p5.d = background;
            p5.e = null;
            p5.f21646f = null;
            if (background != null) {
                l6 l6Var = new l6();
                p5.e = l6Var;
                l6Var.c(i14, i11, 3, 0.125f, g6Var8);
                l6Var.f21614g = r6.v(background);
            }
        }
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f12191b;

            {
                this.f12191b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f12191b.h.M.f(false, true);
                        return;
                    default:
                        this.f12191b.h.M.f(true, true);
                        return;
                }
            }
        });
        e.addView(dVar, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        g6Var7 = ((h3) k0Var).resourcesProvider;
        ei.d dVar2 = new ei.d(context, g6Var7, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.f();
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f12191b;

            {
                this.f12191b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f12191b.h.M.f(false, true);
                        return;
                    default:
                        this.f12191b.h.M.f(true, true);
                        return;
                }
            }
        });
        e.addView(dVar2, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f12186c.addView(e, z5.f(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
