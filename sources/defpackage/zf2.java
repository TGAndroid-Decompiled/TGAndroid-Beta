package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zf2 implements Runnable {
    public final byte a;
    public final ag2 b;
    public final String c;

    public zf2(ag2 ag2Var, String str, byte b) {
        this.a = b;
        this.b = ag2Var;
        this.c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ao1 ao1Var;
        boolean z;
        long j;
        switch (this.a) {
            case 0:
                ag2 ag2Var = this.b;
                ag2Var.getClass();
                hl.c3(new zf2(ag2Var, this.c, (byte) 1));
                return;
            default:
                ag2 ag2Var2 = this.b;
                ag2Var2.n = null;
                bg2 bg2Var = ag2Var2.E;
                TLRPC.Chat chat = bg2Var.n;
                int i = bg2Var.e1;
                if (!xc2.T(chat) && bg2Var.r != null) {
                    arrayList = new ArrayList(bg2Var.r.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i == 1) {
                    arrayList2 = new ArrayList(bg2Var.getContactsController().f0);
                } else {
                    arrayList2 = null;
                }
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    ag2Var2.s = false;
                    ao1Var = null;
                } else {
                    ao1Var = new ao1(ag2Var2, str, arrayList, arrayList2, (byte) 11);
                }
                sv9 sv9Var = ag2Var2.h;
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (xc2.T(bg2Var.n)) {
                    j = bg2Var.N;
                } else {
                    j = 0;
                }
                sv9Var.h(str, z, false, true, false, false, j, false, bg2Var.O, 1, 0L, ao1Var);
                return;
        }
    }
}
