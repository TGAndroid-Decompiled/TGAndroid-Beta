package mi;

import com.google.android.gms.internal.play_billing.s0;
public final class m {
    public final q f17029a;
    public final long f17030b;

    public m(o oVar, q qVar) {
        long length;
        long j10;
        this.f17029a = qVar;
        long length2 = ((oVar.f17032b.length() + oVar.f17031a.length()) * 2) + 128;
        s0 s0Var = (s0) qVar.f17036b;
        if (s0Var == null) {
            j10 = 1024;
        } else {
            long length3 = (((int[]) s0Var.f7220c).length * 4) + 64;
            if (((int[]) s0Var.f7219b) == null) {
                length = 0;
            } else {
                length = ((int[]) s0Var.f7219b).length * 4;
            }
            j10 = length + length3;
        }
        this.f17030b = length2 + j10;
    }
}
