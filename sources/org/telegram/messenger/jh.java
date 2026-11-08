package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jh implements Runnable {
    public final int f23556a;
    public final ui f23557b;
    public final ArrayList f23558c;

    public jh(ui uiVar, ArrayList arrayList, int i7) {
        this.f23556a = i7;
        this.f23557b = uiVar;
        this.f23558c = arrayList;
    }

    @Override
    public final void run() {
        int i7 = this.f23556a;
        ArrayList arrayList = this.f23558c;
        ui uiVar = this.f23557b;
        switch (i7) {
            case 0:
                uiVar.getNotificationCenter().k(56, Long.valueOf(ij.B0(((ij) arrayList.get(0)).f23262k)), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
                return;
            default:
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            yr.d((TLRPC.Message) arrayList.get(i10), hVar, hVar2);
                        } catch (Exception e10) {
                            uiVar.getMessagesStorage().o(e10, true);
                        }
                    }
                    uiVar.getMessagesStorage().K0(hVar, hVar2, arrayList2, arrayList3, 0);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
