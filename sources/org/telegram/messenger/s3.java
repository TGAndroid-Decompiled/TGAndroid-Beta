package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c40;
public final class s3 {
    public TLRPC.GroupCallParticipant f26403a;
    public boolean f26404b;
    public float f26405c;

    public s3(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        this.f26403a = groupCallParticipant;
        this.f26404b = z10;
    }

    public final void a(int i7, int i10, r3 r3Var) {
        float f10 = i7 / i10;
        if (this.f26405c != f10) {
            this.f26405c = f10;
            if (!c40.E5 && r3Var.f26219f.size() % 2 == 1) {
                r3Var.B();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s3.class == obj.getClass()) {
            s3 s3Var = (s3) obj;
            if (this.f26404b == s3Var.f26404b && gj.B1(this.f26403a.peer) == gj.B1(s3Var.f26403a.peer)) {
                return true;
            }
        }
        return false;
    }
}
