package ai;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hk;
import org.telegram.ui.sn;
public final class cd extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout X;
    public s61 Y;
    public boolean Z;

    public cd(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, false, false, d6Var);
        im0 im0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        im0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new va(this, 3));
        s4.k kVar = new s4.k();
        kVar.f45972m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        int i11 = org.telegram.ui.ActionBar.h6.f20986d6;
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        this.e.setTitle(LocaleController.getString(R.string.StarsBuy));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        x90 x90Var = new x90(context, d6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        x90Var.setTextSize(1, 12.0f);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B6, d6Var));
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, d6Var));
        x90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new a3.d(this, 25)));
        x90Var.setGravity(17);
        x90Var.setMaxWidth(ei.x3.a(x90Var.getText(), x90Var.getPaint()));
        frameLayout.addView(x90Var, w7.z5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21057h5, d6Var));
        this.containerView.addView(new z00(getContext()), w7.z5.d(-1.0f, -1));
        s61 s61Var = this.Y;
        if (s61Var != null) {
            s61Var.N(false);
        }
    }

    public static void Q(cd cdVar, int i10) {
        f61 G;
        s61 s61Var = cdVar.Y;
        if (s61Var != null && (G = s61Var.G(i10 - 1)) != null) {
            s61 s61Var2 = cdVar.Y;
            if (G.d == -1) {
                cdVar.Z = !cdVar.Z;
                s61Var2.N(true);
                cdVar.d.v0(0, AndroidUtilities.dp(300.0f), null);
            } else if (G.G(wc.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(cdVar.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.H1;
                }
                if (findActivity != null) {
                    fa.y(cdVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new q5(3, cdVar, G), null);
                }
            }
        }
    }

    public static void R(cd cdVar, f61 f61Var, Boolean bool, String str) {
        if (cdVar.getContext() != null) {
            cdVar.dismiss();
            fa.y(cdVar.currentAccount, false).T(true);
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                if (bool.booleanValue()) {
                    org.telegram.ui.Components.xc.a0(U).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) f61Var.B, new Object[0])), R.raw.stars_topup).j();
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null) {
                        launchActivity.f33187x0.c(true);
                    }
                } else if (str != null) {
                    i0.a.s(R.string.UnknownErrorCode, new Object[]{str}, org.telegram.ui.Components.xc.a0(U), R.raw.error, 36);
                }
            }
        }
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.StarsBuy);
    }

    public final void S(ArrayList arrayList, s61 s61Var) {
        int i10;
        i0.a.p(R.string.TelegramStarsChoose, arrayList);
        ArrayList z10 = fa.y(this.currentAccount, false).z();
        if (z10 != null && !z10.isEmpty()) {
            int i11 = 0;
            int i12 = 1;
            for (int i13 = 0; i13 < z10.size(); i13++) {
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i13);
                if (tL_starsTopupOption.extended && !this.Z) {
                    i11++;
                } else {
                    arrayList.add(wc.a(i13, i12, tL_starsTopupOption));
                    i12++;
                }
            }
            boolean z11 = this.Z;
            if (!z11 && i11 > 0) {
                if (z11) {
                    i10 = R.string.NotifyLessOptions;
                } else {
                    i10 = R.string.NotifyMoreOptions;
                }
                String string = LocaleController.getString(i10);
                int i14 = pc.f2037a;
                f61 J = f61.J(pc.class);
                J.d = -1;
                J.f26140l = string;
                J.f26135f = !this.Z;
                J.f26145q = true;
                arrayList.add(J);
            }
        } else {
            arrayList.add(f61.n(31));
            arrayList.add(f61.n(31));
            arrayList.add(f61.n(31));
            arrayList.add(f61.n(31));
            arrayList.add(f61.n(31));
        }
        arrayList.add(f61.k(this.X));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s61 s61Var;
        if ((i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (s61Var = this.Y) != null) {
            s61Var.N(true);
        }
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final void show() {
        hk hkVar;
        long j10 = fa.y(this.currentAccount, false).p().amount;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R instanceof sn) {
            sn snVar = (sn) R;
            if (snVar.C9() && (hkVar = snVar.Y) != null) {
                hkVar.N();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override
    public final hm0 x(im0 im0Var) {
        s61 s61Var = new s61(this.d, getContext(), this.currentAccount, 0, true, new q(this, 9), this.resourcesProvider);
        this.Y = s61Var;
        s61Var.f30200r = false;
        return s61Var;
    }
}
