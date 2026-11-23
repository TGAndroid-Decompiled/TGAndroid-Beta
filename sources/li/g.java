package li;

import org.telegram.ui.bn;
public final class g implements Runnable {
    public final int f20032a;
    public final o f20033b;
    public final long f20034c;

    public g(o oVar, long j3, int i7) {
        this.f20032a = i7;
        this.f20033b = oVar;
        this.f20034c = j3;
    }

    @Override
    public final void run() {
        switch (this.f20032a) {
            case 0:
                o.c0(this.f20033b, this.f20034c);
                return;
            default:
                o oVar = this.f20033b;
                oVar.getClass();
                oVar.presentFragment(bn.ua(this.f20034c));
                return;
        }
    }
}
