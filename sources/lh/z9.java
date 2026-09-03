package lh;

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
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai;
import org.telegram.ui.lk;
import org.telegram.ui.zn;
public final class z9 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public final long U;
    public final kg.a V;
    public final FrameLayout W;
    public final s00 X;
    public Runnable Y;
    public final TLRPC.InputPeer Z;
    public final boolean f13429a0;
    public w51 f13430b0;
    public boolean f13431c0;

    public z9(android.content.Context r17, org.telegram.ui.ActionBar.f6 r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: lh.z9.<init>(android.content.Context, org.telegram.ui.ActionBar.f6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void P(z9 z9Var, int i10) {
        i51 G;
        w51 w51Var = z9Var.f13430b0;
        if (w51Var != null && (G = w51Var.G(i10 - 1)) != null) {
            w51 w51Var2 = z9Var.f13430b0;
            if (G.d == -1) {
                z9Var.f13431c0 = !z9Var.f13431c0;
                w51Var2.N(true);
            } else if (G.G(v9.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(z9Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.D1;
                }
                if (findActivity != null) {
                    t7.y(z9Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new dh.v(5, z9Var, G), z9Var.Z);
                }
            }
        }
    }

    public static void Q(z9 z9Var, i51 i51Var, Boolean bool, String str) {
        if (z9Var.getContext() != null) {
            if (bool.booleanValue()) {
                new qc((FrameLayout) z9Var.containerView, z9Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) i51Var.B, new Object[0])), R.raw.stars_topup).j();
                z9Var.X.c(true);
                t7.y(z9Var.currentAccount, false).T(true);
            } else if (str != null) {
                ai.r(R.string.UnknownErrorCode, new Object[]{str}, new qc((FrameLayout) z9Var.containerView, z9Var.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    public final void R(ArrayList arrayList, w51 w51Var) {
        long j10;
        int i10;
        int i11;
        kg.a aVar = this.V;
        arrayList.add(i51.l(aVar));
        boolean z4 = this.f13429a0;
        if (z4) {
            ai.q(R.string.TelegramStarsChoose, arrayList);
        }
        int i12 = 0;
        ArrayList z10 = t7.y(this.currentAccount, false).z();
        if (z4) {
            if (z10 != null && !z10.isEmpty()) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                boolean z11 = false;
                int i16 = 1;
                while (true) {
                    int size = z10.size();
                    j10 = this.U;
                    if (i13 >= size) {
                        break;
                    }
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z10.get(i13);
                    if (tL_starsTopupOption.stars >= j10) {
                        if (tL_starsTopupOption.extended && !this.f13431c0 && z11) {
                            i15++;
                        } else {
                            arrayList.add(v9.a(i13, i16, tL_starsTopupOption));
                            i14++;
                            i16++;
                            z11 = true;
                        }
                    }
                    i13++;
                }
                if (i14 < 3) {
                    arrayList.clear();
                    arrayList.add(i51.k(aVar));
                    ai.q(R.string.TelegramStarsChoose, arrayList);
                    int i17 = 0;
                    for (int i18 = 0; i18 < z10.size(); i18++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z10.get(i18);
                        if (tL_starsTopupOption2.stars >= j10) {
                            arrayList.add(v9.a(i18, i16, tL_starsTopupOption2));
                            i17++;
                            i16++;
                        }
                    }
                    if (i17 == 0) {
                        while (i12 < z10.size()) {
                            arrayList.add(v9.a(i12, i16, (TL_stars.TL_starsTopupOption) z10.get(i12)));
                            i12++;
                            i16++;
                        }
                        boolean z12 = this.f13431c0;
                        if (!z12 && i15 > 0) {
                            if (z12) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = p9.f12925a;
                            i51 J = i51.J(p9.class);
                            J.d = -1;
                            J.f25585l = string;
                            J.f25580f = !this.f13431c0;
                            J.f25590q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f13431c0 = true;
                    }
                } else if (i14 > 0) {
                    boolean z13 = this.f13431c0;
                    if (!z13 && i15 > 0) {
                        if (z13) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = p9.f12925a;
                        i51 J2 = i51.J(p9.class);
                        J2.d = -1;
                        J2.f25585l = string2;
                        J2.f25580f = !this.f13431c0;
                        J2.f25590q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i12 < z10.size()) {
                        arrayList.add(v9.a(i12, i16, (TL_stars.TL_starsTopupOption) z10.get(i12)));
                        i12++;
                        i16++;
                    }
                }
            } else {
                arrayList.add(i51.n(31));
                arrayList.add(i51.n(31));
                arrayList.add(i51.n(31));
            }
        }
        arrayList.add(i51.k(this.W));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            w51 w51Var = this.f13430b0;
            if (w51Var != null) {
                w51Var.N(true);
            }
            long j10 = t7.y(this.currentAccount, false).p().amount;
            long j11 = this.U;
            ((TextView) this.V.d).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j11 - j10)));
            org.telegram.ui.Components.pa paVar = this.e;
            if (paVar != null) {
                paVar.setTitle(y());
            }
            if (j10 >= j11 && (runnable = this.Y) != null) {
                runnable.run();
                this.Y = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        kg.a aVar = this.V;
        if (aVar != null) {
            ((fg.i) aVar.f10519b).setPaused(true);
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
        lk lkVar;
        if (!this.f13429a0) {
            kf.k0.v(R.string.PaymentInvoiceDisabledStarsText, new qc(org.telegram.ui.Components.cb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (t7.y(this.currentAccount, false).p().amount >= this.U) {
            Runnable runnable = this.Y;
            if (runnable != null) {
                runnable.run();
                this.Y = null;
            }
        } else {
            org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
            if (R instanceof zn) {
                zn znVar = (zn) R;
                if (znVar.x9() && (lkVar = znVar.V) != null) {
                    lkVar.P();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    @Override
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new dg.r1(this, 21), this.resourcesProvider);
        this.f13430b0 = w51Var;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        kg.a aVar = this.V;
        if (aVar == null) {
            return null;
        }
        return ((TextView) aVar.d).getText();
    }
}
