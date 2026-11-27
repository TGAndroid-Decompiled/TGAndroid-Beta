package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ov1 implements pi7, oj3 {
    public final ChatActivityEnterView a;
    public final r47 b;
    public final TL_keyboard.TL_buttonTypeRequestPeer c;

    public ov1(ChatActivityEnterView chatActivityEnterView, r47 r47Var, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.a = chatActivityEnterView;
        this.b = r47Var;
        this.c = tL_buttonTypeRequestPeer;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void a(ArrayList arrayList) {
        int i = ChatActivityEnterView.X7;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.a;
            uc7 s1 = uc7.s1(chatActivityEnterView.R);
            r47 r47Var = this.b;
            tL_messages_sendBotRequestedPeer.peer = s1.m1(r47Var.k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = r47Var.e1();
            tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                tL_messages_sendBotRequestedPeer.requested_peers.add(uc7.s1(chatActivityEnterView.R).j1(((Long) obj).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
    }

    @Override
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        int i3 = ChatActivityEnterView.X7;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            ChatActivityEnterView chatActivityEnterView = this.a;
            uc7 s1 = uc7.s1(chatActivityEnterView.R);
            r47 r47Var = this.b;
            tL_messages_sendBotRequestedPeer.peer = s1.m1(r47Var.k.peer_id);
            tL_messages_sendBotRequestedPeer.flags |= 1;
            tL_messages_sendBotRequestedPeer.msg_id = r47Var.e1();
            tL_messages_sendBotRequestedPeer.button_id = this.c.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                hashSet.add(Long.valueOf(((jf7) obj).a));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(uc7.s1(chatActivityEnterView.R).j1(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(chatActivityEnterView.R).sendRequest(tL_messages_sendBotRequestedPeer, null);
        }
        uj3Var.finishFragment();
        return true;
    }

    @Override
    public final boolean s(uj3 uj3Var) {
        return false;
    }
}
