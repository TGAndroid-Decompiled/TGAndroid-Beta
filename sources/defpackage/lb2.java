package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lb2 implements Runnable {
    public final byte a;
    public final int b;
    public final long c;
    public final Object d;

    public lb2(Object obj, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = j;
    }

    private final void a() {
        int i;
        k5 k5Var = (k5) this.d;
        r7a B = r7a.B(k5Var.a);
        ArrayList arrayList = (ArrayList) B.a.get("group_" + this.c);
        if (arrayList != null && !arrayList.isEmpty()) {
            d7a d7aVar = (d7a) arrayList.get(0);
            r47 r47Var = (r47) c00.g(1, d7aVar.x);
            d7aVar.G = r47Var.e1();
            r47Var.k.params.put("final", "1");
            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
            tL_messages_messages.messages.add(r47Var.k);
            if (!d7aVar.I && !d7aVar.J) {
                kf7 a0 = kf7.a0(k5Var.a);
                long j = d7aVar.a;
                if (this.b != 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                a0.i1(-2, 0, i, j, 0L, tL_messages_messages, false);
            }
            B.s0(d7aVar, true);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb2.run():void");
    }

    public lb2(Object obj, long j, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.c = j;
        this.b = i;
    }
}
