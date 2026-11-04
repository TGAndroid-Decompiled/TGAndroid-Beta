package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ah implements Runnable {
    public final int f21519a;
    public final li f21520b;
    public final ArrayList f21521c;

    public ah(li liVar, ArrayList arrayList, int i3) {
        this.f21519a = i3;
        this.f21520b = liVar;
        this.f21521c = arrayList;
    }

    @Override
    public final void run() {
        int i3 = this.f21519a;
        ArrayList arrayList = this.f21521c;
        li liVar = this.f21520b;
        switch (i3) {
            case 0:
                liVar.getNotificationCenter().k(56, Long.valueOf(zi.B0(((zi) arrayList.get(0)).f26868k)), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
                return;
            default:
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        try {
                            qr.d((TLRPC.Message) arrayList.get(i10), hVar, hVar2);
                        } catch (Exception e10) {
                            liVar.getMessagesStorage().o(e10, true);
                        }
                    }
                    liVar.getMessagesStorage().K0(hVar, hVar2, arrayList2, arrayList3, 0);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
        }
    }
}
