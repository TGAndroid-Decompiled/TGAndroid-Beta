package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.f40;
public final class u3 {
    public TLRPC.GroupCallParticipant f27117a;
    public boolean f27118b;
    public float f27119c;

    public u3(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        this.f27117a = groupCallParticipant;
        this.f27118b = z10;
    }

    public final void a(int i7, int i10, t3 t3Var) {
        float f10 = i7 / i10;
        if (this.f27119c != f10) {
            this.f27119c = f10;
            if (!f40.E5 && t3Var.f26938f.size() % 2 == 1) {
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
            if (this.f27118b == u3Var.f27118b && fj.B1(this.f27117a.peer) == fj.B1(u3Var.f27117a.peer)) {
                return true;
            }
        }
        return false;
    }
}
