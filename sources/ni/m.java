package ni;

import com.google.android.gms.internal.play_billing.s0;
public final class m {
    public final m4.c f18892a;
    public final long f18893b;

    public m(o oVar, m4.c cVar) {
        long length;
        long j10;
        this.f18892a = cVar;
        long length2 = ((oVar.f18895b.length() + oVar.f18894a.length()) * 2) + 128;
        s0 s0Var = (s0) cVar.f18009b;
        if (s0Var == null) {
            j10 = 1024;
        } else {
            long length3 = (((int[]) s0Var.f7319c).length * 4) + 64;
            if (((int[]) s0Var.f7318b) == null) {
                length = 0;
            } else {
                length = ((int[]) s0Var.f7318b).length * 4;
            }
            j10 = length + length3;
        }
        this.f18893b = length2 + j10;
    }
}
