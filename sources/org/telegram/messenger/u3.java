package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.e40;
public final class u3 {
    public TLRPC.GroupCallParticipant f27215a;
    public boolean f27216b;
    public float f27217c;

    public u3(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        this.f27215a = groupCallParticipant;
        this.f27216b = z10;
    }

    public final void a(int i7, int i10, t3 t3Var) {
        float f10 = i7 / i10;
        if (this.f27217c != f10) {
            this.f27217c = f10;
            if (!e40.E5 && t3Var.f27037f.size() % 2 == 1) {
                t3Var.B();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u3.class == obj.getClass()) {
            u3 u3Var = (u3) obj;
            if (this.f27216b == u3Var.f27216b && fj.B1(this.f27215a.peer) == fj.B1(u3Var.f27215a.peer)) {
                return true;
            }
        }
        return false;
    }
}
