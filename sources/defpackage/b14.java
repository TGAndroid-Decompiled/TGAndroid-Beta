package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b14 {
    public final ArrayList a = new ArrayList();
    public final t14 b;

    public b14(t14 t14Var) {
        this.b = t14Var;
    }

    public final void a(String str, boolean z) {
        t14 t14Var = this.b;
        int i = t14Var.d1;
        String y = tb4.y("gif_search_", str, "_");
        if (!z || !t14Var.m0.containsKey(y)) {
            String str2 = str;
            ji1 ji1Var = new ji1(this, str2, z, y, (byte) 5);
            ArrayList arrayList = this.a;
            if (z) {
                arrayList.add(y);
                ad7.Y(i).L(y, ji1Var);
                return;
            }
            na7 q1 = na7.q1(i);
            TLObject a2 = q1.a2(q1.o3);
            if (!(a2 instanceof TLRPC.User)) {
                return;
            }
            arrayList.add(y);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.bot = q1.o1((TLRPC.User) a2);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_getInlineBotResults, ji1Var, 2);
        }
    }
}
