package cg;

import java.util.ArrayList;
import org.telegram.messenger.k5;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public class s {
    public final ArrayList f4738a = new ArrayList();
    public final a0.h f4739b = new a0.h();
    public final a0.h f4740c = new a0.h();

    public static void a(s sVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, zi ziVar) {
        a0.h hVar = sVar.f4740c;
        long B0 = zi.B0(tL_message);
        sVar.f4738a.add(ephemeralMessage);
        a0.h hVar2 = sVar.f4739b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar2.f(B0);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            hVar2.k(tL_messages_messages, B0);
        }
        tL_messages_messages.messages.add(tL_message);
        ArrayList arrayList = (ArrayList) hVar.f(B0);
        if (arrayList == null) {
            arrayList = k5.j(hVar, B0);
        }
        arrayList.add(ziVar);
    }
}
