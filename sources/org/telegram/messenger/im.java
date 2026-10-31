package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w90;
public final class im implements RequestDelegate {
    public final int f16147a = 0;
    public final long f16148b;
    public final Context f16149c;
    public final Object d;
    public final Object e;
    public final Object f16150f;
    public final Object f16151g;
    public final Object h;
    public final Object f16152i;

    public im(vp vpVar, Context context, org.telegram.ui.ActionBar.x1 x1Var, cs csVar, long j10, Runnable runnable, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        this.d = vpVar;
        this.f16149c = context;
        this.e = x1Var;
        this.f16150f = csVar;
        this.f16148b = j10;
        this.f16151g = runnable;
        this.h = k2Var;
        this.f16152i = tL_messages_migrateChat;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f16147a) {
            case 0:
                vp vpVar = (vp) this.d;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.e;
                cs csVar = (cs) this.f16150f;
                Runnable runnable = (Runnable) this.f16151g;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.h;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) this.f16152i;
                Context context = this.f16149c;
                if (tL_error == null) {
                    if (context != null) {
                        i0.g3(new fn(0, context, x1Var));
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    vpVar.L3(updates, false);
                    i0.g3(new d4(csVar, updates, this.f16148b, 17));
                    return;
                }
                if (runnable != null) {
                    runnable.run();
                }
                i0.g3(new gn(vpVar, csVar, context, x1Var, tL_error, k2Var, tL_messages_migrateChat, 0));
                return;
            default:
                final rh.e6 e6Var = (rh.e6) this.d;
                final j20 j20Var = (j20) this.e;
                final String str = (String) this.f16150f;
                final org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.f16151g;
                final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.h;
                final String str2 = (String) this.f16152i;
                final long j10 = this.f16148b;
                final Context context2 = this.f16149c;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        cc X;
                        String str3;
                        long j11;
                        w90 w90Var;
                        e6 e6Var2 = e6.this;
                        TLObject tLObject2 = tLObject;
                        j20 j20Var2 = j20Var;
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
                            j20Var2.a(Long.valueOf(j11), Boolean.TRUE);
                            if (j11 == 0) {
                                X.I(2131624223, cd.L0(2131745012, null), org.telegram.messenger.i0.W2(cd.G((int) j12, "StarsSubscriptionCompletedText", str4))).j();
                            }
                            LaunchActivity launchActivity = LaunchActivity.I1;
                            if (launchActivity != null && (w90Var = launchActivity.f33391x0) != null) {
                                w90Var.c(true);
                            }
                            e6Var2.S(true);
                            e6Var2.R();
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                            if (vp.r1(e6Var2.f46849a).f18831k7) {
                                j20Var2.a(0L, Boolean.FALSE);
                                e6.c0(context3, p6Var2);
                                return;
                            }
                            boolean[] zArr = {false};
                            x7 x7Var = new x7(context3, p6Var2, j12, 1, chatInvite2.title, new r4(e6Var2, zArr, str5, chatInvite2, j20Var2, 1), 0L);
                            x7Var.setOnDismissListener(new d5(j20Var2, zArr, 0));
                            x7Var.show();
                        } else {
                            j20Var2.a(0L, Boolean.FALSE);
                            if (tL_error2 != null) {
                                str3 = tL_error2.text;
                            } else {
                                str3 = "FAILED_SEND_STARS";
                            }
                            X.Q(2131624011, 36, cd.a0(null, null, 2131743903, str3)).j();
                        }
                    }
                });
                return;
        }
    }

    public im(rh.e6 e6Var, j20 j20Var, long j10, String str, Context context, org.telegram.ui.ActionBar.p6 p6Var, TLRPC.ChatInvite chatInvite, String str2) {
        this.d = e6Var;
        this.e = j20Var;
        this.f16148b = j10;
        this.f16150f = str;
        this.f16149c = context;
        this.f16151g = p6Var;
        this.h = chatInvite;
        this.f16152i = str2;
    }
}
