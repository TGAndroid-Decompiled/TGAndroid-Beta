package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bw implements Runnable {
    public final int f21737a;
    public final dw f21738b;
    public final ArrayList f21739c;

    public bw(dw dwVar, ArrayList arrayList, int i7) {
        this.f21737a = i7;
        this.f21738b = dwVar;
        this.f21739c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21737a) {
            case 0:
                dw dwVar = this.f21738b;
                dwVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f21739c;
                    if (i7 < arrayList.size()) {
                        ij ijVar = new ij(dwVar.currentAccount, (TLRPC.Message) arrayList.get(i7), false, true);
                        ijVar.A0 = true;
                        dwVar.getSendMessagesHelper().k0(0L, ijVar, true);
                        i7++;
                    } else {
                        return;
                    }
                }
            default:
                dw dwVar2 = this.f21738b;
                dwVar2.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f21739c;
                    if (i10 < arrayList2.size()) {
                        ij ijVar2 = (ij) dwVar2.getMessagesController().S.f(((Long) arrayList2.get(i10)).longValue());
                        if (ijVar2 != null) {
                            ijVar2.Z = true;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
