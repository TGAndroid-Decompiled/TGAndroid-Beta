package bg;

import java.util.AbstractMap;
import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class u extends t {
    public final void b(int i7, AbstractMap abstractMap, AbstractMap abstractMap2, int i10) {
        ArrayList arrayList = this.f3373a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TLRPC.TL_message b10 = w.b((TL_ephemeral.EphemeralMessage) obj);
            int i12 = i7;
            AbstractMap abstractMap3 = abstractMap;
            AbstractMap abstractMap4 = abstractMap2;
            ij ijVar = new ij(i12, (TLRPC.Message) b10, abstractMap3, abstractMap4, true, true);
            long B0 = ij.B0(b10);
            if (i10 != 0) {
                b10.edit_date = i10;
                b10.flags |= 32768;
            }
            a0.h hVar = this.f3374b;
            TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar.f(B0);
            if (tL_messages_messages == null) {
                tL_messages_messages = new TLRPC.TL_messages_messages();
                hVar.k(tL_messages_messages, B0);
            }
            tL_messages_messages.messages.add(b10);
            a0.h hVar2 = this.f3375c;
            ArrayList arrayList2 = (ArrayList) hVar2.f(B0);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hVar2.k(arrayList2, B0);
            }
            arrayList2.add(ijVar);
            i7 = i12;
            abstractMap = abstractMap3;
            abstractMap2 = abstractMap4;
        }
    }
}
