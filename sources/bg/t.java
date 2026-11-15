package bg;

import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public class t {
    public final ArrayList f3332a = new ArrayList();
    public final a0.h f3333b = new a0.h();
    public final a0.h f3334c = new a0.h();

    public static void a(t tVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, gj gjVar) {
        a0.h hVar = tVar.f3334c;
        long B0 = gj.B0(tL_message);
        tVar.f3332a.add(ephemeralMessage);
        a0.h hVar2 = tVar.f3333b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar2.f(B0);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            hVar2.k(tL_messages_messages, B0);
        }
        tL_messages_messages.messages.add(tL_message);
        ArrayList arrayList = (ArrayList) hVar.f(B0);
        if (arrayList == null) {
            arrayList = k5.i(hVar, B0);
        }
        arrayList.add(gjVar);
    }
}
