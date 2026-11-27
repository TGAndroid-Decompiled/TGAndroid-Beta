package defpackage;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class du0 implements icc {
    public final byte a;
    public final rv0 b;
    public final pv0 c;
    public final String d;

    public du0(rv0 rv0Var, pv0 pv0Var, String str, byte b) {
        this.a = b;
        this.b = rv0Var;
        this.c = pv0Var;
        this.d = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i;
        qi7 qi7Var;
        byte b = this.a;
        String str = this.d;
        pv0 pv0Var = this.c;
        rv0 rv0Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) ehb.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                rv0 rv0Var2 = this.b;
                pv0 pv0Var2 = this.c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = rv0Var2.getContext();
                        int i2 = rv0Var2.N;
                        TLRPC.User user = rv0Var2.V;
                        ku0 ku0Var = new ku0(rv0Var2, pv0Var2, str2, tL_buttonTypeRequestPeer, (byte) 0);
                        vnb vnbVar = rv0Var2.e;
                        t03.e(context, i2, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, ku0Var, vnbVar, new d31(rv0Var2, vnbVar));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        lu0 lu0Var = new lu0(rv0Var2, zArr, str2, tL_buttonTypeRequestPeer, pv0Var2);
                        qi7 qi7Var2 = qi7.p2;
                        e Q = LaunchActivity.Q();
                        if (Q == null) {
                            qi7Var = null;
                        } else {
                            qi7Var = qi7.p2;
                            if (qi7Var == null) {
                                qi7 qi7Var3 = new qi7(Q, i, bool, bool2, lu0Var);
                                qi7Var3.show();
                                qi7.p2 = qi7Var3;
                                qi7Var = qi7Var3;
                            }
                        }
                        if (qi7Var != null) {
                            qi7Var.setOnDismissListener(new mu0(rv0Var2, zArr, pv0Var2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle j = qd4.j(15, "onlySelect", "dialogsType", true);
                        j.putLong("requestPeerBotId", rv0Var2.V.id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            j.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        boolean[] zArr2 = new boolean[1];
                        su0 su0Var = new su0(rv0Var2, j, zArr2, pv0Var2);
                        su0Var.E2 = new lu0(rv0Var2, zArr2, str2, tL_buttonTypeRequestPeer, pv0Var2);
                        e S = LaunchActivity.S();
                        if (S != 0) {
                            ?? obj3 = new Object();
                            obj3.a = true;
                            S.showAsSheet(su0Var, obj3);
                            return;
                        }
                        return;
                    }
                }
                vnb vnbVar2 = rv0Var2.e;
                if (tL_error != null) {
                    new d31(rv0Var2, vnbVar2).g0(tL_error, false);
                    rv0Var2.u(pv0Var2, "requested_chat_failed", rv0.x(str2, "req_id"));
                    return;
                }
                new d31(rv0Var2, vnbVar2).f0("UNKNOWN_BUTTON", false);
                rv0Var2.u(pv0Var2, "requested_chat_failed", rv0.x(str2, "req_id"));
                return;
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    uc7.s1(rv0Var.N).Y3(updates, false);
                    rv0Var.u(pv0Var, "requested_chat_sent", rv0.x(str, "req_id"));
                    return;
                }
                vnb vnbVar3 = rv0Var.e;
                if (tL_error2 != null) {
                    new d31(rv0Var, vnbVar3).g0(tL_error2, false);
                    rv0Var.u(pv0Var, "requested_chat_failed", rv0.x(str, "req_id"));
                    return;
                }
                new d31(rv0Var, vnbVar3).f0("UNKNOWN_BUTTON", false);
                rv0Var.u(pv0Var, "requested_chat_failed", rv0.x(str, "req_id"));
                return;
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates2 != null) {
                    uc7.s1(rv0Var.N).Y3(updates2, false);
                    rv0Var.u(pv0Var, "requested_chat_sent", rv0.x(str, "req_id"));
                    return;
                }
                vnb vnbVar4 = rv0Var.e;
                if (tL_error3 != null) {
                    new d31(rv0Var, vnbVar4).g0(tL_error3, false);
                    rv0Var.u(pv0Var, "requested_chat_failed", rv0.x(str, "req_id"));
                    return;
                }
                new d31(rv0Var, vnbVar4).f0("UNKNOWN_BUTTON", false);
                rv0Var.u(pv0Var, "requested_chat_failed", rv0.x(str, "req_id"));
                return;
        }
    }
}
