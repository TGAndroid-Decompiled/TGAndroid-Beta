package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.x30;
public final class s3 {
    public TLRPC.GroupCallParticipant f25270a;
    public boolean f25271b;
    public float f25272c;

    public s3(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        this.f25270a = groupCallParticipant;
        this.f25271b = z10;
    }

    public final void a(int i3, int i10, r3 r3Var) {
        float f10 = i3 / i10;
        if (this.f25272c != f10) {
            this.f25272c = f10;
            if (!x30.f51713x5 && r3Var.f25052f.size() % 2 == 1) {
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
            if (this.f25271b == s3Var.f25271b && zi.C1(this.f25270a.peer) == zi.C1(s3Var.f25270a.peer)) {
                return true;
            }
        }
        return false;
    }
}
