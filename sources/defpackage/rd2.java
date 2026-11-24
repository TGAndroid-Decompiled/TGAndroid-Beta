package defpackage;

import org.telegram.tgnet.TLRPC;
public final class rd2 {
    public TLRPC.GroupCallParticipant a;
    public boolean b;
    public float c;

    public rd2(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
        this.a = groupCallParticipant;
        this.b = z;
    }

    public final void a(int i, int i2, qd2 qd2Var) {
        float f = i / i2;
        if (this.c != f) {
            this.c = f;
            if (!g95.u5 && qd2Var.f.size() % 2 == 1) {
                qd2Var.D();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rd2.class == obj.getClass()) {
            rd2 rd2Var = (rd2) obj;
            if (this.b == rd2Var.b && k47.B1(this.a.peer) == k47.B1(rd2Var.a.peer)) {
                return true;
            }
        }
        return false;
    }
}
