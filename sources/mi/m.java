package mi;

import com.google.android.gms.internal.play_billing.s0;
public final class m {
    public final m4.c f15873a;
    public final long f15874b;

    public m(o oVar, m4.c cVar) {
        long length;
        long j10;
        this.f15873a = cVar;
        long length2 = ((oVar.f15876b.length() + oVar.f15875a.length()) * 2) + 128;
        s0 s0Var = (s0) cVar.f15392b;
        if (s0Var == null) {
            j10 = 1024;
        } else {
            long length3 = (((int[]) s0Var.f5751c).length * 4) + 64;
            if (((int[]) s0Var.f5750b) == null) {
                length = 0;
            } else {
                length = ((int[]) s0Var.f5750b).length * 4;
            }
            j10 = length + length3;
        }
        this.f15874b = length2 + j10;
    }
}
