package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.a50;
public final class v3 {
    public TLRPC.GroupCallParticipant f18588a;
    public boolean f18589b;
    public float f18590c;

    public v3(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        this.f18588a = groupCallParticipant;
        this.f18589b = z10;
    }

    public final void a(int i10, int i11, u3 u3Var) {
        float f7 = i10 / i11;
        if (this.f18590c != f7) {
            this.f18590c = f7;
            if (!a50.f35575w5 && u3Var.f18363f.size() % 2 == 1) {
                u3Var.B();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v3.class == obj.getClass()) {
            v3 v3Var = (v3) obj;
            if (this.f18589b == v3Var.f18589b && kj.C1(this.f18588a.peer) == kj.C1(v3Var.f18588a.peer)) {
                return true;
            }
        }
        return false;
    }
}
