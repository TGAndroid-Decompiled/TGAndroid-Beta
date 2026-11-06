package bg;

import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public class t {
    public final ArrayList f3373a = new ArrayList();
    public final a0.h f3374b = new a0.h();
    public final a0.h f3375c = new a0.h();

    public static void a(t tVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, ij ijVar) {
        a0.h hVar = tVar.f3375c;
        long B0 = ij.B0(tL_message);
        tVar.f3373a.add(ephemeralMessage);
        a0.h hVar2 = tVar.f3374b;
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
        arrayList.add(ijVar);
    }
}
