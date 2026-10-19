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
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fk;
import org.telegram.ui.qn;
public final class cd extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final bd Y;
    public final FrameLayout Z;
    public final z00 f1105a0;
    public Runnable f1106b0;
    public final TLRPC.InputPeer f1107c0;
    public final boolean f1108d0;
    public t61 f1109e0;
    public boolean f1110f0;

    public cd(android.content.Context r17, org.telegram.ui.ActionBar.d6 r18, long r19, int r21, java.lang.String r22, java.lang.Runnable r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: ai.cd.<init>(android.content.Context, org.telegram.ui.ActionBar.d6, long, int, java.lang.String, java.lang.Runnable, long):void");
    }

    public static void Q(cd cdVar, int i10) {
        g61 G;
        t61 t61Var = cdVar.f1109e0;
        if (t61Var != null && (G = t61Var.G(i10 - 1)) != null) {
            t61 t61Var2 = cdVar.f1109e0;
            if (G.d == -1) {
                cdVar.f1110f0 = !cdVar.f1110f0;
                t61Var2.N(true);
            } else if (G.G(xc.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
                Activity findActivity = AndroidUtilities.findActivity(cdVar.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.H1;
                }
                if (findActivity != null) {
                    ga.y(cdVar.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new q5(2, cdVar, G), cdVar.f1107c0);
                }
            }
        }
    }

    public static void R(cd cdVar, g61 g61Var, Boolean bool, String str) {
        if (cdVar.getContext() != null) {
            if (bool.booleanValue()) {
                new org.telegram.ui.Components.xc((FrameLayout) cdVar.containerView, cdVar.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) g61Var.B, new Object[0])), R.raw.stars_topup).j();
                cdVar.f1105a0.c(true);
                ga.y(cdVar.currentAccount, false).T(true);
            } else if (str != null) {
                i2.e.s(R.string.UnknownErrorCode, new Object[]{str}, new org.telegram.ui.Components.xc((FrameLayout) cdVar.containerView, cdVar.resourcesProvider), R.raw.error, 36);
            }
        }
    }

    @Override
    public final CharSequence A() {
        bd bdVar = this.Y;
        if (bdVar == null) {
            return null;
        }
        return ((TextView) bdVar.f1047b).getText();
    }

    public final void S(ArrayList arrayList, t61 t61Var) {
        long j10;
        int i10;
        int i11;
        bd bdVar = this.Y;
        arrayList.add(g61.l(bdVar));
        boolean z10 = this.f1108d0;
        if (z10) {
            i2.e.p(R.string.TelegramStarsChoose, arrayList);
        }
        int i12 = 0;
        ArrayList z11 = ga.y(this.currentAccount, false).z();
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
                        if (tL_starsTopupOption.extended && !this.f1110f0 && z12) {
                            i16++;
                        } else {
                            arrayList.add(xc.a(i14, i13, tL_starsTopupOption));
                            i15++;
                            i13++;
                            z12 = true;
                        }
                    }
                    i14++;
                }
                if (i15 < 3) {
                    arrayList.clear();
                    arrayList.add(g61.k(bdVar));
                    i2.e.p(R.string.TelegramStarsChoose, arrayList);
                    int i17 = 0;
                    for (int i18 = 0; i18 < z11.size(); i18++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i18);
                        if (tL_starsTopupOption2.stars >= j10) {
                            arrayList.add(xc.a(i18, i13, tL_starsTopupOption2));
                            i17++;
                            i13++;
                        }
                    }
                    if (i17 == 0) {
                        while (i12 < z11.size()) {
                            arrayList.add(xc.a(i12, i13, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                            i12++;
                            i13++;
                        }
                        boolean z13 = this.f1110f0;
                        if (!z13 && i16 > 0) {
                            if (z13) {
                                i11 = R.string.NotifyLessOptions;
                            } else {
                                i11 = R.string.NotifyMoreOptions;
                            }
                            String string = LocaleController.getString(i11);
                            int i19 = qc.f2087a;
                            g61 J = g61.J(qc.class);
                            J.d = -1;
                            J.f26499l = string;
                            J.f26494f = !this.f1110f0;
                            J.f26504q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f1110f0 = true;
                    }
                } else if (i15 > 0) {
                    boolean z14 = this.f1110f0;
                    if (!z14 && i16 > 0) {
                        if (z14) {
                            i10 = R.string.NotifyLessOptions;
                        } else {
                            i10 = R.string.NotifyMoreOptions;
                        }
                        String string2 = LocaleController.getString(i10);
                        int i20 = qc.f2087a;
                        g61 J2 = g61.J(qc.class);
                        J2.d = -1;
                        J2.f26499l = string2;
                        J2.f26494f = !this.f1110f0;
                        J2.f26504q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i12 < z11.size()) {
                        arrayList.add(xc.a(i12, i13, (TL_stars.TL_starsTopupOption) z11.get(i12)));
                        i12++;
                        i13++;
                    }
                }
            } else {
                arrayList.add(g61.n(31));
                arrayList.add(g61.n(31));
                arrayList.add(g61.n(31));
            }
        }
        arrayList.add(g61.k(this.Z));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            t61 t61Var = this.f1109e0;
            if (t61Var != null) {
                t61Var.N(true);
            }
            long j10 = ga.y(this.currentAccount, false).p().amount;
            long j11 = this.X;
            ((TextView) this.Y.f1047b).setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j11 - j10)));
            org.telegram.ui.Components.xa xaVar = this.e;
            if (xaVar != null) {
                xaVar.setTitle(A());
            }
            if (j10 >= j11 && (runnable = this.f1106b0) != null) {
                runnable.run();
                this.f1106b0 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        bd bdVar = this.Y;
        if (bdVar != null) {
            ((tg.n) bdVar.f1048c).setPaused(true);
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
        fk fkVar;
        if (!this.f1108d0) {
            org.telegram.messenger.g0.q(R.string.PaymentInvoiceDisabledStarsText, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
        } else if (ga.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.f1106b0;
            if (runnable != null) {
                runnable.run();
                this.f1106b0 = null;
            }
        } else {
            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
            if (R instanceof qn) {
                qn qnVar = (qn) R;
                if (qnVar.C9() && (fkVar = qnVar.Y) != null) {
                    fkVar.N();
                }
            }
            super.show();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        }
    }

    @Override
    public final hm0 x(im0 im0Var) {
        t61 t61Var = new t61(this.d, getContext(), this.currentAccount, 0, true, new q(this, 8), this.resourcesProvider);
        this.f1109e0 = t61Var;
        return t61Var;
    }
}
