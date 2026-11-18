package li;

import org.telegram.ui.bn;
public final class h implements Runnable {
    public final int f19938a;
    public final p f19939b;
    public final long f19940c;

    public h(p pVar, long j3, int i7) {
        this.f19938a = i7;
        this.f19939b = pVar;
        this.f19940c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19938a) {
            case 0:
                p.c0(this.f19939b, this.f19940c);
                return;
            default:
                p pVar = this.f19939b;
                pVar.getClass();
                pVar.presentFragment(bn.ua(this.f19940c));
                return;
        }
    }
}
