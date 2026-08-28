package gh;

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
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ak;
import org.telegram.ui.qn;
public final class ea extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public final long T;
    public final fg.a U;
    public final FrameLayout V;
    public final c00 W;
    public Runnable X;
    public final TLRPC.InputPeer Y;
    public final boolean Z;
    public z41 f8036a0;
    public boolean f8037b0;

    public ea(android.content.Context r17, org.telegram.ui.ActionBar.b6 r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: gh.ea.<init>(android.content.Context, org.telegram.ui.ActionBar.b6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void O(ea eaVar, int i9) {
        l41 G;
        z41 z41Var = eaVar.f8036a0;
        if (z41Var != null && (G = z41Var.G(i9 - 1)) != null) {
            z41 z41Var2 = eaVar.f8036a0;
            if (G.d == -1) {
                eaVar.f8037b0 = !eaVar.f8037b0;
                z41Var2.N(true);
            } else if (G.G(aa.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(eaVar.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.C1;
                }
                if (findActivity != null) {
                    v7.y(eaVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new bg.y0(4, eaVar, G), eaVar.Y);
                }
            }
        }
    }

    public static void P(ea eaVar, l41 l41Var, Boolean bool, String str) {
        if (eaVar.getContext() != null) {
            if (bool.booleanValue()) {
                new oc((FrameLayout) eaVar.containerView, eaVar.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) l41Var.B, new Object[0])), R.raw.stars_topup).j();
                eaVar.W.c(true);
                v7.y(eaVar.currentAccount, false).T(true);
            } else if (str != null) {
                org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{str}, new oc((FrameLayout) eaVar.containerView, eaVar.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    public final void Q(ArrayList arrayList, z41 z41Var) {
        long j10;
        int i9;
        int i10;
        fg.a aVar = this.U;
        arrayList.add(l41.l(aVar));
        boolean z10 = this.Z;
        if (z10) {
            org.telegram.ui.Cells.j2.l(R.string.TelegramStarsChoose, arrayList);
        }
        int i11 = 0;
        ArrayList z11 = v7.y(this.currentAccount, false).z();
        if (z10) {
            if (z11 != null && !z11.isEmpty()) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                boolean z12 = false;
                int i15 = 1;
                while (true) {
                    int size = z11.size();
                    j10 = this.T;
                    if (i12 >= size) {
                        break;
                    }
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z11.get(i12);
                    if (tL_starsTopupOption.stars >= j10) {
                        if (tL_starsTopupOption.extended && !this.f8037b0 && z12) {
                            i14++;
                        } else {
                            arrayList.add(aa.a(i12, i15, tL_starsTopupOption));
                            i13++;
                            i15++;
                            z12 = true;
                        }
                    }
                    i12++;
                }
                if (i13 < 3) {
                    arrayList.clear();
                    arrayList.add(l41.k(aVar));
                    org.telegram.ui.Cells.j2.l(R.string.TelegramStarsChoose, arrayList);
                    int i16 = 0;
                    for (int i17 = 0; i17 < z11.size(); i17++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i17);
                        if (tL_starsTopupOption2.stars >= j10) {
                            arrayList.add(aa.a(i17, i15, tL_starsTopupOption2));
                            i16++;
                            i15++;
                        }
                    }
                    if (i16 == 0) {
                        while (i11 < z11.size()) {
                            arrayList.add(aa.a(i11, i15, (TL_stars.TL_starsTopupOption) z11.get(i11)));
                            i11++;
                            i15++;
                        }
                        boolean z13 = this.f8037b0;
                        if (!z13 && i14 > 0) {
                            if (z13) {
                                i10 = R.string.NotifyLessOptions;
                            } else {
                                i10 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i10);
                            int i18 = t9.f8926a;
                            l41 J = l41.J(t9.class);
                            J.d = -1;
                            J.f30339l = string;
                            J.f30334f = !this.f8037b0;
                            J.f30344q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f8037b0 = true;
                    }
                } else if (i13 > 0) {
                    boolean z14 = this.f8037b0;
                    if (!z14 && i14 > 0) {
                        if (z14) {
                            i9 = R.string.NotifyLessOptions;
                        } else {
                            i9 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i9);
                        int i19 = t9.f8926a;
                        l41 J2 = l41.J(t9.class);
                        J2.d = -1;
                        J2.f30339l = string2;
                        J2.f30334f = !this.f8037b0;
                        J2.f30344q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i11 < z11.size()) {
                        arrayList.add(aa.a(i11, i15, (TL_stars.TL_starsTopupOption) z11.get(i11)));
                        i11++;
                        i15++;
                    }
                }
            } else {
                arrayList.add(l41.n(31));
                arrayList.add(l41.n(31));
                arrayList.add(l41.n(31));
            }
        }
        arrayList.add(l41.k(this.V));
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        Runnable runnable;
        if (i9 == NotificationCenter.starOptionsLoaded || i9 == NotificationCenter.starBalanceUpdated) {
            z41 z41Var = this.f8036a0;
            if (z41Var != null) {
                z41Var.N(true);
            }
            long j10 = v7.y(this.currentAccount, false).p().amount;
            long j11 = this.T;
            ((TextView) this.U.d).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j11 - j10)));
            org.telegram.ui.Components.pa paVar = this.f32408e;
            if (paVar != null) {
                paVar.setTitle(y());
            }
            if (j10 >= j11 && (runnable = this.X) != null) {
                runnable.run();
                this.X = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        fg.a aVar = this.U;
        if (aVar != null) {
            ((ag.j) aVar.f6274b).setPaused(true);
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
        ak akVar;
        if (!this.Z) {
            org.telegram.messenger.l0.p(R.string.PaymentInvoiceDisabledStarsText, new oc(org.telegram.ui.Components.cb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (v7.y(this.currentAccount, false).p().amount >= this.T) {
            Runnable runnable = this.X;
            if (runnable != null) {
                runnable.run();
                this.X = null;
            }
        } else {
            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
            if (R instanceof qn) {
                qn qnVar = (qn) R;
                if (qnVar.x9() && (akVar = qnVar.U) != null) {
                    akVar.O();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.currentAccount, 0, true, new bh.c(this, 20), this.resourcesProvider);
        this.f8036a0 = z41Var;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        fg.a aVar = this.U;
        if (aVar == null) {
            return null;
        }
        return ((TextView) aVar.d).getText();
    }
}
