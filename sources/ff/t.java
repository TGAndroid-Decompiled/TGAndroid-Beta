package ff;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public class t {
    public final ArrayList f6257a = new ArrayList();
    public final a0.h f6258b = new a0.h();
    public final a0.h f6259c = new a0.h();

    public static void a(t tVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, MessageObject messageObject) {
        a0.h hVar = tVar.f6259c;
        long dialogId = MessageObject.getDialogId(tL_message);
        tVar.f6257a.add(ephemeralMessage);
        a0.h hVar2 = tVar.f6258b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar2.f(dialogId);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            hVar2.k(tL_messages_messages, dialogId);
        }
        tL_messages_messages.messages.add(tL_message);
        ArrayList arrayList = (ArrayList) hVar.f(dialogId);
        if (arrayList == null) {
            arrayList = org.telegram.messenger.l0.j(dialogId, hVar);
        }
        arrayList.add(messageObject);
    }
}
