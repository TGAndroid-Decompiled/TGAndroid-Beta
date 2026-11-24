package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zt9 implements Runnable {
    public final byte a;
    public final bu9 b;
    public final ArrayList c;

    public zt9(bu9 bu9Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = bu9Var;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        bu9 bu9Var = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < arrayList.size(); i++) {
                    k27 k27Var = new k27(bu9Var.currentAccount, (TLRPC.Message) arrayList.get(i), false, true);
                    k27Var.C0 = true;
                    bu9Var.getSendMessagesHelper().j0(0L, k27Var, true);
                }
                return;
            default:
                bu9Var.getClass();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    k27 k27Var2 = (k27) bu9Var.getMessagesController().T.f(((Long) arrayList.get(i2)).longValue());
                    if (k27Var2 != null) {
                        k27Var2.Z = true;
                    }
                }
                return;
        }
    }
}
