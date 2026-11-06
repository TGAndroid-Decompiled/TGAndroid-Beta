package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c40;
public final class s3 {
    public TLRPC.GroupCallParticipant f25405a;
    public boolean f25406b;
    public float f25407c;

    public s3(TLRPC.GroupCallParticipant groupCallParticipant, boolean z9) {
        this.f25405a = groupCallParticipant;
        this.f25406b = z9;
    }

    public final void a(int i7, int i10, r3 r3Var) {
        float f10 = i7 / i10;
        if (this.f25407c != f10) {
            this.f25407c = f10;
            if (!c40.f44521w5 && r3Var.f25204f.size() % 2 == 1) {
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
            if (this.f25406b == s3Var.f25406b && ij.C1(this.f25405a.peer) == ij.C1(s3Var.f25405a.peer)) {
                return true;
            }
        }
        return false;
    }
}
