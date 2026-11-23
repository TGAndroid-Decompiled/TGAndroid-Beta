package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.f40;
public final class u3 {
    public TLRPC.GroupCallParticipant f27155a;
    public boolean f27156b;
    public float f27157c;

    public u3(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        this.f27155a = groupCallParticipant;
        this.f27156b = z10;
    }

    public final void a(int i7, int i10, t3 t3Var) {
        float f10 = i7 / i10;
        if (this.f27157c != f10) {
            this.f27157c = f10;
            if (!f40.E5 && t3Var.f26953f.size() % 2 == 1) {
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
            if (this.f27156b == u3Var.f27156b && gj.B1(this.f27155a.peer) == gj.B1(u3Var.f27155a.peer)) {
                return true;
            }
        }
        return false;
    }
}
