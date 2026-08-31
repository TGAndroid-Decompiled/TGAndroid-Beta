package eh;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.x51;
public final class n implements Utilities.Callback2 {
    public final int f5661a;
    public final u f5662b;

    public n(u uVar, int i10) {
        this.f5661a = i10;
        this.f5662b = uVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f5661a;
        u uVar = this.f5662b;
        boolean z4 = false;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                x51 x51Var = (x51) obj2;
                arrayList.clear();
                ArrayList arrayList2 = uVar.f5678j;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(uVar.f5671a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    t tVar = new t(uVar, peerDialogId, 0);
                    int i13 = q.f5665a;
                    j51 J = j51.J(q.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f28027z = i12;
                    J.D = tVar;
                    arrayList.add(J);
                }
                if (!uVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = r.f5666a;
                        arrayList.add(j51.J(r.class));
                        arrayList.add(j51.J(r.class));
                        arrayList.add(j51.J(r.class));
                        arrayList.add(j51.J(r.class));
                        arrayList.add(j51.J(r.class));
                        return;
                    }
                    int i15 = s.f5667a;
                    arrayList.add(j51.J(s.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = uVar.f5671a;
                uVar.f5677i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    uVar.f5676g = str;
                    if (str == null) {
                        z4 = true;
                    }
                    uVar.h = z4;
                    uVar.f5678j.addAll(tL_messages_votesList.votes);
                    m mVar = uVar.f5674e;
                    if (mVar != null) {
                        mVar.run();
                        return;
                    }
                    return;
                }
                uVar.f5676g = null;
                uVar.h = true;
                return;
        }
    }
}
