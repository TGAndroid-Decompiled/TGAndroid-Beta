package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mw implements Runnable {
    public final int f17005a;
    public final ow f17006b;
    public final ArrayList f17007c;

    public mw(ow owVar, ArrayList arrayList, int i10) {
        this.f17005a = i10;
        this.f17006b = owVar;
        this.f17007c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17005a) {
            case 0:
                ow owVar = this.f17006b;
                owVar.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f17007c;
                    if (i10 < arrayList.size()) {
                        jj jjVar = new jj(owVar.currentAccount, (TLRPC.Message) arrayList.get(i10), false, true);
                        jjVar.A0 = true;
                        owVar.getSendMessagesHelper().k0(0L, jjVar, true);
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                ow owVar2 = this.f17006b;
                owVar2.getClass();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f17007c;
                    if (i11 < arrayList2.size()) {
                        jj jjVar2 = (jj) owVar2.getMessagesController().S.f(((Long) arrayList2.get(i11)).longValue());
                        if (jjVar2 != null) {
                            jjVar2.Z = true;
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
