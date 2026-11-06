package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class qg implements Runnable {
    public final int f24692a = 1;
    public final ui f24693b;
    public final xr f24694c;
    public final TLRPC.Message d;

    public qg(ui uiVar, xr xrVar, TLRPC.Message message) {
        this.f24693b = uiVar;
        this.f24694c = xrVar;
        this.d = message;
    }

    @Override
    public final void run() {
        int i7 = this.f24692a;
        TLRPC.Message message = this.d;
        xr xrVar = this.f24694c;
        ui uiVar = this.f24693b;
        switch (i7) {
            case 0:
                uiVar.getNotificationCenter().k(69, message, xrVar);
                return;
            default:
                a0.h hVar = uiVar.f25853y1;
                HashMap hashMap = uiVar.f25850x1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(xrVar);
                hashMap.put(xrVar, message);
                a0.h hVar2 = uiVar.f25847w1;
                ArrayList arrayList = (ArrayList) hVar2.f(xrVar.f26513a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                hVar2.k(arrayList, xrVar.f26513a);
                if (ij.v0(message) == 0) {
                    if (message2 != null) {
                        hVar.e(message2.f26974id);
                    }
                    hVar.k(xrVar, message.f26974id);
                }
                uiVar.getNotificationCenter().k(69, message, xrVar);
                return;
        }
    }

    public qg(ui uiVar, TLRPC.Message message, xr xrVar) {
        this.f24693b = uiVar;
        this.d = message;
        this.f24694c = xrVar;
    }
}
