package dh;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.w51;
public final class m implements Utilities.Callback2 {
    public final int f4930a;
    public final t f4931b;

    public m(t tVar, int i10) {
        this.f4930a = i10;
        this.f4931b = tVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f4930a;
        t tVar = this.f4931b;
        boolean z4 = false;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var = (w51) obj2;
                arrayList.clear();
                ArrayList arrayList2 = tVar.f4946j;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                    TLObject userOrChat = MessagesController.getInstance(tVar.f4940a).getUserOrChat(peerDialogId);
                    int i12 = messagePeerVote.date;
                    s sVar = new s(tVar, peerDialogId, 0);
                    int i13 = p.f4934a;
                    i51 J = i51.J(p.class);
                    J.G = userOrChat;
                    J.B = peerDialogId;
                    J.f25598z = i12;
                    J.D = sVar;
                    arrayList.add(J);
                }
                if (!tVar.h) {
                    if (arrayList2.isEmpty()) {
                        int i14 = q.f4935a;
                        arrayList.add(i51.J(q.class));
                        arrayList.add(i51.J(q.class));
                        arrayList.add(i51.J(q.class));
                        arrayList.add(i51.J(q.class));
                        arrayList.add(i51.J(q.class));
                        return;
                    }
                    int i15 = r.f4936a;
                    arrayList.add(i51.J(r.class));
                    return;
                }
                return;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i16 = tVar.f4940a;
                tVar.f4945i = false;
                if (tL_messages_votesList != null) {
                    MessagesController.getInstance(i16).putUsers(tL_messages_votesList.users, false);
                    MessagesController.getInstance(i16).putChats(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    tVar.f4944g = str;
                    if (str == null) {
                        z4 = true;
                    }
                    tVar.h = z4;
                    tVar.f4946j.addAll(tL_messages_votesList.votes);
                    ag.d dVar = tVar.e;
                    if (dVar != null) {
                        dVar.run();
                        return;
                    }
                    return;
                }
                tVar.f4944g = null;
                tVar.h = true;
                return;
        }
    }
}
