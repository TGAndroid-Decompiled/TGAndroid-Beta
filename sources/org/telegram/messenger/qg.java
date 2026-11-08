package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class qg implements Runnable {
    public final int f24695a = 1;
    public final ui f24696b;
    public final xr f24697c;
    public final TLRPC.Message d;

    public qg(ui uiVar, xr xrVar, TLRPC.Message message) {
        this.f24696b = uiVar;
        this.f24697c = xrVar;
        this.d = message;
    }

    @Override
    public final void run() {
        int i7 = this.f24695a;
        TLRPC.Message message = this.d;
        xr xrVar = this.f24697c;
        ui uiVar = this.f24696b;
        switch (i7) {
            case 0:
                uiVar.getNotificationCenter().k(69, message, xrVar);
                return;
            default:
                a0.h hVar = uiVar.f25856y1;
                HashMap hashMap = uiVar.f25853x1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(xrVar);
                hashMap.put(xrVar, message);
                a0.h hVar2 = uiVar.f25850w1;
                ArrayList arrayList = (ArrayList) hVar2.f(xrVar.f26520a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                hVar2.k(arrayList, xrVar.f26520a);
                if (ij.v0(message) == 0) {
                    if (message2 != null) {
                        hVar.e(message2.f26977id);
                    }
                    hVar.k(xrVar, message.f26977id);
                }
                uiVar.getNotificationCenter().k(69, message, xrVar);
                return;
        }
    }

    public qg(ui uiVar, TLRPC.Message message, xr xrVar) {
        this.f24696b = uiVar;
        this.d = message;
        this.f24697c = xrVar;
    }
}
