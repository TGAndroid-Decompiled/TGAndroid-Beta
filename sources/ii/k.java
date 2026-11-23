package ii;

import di.p9;
import org.telegram.messenger.ur;
public final class k implements Runnable {
    public final int f16337a = 0;
    public final long f16338b;
    public final long f16339c;
    public final int d;
    public final int f16340e;
    public final Object f16341f;

    public k(int i7, long j3, long j10, int i10, p9 p9Var) {
        this.d = i7;
        this.f16338b = j3;
        this.f16339c = j10;
        this.f16340e = i10;
        this.f16341f = p9Var;
    }

    @Override
    public final void run() {
        switch (this.f16337a) {
            case 0:
                p9 p9Var = (p9) this.f16341f;
                n.a(this.d, this.f16338b, this.f16339c, this.f16340e + 1, p9Var);
                return;
            default:
                ((ur) this.f16341f).e2(-this.f16338b, this.f16339c, this.d, this.f16340e);
                return;
        }
    }

    public k(ur urVar, long j3, long j10, int i7, int i10) {
        this.f16341f = urVar;
        this.f16338b = j3;
        this.f16339c = j10;
        this.d = i7;
        this.f16340e = i10;
    }
}
