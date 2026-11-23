package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class pg implements Runnable {
    public final int f26302a = 1;
    public final si f26303b;
    public final tr f26304c;
    public final TLRPC.Message d;

    public pg(si siVar, tr trVar, TLRPC.Message message) {
        this.f26303b = siVar;
        this.f26304c = trVar;
        this.d = message;
    }

    @Override
    public final void run() {
        int i7 = this.f26302a;
        TLRPC.Message message = this.d;
        tr trVar = this.f26304c;
        si siVar = this.f26303b;
        switch (i7) {
            case 0:
                siVar.getNotificationCenter().k(69, message, trVar);
                return;
            default:
                a0.h hVar = siVar.B1;
                HashMap hashMap = siVar.A1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(trVar);
                hashMap.put(trVar, message);
                a0.h hVar2 = siVar.f26869z1;
                ArrayList arrayList = (ArrayList) hVar2.f(trVar.f27073a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                hVar2.k(arrayList, trVar.f27073a);
                if (gj.v0(message) == 0) {
                    if (message2 != null) {
                        hVar.e(message2.f28455id);
                    }
                    hVar.k(trVar, message.f28455id);
                }
                siVar.getNotificationCenter().k(69, message, trVar);
                return;
        }
    }

    public pg(si siVar, TLRPC.Message message, tr trVar) {
        this.f26303b = siVar;
        this.d = message;
        this.f26304c = trVar;
    }
}
