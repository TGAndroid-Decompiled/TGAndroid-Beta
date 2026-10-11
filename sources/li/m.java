package li;

import com.google.android.gms.internal.play_billing.s0;
import n4.x;
public final class m {
    public final x f15665a;
    public final long f15666b;

    public m(o oVar, x xVar) {
        long length;
        long j3;
        this.f15665a = xVar;
        long length2 = ((oVar.f15668b.length() + oVar.f15667a.length()) * 2) + 128;
        s0 s0Var = (s0) xVar.f16694b;
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
        this.f15666b = length2 + j3;
    }
}
