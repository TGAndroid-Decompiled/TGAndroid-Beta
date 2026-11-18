package ii;

import di.o9;
import org.telegram.messenger.tr;
public final class k implements Runnable {
    public final int f16309a = 0;
    public final long f16310b;
    public final long f16311c;
    public final int d;
    public final int f16312e;
    public final Object f16313f;

    public k(int i7, long j3, long j10, int i10, o9 o9Var) {
        this.d = i7;
        this.f16310b = j3;
        this.f16311c = j10;
        this.f16312e = i10;
        this.f16313f = o9Var;
    }

    @Override
    public final void run() {
        switch (this.f16309a) {
            case 0:
                o9 o9Var = (o9) this.f16313f;
                n.a(this.d, this.f16310b, this.f16311c, this.f16312e + 1, o9Var);
                return;
            default:
                ((tr) this.f16313f).e2(-this.f16310b, this.f16311c, this.d, this.f16312e);
                return;
        }
    }

    public k(tr trVar, long j3, long j10, int i7, int i10) {
        this.f16313f = trVar;
        this.f16310b = j3;
        this.f16311c = j10;
        this.d = i7;
        this.f16312e = i10;
    }
}
