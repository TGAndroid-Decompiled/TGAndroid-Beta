package ni;

import com.google.android.gms.internal.play_billing.s0;
public final class o {
    public final j2.n f20641a;
    public final long f20642b;

    public o(q qVar, j2.n nVar) {
        long length;
        long j3;
        this.f20641a = nVar;
        long length2 = ((qVar.f20644b.length() + qVar.f20643a.length()) * 2) + 128;
        s0 s0Var = (s0) nVar.f16456b;
        if (s0Var == null) {
            j3 = 1024;
        } else {
            long length3 = (((int[]) s0Var.f7453c).length * 4) + 64;
            if (((int[]) s0Var.f7452b) == null) {
                length = 0;
            } else {
                length = ((int[]) s0Var.f7452b).length * 4;
            }
            j3 = length + length3;
        }
        this.f20642b = length2 + j3;
    }
}
