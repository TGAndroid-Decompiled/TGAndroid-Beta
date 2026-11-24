package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tg2 implements Runnable {
    public final byte a;
    public final vg2 b;
    public final String c;

    public tg2(vg2 vg2Var, String str, byte b) {
        this.a = b;
        this.b = vg2Var;
        this.c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        xo1 xo1Var;
        boolean z;
        long j;
        switch (this.a) {
            case 0:
                vg2 vg2Var = this.b;
                vg2Var.getClass();
                gm.c3(new tg2(vg2Var, this.c, (byte) 1));
                return;
            default:
                vg2 vg2Var2 = this.b;
                vg2Var2.n = null;
                wg2 wg2Var = vg2Var2.E;
                TLRPC.Chat chat = wg2Var.n;
                int i = wg2Var.e1;
                if (!sd2.T(chat) && wg2Var.r != null) {
                    arrayList = new ArrayList(wg2Var.r.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i == 1) {
                    arrayList2 = new ArrayList(wg2Var.getContactsController().f0);
                } else {
                    arrayList2 = null;
                }
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    vg2Var2.s = false;
                    xo1Var = null;
                } else {
                    xo1Var = new xo1(vg2Var2, str, arrayList, arrayList2, (byte) 11);
                }
                bu9 bu9Var = vg2Var2.h;
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (sd2.T(wg2Var.n)) {
                    j = wg2Var.N;
                } else {
                    j = 0;
                }
                bu9Var.h(str, z, false, true, false, false, j, false, wg2Var.O, 1, 0L, xo1Var);
                return;
        }
    }
}
