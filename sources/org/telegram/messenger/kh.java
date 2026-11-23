package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kh implements Runnable {
    public final int f25068a;
    public final si f25069b;
    public final ArrayList f25070c;

    public kh(si siVar, ArrayList arrayList, int i7) {
        this.f25068a = i7;
        this.f25069b = siVar;
        this.f25070c = arrayList;
    }

    @Override
    public final void run() {
        int i7 = this.f25068a;
        ArrayList arrayList = this.f25070c;
        si siVar = this.f25069b;
        switch (i7) {
            case 0:
                siVar.getNotificationCenter().k(56, Long.valueOf(gj.B0(((gj) arrayList.get(0)).f24213k)), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
                return;
            default:
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            ur.d((TLRPC.Message) arrayList.get(i10), hVar, hVar2);
                        } catch (Exception e10) {
                            siVar.getMessagesStorage().o(e10, true);
                        }
                    }
                    siVar.getMessagesStorage().K0(hVar, hVar2, arrayList2, arrayList3, 0);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
