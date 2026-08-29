package jh;

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
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dk;
import org.telegram.ui.th;
import org.telegram.ui.tn;
public final class y9 extends org.telegram.ui.Components.xa implements NotificationCenter.NotificationCenterDelegate {
    public final long T;
    public final ig.a U;
    public final FrameLayout V;
    public final n00 W;
    public Runnable X;
    public final TLRPC.InputPeer Y;
    public final boolean Z;
    public k51 f13137a0;
    public boolean f13138b0;

    public y9(android.content.Context r17, org.telegram.ui.ActionBar.c6 r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: jh.y9.<init>(android.content.Context, org.telegram.ui.ActionBar.c6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void P(y9 y9Var, int i10) {
        w41 G;
        k51 k51Var = y9Var.f13137a0;
        if (k51Var != null && (G = k51Var.G(i10 - 1)) != null) {
            k51 k51Var2 = y9Var.f13137a0;
            if (G.d == -1) {
                y9Var.f13138b0 = !y9Var.f13138b0;
                k51Var2.N(true);
            } else if (G.G(u9.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(y9Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.C1;
                }
                if (findActivity != null) {
                    s7.y(y9Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new bh.v(5, y9Var, G), y9Var.Y);
                }
            }
        }
    }

    public static void Q(y9 y9Var, w41 w41Var, Boolean bool, String str) {
        if (y9Var.getContext() != null) {
            if (bool.booleanValue()) {
                new tc((FrameLayout) y9Var.containerView, y9Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) w41Var.B, new Object[0])), R.raw.stars_topup).j();
                y9Var.W.c(true);
                s7.y(y9Var.currentAccount, false).T(true);
            } else if (str != null) {
                th.r(R.string.UnknownErrorCode, new Object[]{str}, new tc((FrameLayout) y9Var.containerView, y9Var.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    public final void R(ArrayList arrayList, k51 k51Var) {
        long j10;
        int i10;
        int i11;
        ig.a aVar = this.U;
        arrayList.add(w41.l(aVar));
        boolean z10 = this.Z;
        if (z10) {
            th.p(R.string.TelegramStarsChoose, arrayList);
        }
        int i12 = 0;
        ArrayList z11 = s7.y(this.currentAccount, false).z();
        if (z10) {
            if (z11 != null && !z11.isEmpty()) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                boolean z12 = false;
                int i16 = 1;
                while (true) {
                    int size = z11.size();
                    j10 = this.T;
                    if (i13 >= size) {
                        break;
                    }
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z11.get(i13);
                    if (tL_starsTopupOption.stars >= j10) {
                        if (tL_starsTopupOption.extended && !this.f13138b0 && z12) {
                            i15++;
                        } else {
                            arrayList.add(u9.a(i13, i16, tL_starsTopupOption));
                            i14++;
                            i16++;
                            z12 = true;
                        }
                    }
                    i13++;
                }
                if (i14 < 3) {
                    arrayList.clear();
                    arrayList.add(w41.k(aVar));
                    th.p(R.string.TelegramStarsChoose, arrayList);
                    int i17 = 0;
                    for (int i18 = 0; i18 < z11.size(); i18++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i18);
                        if (tL_starsTopupOption2.stars >= j10) {
                            arrayList.add(u9.a(i18, i16, tL_starsTopupOption2));
                            i17++;
                            i16++;
                        }
                    }
                    if (i17 == 0) {
                        while (i12 < z11.size()) {
                            arrayList.add(u9.a(i12, i16, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                            i12++;
                            i16++;
                        }
                        boolean z13 = this.f13138b0;
                        if (!z13 && i15 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = o9.f12588a;
                            w41 J = w41.J(o9.class);
                            J.d = -1;
                            J.f34300l = string;
                            J.f34295f = !this.f13138b0;
                            J.f34305q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f13138b0 = true;
                    }
                } else if (i14 > 0) {
                    boolean z14 = this.f13138b0;
                    if (!z14 && i15 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = o9.f12588a;
                        w41 J2 = w41.J(o9.class);
                        J2.d = -1;
                        J2.f34300l = string2;
                        J2.f34295f = !this.f13138b0;
                        J2.f34305q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i12 < z11.size()) {
                        arrayList.add(u9.a(i12, i16, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                        i12++;
                        i16++;
                    }
                }
            } else {
                arrayList.add(w41.n(31));
                arrayList.add(w41.n(31));
                arrayList.add(w41.n(31));
            }
        }
        arrayList.add(w41.k(this.V));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            k51 k51Var = this.f13137a0;
            if (k51Var != null) {
                k51Var.N(true);
            }
            long j10 = s7.y(this.currentAccount, false).p().amount;
            long j11 = this.T;
            ((TextView) this.U.d).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j11 - j10)));
            org.telegram.ui.Components.ua uaVar = this.f34660e;
            if (uaVar != null) {
                uaVar.setTitle(y());
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
        ig.a aVar = this.U;
        if (aVar != null) {
            ((dg.i) aVar.f8964b).setPaused(true);
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
        dk dkVar;
        if (!this.Z) {
            j7.l1.v(R.string.PaymentInvoiceDisabledStarsText, new tc(hb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (s7.y(this.currentAccount, false).p().amount >= this.T) {
            Runnable runnable = this.X;
            if (runnable != null) {
                runnable.run();
                this.X = null;
            }
        } else {
            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
            if (R instanceof tn) {
                tn tnVar = (tn) R;
                if (tnVar.x9() && (dkVar = tnVar.U) != null) {
                    dkVar.P();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.currentAccount, 0, true, new bg.t1(this, 21), this.resourcesProvider);
        this.f13137a0 = k51Var;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        ig.a aVar = this.U;
        if (aVar == null) {
            return null;
        }
        return ((TextView) aVar.d).getText();
    }
}
