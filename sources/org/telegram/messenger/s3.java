package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.f40;
public final class s3 {
    public TLRPC.GroupCallParticipant f25413a;
    public boolean f25414b;
    public float f25415c;

    public s3(TLRPC.GroupCallParticipant groupCallParticipant, boolean z9) {
        this.f25413a = groupCallParticipant;
        this.f25414b = z9;
    }

    public final void a(int i7, int i10, r3 r3Var) {
        float f10 = i7 / i10;
        if (this.f25415c != f10) {
            this.f25415c = f10;
            if (!f40.f45503z5 && r3Var.f25229f.size() % 2 == 1) {
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
            if (this.f25414b == s3Var.f25414b && ij.B1(this.f25413a.peer) == ij.B1(s3Var.f25413a.peer)) {
                return true;
            }
        }
        return false;
    }
}
