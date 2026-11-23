package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vv implements Runnable {
    public final int f27697a;
    public final xv f27698b;
    public final ArrayList f27699c;

    public vv(xv xvVar, ArrayList arrayList, int i7) {
        this.f27697a = i7;
        this.f27698b = xvVar;
        this.f27699c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f27697a) {
            case 0:
                xv xvVar = this.f27698b;
                xvVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f27699c;
                    if (i7 < arrayList.size()) {
                        fj fjVar = new fj(xvVar.currentAccount, (TLRPC.Message) arrayList.get(i7), false, true);
                        fjVar.C0 = true;
                        xvVar.getSendMessagesHelper().k0(0L, fjVar, true);
                        i7++;
                    } else {
                        return;
                    }
                }
            default:
                xv xvVar2 = this.f27698b;
                xvVar2.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f27699c;
                    if (i10 < arrayList2.size()) {
                        fj fjVar2 = (fj) xvVar2.getMessagesController().T.f(((Long) arrayList2.get(i10)).longValue());
                        if (fjVar2 != null) {
                            fjVar2.Z = true;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
