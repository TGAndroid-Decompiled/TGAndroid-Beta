package oi;

import com.google.android.gms.internal.play_billing.s0;
import mi.h0;
public final class m {
    public final h0 f21155a;
    public final long f21156b;

    public m(o oVar, h0 h0Var) {
        long length;
        long j10;
        this.f21155a = h0Var;
        long length2 = ((oVar.f21158b.length() + oVar.f21157a.length()) * 2) + 128;
        s0 s0Var = (s0) h0Var.f19644b;
        if (s0Var == null) {
            j10 = 1024;
        } else {
            long length3 = (((int[]) s0Var.f7510c).length * 4) + 64;
            if (((int[]) s0Var.f7509b) == null) {
                length = 0;
            } else {
                length = ((int[]) s0Var.f7509b).length * 4;
            }
            j10 = length + length3;
        }
        this.f21156b = length2 + j10;
    }
}
