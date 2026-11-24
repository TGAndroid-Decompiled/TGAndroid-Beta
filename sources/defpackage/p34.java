package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public class p34 {
    public final ArrayList a = new ArrayList();
    public final vf6 b = new vf6();
    public final vf6 c = new vf6();

    public final void a(TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, k27 k27Var) {
        long B0 = k27.B0(tL_message);
        this.a.add(ephemeralMessage);
        vf6 vf6Var = this.b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) vf6Var.f(B0);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            vf6Var.k(tL_messages_messages, B0);
        }
        tL_messages_messages.messages.add(tL_message);
        vf6 vf6Var2 = this.c;
        ArrayList arrayList = (ArrayList) vf6Var2.f(B0);
        if (arrayList == null) {
            arrayList = tb4.s(vf6Var2, B0);
        }
        arrayList.add(k27Var);
    }
}
