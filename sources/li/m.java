package li;

import com.google.android.gms.internal.play_billing.s0;
import n4.x;
public final class m {
    public final x f15629a;
    public final long f15630b;

    public m(o oVar, x xVar) {
        long length;
        long j3;
        this.f15629a = xVar;
        long length2 = ((oVar.f15632b.length() + oVar.f15631a.length()) * 2) + 128;
        s0 s0Var = (s0) xVar.f16658b;
        if (s0Var == null) {
            j3 = 1024;
        } else {
            long length3 = (((int[]) s0Var.f7461c).length * 4) + 64;
            if (((int[]) s0Var.f7460b) == null) {
                length = 0;
            } else {
                length = ((int[]) s0Var.f7460b).length * 4;
            }
            j3 = length + length3;
        }
        this.f15630b = length2 + j3;
    }
}
