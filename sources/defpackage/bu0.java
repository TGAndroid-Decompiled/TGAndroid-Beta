package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
public final class bu0 implements fg7, wi3 {
    public final hv0 a;
    public final boolean[] b;
    public final String c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final ev0 e;

    public bu0(hv0 hv0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, ev0 ev0Var) {
        this.a = hv0Var;
        this.b = zArr;
        this.c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = ev0Var;
    }

    @Override
    public final boolean F() {
        return false;
    }

    @Override
    public final void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            this.b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            hv0 hv0Var = this.a;
            na7.q1(hv0Var.N);
            tL_messages_sendBotRequestedPeer.peer = na7.l1(hv0Var.V);
            String str = this.c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(na7.q1(hv0Var.N).h1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(hv0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new hc((byte) 0), new ut0(hv0Var, this.e, str, (byte) 2));
        }
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        if (!arrayList.isEmpty()) {
            this.b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            hv0 hv0Var = this.a;
            na7.q1(hv0Var.N);
            tL_messages_sendBotRequestedPeer.peer = na7.l1(hv0Var.V);
            String str = this.c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                hashSet.add(Long.valueOf(((zc7) obj).a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(na7.q1(hv0Var.N).h1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(hv0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new hc((byte) 0), new ut0(hv0Var, this.e, str, (byte) 1));
        }
        cj3Var.finishFragment();
        return true;
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }
}
