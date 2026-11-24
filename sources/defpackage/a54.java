package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public class a54 {
    public final ArrayList a = new ArrayList();
    public final vh6 b = new vh6();
    public final vh6 c = new vh6();

    public final void a(TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, k47 k47Var) {
        long B0 = k47.B0(tL_message);
        this.a.add(ephemeralMessage);
        vh6 vh6Var = this.b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) vh6Var.f(B0);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            vh6Var.k(tL_messages_messages, B0);
        }
        tL_messages_messages.messages.add(tL_message);
        vh6 vh6Var2 = this.c;
        ArrayList arrayList = (ArrayList) vh6Var2.f(B0);
        if (arrayList == null) {
            arrayList = td4.t(vh6Var2, B0);
        }
        arrayList.add(k47Var);
    }
}
