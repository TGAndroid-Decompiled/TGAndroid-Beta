package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class pg implements Runnable {
    public final int f25927a = 1;
    public final si f25928b;
    public final ur f25929c;
    public final TLRPC.Message d;

    public pg(si siVar, ur urVar, TLRPC.Message message) {
        this.f25928b = siVar;
        this.f25929c = urVar;
        this.d = message;
    }

    @Override
    public final void run() {
        int i7 = this.f25927a;
        TLRPC.Message message = this.d;
        ur urVar = this.f25929c;
        si siVar = this.f25928b;
        switch (i7) {
            case 0:
                siVar.getNotificationCenter().k(69, message, urVar);
                return;
            default:
                a0.h hVar = siVar.f26517z1;
                HashMap hashMap = siVar.f26515y1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(urVar);
                hashMap.put(urVar, message);
                a0.h hVar2 = siVar.f26512x1;
                ArrayList arrayList = (ArrayList) hVar2.f(urVar.f26860a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                hVar2.k(arrayList, urVar.f26860a);
                if (gj.v0(message) == 0) {
                    if (message2 != null) {
                        hVar.e(message2.f28072id);
                    }
                    hVar.k(urVar, message.f28072id);
                }
                siVar.getNotificationCenter().k(69, message, urVar);
                return;
        }
    }

    public pg(si siVar, TLRPC.Message message, ur urVar) {
        this.f25928b = siVar;
        this.d = message;
        this.f25929c = urVar;
    }
}
