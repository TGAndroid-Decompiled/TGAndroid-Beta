package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wv implements Runnable {
    public final int f27769a;
    public final yv f27770b;
    public final ArrayList f27771c;

    public wv(yv yvVar, ArrayList arrayList, int i7) {
        this.f27769a = i7;
        this.f27770b = yvVar;
        this.f27771c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f27769a) {
            case 0:
                yv yvVar = this.f27770b;
                yvVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f27771c;
                    if (i7 < arrayList.size()) {
                        gj gjVar = new gj(yvVar.currentAccount, (TLRPC.Message) arrayList.get(i7), false, true);
                        gjVar.C0 = true;
                        yvVar.getSendMessagesHelper().k0(0L, gjVar, true);
                        i7++;
                    } else {
                        return;
                    }
                }
            default:
                yv yvVar2 = this.f27770b;
                yvVar2.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f27771c;
                    if (i10 < arrayList2.size()) {
                        gj gjVar2 = (gj) yvVar2.getMessagesController().T.f(((Long) arrayList2.get(i10)).longValue());
                        if (gjVar2 != null) {
                            gjVar2.Z = true;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
