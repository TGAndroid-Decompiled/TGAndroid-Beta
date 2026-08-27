package gf;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;

public class t {

    public final ArrayList f7057a = new ArrayList();

    public final a0.h f7058b = new a0.h();

    public final a0.h f7059c = new a0.h();

    public static void a(t tVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, MessageObject messageObject) {
        a0.h hVar = tVar.f7059c;
        long dialogId = MessageObject.getDialogId(tL_message);
        tVar.f7057a.add(ephemeralMessage);
        a0.h hVar2 = tVar.f7058b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar2.f(dialogId);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            hVar2.k(tL_messages_messages, dialogId);
        }
        tL_messages_messages.messages.add(tL_message);
        ArrayList arrayListL = (ArrayList) hVar.f(dialogId);
        if (arrayListL == null) {
            arrayListL = y1.l(dialogId, hVar);
        }
        arrayListL.add(messageObject);
    }
}
