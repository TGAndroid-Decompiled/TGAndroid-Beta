package ci;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.lr;
import org.telegram.messenger.n10;
import org.telegram.messenger.vm;
import org.telegram.messenger.wm;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p80;
public final class y6 implements RequestDelegate {
    public final int f6399a = 0;
    public final Context f6400b;
    public final long f6401c;
    public final Object d;
    public final Object f6402e;
    public final Object f6403f;
    public final Object f6404g;
    public final Object h;
    public final TLObject f6405i;

    public y6(e9 e9Var, n10 n10Var, long j10, String str, Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.ChatInvite chatInvite, String str2) {
        this.d = e9Var;
        this.f6402e = n10Var;
        this.f6401c = j10;
        this.f6403f = str;
        this.f6400b = context;
        this.h = e6Var;
        this.f6405i = chatInvite;
        this.f6404g = str2;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f6399a) {
            case 0:
                final e9 e9Var = (e9) this.d;
                final n10 n10Var = (n10) this.f6402e;
                final String str = (String) this.f6403f;
                final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.h;
                final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.f6405i;
                final String str2 = (String) this.f6404g;
                final long j10 = this.f6401c;
                final Context context = this.f6400b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.Components.fc X;
                        String str3;
                        long j11;
                        p80 p80Var;
                        e9 e9Var2 = e9.this;
                        TLObject tLObject2 = tLObject;
                        n10 n10Var2 = n10Var;
                        long j12 = j10;
                        String str4 = str;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context2 = context;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        TLRPC.ChatInvite chatInvite2 = chatInvite;
                        String str5 = str2;
                        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                        if (!org.telegram.messenger.g0.u1(Q)) {
                            X = org.telegram.ui.Components.fc.a0(Q);
                        } else {
                            X = org.telegram.ui.Components.fc.X();
                        }
                        if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                            Utilities.d.c(new q7(e9Var2, tL_payments_paymentResult, 1));
                            TLRPC.Updates updates = tL_payments_paymentResult.updates;
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateChannel) {
                                j11 = -((TL_update.TL_updateChannel) update).channel_id;
                            } else {
                                j11 = 0;
                            }
                            if (updates.updates != null) {
                                for (int i3 = 0; i3 < tL_payments_paymentResult.updates.updates.size(); i3++) {
                                    if (tL_payments_paymentResult.updates.updates.get(i3) instanceof TL_update.TL_updateChannel) {
                                        j11 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i3)).channel_id;
                                    }
                                }
                            }
                            n10Var2.a(Long.valueOf(j11), Boolean.TRUE);
                            if (j11 == 0) {
                                X.I(2131624225, bd.M0(2131745004, null), org.telegram.messenger.g0.X2(bd.G((int) j12, "StarsSubscriptionCompletedText", str4))).j();
                            }
                            LaunchActivity launchActivity = LaunchActivity.K1;
                            if (launchActivity != null && (p80Var = launchActivity.f41328y0) != null) {
                                p80Var.c(true);
                            }
                            e9Var2.S(true);
                            e9Var2.R();
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                            if (hp.s1(e9Var2.f5029a).f23042j7) {
                                n10Var2.a(0L, Boolean.FALSE);
                                e9.c0(context2, e6Var2);
                                return;
                            }
                            boolean[] zArr = {false};
                            mb mbVar = new mb(context2, e6Var2, j12, 1, chatInvite2.title, new ai.t6(e9Var2, zArr, str5, chatInvite2, n10Var2, 3), 0L);
                            mbVar.setOnDismissListener(new u7(n10Var2, zArr, 0));
                            mbVar.show();
                        } else {
                            n10Var2.a(0L, Boolean.FALSE);
                            if (tL_error2 != null) {
                                str3 = tL_error2.text;
                            } else {
                                str3 = "FAILED_SEND_STARS";
                            }
                            X.Q(2131624011, 36, bd.a0(null, null, 2131743888, str3)).j();
                        }
                    }
                });
                return;
            default:
                hp hpVar = (hp) this.d;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.f6402e;
                lr lrVar = (lr) this.f6403f;
                Runnable runnable = (Runnable) this.f6404g;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.h;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) this.f6405i;
                Context context2 = this.f6400b;
                if (tL_error == null) {
                    if (context2 != null) {
                        org.telegram.messenger.g0.h3(new vm(0, context2, s1Var));
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    hpVar.O3(updates, false);
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.a4(lrVar, updates, this.f6401c, 18));
                    return;
                }
                if (runnable != null) {
                    runnable.run();
                }
                org.telegram.messenger.g0.h3(new wm(hpVar, lrVar, context2, s1Var, tL_error, d2Var, tL_messages_migrateChat, 0));
                return;
        }
    }

    public y6(hp hpVar, Context context, org.telegram.ui.ActionBar.s1 s1Var, lr lrVar, long j10, Runnable runnable, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        this.d = hpVar;
        this.f6400b = context;
        this.f6402e = s1Var;
        this.f6403f = lrVar;
        this.f6401c = j10;
        this.f6404g = runnable;
        this.h = d2Var;
        this.f6405i = tL_messages_migrateChat;
    }
}
