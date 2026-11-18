package ii;

import di.o9;
import org.telegram.messenger.tr;
public final class k implements Runnable {
    public final int f16312a = 0;
    public final long f16313b;
    public final long f16314c;
    public final int d;
    public final int f16315e;
    public final Object f16316f;

    public k(int i7, long j3, long j10, int i10, o9 o9Var) {
        this.d = i7;
        this.f16313b = j3;
        this.f16314c = j10;
        this.f16315e = i10;
        this.f16316f = o9Var;
    }

    @Override
    public final void run() {
        switch (this.f16312a) {
            case 0:
                o9 o9Var = (o9) this.f16316f;
                n.a(this.d, this.f16313b, this.f16314c, this.f16315e + 1, o9Var);
                return;
            default:
                ((tr) this.f16316f).e2(-this.f16313b, this.f16314c, this.d, this.f16315e);
                return;
        }
    }

    public k(tr trVar, long j3, long j10, int i7, int i10) {
        this.f16316f = trVar;
        this.f16313b = j3;
        this.f16314c = j10;
        this.d = i7;
        this.f16315e = i10;
    }
}
