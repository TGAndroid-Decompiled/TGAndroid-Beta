package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class cv1 implements fg7, wi3 {
    public final ChatActivityEnterView a;
    public final k27 b;
    public final TL_keyboard.TL_buttonTypeRequestPeer c;

    public cv1(ChatActivityEnterView chatActivityEnterView, k27 k27Var, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.a = chatActivityEnterView;
        this.b = k27Var;
        this.c = tL_buttonTypeRequestPeer;
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void a(ArrayList arrayList) {
        int i = ChatActivityEnterView.r7;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.a;
            na7 q1 = na7.q1(chatActivityEnterView.R);
            k27 k27Var = this.b;
            tL_messages_sendBotRequestedPeer.peer = q1.k1(k27Var.k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = k27Var.e1();
            tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(na7.q1(chatActivityEnterView.R).h1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        int i3 = ChatActivityEnterView.r7;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.a;
            na7 q1 = na7.q1(chatActivityEnterView.R);
            k27 k27Var = this.b;
            tL_messages_sendBotRequestedPeer.peer = q1.k1(k27Var.k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = k27Var.e1();
            tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                hashSet.add(Long.valueOf(((zc7) obj).a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(na7.q1(chatActivityEnterView.R).h1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        cj3Var.finishFragment();
        return true;
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }
}
