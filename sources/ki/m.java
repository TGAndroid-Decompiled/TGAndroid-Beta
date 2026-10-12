package ki;

import com.google.android.gms.internal.play_billing.s0;
import n4.y;
public final class m {
    public final y f14899a;
    public final long f14900b;

    public m(o oVar, y yVar) {
        long length;
        long j3;
        this.f14899a = yVar;
        long length2 = ((oVar.f14902b.length() + oVar.f14901a.length()) * 2) + 128;
        s0 s0Var = (s0) yVar.f16363b;
        if (s0Var == null) {
            j3 = 1024;
        } else {
            long length3 = (((int[]) s0Var.f7460c).length * 4) + 64;
            if (((int[]) s0Var.f7459b) == null) {
                length = 0;
            } else {
                length = ((int[]) s0Var.f7459b).length * 4;
            }
            j3 = length + length3;
        }
        this.f14900b = length2 + j3;
    }
}
