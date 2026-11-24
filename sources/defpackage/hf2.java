package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hf2 implements Runnable {
    public final byte a;
    public final jf2 b;
    public final String c;

    public hf2(jf2 jf2Var, String str, byte b) {
        this.a = b;
        this.b = jf2Var;
        this.c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        hn1 hn1Var;
        boolean z;
        long j;
        switch (this.a) {
            case 0:
                jf2 jf2Var = this.b;
                jf2Var.getClass();
                gl.d3(new hf2(jf2Var, this.c, (byte) 1));
                return;
            default:
                jf2 jf2Var2 = this.b;
                jf2Var2.n = null;
                kf2 kf2Var = jf2Var2.E;
                TLRPC.Chat chat = kf2Var.n;
                int i = kf2Var.e1;
                if (!hc2.T(chat) && kf2Var.r != null) {
                    arrayList = new ArrayList(kf2Var.r.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i == 1) {
                    arrayList2 = new ArrayList(kf2Var.getContactsController().f0);
                } else {
                    arrayList2 = null;
                }
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    jf2Var2.s = false;
                    hn1Var = null;
                } else {
                    hn1Var = new hn1(jf2Var2, str, arrayList, arrayList2, (byte) 11);
                }
                zr9 zr9Var = jf2Var2.h;
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (hc2.T(kf2Var.n)) {
                    j = kf2Var.N;
                } else {
                    j = 0;
                }
                zr9Var.h(str, z, false, true, false, false, j, false, kf2Var.O, 1, 0L, hn1Var);
                return;
        }
    }
}
