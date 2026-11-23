package ii;

import di.p9;
import org.telegram.messenger.tr;
public final class k implements Runnable {
    public final int f16400a = 0;
    public final long f16401b;
    public final long f16402c;
    public final int d;
    public final int f16403e;
    public final Object f16404f;

    public k(int i7, long j3, long j10, int i10, p9 p9Var) {
        this.d = i7;
        this.f16401b = j3;
        this.f16402c = j10;
        this.f16403e = i10;
        this.f16404f = p9Var;
    }

    @Override
    public final void run() {
        switch (this.f16400a) {
            case 0:
                p9 p9Var = (p9) this.f16404f;
                n.a(this.d, this.f16401b, this.f16402c, this.f16403e + 1, p9Var);
                return;
            default:
                ((tr) this.f16404f).e2(-this.f16401b, this.f16402c, this.d, this.f16403e);
                return;
        }
    }

    public k(tr trVar, long j3, long j10, int i7, int i10) {
        this.f16404f = trVar;
        this.f16401b = j3;
        this.f16402c = j10;
        this.d = i7;
        this.f16403e = i10;
    }
}
