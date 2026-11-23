package ii;

import di.p9;
import org.telegram.messenger.ur;
public final class k implements Runnable {
    public final int f16303a = 0;
    public final long f16304b;
    public final long f16305c;
    public final int d;
    public final int f16306e;
    public final Object f16307f;

    public k(int i7, long j3, long j10, int i10, p9 p9Var) {
        this.d = i7;
        this.f16304b = j3;
        this.f16305c = j10;
        this.f16306e = i10;
        this.f16307f = p9Var;
    }

    @Override
    public final void run() {
        switch (this.f16303a) {
            case 0:
                p9 p9Var = (p9) this.f16307f;
                n.a(this.d, this.f16304b, this.f16305c, this.f16306e + 1, p9Var);
                return;
            default:
                ((ur) this.f16307f).e2(-this.f16304b, this.f16305c, this.d, this.f16306e);
                return;
        }
    }

    public k(ur urVar, long j3, long j10, int i7, int i10) {
        this.f16307f = urVar;
        this.f16304b = j3;
        this.f16305c = j10;
        this.d = i7;
        this.f16306e = i10;
    }
}
