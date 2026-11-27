package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class m44 extends l44 {
    public final void b(int i, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, int i2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            TLRPC.TL_message b = o44.b((TL_ephemeral.EphemeralMessage) obj);
            int i4 = i;
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap;
            ConcurrentHashMap concurrentHashMap4 = concurrentHashMap2;
            r47 r47Var = new r47(i4, (TLRPC.Message) b, (AbstractMap) concurrentHashMap3, (AbstractMap) concurrentHashMap4, true, true);
            long B0 = r47.B0(b);
            if (i2 != 0) {
                b.edit_date = i2;
                b.flags |= 32768;
            }
            zh6 zh6Var = this.b;
            TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) zh6Var.f(B0);
            if (tL_messages_messages == null) {
                tL_messages_messages = new TLRPC.TL_messages_messages();
                zh6Var.k(B0, tL_messages_messages);
            }
            tL_messages_messages.messages.add(b);
            zh6 zh6Var2 = this.c;
            ArrayList arrayList2 = (ArrayList) zh6Var2.f(B0);
            if (arrayList2 == null) {
                arrayList2 = qd4.s(zh6Var2, B0);
            }
            arrayList2.add(r47Var);
            i = i4;
            concurrentHashMap = concurrentHashMap3;
            concurrentHashMap2 = concurrentHashMap4;
        }
    }
}
