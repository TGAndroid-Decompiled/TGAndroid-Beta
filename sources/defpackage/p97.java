package defpackage;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class p97 implements RequestDelegate {
    public final byte a = 1;
    public final long b;
    public final Context c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public p97(uc7 uc7Var, Context context, id idVar, ff7 ff7Var, long j, ea2 ea2Var, e eVar, TLRPC.TL_messages_migrateChat tL_messages_migrateChat) {
        this.d = uc7Var;
        this.c = context;
        this.e = idVar;
        this.f = ff7Var;
        this.b = j;
        this.g = ea2Var;
        this.h = eVar;
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
                uc7 uc7Var = (uc7) obj6;
                id idVar = (id) obj5;
                ff7 ff7Var = (ff7) obj4;
                ea2 ea2Var = (ea2) obj3;
                e eVar = (e) obj2;
                TLRPC.TL_messages_migrateChat tL_messages_migrateChat = (TLRPC.TL_messages_migrateChat) obj;
                Context context = this.c;
                if (tL_error == null) {
                    if (context != null) {
                        hl.c3(new vd(idVar, context));
                    }
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    uc7Var.Y3(updates, false);
                    hl.c3(new cq6(ff7Var, updates, this.b, (byte) 6));
                    return;
                }
                if (ea2Var != null) {
                    ea2Var.run();
                }
                hl.c3(new ra7(uc7Var, ff7Var, context, idVar, tL_error, eVar, tL_messages_migrateChat, (byte) 0));
                return;
            default:
                final jxa jxaVar = (jxa) obj6;
                final icc iccVar = (icc) obj5;
                final String str = (String) obj4;
                final vnb vnbVar = (vnb) obj3;
                final TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) obj2;
                final String str2 = (String) obj;
                final long j = this.b;
                final Context context2 = this.c;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        d31 Y;
                        String str3;
                        long j2;
                        y16 y16Var;
                        jxa jxaVar2 = jxa.this;
                        TLObject tLObject2 = tLObject;
                        icc iccVar2 = iccVar;
                        long j3 = j;
                        String str4 = str;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context3 = context2;
                        vnb vnbVar2 = vnbVar;
                        TLRPC.ChatInvite chatInvite2 = chatInvite;
                        String str5 = str2;
                        e Q = LaunchActivity.Q();
                        if (!hl.s1(Q)) {
                            Y = d31.b0(Q);
                        } else {
                            Y = d31.Y();
                        }
                        if (tLObject2 instanceof TLRPC.TL_payments_paymentResult) {
                            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                            Utilities.d.c(new fwa(jxaVar2, tL_payments_paymentResult, (byte) 1));
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
                            iccVar2.a(Long.valueOf(j2), Boolean.TRUE);
                            if (j2 == 0) {
                                Y.I(2131624220, ob6.M0(2131744651, null), hl.S2(ob6.G((int) j3, "StarsSubscriptionCompletedText", str4))).j();
                            }
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity != null && (y16Var = launchActivity.w0) != null) {
                                y16Var.c(true);
                            }
                            jxaVar2.Q(true);
                            jxaVar2.P();
                        } else if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                            if (!uc7.s1(jxaVar2.a).i5()) {
                                iccVar2.a(0L, Boolean.FALSE);
                                jxa.d0(context3, vnbVar2);
                                return;
                            }
                            boolean[] zArr = {false};
                            dza dzaVar = new dza(context3, vnbVar2, j3, 1, chatInvite2.title, new cp7(jxaVar2, zArr, str5, chatInvite2, iccVar2, (byte) 27), 0L);
                            dzaVar.setOnDismissListener(new gwa((byte) 0, iccVar2, zArr));
                            dzaVar.show();
                        } else {
                            iccVar2.a(0L, Boolean.FALSE);
                            if (tL_error2 != null) {
                                str3 = tL_error2.text;
                            } else {
                                str3 = "FAILED_SEND_STARS";
                            }
                            Y.Q(2131624012, 36, ob6.a0(null, null, 2131743533, str3)).j();
                        }
                    }
                });
                return;
        }
    }

    public p97(jxa jxaVar, icc iccVar, long j, String str, Context context, vnb vnbVar, TLRPC.ChatInvite chatInvite, String str2) {
        this.d = jxaVar;
        this.e = iccVar;
        this.b = j;
        this.f = str;
        this.c = context;
        this.g = vnbVar;
        this.h = chatInvite;
        this.i = str2;
    }
}
