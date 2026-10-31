package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.b50;
public final class v3 {
    public TLRPC.GroupCallParticipant f18477a;
    public boolean f18478b;
    public float f18479c;

    public v3(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        this.f18477a = groupCallParticipant;
        this.f18478b = z10;
    }

    public final void a(int i10, int i11, u3 u3Var) {
        float f7 = i10 / i11;
        if (this.f18479c != f7) {
            this.f18479c = f7;
            if (!b50.f35991w5 && u3Var.f18230f.size() % 2 == 1) {
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
            if (this.f18478b == v3Var.f18478b && jj.C1(this.f18477a.peer) == jj.C1(v3Var.f18477a.peer)) {
                return true;
            }
        }
        return false;
    }
}
