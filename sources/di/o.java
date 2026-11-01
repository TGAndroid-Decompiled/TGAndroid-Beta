package di;

import com.google.android.gms.internal.play_billing.s0;
public final class o {
    public final n4.q f5979a;
    public final long f5980b;

    public o(q qVar, n4.q qVar2) {
        long length;
        long j10;
        this.f5979a = qVar2;
        long length2 = ((qVar.f5982b.length() + qVar.f5981a.length()) * 2) + 128;
        s0 s0Var = (s0) qVar2.f13527a;
        if (s0Var == null) {
            j10 = 1024;
        } else {
            long length3 = (((int[]) s0Var.f5199a).length * 4) + 64;
            if (((int[]) s0Var.f5201c) == null) {
                length = 0;
            } else {
                length = ((int[]) s0Var.f5201c).length * 4;
            }
            j10 = length + length3;
        }
        this.f5980b = length2 + j10;
    }
}
