package bi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fn;
import org.telegram.messenger.gn;
import org.telegram.messenger.qp;
import org.telegram.messenger.tr;
import org.telegram.messenger.v10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u80;
public final class x7 implements RequestDelegate {
    public final int f5036a = 0;
    public final Context f5037b;
    public final long f5038c;
    public final Object d;
    public final Object f5039e;
    public final Object f5040f;
    public final Object f5041g;
    public final Object h;
    public final TLObject f5042i;

    public x7(ea eaVar, v10 v10Var, long j3, String str, Context context, org.telegram.ui.ActionBar.h6 h6Var, TLRPC.ChatInvite chatInvite, String str2) {
        this.d = eaVar;
        this.f5039e = v10Var;
        this.f5038c = j3;
        this.f5040f = str;
        this.f5037b = context;
        this.h = h6Var;
        this.f5042i = chatInvite;
        this.f5041g = str2;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f5036a) {
            case 0:
                final ea eaVar = (ea) this.d;
                final v10 v10Var = (v10) this.f5039e;
                final String str = (String) this.f5040f;
                final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.h;
                final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.f5042i;
                final String str2 = (String) this.f5041g;
                final long j3 = this.f5038c;
                final Context context = this.f5037b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.Components.gc X;
                        String str3;
                        long j10;
                        u80 u80Var;
                        ea eaVar2 = ea.this;
                        TLObject tLObject2 = tLObject;
                        v10 v10Var2 = v10Var;
                        long j11 = j3;
                        String str4 = str;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context2 = context;
                        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                        TLRPC.ChatInvite chatInvite2 = chatInvite;
                        String str5 = str2;
                        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                        if (!org.telegram.messenger.g0.u1(Q)) {
                            X = org.telegram.ui.Components.gc.a0(Q);
                        } else {
                            X = org.telegram.ui.Components.gc.X();
                        }
                        if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                            Utilities.d.c(new p8(eaVar2, tL_payments_paymentResult, 1));
                            TLRPC.Updates updates = tL_payments_paymentResult.updates;
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateChannel) {
                                j10 = -((TL_update.TL_updateChannel) update).channel_id;
                            } else {
                                j10 = 0;
                            }
                            if (updates.updates != null) {
                                for (int i7 = 0; i7 < tL_payments_paymentResult.updates.updates.size(); i7++) {
                                    if (tL_payments_paymentResult.updates.updates.get(i7) instanceof TL_update.TL_updateChannel) {
                                        j10 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i7)).channel_id;
                                    }
                                }
                            }
                            v10Var2.a(Long.valueOf(j10), Boolean.TRUE);
                            if (j10 == 0) {
                                X.I(2131624225, org.telegram.messenger.id.M0(2131744994, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) j11, "StarsSubscriptionCompletedText", str4))).j();
                            }
                            LaunchActivity launchActivity = LaunchActivity.G1;
                            if (launchActivity != null && (u80Var = launchActivity.f41291v0) != null) {
                                u80Var.c(true);
                            }
                            eaVar2.S(true);
                            eaVar2.R();
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                            if (qp.s1(eaVar2.f3804a).f24821j7) {
                                v10Var2.a(0L, Boolean.FALSE);
                                ea.c0(context2, h6Var2);
                                return;
                            }
                            boolean[] zArr = {false};
                            tc tcVar = new tc(context2, h6Var2, j11, 1, chatInvite2.title, new u0(eaVar2, zArr, str5, chatInvite2, v10Var2, 2), 0L);
                            tcVar.setOnDismissListener(new t8(v10Var2, zArr, 0));
                            tcVar.show();
                        } else {
                            v10Var2.a(0L, Boolean.FALSE);
                            if (tL_error2 != null) {
                                str3 = tL_error2.text;
                            } else {
                                str3 = "FAILED_SEND_STARS";
                            }
                            X.Q(2131624011, 36, org.telegram.messenger.id.a0(null, null, 2131743878, str3)).j();
                        }
                    }
                });
                return;
            default:
                qp qpVar = (qp) this.d;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f5039e;
                tr trVar = (tr) this.f5040f;
                Runnable runnable = (Runnable) this.f5041g;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.h;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) this.f5042i;
                Context context2 = this.f5037b;
                if (tL_error == null) {
                    if (context2 != null) {
                        org.telegram.messenger.g0.h3(new fn(0, context2, u1Var));
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    qpVar.O3(updates, false);
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.a4(trVar, updates, this.f5038c, 18));
                    return;
                }
                if (runnable != null) {
                    runnable.run();
                }
                org.telegram.messenger.g0.h3(new gn(qpVar, trVar, context2, u1Var, tL_error, f2Var, tL_messages_migrateChat, 0));
                return;
        }
    }

    public x7(qp qpVar, Context context, org.telegram.ui.ActionBar.u1 u1Var, tr trVar, long j3, Runnable runnable, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        this.d = qpVar;
        this.f5037b = context;
        this.f5039e = u1Var;
        this.f5040f = trVar;
        this.f5038c = j3;
        this.f5041g = runnable;
        this.h = f2Var;
        this.f5042i = tL_messages_migrateChat;
    }
}
