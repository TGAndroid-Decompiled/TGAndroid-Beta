package ai;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hk;
import org.telegram.ui.sn;
public final class bd extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final ad Y;
    public final FrameLayout Z;
    public final z00 f1052a0;
    public Runnable f1053b0;
    public final TLRPC.InputPeer f1054c0;
    public final boolean f1055d0;
    public s61 f1056e0;
    public boolean f1057f0;

    public bd(android.content.Context r17, org.telegram.ui.ActionBar.d6 r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: ai.bd.<init>(android.content.Context, org.telegram.ui.ActionBar.d6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void Q(bd bdVar, int i10) {
        f61 G;
        s61 s61Var = bdVar.f1056e0;
        if (s61Var != null && (G = s61Var.G(i10 - 1)) != null) {
            s61 s61Var2 = bdVar.f1056e0;
            if (G.d == -1) {
                bdVar.f1057f0 = !bdVar.f1057f0;
                s61Var2.N(true);
            } else if (G.G(wc.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(bdVar.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.H1;
                }
                if (findActivity != null) {
                    fa.y(bdVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new q5(2, bdVar, G), bdVar.f1054c0);
                }
            }
        }
    }

    public static void R(bd bdVar, f61 f61Var, Boolean bool, String str) {
        if (bdVar.getContext() != null) {
            if (bool.booleanValue()) {
                new org.telegram.ui.Components.xc((FrameLayout) bdVar.containerView, bdVar.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) f61Var.B, new Object[0])), R.raw.stars_topup).j();
                bdVar.f1052a0.c(true);
                fa.y(bdVar.currentAccount, false).T(true);
            } else if (str != null) {
                i0.a.s(R.string.UnknownErrorCode, new Object[]{str}, new org.telegram.ui.Components.xc((FrameLayout) bdVar.containerView, bdVar.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    @Override
    public final CharSequence A() {
        ad adVar = this.Y;
        if (adVar == null) {
            return null;
        }
        return ((TextView) adVar.f981b).getText();
    }

    public final void S(ArrayList arrayList, s61 s61Var) {
        long j10;
        int i10;
        int i11;
        ad adVar = this.Y;
        arrayList.add(f61.l(adVar));
        boolean z10 = this.f1055d0;
        if (z10) {
            i0.a.p(R.string.TelegramStarsChoose, arrayList);
        }
        int i12 = 0;
        ArrayList z11 = fa.y(this.currentAccount, false).z();
        if (z10) {
            if (z11 != null && !z11.isEmpty()) {
                int i13 = 1;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                boolean z12 = false;
                while (true) {
                    int size = z11.size();
                    j10 = this.X;
                    if (i14 >= size) {
                        break;
                    }
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z11.get(i14);
                    if (tL_starsTopupOption.stars >= j10) {
                        if (tL_starsTopupOption.extended && !this.f1057f0 && z12) {
                            i16++;
                        } else {
                            arrayList.add(wc.a(i14, i13, tL_starsTopupOption));
                            i15++;
                            i13++;
                            z12 = true;
                        }
                    }
                    i14++;
                }
                if (i15 < 3) {
                    arrayList.clear();
                    arrayList.add(f61.k(adVar));
                    i0.a.p(R.string.TelegramStarsChoose, arrayList);
                    int i17 = 0;
                    for (int i18 = 0; i18 < z11.size(); i18++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i18);
                        if (tL_starsTopupOption2.stars >= j10) {
                            arrayList.add(wc.a(i18, i13, tL_starsTopupOption2));
                            i17++;
                            i13++;
                        }
                    }
                    if (i17 == 0) {
                        while (i12 < z11.size()) {
                            arrayList.add(wc.a(i12, i13, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                            i12++;
                            i13++;
                        }
                        boolean z13 = this.f1057f0;
                        if (!z13 && i16 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = pc.f2037a;
                            f61 J = f61.J(pc.class);
                            J.d = -1;
                            J.f26140l = string;
                            J.f26135f = !this.f1057f0;
                            J.f26145q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f1057f0 = true;
                    }
                } else if (i15 > 0) {
                    boolean z14 = this.f1057f0;
                    if (!z14 && i16 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = pc.f2037a;
                        f61 J2 = f61.J(pc.class);
                        J2.d = -1;
                        J2.f26140l = string2;
                        J2.f26135f = !this.f1057f0;
                        J2.f26145q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i12 < z11.size()) {
                        arrayList.add(wc.a(i12, i13, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                        i12++;
                        i13++;
                    }
                }
            } else {
                arrayList.add(f61.n(31));
                arrayList.add(f61.n(31));
                arrayList.add(f61.n(31));
            }
        }
        arrayList.add(f61.k(this.Z));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            s61 s61Var = this.f1056e0;
            if (s61Var != null) {
                s61Var.N(true);
            }
            long j10 = fa.y(this.currentAccount, false).p().amount;
            long j11 = this.X;
            ((TextView) this.Y.f981b).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j11 - j10)));
            org.telegram.ui.Components.xa xaVar = this.e;
            if (xaVar != null) {
                xaVar.setTitle(A());
            }
            if (j10 >= j11 && (runnable = this.f1053b0) != null) {
                runnable.run();
                this.f1053b0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ad adVar = this.Y;
        if (adVar != null) {
            ((tg.n) adVar.f982c).setPaused(true);
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
        if (!this.f1055d0) {
            org.telegram.messenger.q.q(R.string.PaymentInvoiceDisabledStarsText, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (fa.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.f1053b0;
            if (runnable != null) {
                runnable.run();
                this.f1053b0 = null;
            }
        } else {
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
    }

    @Override
    public final hm0 x(im0 im0Var) {
        s61 s61Var = new s61(this.d, getContext(), this.currentAccount, 0, true, new q(this, 8), this.resourcesProvider);
        this.f1056e0 = s61Var;
        return s61Var;
    }
}
