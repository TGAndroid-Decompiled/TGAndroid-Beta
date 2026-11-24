package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yq6 implements Runnable {
    public final byte a;
    public final hs6 b;
    public final ArrayList c;

    public yq6(hs6 hs6Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = hs6Var;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        hs6 hs6Var = this.b;
        switch (b) {
            case 0:
                hs6Var.getNotificationCenter().k(57, Long.valueOf(k47.B0(((k47) arrayList.get(0)).k)), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
                return;
            default:
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    vh6 vh6Var = new vh6();
                    vh6 vh6Var2 = new vh6();
                    for (int i = 0; i < arrayList.size(); i++) {
                        try {
                            cf7.c((TLRPC.Message) arrayList.get(i), vh6Var, vh6Var2);
                        } catch (Exception e) {
                            hs6Var.getMessagesStorage().n(e, true);
                        }
                    }
                    hs6Var.getMessagesStorage().H0(vh6Var, vh6Var2, arrayList2, arrayList3, 0);
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }
}
