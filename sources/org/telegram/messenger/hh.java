package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hh implements Runnable {
    public final int f24152a;
    public final si f24153b;
    public final ArrayList f24154c;

    public hh(si siVar, ArrayList arrayList, int i7) {
        this.f24152a = i7;
        this.f24153b = siVar;
        this.f24154c = arrayList;
    }

    @Override
    public final void run() {
        int i7 = this.f24152a;
        ArrayList arrayList = this.f24154c;
        si siVar = this.f24153b;
        switch (i7) {
            case 0:
                siVar.getNotificationCenter().k(56, Long.valueOf(gj.B0(((gj) arrayList.get(0)).f23819k)), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
                return;
            default:
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            vr.d((TLRPC.Message) arrayList.get(i10), hVar, hVar2);
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
