package bg;

import java.util.ArrayList;
import org.telegram.messenger.f3;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public class u {
    public final ArrayList f3340a = new ArrayList();
    public final a0.h f3341b = new a0.h();
    public final a0.h f3342c = new a0.h();

    public static void a(u uVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, fj fjVar) {
        a0.h hVar = uVar.f3342c;
        long B0 = fj.B0(tL_message);
        uVar.f3340a.add(ephemeralMessage);
        a0.h hVar2 = uVar.f3341b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar2.f(B0);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            hVar2.k(tL_messages_messages, B0);
        }
        tL_messages_messages.messages.add(tL_message);
        ArrayList arrayList = (ArrayList) hVar.f(B0);
        if (arrayList == null) {
            arrayList = f3.h(hVar, B0);
        }
        arrayList.add(fjVar);
    }
}
