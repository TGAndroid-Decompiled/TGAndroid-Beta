package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gc2 implements Runnable {
    public final byte a;
    public final int b;
    public final long c;
    public final Object d;

    public gc2(Object obj, int i, long j, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = j;
    }

    private final void a() {
        int i;
        j5 j5Var = (j5) this.d;
        a6a B = a6a.B(j5Var.a);
        ArrayList arrayList = (ArrayList) B.a.get("group_" + this.c);
        if (arrayList != null && !arrayList.isEmpty()) {
            m5a m5aVar = (m5a) arrayList.get(0);
            k47 k47Var = (k47) b10.f(1, m5aVar.x);
            m5aVar.G = k47Var.e1();
            k47Var.k.params.put("final", "1");
            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
            tL_messages_messages.messages.add(k47Var.k);
            if (!m5aVar.I && !m5aVar.J) {
                cf7 Y = cf7.Y(j5Var.a);
                long j = m5aVar.a;
                if (this.b != 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                Y.e1(-2, 0, i, j, 0L, tL_messages_messages, false);
            }
            B.s0(m5aVar, true);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc2.run():void");
    }

    public gc2(Object obj, long j, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.c = j;
        this.b = i;
    }
}
