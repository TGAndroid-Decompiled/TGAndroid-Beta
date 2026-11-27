package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
public final class lu0 implements pi7, oj3 {
    public final rv0 a;
    public final boolean[] b;
    public final String c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final pv0 e;

    public lu0(rv0 rv0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, pv0 pv0Var) {
        this.a = rv0Var;
        this.b = zArr;
        this.c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = pv0Var;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            this.b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            rv0 rv0Var = this.a;
            uc7.s1(rv0Var.N);
            tL_messages_sendBotRequestedPeer.peer = uc7.n1(rv0Var.V);
            String str = this.c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(uc7.s1(rv0Var.N).j1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(rv0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new ic((byte) 0), new du0(rv0Var, this.e, str, (byte) 2));
        }
    }

    @Override
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        if (!arrayList.isEmpty()) {
            this.b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            rv0 rv0Var = this.a;
            uc7.s1(rv0Var.N);
            tL_messages_sendBotRequestedPeer.peer = uc7.n1(rv0Var.V);
            String str = this.c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                hashSet.add(Long.valueOf(((jf7) obj).a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(uc7.s1(rv0Var.N).j1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(rv0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new ic((byte) 0), new du0(rv0Var, this.e, str, (byte) 1));
        }
        uj3Var.finishFragment();
        return true;
    }

    @Override
    public final boolean s(uj3 uj3Var) {
        return false;
    }
}
