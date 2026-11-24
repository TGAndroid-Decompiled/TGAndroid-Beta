package defpackage;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class j77 implements RequestDelegate {
    public final byte a = 1;
    public final long b;
    public final Context c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public j77(na7 na7Var, Context context, hd hdVar, vc7 vc7Var, long j, n92 n92Var, d dVar, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        this.d = na7Var;
        this.c = context;
        this.e = hdVar;
        this.f = vc7Var;
        this.b = j;
        this.g = n92Var;
        this.h = dVar;
        this.i = tL_messages_migrateChat;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.i;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                na7 na7Var = (na7) obj6;
                hd hdVar = (hd) obj5;
                vc7 vc7Var = (vc7) obj4;
                n92 n92Var = (n92) obj3;
                d dVar = (d) obj2;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) obj;
                Context context = this.c;
                if (tL_error == null) {
                    if (context != null) {
                        gl.d3(new oe(hdVar, context));
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    na7Var.Q3(updates, false);
                    gl.d3(new go6(vc7Var, updates, this.b, (byte) 5));
                    return;
                }
                if (n92Var != null) {
                    n92Var.run();
                }
                gl.d3(new i87(na7Var, vc7Var, context, hdVar, tL_error, dVar, tL_messages_migrateChat, (byte) 0));
                return;
            default:
                final gta gtaVar = (gta) obj6;
                final i8c i8cVar = (i8c) obj5;
                final String str = (String) obj4;
                final wjb wjbVar = (wjb) obj3;
                final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) obj2;
                final String str2 = (String) obj;
                final long j = this.b;
                final Context context2 = this.c;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        u21 Y;
                        String str3;
                        long j2;
                        vz5 vz5Var;
                        gta gtaVar2 = gta.this;
                        TLObject tLObject2 = tLObject;
                        i8c i8cVar2 = i8cVar;
                        long j3 = j;
                        String str4 = str;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context3 = context2;
                        wjb wjbVar2 = wjbVar;
                        TLRPC.ChatInvite chatInvite2 = chatInvite;
                        String str5 = str2;
                        d Q = LaunchActivity.Q();
                        if (!gl.s1(Q)) {
                            Y = u21.b0(Q);
                        } else {
                            Y = u21.Y();
                        }
                        if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                            Utilities.d.c(new bsa(gtaVar2, tL_payments_paymentResult, (byte) 1));
                            TLRPC.Updates updates2 = tL_payments_paymentResult.updates;
                            TLRPC.Update update = updates2.update;
                            if (update instanceof TL_update.TL_updateChannel) {
                                j2 = -((TL_update.TL_updateChannel) update).channel_id;
                            } else {
                                j2 = 0;
                            }
                            if (updates2.updates != null) {
                                for (int i = 0; i < tL_payments_paymentResult.updates.updates.size(); i++) {
                                    if (tL_payments_paymentResult.updates.updates.get(i) instanceof TL_update.TL_updateChannel) {
                                        j2 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i)).channel_id;
                                    }
                                }
                            }
                            i8cVar2.a(Long.valueOf(j2), Boolean.TRUE);
                            if (j2 == 0) {
                                Y.I(2131624221, k96.M0(2131744757, null), gl.T2(k96.G((int) j3, "StarsSubscriptionCompletedText", str4))).j();
                            }
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity != null && (vz5Var = launchActivity.w0) != null) {
                                vz5Var.c(true);
                            }
                            gtaVar2.P(true);
                            gtaVar2.O();
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                            if (!na7.q1(gtaVar2.a).Z4()) {
                                i8cVar2.a(0L, Boolean.FALSE);
                                gta.c0(context3, wjbVar2);
                                return;
                            }
                            boolean[] zArr = {false};
                            zua zuaVar = new zua(context3, wjbVar2, j3, 1, chatInvite2.title, new ex7(gtaVar2, zArr, str5, chatInvite2, i8cVar2, (byte) 25), 0L);
                            zuaVar.setOnDismissListener(new csa((byte) 0, i8cVar2, zArr));
                            zuaVar.show();
                        } else {
                            i8cVar2.a(0L, Boolean.FALSE);
                            if (tL_error2 != null) {
                                str3 = tL_error2.text;
                            } else {
                                str3 = "FAILED_SEND_STARS";
                            }
                            Y.Q(2131624012, 36, k96.a0(null, null, 2131743639, str3)).j();
                        }
                    }
                });
                return;
        }
    }

    public j77(gta gtaVar, i8c i8cVar, long j, String str, Context context, wjb wjbVar, TLRPC.ChatInvite chatInvite, String str2) {
        this.d = gtaVar;
        this.e = i8cVar;
        this.b = j;
        this.f = str;
        this.c = context;
        this.g = wjbVar;
        this.h = chatInvite;
        this.i = str2;
    }
}
