package li;

import org.telegram.ui.bn;
public final class h implements Runnable {
    public final int f19935a;
    public final p f19936b;
    public final long f19937c;

    public h(p pVar, long j3, int i7) {
        this.f19935a = i7;
        this.f19936b = pVar;
        this.f19937c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19935a) {
            case 0:
                p.c0(this.f19936b, this.f19937c);
                return;
            default:
                p pVar = this.f19936b;
                pVar.getClass();
                pVar.presentFragment(bn.ua(this.f19937c));
                return;
        }
    }
}
