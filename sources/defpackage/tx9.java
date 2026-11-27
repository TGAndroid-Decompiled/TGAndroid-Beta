package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tx9 implements Runnable {
    public final byte a;
    public final wx9 b;
    public final ArrayList c;

    public tx9(wx9 wx9Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = wx9Var;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        wx9 wx9Var = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < arrayList.size(); i++) {
                    r47 r47Var = new r47(wx9Var.currentAccount, (TLRPC.Message) arrayList.get(i), false, true);
                    r47Var.C0 = true;
                    wx9Var.getSendMessagesHelper().j0(0L, r47Var, true);
                }
                return;
            default:
                wx9Var.getClass();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    r47 r47Var2 = (r47) wx9Var.getMessagesController().T.f(((Long) arrayList.get(i2)).longValue());
                    if (r47Var2 != null) {
                        r47Var2.Z = true;
                    }
                }
                return;
        }
    }
}
