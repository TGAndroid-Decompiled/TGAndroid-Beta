package li;

import com.google.android.gms.internal.play_billing.s0;
public final class m {
    public final n4.s f14766a;
    public final long f14767b;

    public m(o oVar, n4.s sVar) {
        long length;
        long j10;
        this.f14766a = sVar;
        long length2 = ((oVar.f14769b.length() + oVar.f14768a.length()) * 2) + 128;
        s0 s0Var = (s0) sVar.f15745b;
        if (s0Var == null) {
            j10 = 1024;
        } else {
            long length3 = (((int[]) s0Var.f5754c).length * 4) + 64;
            if (((int[]) s0Var.f5753b) == null) {
                length = 0;
            } else {
                length = ((int[]) s0Var.f5753b).length * 4;
            }
            j10 = length + length3;
        }
        this.f14767b = length2 + j10;
    }
}
