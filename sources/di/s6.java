package di;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.or;
import org.telegram.messenger.p10;
import org.telegram.messenger.vm;
import org.telegram.messenger.wm;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t80;
public final class s6 implements RequestDelegate {
    public final int f9707a = 0;
    public final Context f9708b;
    public final long f9709c;
    public final Object d;
    public final Object f9710e;
    public final Object f9711f;
    public final Object f9712g;
    public final Object h;
    public final TLObject f9713i;

    public s6(y8 y8Var, p10 p10Var, long j3, String str, Context context, org.telegram.ui.ActionBar.i6 i6Var, TLRPC.ChatInvite chatInvite, String str2) {
        this.d = y8Var;
        this.f9710e = p10Var;
        this.f9709c = j3;
        this.f9711f = str;
        this.f9708b = context;
        this.h = i6Var;
        this.f9713i = chatInvite;
        this.f9712g = str2;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f9707a) {
            case 0:
                final y8 y8Var = (y8) this.d;
                final p10 p10Var = (p10) this.f9710e;
                final String str = (String) this.f9711f;
                final org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.h;
                final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.f9713i;
                final String str2 = (String) this.f9712g;
                final long j3 = this.f9709c;
                final Context context = this.f9708b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.Components.kc Y;
                        String str3;
                        long j10;
                        t80 t80Var;
                        y8 y8Var2 = y8.this;
                        TLObject tLObject2 = tLObject;
                        p10 p10Var2 = p10Var;
                        long j11 = j3;
                        String str4 = str;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context2 = context;
                        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        TLRPC.ChatInvite chatInvite2 = chatInvite;
                        String str5 = str2;
                        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                        if (!org.telegram.messenger.g0.u1(Q)) {
                            Y = org.telegram.ui.Components.kc.b0(Q);
                        } else {
                            Y = org.telegram.ui.Components.kc.Y();
                        }
                        if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                            Utilities.d.c(new l7(y8Var2, tL_payments_paymentResult, 1));
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
                            p10Var2.a(Long.valueOf(j10), Boolean.TRUE);
                            if (j10 == 0) {
                                Y.I(2131624226, gd.N0(2131744753, null), org.telegram.messenger.g0.W2(gd.G((int) j11, "StarsSubscriptionCompletedText", str4))).j();
                            }
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity != null && (t80Var = launchActivity.f43228w0) != null) {
                                t80Var.c(true);
                            }
                            y8Var2.R(true);
                            y8Var2.Q();
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                            if (mp.u1(y8Var2.f10046a).f25802m7) {
                                p10Var2.a(0L, Boolean.FALSE);
                                y8.c0(context2, i6Var2);
                                return;
                            }
                            boolean[] zArr = {false};
                            fb fbVar = new fb(context2, i6Var2, j11, 1, chatInvite2.title, new bi.s1(y8Var2, zArr, str5, chatInvite2, p10Var2, 4), 0L);
                            fbVar.setOnDismissListener(new n7(0, p10Var2, zArr));
                            fbVar.show();
                        } else {
                            p10Var2.a(0L, Boolean.FALSE);
                            if (tL_error2 != null) {
                                str3 = tL_error2.text;
                            } else {
                                str3 = "FAILED_SEND_STARS";
                            }
                            Y.Q(2131624012, 36, gd.a0(null, null, 2131743631, str3)).j();
                        }
                    }
                });
                return;
            default:
                mp mpVar = (mp) this.d;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f9710e;
                or orVar = (or) this.f9711f;
                Runnable runnable = (Runnable) this.f9712g;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.h;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) this.f9713i;
                Context context2 = this.f9708b;
                if (tL_error == null) {
                    if (context2 != null) {
                        org.telegram.messenger.g0.g3(new vm(0, context2, t1Var));
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    mpVar.V3(updates, false);
                    org.telegram.messenger.g0.g3(new org.telegram.messenger.d4(orVar, updates, this.f9709c, 17));
                    return;
                }
                if (runnable != null) {
                    runnable.run();
                }
                org.telegram.messenger.g0.g3(new wm(mpVar, orVar, context2, t1Var, tL_error, g2Var, tL_messages_migrateChat, 0));
                return;
        }
    }

    public s6(mp mpVar, Context context, org.telegram.ui.ActionBar.t1 t1Var, or orVar, long j3, Runnable runnable, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        this.d = mpVar;
        this.f9708b = context;
        this.f9710e = t1Var;
        this.f9711f = orVar;
        this.f9709c = j3;
        this.f9712g = runnable;
        this.h = g2Var;
        this.f9713i = tL_messages_migrateChat;
    }
}
