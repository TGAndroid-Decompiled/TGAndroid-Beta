package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
public final class kv0 implements ii7, hk3 {
    public final qw0 a;
    public final boolean[] b;
    public final String c;
    public final TL_keyboard.TL_buttonTypeRequestPeer d;
    public final ow0 e;

    public kv0(qw0 qw0Var, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, ow0 ow0Var) {
        this.a = qw0Var;
        this.b = zArr;
        this.c = str;
        this.d = tL_buttonTypeRequestPeer;
        this.e = ow0Var;
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
            qw0 qw0Var = this.a;
            oc7.r1(qw0Var.N);
            tL_messages_sendBotRequestedPeer.peer = oc7.m1(qw0Var.V);
            String str = this.c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(oc7.r1(qw0Var.N).i1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(qw0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new kc((byte) 0), new dv0(qw0Var, this.e, str, (byte) 2));
        }
    }

    @Override
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        if (!arrayList.isEmpty()) {
            this.b[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            qw0 qw0Var = this.a;
            oc7.r1(qw0Var.N);
            tL_messages_sendBotRequestedPeer.peer = oc7.m1(qw0Var.V);
            String str = this.c;
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = this.d.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                hashSet.add(Long.valueOf(((bf7) obj).a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(oc7.r1(qw0Var.N).i1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(qw0Var.N).sendRequestTyped(tL_messages_sendBotRequestedPeer, new kc((byte) 0), new dv0(qw0Var, this.e, str, (byte) 1));
        }
        nk3Var.finishFragment();
        return true;
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        return false;
    }
}
