package defpackage;

import org.telegram.tgnet.TLRPC;
public final class gc2 {
    public TLRPC.GroupCallParticipant a;
    public boolean b;
    public float c;

    public gc2(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
        this.a = groupCallParticipant;
        this.b = z;
    }

    public final void a(int i, int i2, fc2 fc2Var) {
        float f = i / i2;
        if (this.c != f) {
            this.c = f;
            if (!h75.u5 && fc2Var.f.size() % 2 == 1) {
                fc2Var.D();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gc2.class == obj.getClass()) {
            gc2 gc2Var = (gc2) obj;
            if (this.b == gc2Var.b && k27.B1(this.a.peer) == k27.B1(gc2Var.a.peer)) {
                return true;
            }
        }
        return false;
    }
}
