package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hh implements Runnable {
    public final int f15890a;
    public final ui f15891b;
    public final ArrayList f15892c;

    public hh(ui uiVar, ArrayList arrayList, int i10) {
        this.f15890a = i10;
        this.f15891b = uiVar;
        this.f15892c = arrayList;
    }

    @Override
    public final void run() {
        int i10 = this.f15890a;
        ArrayList arrayList = this.f15892c;
        ui uiVar = this.f15891b;
        switch (i10) {
            case 0:
                uiVar.getNotificationCenter().k(56, Long.valueOf(jj.B0(((jj) arrayList.get(0)).f16337k)), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
                return;
            default:
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        try {
                            hs.d((TLRPC.Message) arrayList.get(i11), hVar, hVar2);
                        } catch (Exception e) {
                            uiVar.getMessagesStorage().o(e, true);
                        }
                    }
                    uiVar.getMessagesStorage().K0(hVar, hVar2, arrayList2, arrayList3, 0);
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
        }
    }
}
