package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jh implements Runnable {
    public final int f24881a;
    public final ri f24882b;
    public final ArrayList f24883c;

    public jh(ri riVar, ArrayList arrayList, int i7) {
        this.f24881a = i7;
        this.f24882b = riVar;
        this.f24883c = arrayList;
    }

    @Override
    public final void run() {
        int i7 = this.f24881a;
        ArrayList arrayList = this.f24883c;
        ri riVar = this.f24882b;
        switch (i7) {
            case 0:
                riVar.getNotificationCenter().k(56, Long.valueOf(fj.B0(((fj) arrayList.get(0)).f23993k)), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
                return;
            default:
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            tr.d((TLRPC.Message) arrayList.get(i10), hVar, hVar2);
                        } catch (Exception e10) {
                            riVar.getMessagesStorage().o(e10, true);
                        }
                    }
                    riVar.getMessagesStorage().K0(hVar, hVar2, arrayList2, arrayList3, 0);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
