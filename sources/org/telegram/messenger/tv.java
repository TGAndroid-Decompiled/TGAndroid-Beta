package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tv implements Runnable {
    public final int f25597a;
    public final vv f25598b;
    public final ArrayList f25599c;

    public tv(vv vvVar, ArrayList arrayList, int i3) {
        this.f25597a = i3;
        this.f25598b = vvVar;
        this.f25599c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f25597a) {
            case 0:
                vv vvVar = this.f25598b;
                vvVar.getClass();
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.f25599c;
                    if (i3 < arrayList.size()) {
                        zi ziVar = new zi(vvVar.currentAccount, (TLRPC.Message) arrayList.get(i3), false, true);
                        ziVar.A0 = true;
                        vvVar.getSendMessagesHelper().k0(0L, ziVar, true);
                        i3++;
                    } else {
                        return;
                    }
                }
            default:
                vv vvVar2 = this.f25598b;
                vvVar2.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f25599c;
                    if (i10 < arrayList2.size()) {
                        zi ziVar2 = (zi) vvVar2.getMessagesController().T.f(((Long) arrayList2.get(i10)).longValue());
                        if (ziVar2 != null) {
                            ziVar2.Z = true;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
