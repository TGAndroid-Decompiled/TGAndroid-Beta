package defpackage;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class vv2 implements Runnable {
    public final byte a;
    public final bw2 b;
    public final HashMap c;
    public final HashMap d;

    public vv2(bw2 bw2Var, HashMap hashMap, HashMap hashMap2, byte b) {
        this.a = b;
        this.b = bw2Var;
        this.c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                bw2 bw2Var = this.b;
                Utilities.e.c(new vv2(bw2Var, this.c, this.d, (byte) 1));
                if (!bw2Var.e) {
                    bw2Var.e = true;
                    cf7 messagesStorage = bw2Var.getMessagesStorage();
                    messagesStorage.a.c(new ee7(messagesStorage, false, (byte) 0));
                    return;
                }
                return;
            default:
                bw2 bw2Var2 = this.b;
                HashMap hashMap = this.c;
                HashMap hashMap2 = this.d;
                bw2Var2.l0 = hashMap;
                bw2Var2.m0 = hashMap2;
                return;
        }
    }
}
