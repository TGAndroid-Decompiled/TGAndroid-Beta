package bi;

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
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hk;
import org.telegram.ui.un;
public final class tc extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final sc Y;
    public final FrameLayout Z;
    public final z00 f5483a0;
    public Runnable f5484b0;
    public final TLRPC.InputPeer f5485c0;
    public final boolean f5486d0;
    public j71 f5487e0;
    public boolean f5488f0;

    public tc(android.content.Context r17, org.telegram.ui.ActionBar.u6 r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: bi.tc.<init>(android.content.Context, org.telegram.ui.ActionBar.u6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void P(tc tcVar, int i10) {
        t61 G;
        j71 j71Var = tcVar.f5487e0;
        if (j71Var != null && (G = j71Var.G(i10 - 1)) != null) {
            j71 j71Var2 = tcVar.f5487e0;
            if (G.d == -1) {
                tcVar.f5488f0 = !tcVar.f5488f0;
                j71Var2.O(true);
            } else if (G.H(oc.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(tcVar.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.I1;
                }
                if (findActivity != null) {
                    ca.y(tcVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new m5(2, tcVar, G), tcVar.f5485c0);
                }
            }
        }
    }

    public static void Q(tc tcVar, t61 t61Var, Boolean bool, String str) {
        if (tcVar.getContext() != null) {
            if (bool.booleanValue()) {
                new org.telegram.ui.Components.wc((FrameLayout) tcVar.containerView, tcVar.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) t61Var.B, new Object[0])), R.raw.stars_topup).j();
                tcVar.f5483a0.c(true);
                ca.y(tcVar.currentAccount, false).T(true);
            } else if (str != null) {
                ic.a.s(R.string.UnknownErrorCode, new Object[]{str}, new org.telegram.ui.Components.wc((FrameLayout) tcVar.containerView, tcVar.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    public final void R(ArrayList arrayList, j71 j71Var) {
        long j10;
        int i10;
        int i11;
        sc scVar = this.Y;
        arrayList.add(t61.m(scVar));
        boolean z10 = this.f5486d0;
        if (z10) {
            ic.a.p(R.string.TelegramStarsChoose, arrayList);
        }
        int i12 = 0;
        ArrayList z11 = ca.y(this.currentAccount, false).z();
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
                        if (tL_starsTopupOption.extended && !this.f5488f0 && z12) {
                            i16++;
                        } else {
                            arrayList.add(oc.a(i14, i13, tL_starsTopupOption));
                            i15++;
                            i13++;
                            z12 = true;
                        }
                    }
                    i14++;
                }
                if (i15 < 3) {
                    arrayList.clear();
                    arrayList.add(t61.k(scVar));
                    ic.a.p(R.string.TelegramStarsChoose, arrayList);
                    int i17 = 0;
                    for (int i18 = 0; i18 < z11.size(); i18++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i18);
                        if (tL_starsTopupOption2.stars >= j10) {
                            arrayList.add(oc.a(i18, i13, tL_starsTopupOption2));
                            i17++;
                            i13++;
                        }
                    }
                    if (i17 == 0) {
                        while (i12 < z11.size()) {
                            arrayList.add(oc.a(i12, i13, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                            i12++;
                            i13++;
                        }
                        boolean z13 = this.f5488f0;
                        if (!z13 && i16 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = ic.f4848a;
                            t61 K = t61.K(ic.class);
                            K.d = -1;
                            K.f32872l = string;
                            K.f32867f = !this.f5488f0;
                            K.f32877q = true;
                            arrayList.add(K);
                        }
                    } else {
                        this.f5488f0 = true;
                    }
                } else if (i15 > 0) {
                    boolean z14 = this.f5488f0;
                    if (!z14 && i16 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = ic.f4848a;
                        t61 K2 = t61.K(ic.class);
                        K2.d = -1;
                        K2.f32872l = string2;
                        K2.f32867f = !this.f5488f0;
                        K2.f32877q = true;
                        arrayList.add(K2);
                    }
                } else {
                    while (i12 < z11.size()) {
                        arrayList.add(oc.a(i12, i13, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                        i12++;
                        i13++;
                    }
                }
            } else {
                arrayList.add(t61.p(31));
                arrayList.add(t61.p(31));
                arrayList.add(t61.p(31));
            }
        }
        arrayList.add(t61.k(this.Z));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            j71 j71Var = this.f5487e0;
            if (j71Var != null) {
                j71Var.O(true);
            }
            long j10 = ca.y(this.currentAccount, false).p().amount;
            long j11 = this.X;
            ((TextView) this.Y.f5423b).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j11 - j10)));
            org.telegram.ui.Components.xa xaVar = this.e;
            if (xaVar != null) {
                xaVar.setTitle(y());
            }
            if (j10 >= j11 && (runnable = this.f5484b0) != null) {
                runnable.run();
                this.f5484b0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        sc scVar = this.Y;
        if (scVar != null) {
            ((ug.n) scVar.f5424c).setPaused(true);
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
        if (!this.f5486d0) {
            org.telegram.messenger.t.q(R.string.PaymentInvoiceDisabledStarsText, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (ca.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.f5484b0;
            if (runnable != null) {
                runnable.run();
                this.f5484b0 = null;
            }
        } else {
            org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
            if (R instanceof un) {
                un unVar = (un) R;
                if (unVar.F9() && (hkVar = unVar.Y) != null) {
                    hkVar.M();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(this.d, getContext(), this.currentAccount, 0, true, new ai.e(this, 11), this.resourcesProvider);
        this.f5487e0 = j71Var;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        sc scVar = this.Y;
        if (scVar == null) {
            return null;
        }
        return ((TextView) scVar.f5423b).getText();
    }
}
