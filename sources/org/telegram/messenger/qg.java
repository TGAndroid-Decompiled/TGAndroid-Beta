package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class qg implements Runnable {
    public final int f24684a = 1;
    public final ui f24685b;
    public final xr f24686c;
    public final TLRPC.Message d;

    public qg(ui uiVar, xr xrVar, TLRPC.Message message) {
        this.f24685b = uiVar;
        this.f24686c = xrVar;
        this.d = message;
    }

    @Override
    public final void run() {
        int i7 = this.f24684a;
        TLRPC.Message message = this.d;
        xr xrVar = this.f24686c;
        ui uiVar = this.f24685b;
        switch (i7) {
            case 0:
                uiVar.getNotificationCenter().k(69, message, xrVar);
                return;
            default:
                a0.h hVar = uiVar.f25845y1;
                HashMap hashMap = uiVar.f25842x1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(xrVar);
                hashMap.put(xrVar, message);
                a0.h hVar2 = uiVar.f25839w1;
                ArrayList arrayList = (ArrayList) hVar2.f(xrVar.f26505a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                hVar2.k(arrayList, xrVar.f26505a);
                if (ij.v0(message) == 0) {
                    if (message2 != null) {
                        hVar.e(message2.f26973id);
                    }
                    hVar.k(xrVar, message.f26973id);
                }
                uiVar.getNotificationCenter().k(69, message, xrVar);
                return;
        }
    }

    public qg(ui uiVar, TLRPC.Message message, xr xrVar) {
        this.f24685b = uiVar;
        this.d = message;
        this.f24686c = xrVar;
    }
}
