package gf;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;

public final class u extends t {
    public final void b(int i10, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i11) {
        ArrayList arrayList = this.f7057a;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            TLRPC.TL_message tL_messageB = x.b((TL_ephemeral.EphemeralMessage) obj);
            int i13 = i10;
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap;
            ConcurrentHashMap concurrentHashMap4 = concurrentHashMap2;
            MessageObject messageObject = new MessageObject(i13, (TLRPC.Message) tL_messageB, (AbstractMap<Long, TLRPC.User>) concurrentHashMap3, (AbstractMap<Long, TLRPC.Chat>) concurrentHashMap4, true, true);
            long dialogId = MessageObject.getDialogId(tL_messageB);
            if (i11 != 0) {
                tL_messageB.edit_date = i11;
                tL_messageB.flags |= 32768;
            }
            a0.h hVar = this.f7058b;
            TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar.f(dialogId);
            if (tL_messages_messages == null) {
                tL_messages_messages = new TLRPC.TL_messages_messages();
                hVar.k(tL_messages_messages, dialogId);
            }
            tL_messages_messages.messages.add(tL_messageB);
            a0.h hVar2 = this.f7059c;
            ArrayList arrayListL = (ArrayList) hVar2.f(dialogId);
            if (arrayListL == null) {
                arrayListL = y1.l(dialogId, hVar2);
            }
            arrayListL.add(messageObject);
            i10 = i13;
            concurrentHashMap = concurrentHashMap3;
            concurrentHashMap2 = concurrentHashMap4;
        }
    }
}
