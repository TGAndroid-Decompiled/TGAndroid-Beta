package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ih implements Runnable {
    public final int f16283a;
    public final vi f16284b;
    public final ArrayList f16285c;

    public ih(vi viVar, ArrayList arrayList, int i10) {
        this.f16283a = i10;
        this.f16284b = viVar;
        this.f16285c = arrayList;
    }

    @Override
    public final void run() {
        int i10 = this.f16283a;
        ArrayList arrayList = this.f16285c;
        vi viVar = this.f16284b;
        switch (i10) {
            case 0:
                viVar.getNotificationCenter().k(56, Long.valueOf(kj.B0(((kj) arrayList.get(0)).f16690k)), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
                return;
            default:
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        try {
                            is.d((TLRPC.Message) arrayList.get(i11), hVar, hVar2);
                        } catch (Exception e) {
                            viVar.getMessagesStorage().o(e, true);
                        }
                    }
                    viVar.getMessagesStorage().K0(hVar, hVar2, arrayList2, arrayList3, 0);
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
        }
    }
}
