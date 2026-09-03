package lf;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class t extends s {
    public final void b(int i10, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i11) {
        ArrayList arrayList = this.f12509a;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            TLRPC.TL_message b10 = w.b((TL_ephemeral.EphemeralMessage) obj);
            int i13 = i10;
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap;
            ConcurrentHashMap concurrentHashMap4 = concurrentHashMap2;
            MessageObject messageObject = new MessageObject(i13, (TLRPC.Message) b10, (AbstractMap<Long, TLRPC.User>) concurrentHashMap3, (AbstractMap<Long, TLRPC.Chat>) concurrentHashMap4, true, true);
            long dialogId = MessageObject.getDialogId(b10);
            if (i11 != 0) {
                b10.edit_date = i11;
                b10.flags |= 32768;
            }
            a0.h hVar = this.f12510b;
            TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar.f(dialogId);
            if (tL_messages_messages == null) {
                tL_messages_messages = new TLRPC.TL_messages_messages();
                hVar.k(tL_messages_messages, dialogId);
            }
            tL_messages_messages.messages.add(b10);
            a0.h hVar2 = this.f12511c;
            ArrayList arrayList2 = (ArrayList) hVar2.f(dialogId);
            if (arrayList2 == null) {
                arrayList2 = y3.l(dialogId, hVar2);
            }
            arrayList2.add(messageObject);
            i10 = i13;
            concurrentHashMap = concurrentHashMap3;
            concurrentHashMap2 = concurrentHashMap4;
        }
    }
}
