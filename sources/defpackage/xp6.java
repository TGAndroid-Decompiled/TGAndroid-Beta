package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class xp6 implements Runnable {
    public final byte a = 1;
    public final ls6 b;
    public final jf7 c;
    public final TLRPC.Message d;

    public xp6(ls6 ls6Var, jf7 jf7Var, TLRPC.Message message) {
        this.b = ls6Var;
        this.c = jf7Var;
        this.d = message;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Message message = this.d;
        jf7 jf7Var = this.c;
        ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                ls6Var.getNotificationCenter().k(70, message, jf7Var);
                return;
            default:
                zh6 zh6Var = ls6Var.B1;
                HashMap hashMap = ls6Var.A1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(jf7Var);
                hashMap.put(jf7Var, message);
                zh6 zh6Var2 = ls6Var.z1;
                ArrayList arrayList = (ArrayList) zh6Var2.f(jf7Var.a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                zh6Var2.k(jf7Var.a, arrayList);
                if (r47.v0(message) == 0) {
                    if (message2 != null) {
                        zh6Var.e(message2.id);
                    }
                    zh6Var.k(message.id, jf7Var);
                }
                ls6Var.getNotificationCenter().k(70, message, jf7Var);
                return;
        }
    }

    public xp6(ls6 ls6Var, TLRPC.Message message, jf7 jf7Var) {
        this.b = ls6Var;
        this.d = message;
        this.c = jf7Var;
    }
}
