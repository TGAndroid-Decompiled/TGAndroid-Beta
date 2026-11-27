package defpackage;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class fv2 implements Runnable {
    public final byte a;
    public final lv2 b;
    public final HashMap c;
    public final HashMap d;

    public fv2(lv2 lv2Var, HashMap hashMap, HashMap hashMap2, byte b) {
        this.a = b;
        this.b = lv2Var;
        this.c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                lv2 lv2Var = this.b;
                Utilities.e.c(new fv2(lv2Var, this.c, this.d, (byte) 1));
                if (!lv2Var.e) {
                    lv2Var.e = true;
                    jf7 messagesStorage = lv2Var.getMessagesStorage();
                    messagesStorage.a.c(new je7(messagesStorage, false, (byte) 0));
                    return;
                }
                return;
            default:
                lv2 lv2Var2 = this.b;
                HashMap hashMap = this.c;
                HashMap hashMap2 = this.d;
                lv2Var2.l0 = hashMap;
                lv2Var2.m0 = hashMap2;
                return;
        }
    }
}
