package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class ig implements Runnable {
    public final int f23533a = 1;
    public final li f23534b;
    public final pr f23535c;
    public final TLRPC.Message d;

    public ig(li liVar, pr prVar, TLRPC.Message message) {
        this.f23534b = liVar;
        this.f23535c = prVar;
        this.d = message;
    }

    @Override
    public final void run() {
        int i3 = this.f23533a;
        TLRPC.Message message = this.d;
        pr prVar = this.f23535c;
        li liVar = this.f23534b;
        switch (i3) {
            case 0:
                liVar.getNotificationCenter().k(69, message, prVar);
                return;
            default:
                a0.h hVar = liVar.f24067z1;
                HashMap hashMap = liVar.f24065y1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(prVar);
                hashMap.put(prVar, message);
                a0.h hVar2 = liVar.f24062x1;
                ArrayList arrayList = (ArrayList) hVar2.f(prVar.f24797a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                hVar2.k(arrayList, prVar.f24797a);
                if (zi.v0(message) == 0) {
                    if (message2 != null) {
                        hVar.e(message2.f27022id);
                    }
                    hVar.k(prVar, message.f27022id);
                }
                liVar.getNotificationCenter().k(69, message, prVar);
                return;
        }
    }

    public ig(li liVar, TLRPC.Message message, pr prVar) {
        this.f23534b = liVar;
        this.d = message;
        this.f23535c = prVar;
    }
}
