package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c40;
public final class s3 {
    public TLRPC.GroupCallParticipant f26393a;
    public boolean f26394b;
    public float f26395c;

    public s3(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        this.f26393a = groupCallParticipant;
        this.f26394b = z10;
    }

    public final void a(int i7, int i10, r3 r3Var) {
        float f10 = i7 / i10;
        if (this.f26395c != f10) {
            this.f26395c = f10;
            if (!c40.E5 && r3Var.f26211f.size() % 2 == 1) {
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
            if (this.f26394b == s3Var.f26394b && gj.B1(this.f26393a.peer) == gj.B1(s3Var.f26393a.peer)) {
                return true;
            }
        }
        return false;
    }
}
