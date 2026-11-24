package defpackage;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class dv0 implements jac {
    public final byte a;
    public final qw0 b;
    public final ow0 c;
    public final String d;

    public dv0(qw0 qw0Var, ow0 ow0Var, String str, byte b) {
        this.a = b;
        this.b = qw0Var;
        this.c = ow0Var;
        this.d = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i;
        ji7 ji7Var;
        byte b = this.a;
        String str = this.d;
        ow0 ow0Var = this.c;
        qw0 qw0Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) kfb.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                qw0 qw0Var2 = this.b;
                ow0 ow0Var2 = this.c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = qw0Var2.getContext();
                        int i2 = qw0Var2.N;
                        TLRPC.User user = qw0Var2.V;
                        jv0 jv0Var = new jv0(qw0Var2, ow0Var2, str2, tL_buttonTypeRequestPeer, (byte) 0);
                        ylb ylbVar = qw0Var2.e;
                        l13.e(context, i2, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, jv0Var, ylbVar, new c41(qw0Var2, ylbVar));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        kv0 kv0Var = new kv0(qw0Var2, zArr, str2, tL_buttonTypeRequestPeer, ow0Var2);
                        ji7 ji7Var2 = ji7.p2;
                        d Q = LaunchActivity.Q();
                        if (Q == null) {
                            ji7Var = null;
                        } else {
                            ji7Var = ji7.p2;
                            if (ji7Var == null) {
                                ji7 ji7Var3 = new ji7(Q, i, bool, bool2, kv0Var);
                                ji7Var3.show();
                                ji7.p2 = ji7Var3;
                                ji7Var = ji7Var3;
                            }
                        }
                        if (ji7Var != null) {
                            ji7Var.setOnDismissListener(new lv0(qw0Var2, zArr, ow0Var2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle j = td4.j(15, "onlySelect", "dialogsType", true);
                        j.putLong("requestPeerBotId", qw0Var2.V.id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            j.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        boolean[] zArr2 = new boolean[1];
                        sv0 sv0Var = new sv0(qw0Var2, j, zArr2, ow0Var2);
                        sv0Var.E2 = new kv0(qw0Var2, zArr2, str2, tL_buttonTypeRequestPeer, ow0Var2);
                        d S = LaunchActivity.S();
                        if (S != 0) {
                            ?? obj3 = new Object();
                            obj3.a = true;
                            S.showAsSheet(sv0Var, obj3);
                            return;
                        }
                        return;
                    }
                }
                ylb ylbVar2 = qw0Var2.e;
                if (tL_error != null) {
                    new c41(qw0Var2, ylbVar2).g0(tL_error, false);
                    qw0Var2.u(ow0Var2, "requested_chat_failed", qw0.x(str2, "req_id"));
                    return;
                }
                new c41(qw0Var2, ylbVar2).f0("UNKNOWN_BUTTON", false);
                qw0Var2.u(ow0Var2, "requested_chat_failed", qw0.x(str2, "req_id"));
                return;
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    oc7.r1(qw0Var.N).T3(updates, false);
                    qw0Var.u(ow0Var, "requested_chat_sent", qw0.x(str, "req_id"));
                    return;
                }
                ylb ylbVar3 = qw0Var.e;
                if (tL_error2 != null) {
                    new c41(qw0Var, ylbVar3).g0(tL_error2, false);
                    qw0Var.u(ow0Var, "requested_chat_failed", qw0.x(str, "req_id"));
                    return;
                }
                new c41(qw0Var, ylbVar3).f0("UNKNOWN_BUTTON", false);
                qw0Var.u(ow0Var, "requested_chat_failed", qw0.x(str, "req_id"));
                return;
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates2 != null) {
                    oc7.r1(qw0Var.N).T3(updates2, false);
                    qw0Var.u(ow0Var, "requested_chat_sent", qw0.x(str, "req_id"));
                    return;
                }
                ylb ylbVar4 = qw0Var.e;
                if (tL_error3 != null) {
                    new c41(qw0Var, ylbVar4).g0(tL_error3, false);
                    qw0Var.u(ow0Var, "requested_chat_failed", qw0.x(str, "req_id"));
                    return;
                }
                new c41(qw0Var, ylbVar4).f0("UNKNOWN_BUTTON", false);
                qw0Var.u(ow0Var, "requested_chat_failed", qw0.x(str, "req_id"));
                return;
        }
    }
}
