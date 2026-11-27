package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w14 {
    public final ArrayList a = new ArrayList();
    public final o24 b;

    public w14(o24 o24Var) {
        this.b = o24Var;
    }

    public final void a(String str, boolean z) {
        o24 o24Var = this.b;
        int i = o24Var.d1;
        String y = qd4.y("gif_search_", str, "_");
        if (!z || !o24Var.m0.containsKey(y)) {
            String str2 = str;
            si1 si1Var = new si1(this, str2, z, y, (byte) 5);
            ArrayList arrayList = this.a;
            if (z) {
                arrayList.add(y);
                kf7.a0(i).N(y, si1Var);
                return;
            }
            uc7 s1 = uc7.s1(i);
            TLObject c2 = s1.c2(s1.p3);
            if (!(c2 instanceof TLRPC.User)) {
                return;
            }
            arrayList.add(y);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.bot = s1.q1((TLRPC.User) c2);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_getInlineBotResults, si1Var, 2);
        }
    }
}
