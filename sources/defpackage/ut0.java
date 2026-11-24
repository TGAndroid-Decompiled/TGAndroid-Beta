package defpackage;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class ut0 implements i8c {
    public final byte a;
    public final hv0 b;
    public final ev0 c;
    public final String d;

    public ut0(hv0 hv0Var, ev0 ev0Var, String str, byte b) {
        this.a = b;
        this.b = hv0Var;
        this.c = ev0Var;
        this.d = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i;
        gg7 gg7Var;
        byte b = this.a;
        String str = this.d;
        ev0 ev0Var = this.c;
        hv0 hv0Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) jdb.a((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                hv0 hv0Var2 = this.b;
                ev0 ev0Var2 = this.c;
                String str2 = this.d;
                if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = hv0Var2.getContext();
                        int i2 = hv0Var2.N;
                        TLRPC.User user = hv0Var2.V;
                        au0 au0Var = new au0(hv0Var2, ev0Var2, str2, tL_buttonTypeRequestPeer, (byte) 0);
                        wjb wjbVar = hv0Var2.e;
                        a03.e(context, i2, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, au0Var, wjbVar, new u21(hv0Var2, wjbVar));
                        return;
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        bu0 bu0Var = new bu0(hv0Var2, zArr, str2, tL_buttonTypeRequestPeer, ev0Var2);
                        gg7 gg7Var2 = gg7.p2;
                        d Q = LaunchActivity.Q();
                        if (Q == null) {
                            gg7Var = null;
                        } else {
                            gg7Var = gg7.p2;
                            if (gg7Var == null) {
                                gg7 gg7Var3 = new gg7(Q, i, bool, bool2, bu0Var);
                                gg7Var3.show();
                                gg7.p2 = gg7Var3;
                                gg7Var = gg7Var3;
                            }
                        }
                        if (gg7Var != null) {
                            gg7Var.setOnDismissListener(new cu0(hv0Var2, zArr, ev0Var2, str2));
                            return;
                        }
                        return;
                    } else {
                        Bundle j = tb4.j(15, "onlySelect", "dialogsType", true);
                        j.putLong("requestPeerBotId", hv0Var2.V.id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            j.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        boolean[] zArr2 = new boolean[1];
                        ju0 ju0Var = new ju0(hv0Var2, j, zArr2, ev0Var2);
                        ju0Var.E2 = new bu0(hv0Var2, zArr2, str2, tL_buttonTypeRequestPeer, ev0Var2);
                        d S = LaunchActivity.S();
                        if (S != 0) {
                            ?? obj3 = new Object();
                            obj3.a = true;
                            S.showAsSheet(ju0Var, obj3);
                            return;
                        }
                        return;
                    }
                }
                wjb wjbVar2 = hv0Var2.e;
                if (tL_error != null) {
                    new u21(hv0Var2, wjbVar2).g0(tL_error, false);
                    hv0Var2.u(ev0Var2, "requested_chat_failed", hv0.x(str2, "req_id"));
                    return;
                }
                new u21(hv0Var2, wjbVar2).f0("UNKNOWN_BUTTON", false);
                hv0Var2.u(ev0Var2, "requested_chat_failed", hv0.x(str2, "req_id"));
                return;
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    na7.q1(hv0Var.N).Q3(updates, false);
                    hv0Var.u(ev0Var, "requested_chat_sent", hv0.x(str, "req_id"));
                    return;
                }
                wjb wjbVar3 = hv0Var.e;
                if (tL_error2 != null) {
                    new u21(hv0Var, wjbVar3).g0(tL_error2, false);
                    hv0Var.u(ev0Var, "requested_chat_failed", hv0.x(str, "req_id"));
                    return;
                }
                new u21(hv0Var, wjbVar3).f0("UNKNOWN_BUTTON", false);
                hv0Var.u(ev0Var, "requested_chat_failed", hv0.x(str, "req_id"));
                return;
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates2 != null) {
                    na7.q1(hv0Var.N).Q3(updates2, false);
                    hv0Var.u(ev0Var, "requested_chat_sent", hv0.x(str, "req_id"));
                    return;
                }
                wjb wjbVar4 = hv0Var.e;
                if (tL_error3 != null) {
                    new u21(hv0Var, wjbVar4).g0(tL_error3, false);
                    hv0Var.u(ev0Var, "requested_chat_failed", hv0.x(str, "req_id"));
                    return;
                }
                new u21(hv0Var, wjbVar4).f0("UNKNOWN_BUTTON", false);
                hv0Var.u(ev0Var, "requested_chat_failed", hv0.x(str, "req_id"));
                return;
        }
    }
}
