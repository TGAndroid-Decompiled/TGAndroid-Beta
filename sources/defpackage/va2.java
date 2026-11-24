package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class va2 implements Runnable {
    public final byte a;
    public final int b;
    public final long c;
    public final Object d;

    public va2(Object obj, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = j;
    }

    private final void a() {
        int i;
        j5 j5Var = (j5) this.d;
        z3a B = z3a.B(j5Var.a);
        ArrayList arrayList = (ArrayList) B.a.get("group_" + this.c);
        if (arrayList != null && !arrayList.isEmpty()) {
            k3a k3aVar = (k3a) arrayList.get(0);
            k27 k27Var = (k27) b00.f(1, k3aVar.x);
            k3aVar.G = k27Var.e1();
            k27Var.k.params.put("final", "1");
            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
            tL_messages_messages.messages.add(k27Var.k);
            if (!k3aVar.I && !k3aVar.J) {
                ad7 Y = ad7.Y(j5Var.a);
                long j = k3aVar.a;
                if (this.b != 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                Y.e1(-2, 0, i, j, 0L, tL_messages_messages, false);
            }
            B.s0(k3aVar, true);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va2.run():void");
    }

    public va2(Object obj, long j, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.c = j;
        this.b = i;
    }
}
