package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class og implements Runnable {
    public final int f26058a = 1;
    public final ri f26059b;
    public final sr f26060c;
    public final TLRPC.Message d;

    public og(ri riVar, sr srVar, TLRPC.Message message) {
        this.f26059b = riVar;
        this.f26060c = srVar;
        this.d = message;
    }

    @Override
    public final void run() {
        int i7 = this.f26058a;
        TLRPC.Message message = this.d;
        sr srVar = this.f26060c;
        ri riVar = this.f26059b;
        switch (i7) {
            case 0:
                riVar.getNotificationCenter().k(69, message, srVar);
                return;
            default:
                a0.h hVar = riVar.B1;
                HashMap hashMap = riVar.A1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(srVar);
                hashMap.put(srVar, message);
                a0.h hVar2 = riVar.f26657z1;
                ArrayList arrayList = (ArrayList) hVar2.f(srVar.f26847a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                hVar2.k(arrayList, srVar.f26847a);
                if (fj.v0(message) == 0) {
                    if (message2 != null) {
                        hVar.e(message2.f28426id);
                    }
                    hVar.k(srVar, message.f28426id);
                }
                riVar.getNotificationCenter().k(69, message, srVar);
                return;
        }
    }

    public og(ri riVar, TLRPC.Message message, sr srVar) {
        this.f26059b = riVar;
        this.d = message;
        this.f26060c = srVar;
    }
}
