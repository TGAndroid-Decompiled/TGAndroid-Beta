package di;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cn;
import org.telegram.messenger.dn;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.qr;
import org.telegram.messenger.s10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r80;
public final class p6 implements RequestDelegate {
    public final int f9219a = 0;
    public final Context f9220b;
    public final long f9221c;
    public final Object d;
    public final Object f9222e;
    public final Object f9223f;
    public final Object f9224g;
    public final Object h;
    public final TLObject f9225i;

    public p6(u8 u8Var, s10 s10Var, long j3, String str, Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.ChatInvite chatInvite, String str2) {
        this.d = u8Var;
        this.f9222e = s10Var;
        this.f9221c = j3;
        this.f9223f = str;
        this.f9220b = context;
        this.h = e6Var;
        this.f9225i = chatInvite;
        this.f9224g = str2;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f9219a) {
            case 0:
                final u8 u8Var = (u8) this.d;
                final s10 s10Var = (s10) this.f9222e;
                final String str = (String) this.f9223f;
                final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.h;
                final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) this.f9225i;
                final String str2 = (String) this.f9224g;
                final long j3 = this.f9221c;
                final Context context = this.f9220b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        org.telegram.ui.Components.cc X;
                        String str3;
                        long j10;
                        r80 r80Var;
                        u8 u8Var2 = u8.this;
                        TLObject tLObject2 = tLObject;
                        s10 s10Var2 = s10Var;
                        long j11 = j3;
                        String str4 = str;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context2 = context;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        TLRPC.ChatInvite chatInvite2 = chatInvite;
                        String str5 = str2;
                        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                        if (!org.telegram.messenger.g0.u1(Q)) {
                            X = org.telegram.ui.Components.cc.a0(Q);
                        } else {
                            X = org.telegram.ui.Components.cc.X();
                        }
                        if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                            Utilities.d.c(new i7(u8Var2, tL_payments_paymentResult, 1));
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
                            s10Var2.a(Long.valueOf(j10), Boolean.TRUE);
                            if (j10 == 0) {
                                X.I(2131624226, hd.M0(2131744994, null), org.telegram.messenger.g0.X2(hd.G((int) j11, "StarsSubscriptionCompletedText", str4))).j();
                            }
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity != null && (r80Var = launchActivity.f42663w0) != null) {
                                r80Var.c(true);
                            }
                            u8Var2.S(true);
                            u8Var2.R();
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                            if (np.s1(u8Var2.f9529a).f25325k7) {
                                s10Var2.a(0L, Boolean.FALSE);
                                u8.c0(context2, e6Var2);
                                return;
                            }
                            boolean[] zArr = {false};
                            bb bbVar = new bb(context2, e6Var2, j11, 1, chatInvite2.title, new ai.b(u8Var2, zArr, str5, chatInvite2, s10Var2), 0L);
                            bbVar.setOnDismissListener(new m7(s10Var2, zArr, 0));
                            bbVar.show();
                        } else {
                            s10Var2.a(0L, Boolean.FALSE);
                            if (tL_error2 != null) {
                                str3 = tL_error2.text;
                            } else {
                                str3 = "FAILED_SEND_STARS";
                            }
                            X.Q(2131624012, 36, hd.a0(null, null, 2131743878, str3)).j();
                        }
                    }
                });
                return;
            default:
                np npVar = (np) this.d;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f9222e;
                qr qrVar = (qr) this.f9223f;
                Runnable runnable = (Runnable) this.f9224g;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.h;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) this.f9225i;
                Context context2 = this.f9220b;
                if (tL_error == null) {
                    if (context2 != null) {
                        org.telegram.messenger.g0.h3(new cn(0, context2, t1Var));
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    npVar.O3(updates, false);
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.a4(qrVar, updates, this.f9221c, 18));
                    return;
                }
                if (runnable != null) {
                    runnable.run();
                }
                org.telegram.messenger.g0.h3(new dn(npVar, qrVar, context2, t1Var, tL_error, e2Var, tL_messages_migrateChat, 0));
                return;
        }
    }

    public p6(np npVar, Context context, org.telegram.ui.ActionBar.t1 t1Var, qr qrVar, long j3, Runnable runnable, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        this.d = npVar;
        this.f9220b = context;
        this.f9222e = t1Var;
        this.f9223f = qrVar;
        this.f9221c = j3;
        this.f9224g = runnable;
        this.h = e2Var;
        this.f9225i = tL_messages_migrateChat;
    }
}
