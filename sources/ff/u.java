package ff;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class u extends t {
    public final void b(int i9, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i10) {
        ArrayList arrayList = this.f6257a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TLRPC.TL_message b10 = x.b((TL_ephemeral.EphemeralMessage) obj);
            int i12 = i9;
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap;
            ConcurrentHashMap concurrentHashMap4 = concurrentHashMap2;
            MessageObject messageObject = new MessageObject(i12, (TLRPC.Message) b10, (AbstractMap<Long, TLRPC.User>) concurrentHashMap3, (AbstractMap<Long, TLRPC.Chat>) concurrentHashMap4, true, true);
            long dialogId = MessageObject.getDialogId(b10);
            if (i10 != 0) {
                b10.edit_date = i10;
                b10.flags |= 32768;
            }
            a0.h hVar = this.f6258b;
            TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar.f(dialogId);
            if (tL_messages_messages == null) {
                tL_messages_messages = new TLRPC.TL_messages_messages();
                hVar.k(tL_messages_messages, dialogId);
            }
            tL_messages_messages.messages.add(b10);
            a0.h hVar2 = this.f6259c;
            ArrayList arrayList2 = (ArrayList) hVar2.f(dialogId);
            if (arrayList2 == null) {
                arrayList2 = org.telegram.messenger.l0.j(dialogId, hVar2);
            }
            arrayList2.add(messageObject);
            i9 = i12;
            concurrentHashMap = concurrentHashMap3;
            concurrentHashMap2 = concurrentHashMap4;
        }
    }
}
