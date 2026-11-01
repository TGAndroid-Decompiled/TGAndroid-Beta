package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.k20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.v90;
public final class jm implements RequestDelegate {
    public final int f16482a = 0;
    public final long f16483b;
    public final Context f16484c;
    public final Object d;
    public final Object e;
    public final Object f16485f;
    public final Object f16486g;
    public final Object h;
    public final Object f16487i;

    public jm(wp wpVar, Context context, org.telegram.ui.ActionBar.x1 x1Var, ds dsVar, long j10, Runnable runnable, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        this.d = wpVar;
        this.f16484c = context;
        this.e = x1Var;
        this.f16485f = dsVar;
        this.f16483b = j10;
        this.f16486g = runnable;
        this.h = k2Var;
        this.f16487i = tL_messages_migrateChat;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f16482a) {
            case 0:
                wp wpVar = (wp) this.d;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.e;
                ds dsVar = (ds) this.f16485f;
                Runnable runnable = (Runnable) this.f16486g;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.h;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) this.f16487i;
                Context context = this.f16484c;
                if (tL_error == null) {
                    if (context != null) {
                        i0.g3(new gn(0, context, x1Var));
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    wpVar.L3(updates, false);
                    i0.g3(new d4(dsVar, updates, this.f16483b, 17));
                    return;
                }
                if (runnable != null) {
                    runnable.run();
                }
                i0.g3(new hn(wpVar, dsVar, context, x1Var, tL_error, k2Var, tL_messages_migrateChat, 0));
                return;
            default:
                final rh.e6 e6Var = (rh.e6) this.d;
                final k20 k20Var = (k20) this.e;
                final String str = (String) this.f16485f;
                final org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.f16486g;
                final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.h;
                final String str2 = (String) this.f16487i;
                final long j10 = this.f16483b;
                final Context context2 = this.f16484c;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        cc X;
                        String str3;
                        long j11;
                        v90 v90Var;
                        e6 e6Var2 = e6.this;
                        TLObject tLObject2 = tLObject;
                        k20 k20Var2 = k20Var;
                        long j12 = j10;
                        String str4 = str;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context3 = context2;
                        org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                        TLRPC.ChatInvite chatInvite2 = chatInvite;
                        String str5 = str2;
                        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                        if (!org.telegram.messenger.i0.u1(Q)) {
                            X = cc.a0(Q);
                        } else {
                            X = cc.X();
                        }
                        if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                            Utilities.d.c(new b5(e6Var2, tL_payments_paymentResult, 1));
                            TLRPC.Updates updates2 = tL_payments_paymentResult.updates;
                            TLRPC.Update update = updates2.update;
                            if (update instanceof TL_update.TL_updateChannel) {
                                j11 = -((TL_update.TL_updateChannel) update).channel_id;
                            } else {
                                j11 = 0;
                            }
                            if (updates2.updates != null) {
                                for (int i10 = 0; i10 < tL_payments_paymentResult.updates.updates.size(); i10++) {
                                    if (tL_payments_paymentResult.updates.updates.get(i10) instanceof TL_update.TL_updateChannel) {
                                        j11 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i10)).channel_id;
                                    }
                                }
                            }
                            k20Var2.a(Long.valueOf(j11), Boolean.TRUE);
                            if (j11 == 0) {
                                X.I(2131624223, dd.L0(2131745012, null), org.telegram.messenger.i0.W2(dd.G((int) j12, "StarsSubscriptionCompletedText", str4))).j();
                            }
                            LaunchActivity launchActivity = LaunchActivity.I1;
                            if (launchActivity != null && (v90Var = launchActivity.f33398x0) != null) {
                                v90Var.c(true);
                            }
                            e6Var2.S(true);
                            e6Var2.R();
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                            if (wp.r1(e6Var2.f46863a).f19174k7) {
                                k20Var2.a(0L, Boolean.FALSE);
                                e6.c0(context3, p6Var2);
                                return;
                            }
                            boolean[] zArr = {false};
                            x7 x7Var = new x7(context3, p6Var2, j12, 1, chatInvite2.title, new r4(e6Var2, zArr, str5, chatInvite2, k20Var2, 1), 0L);
                            x7Var.setOnDismissListener(new d5(k20Var2, zArr, 0));
                            x7Var.show();
                        } else {
                            k20Var2.a(0L, Boolean.FALSE);
                            if (tL_error2 != null) {
                                str3 = tL_error2.text;
                            } else {
                                str3 = "FAILED_SEND_STARS";
                            }
                            X.Q(2131624011, 36, dd.a0(null, null, 2131743903, str3)).j();
                        }
                    }
                });
                return;
        }
    }

    public jm(rh.e6 e6Var, k20 k20Var, long j10, String str, Context context, org.telegram.ui.ActionBar.p6 p6Var, TLRPC.ChatInvite chatInvite, String str2) {
        this.d = e6Var;
        this.e = k20Var;
        this.f16483b = j10;
        this.f16485f = str;
        this.f16484c = context;
        this.f16486g = p6Var;
        this.h = chatInvite;
        this.f16487i = str2;
    }
}
