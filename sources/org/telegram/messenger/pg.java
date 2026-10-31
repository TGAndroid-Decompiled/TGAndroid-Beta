package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class pg implements Runnable {
    public final int f17435a = 1;
    public final ui f17436b;
    public final gs f17437c;
    public final TLRPC.Message d;

    public pg(ui uiVar, gs gsVar, TLRPC.Message message) {
        this.f17436b = uiVar;
        this.f17437c = gsVar;
        this.d = message;
    }

    @Override
    public final void run() {
        int i10 = this.f17435a;
        TLRPC.Message message = this.d;
        gs gsVar = this.f17437c;
        ui uiVar = this.f17436b;
        switch (i10) {
            case 0:
                uiVar.getNotificationCenter().k(69, message, gsVar);
                return;
            default:
                a0.h hVar = uiVar.f18361y1;
                HashMap hashMap = uiVar.f18358x1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(gsVar);
                hashMap.put(gsVar, message);
                a0.h hVar2 = uiVar.f18355w1;
                ArrayList arrayList = (ArrayList) hVar2.f(gsVar.f15760a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                hVar2.k(arrayList, gsVar.f15760a);
                if (jj.v0(message) == 0) {
                    if (message2 != null) {
                        hVar.e(message2.f19814id);
                    }
                    hVar.k(gsVar, message.f19814id);
                }
                uiVar.getNotificationCenter().k(69, message, gsVar);
                return;
        }
    }

    public pg(ui uiVar, TLRPC.Message message, gs gsVar) {
        this.f17436b = uiVar;
        this.d = message;
        this.f17437c = gsVar;
    }
}
