package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ow1 implements ii7, hk3 {
    public final ChatActivityEnterView a;
    public final k47 b;
    public final TL_keyboard.TL_buttonTypeRequestPeer c;

    public ow1(ChatActivityEnterView chatActivityEnterView, k47 k47Var, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.a = chatActivityEnterView;
        this.b = k47Var;
        this.c = tL_buttonTypeRequestPeer;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void a(ArrayList arrayList) {
        int i = ChatActivityEnterView.z7;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.a;
            oc7 r1 = oc7.r1(chatActivityEnterView.R);
            k47 k47Var = this.b;
            tL_messages_sendBotRequestedPeer.peer = r1.l1(k47Var.k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = k47Var.e1();
            tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(oc7.r1(chatActivityEnterView.R).i1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
    }

    @Override
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        int i3 = ChatActivityEnterView.z7;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.a;
            oc7 r1 = oc7.r1(chatActivityEnterView.R);
            k47 k47Var = this.b;
            tL_messages_sendBotRequestedPeer.peer = r1.l1(k47Var.k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = k47Var.e1();
            tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                hashSet.add(Long.valueOf(((bf7) obj).a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(oc7.r1(chatActivityEnterView.R).i1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        nk3Var.finishFragment();
        return true;
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        return false;
    }
}
