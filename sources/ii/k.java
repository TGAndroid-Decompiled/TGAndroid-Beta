package ii;

import di.p9;
import org.telegram.messenger.tr;
public final class k implements Runnable {
    public final int f16334a = 0;
    public final long f16335b;
    public final long f16336c;
    public final int d;
    public final int f16337e;
    public final Object f16338f;

    public k(int i7, long j3, long j10, int i10, p9 p9Var) {
        this.d = i7;
        this.f16335b = j3;
        this.f16336c = j10;
        this.f16337e = i10;
        this.f16338f = p9Var;
    }

    @Override
    public final void run() {
        switch (this.f16334a) {
            case 0:
                p9 p9Var = (p9) this.f16338f;
                n.a(this.d, this.f16335b, this.f16336c, this.f16337e + 1, p9Var);
                return;
            default:
                ((tr) this.f16338f).e2(-this.f16335b, this.f16336c, this.d, this.f16337e);
                return;
        }
    }

    public k(tr trVar, long j3, long j10, int i7, int i10) {
        this.f16338f = trVar;
        this.f16335b = j3;
        this.f16336c = j10;
        this.d = i7;
        this.f16337e = i10;
    }
}
