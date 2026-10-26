package ii;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.ActionBar.z6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.r71;
public final class i0 extends g0 {
    public final j0 h;

    public i0(j0 j0Var, Context context) {
        super(j0Var, context);
        int i10;
        u6 u6Var;
        u6 u6Var2;
        u6 u6Var3;
        u6 u6Var4;
        u6 u6Var5;
        u6 u6Var6;
        u6 u6Var7;
        u6 u6Var8;
        this.h = j0Var;
        i10 = ((k3) j0Var).currentAccount;
        s sVar = new s(j0Var, 5);
        t tVar = new t(j0Var, 5);
        u6Var = ((k3) j0Var).resourcesProvider;
        r71 r71Var = new r71(context, i10, 0, false, sVar, tVar, null, u6Var);
        this.d = r71Var;
        r71Var.u1();
        r71 r71Var2 = this.d;
        r71Var2.f32152g3.f29507r = false;
        r71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.d.j(new ai.b(this, 16));
        this.f14349c.addView(this.d, 0, gb1.g(-1.0f, -1));
        u6Var2 = ((k3) j0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, u6Var2);
        this.f14347a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f14347a;
        int i11 = y6.G6;
        u6Var3 = ((k3) j0Var).resourcesProvider;
        f7.m(kVar2, 5, i11, u6Var3);
        org.telegram.ui.ActionBar.k kVar3 = this.f14347a;
        int i12 = y6.f23769z8;
        u6Var4 = ((k3) j0Var).resourcesProvider;
        f7.m(kVar3, 3, i12, u6Var4);
        this.f14347a.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar4 = this.f14347a;
        int i13 = y6.f23750y8;
        u6Var5 = ((k3) j0Var).resourcesProvider;
        f7.m(kVar4, 1, i13, u6Var5);
        this.f14347a.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
        this.f14347a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f14347a.setActionBarMenuOnItemClick(new bh.m(this, 10));
        this.f14349c.addView(this.f14347a, gb1.i(-1, 56, 48));
        LinearLayout d = vh.d(context, 0);
        d.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        u6Var6 = ((k3) j0Var).resourcesProvider;
        fi.d dVar = new fi.d(context, u6Var6, true);
        dVar.e();
        int i14 = y6.f23356d6;
        dVar.setColor(i0.a.f(0.125f, j0Var.getThemedColor(i14), j0Var.getThemedColor(i11)));
        dVar.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        dVar.f();
        if (dVar.getBackground() != null) {
            Drawable background = dVar.getBackground();
            u6Var8 = ((k3) j0Var).resourcesProvider;
            dVar.setBackground(background);
            a7 p10 = f7.p(dVar, true);
            p10.d = background;
            p10.e = null;
            p10.f22422f = null;
            if (background != null) {
                z6 z6Var = new z6();
                p10.e = z6Var;
                z6Var.c(i14, i11, 3, 0.125f, u6Var8);
                z6Var.f23803g = f7.u(background);
            }
        }
        dVar.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f14354b;

            {
                this.f14354b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14354b.h.M.f(false, true);
                        return;
                    default:
                        this.f14354b.h.M.f(true, true);
                        return;
                }
            }
        });
        d.addView(dVar, gb1.t(0, 48, 1.0f, 0, 4, 0, 4, 0));
        u6Var7 = ((k3) j0Var).resourcesProvider;
        fi.d dVar2 = new fi.d(context, u6Var7, true);
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        dVar2.f();
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final i0 f14354b;

            {
                this.f14354b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14354b.h.M.f(false, true);
                        return;
                    default:
                        this.f14354b.h.M.f(true, true);
                        return;
                }
            }
        });
        d.addView(dVar2, gb1.t(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f14349c.addView(d, gb1.j(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
        a();
    }
}
