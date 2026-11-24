package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m24 {
    public final ArrayList a = new ArrayList();
    public final e34 b;

    public m24(e34 e34Var) {
        this.b = e34Var;
    }

    public final void a(String str, boolean z) {
        e34 e34Var = this.b;
        int i = e34Var.d1;
        String o = kt6.o("gif_search_", str, "_");
        if (!z || !e34Var.m0.containsKey(o)) {
            String str2 = str;
            rj1 rj1Var = new rj1(this, str2, z, o, (byte) 5);
            ArrayList arrayList = this.a;
            if (z) {
                arrayList.add(o);
                cf7.Y(i).L(o, rj1Var);
                return;
            }
            oc7 r1 = oc7.r1(i);
            TLObject b2 = r1.b2(r1.o3);
            if (!(b2 instanceof TLRPC.User)) {
                return;
            }
            arrayList.add(o);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.bot = r1.p1((TLRPC.User) b2);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_getInlineBotResults, rj1Var, 2);
        }
    }
}
