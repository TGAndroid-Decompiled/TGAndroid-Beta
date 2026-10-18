package mi;

import com.google.android.gms.internal.play_billing.s0;
public final class m {
    public final q f16965a;
    public final long f16966b;

    public m(o oVar, q qVar) {
        long length;
        long j10;
        this.f16965a = qVar;
        long length2 = ((oVar.f16968b.length() + oVar.f16967a.length()) * 2) + 128;
        s0 s0Var = (s0) qVar.f16972b;
        if (s0Var == null) {
            j10 = 1024;
        } else {
            long length3 = (((int[]) s0Var.f7209c).length * 4) + 64;
            if (((int[]) s0Var.f7208b) == null) {
                length = 0;
            } else {
                length = ((int[]) s0Var.f7208b).length * 4;
            }
            j10 = length + length3;
        }
        this.f16966b = length2 + j10;
    }
}
