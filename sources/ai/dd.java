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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gk;
import org.telegram.ui.sn;
public final class dd extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final cd Y;
    public final FrameLayout Z;
    public final z00 f1158a0;
    public Runnable f1159b0;
    public final TLRPC.InputPeer f1160c0;
    public final boolean f1161d0;
    public b71 f1162e0;
    public boolean f1163f0;

    public dd(android.content.Context r17, org.telegram.ui.ActionBar.g6 r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: ai.dd.<init>(android.content.Context, org.telegram.ui.ActionBar.g6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void P(dd ddVar, int i10) {
        m61 G;
        b71 b71Var = ddVar.f1162e0;
        if (b71Var != null && (G = b71Var.G(i10 - 1)) != null) {
            b71 b71Var2 = ddVar.f1162e0;
            if (G.d == -1) {
                ddVar.f1163f0 = !ddVar.f1163f0;
                b71Var2.N(true);
            } else if (G.G(yc.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(ddVar.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.J1;
                }
                if (findActivity != null) {
                    ha.y(ddVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new r5(2, ddVar, G), ddVar.f1160c0);
                }
            }
        }
    }

    public static void Q(dd ddVar, m61 m61Var, Boolean bool, String str) {
        if (ddVar.getContext() != null) {
            if (bool.booleanValue()) {
                new org.telegram.ui.Components.xc((FrameLayout) ddVar.containerView, ddVar.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) m61Var.B, new Object[0])), R.raw.stars_topup).j();
                ddVar.f1158a0.c(true);
                ha.y(ddVar.currentAccount, false).T(true);
            } else if (str != null) {
                i2.o1.t(R.string.UnknownErrorCode, new Object[]{str}, new org.telegram.ui.Components.xc((FrameLayout) ddVar.containerView, ddVar.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    public final void R(ArrayList arrayList, b71 b71Var) {
        long j10;
        int i10;
        int i11;
        cd cdVar = this.Y;
        arrayList.add(m61.l(cdVar));
        boolean z10 = this.f1161d0;
        if (z10) {
            i2.o1.q(R.string.TelegramStarsChoose, arrayList);
        }
        int i12 = 0;
        ArrayList z11 = ha.y(this.currentAccount, false).z();
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
                        if (tL_starsTopupOption.extended && !this.f1163f0 && z12) {
                            i16++;
                        } else {
                            arrayList.add(yc.a(i14, i13, tL_starsTopupOption));
                            i15++;
                            i13++;
                            z12 = true;
                        }
                    }
                    i14++;
                }
                if (i15 < 3) {
                    arrayList.clear();
                    arrayList.add(m61.k(cdVar));
                    i2.o1.q(R.string.TelegramStarsChoose, arrayList);
                    int i17 = 0;
                    for (int i18 = 0; i18 < z11.size(); i18++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i18);
                        if (tL_starsTopupOption2.stars >= j10) {
                            arrayList.add(yc.a(i18, i13, tL_starsTopupOption2));
                            i17++;
                            i13++;
                        }
                    }
                    if (i17 == 0) {
                        while (i12 < z11.size()) {
                            arrayList.add(yc.a(i12, i13, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                            i12++;
                            i13++;
                        }
                        boolean z13 = this.f1163f0;
                        if (!z13 && i16 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = rc.f2138a;
                            m61 J = m61.J(rc.class);
                            J.d = -1;
                            J.f28559l = string;
                            J.f28554f = !this.f1163f0;
                            J.f28564q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f1163f0 = true;
                    }
                } else if (i15 > 0) {
                    boolean z14 = this.f1163f0;
                    if (!z14 && i16 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = rc.f2138a;
                        m61 J2 = m61.J(rc.class);
                        J2.d = -1;
                        J2.f28559l = string2;
                        J2.f28554f = !this.f1163f0;
                        J2.f28564q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i12 < z11.size()) {
                        arrayList.add(yc.a(i12, i13, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                        i12++;
                        i13++;
                    }
                }
            } else {
                arrayList.add(m61.n(31));
                arrayList.add(m61.n(31));
                arrayList.add(m61.n(31));
            }
        }
        arrayList.add(m61.k(this.Z));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            b71 b71Var = this.f1162e0;
            if (b71Var != null) {
                b71Var.N(true);
            }
            long j10 = ha.y(this.currentAccount, false).p().amount;
            long j11 = this.X;
            ((TextView) this.Y.f1112b).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j11 - j10)));
            org.telegram.ui.Components.xa xaVar = this.e;
            if (xaVar != null) {
                xaVar.setTitle(z());
            }
            if (j10 >= j11 && (runnable = this.f1159b0) != null) {
                runnable.run();
                this.f1159b0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        cd cdVar = this.Y;
        if (cdVar != null) {
            ((tg.n) cdVar.f1113c).setPaused(true);
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
        gk gkVar;
        if (!this.f1161d0) {
            org.telegram.messenger.v0.p(R.string.PaymentInvoiceDisabledStarsText, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (ha.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.f1159b0;
            if (runnable != null) {
                runnable.run();
                this.f1159b0 = null;
            }
        } else {
            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
            if (R instanceof sn) {
                sn snVar = (sn) R;
                if (snVar.C9() && (gkVar = snVar.Y) != null) {
                    gkVar.M();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    @Override
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(this.d, getContext(), this.currentAccount, 0, true, new q(this, 8), this.resourcesProvider);
        this.f1162e0 = b71Var;
        return b71Var;
    }

    @Override
    public final CharSequence z() {
        cd cdVar = this.Y;
        if (cdVar == null) {
            return null;
        }
        return ((TextView) cdVar.f1112b).getText();
    }
}
