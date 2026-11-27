package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ar6 implements Runnable {
    public final byte a;
    public final ls6 b;
    public final ArrayList c;

    public ar6(ls6 ls6Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                ls6Var.getNotificationCenter().k(57, Long.valueOf(r47.B0(((r47) arrayList.get(0)).k)), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
                return;
            default:
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    zh6 zh6Var = new zh6();
                    zh6 zh6Var2 = new zh6();
                    for (int i = 0; i < arrayList.size(); i++) {
                        try {
                            jf7.c((TLRPC.Message) arrayList.get(i), zh6Var, zh6Var2);
                        } catch (Exception e) {
                            ls6Var.getMessagesStorage().n(e, true);
                        }
                    }
                    ls6Var.getMessagesStorage().H0(zh6Var, zh6Var2, arrayList2, arrayList3, 0);
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }
}
