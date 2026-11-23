package li;

import org.telegram.ui.bn;
public final class h implements Runnable {
    public final int f19969a;
    public final p f19970b;
    public final long f19971c;

    public h(p pVar, long j3, int i7) {
        this.f19969a = i7;
        this.f19970b = pVar;
        this.f19971c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19969a) {
            case 0:
                p.c0(this.f19970b, this.f19971c);
                return;
            default:
                p pVar = this.f19970b;
                pVar.getClass();
                pVar.presentFragment(bn.ua(this.f19971c));
                return;
        }
    }
}
