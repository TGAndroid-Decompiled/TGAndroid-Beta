package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class qg implements Runnable {
    public final int f17770a = 1;
    public final vi f17771b;
    public final hs f17772c;
    public final TLRPC.Message d;

    public qg(vi viVar, hs hsVar, TLRPC.Message message) {
        this.f17771b = viVar;
        this.f17772c = hsVar;
        this.d = message;
    }

    @Override
    public final void run() {
        int i10 = this.f17770a;
        TLRPC.Message message = this.d;
        hs hsVar = this.f17772c;
        vi viVar = this.f17771b;
        switch (i10) {
            case 0:
                viVar.getNotificationCenter().k(69, message, hsVar);
                return;
            default:
                a0.h hVar = viVar.f18690y1;
                HashMap hashMap = viVar.f18687x1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(hsVar);
                hashMap.put(hsVar, message);
                a0.h hVar2 = viVar.f18684w1;
                ArrayList arrayList = (ArrayList) hVar2.f(hsVar.f16109a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                hVar2.k(arrayList, hsVar.f16109a);
                if (kj.v0(message) == 0) {
                    if (message2 != null) {
                        hVar.e(message2.f19815id);
                    }
                    hVar.k(hsVar, message.f19815id);
                }
                viVar.getNotificationCenter().k(69, message, hsVar);
                return;
        }
    }

    public qg(vi viVar, TLRPC.Message message, hs hsVar) {
        this.f17771b = viVar;
        this.d = message;
        this.f17772c = hsVar;
    }
}
