package li;

import org.telegram.ui.bn;
public final class h implements Runnable {
    public final int f19966a;
    public final p f19967b;
    public final long f19968c;

    public h(p pVar, long j3, int i7) {
        this.f19966a = i7;
        this.f19967b = pVar;
        this.f19968c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19966a) {
            case 0:
                p.c0(this.f19967b, this.f19968c);
                return;
            default:
                p pVar = this.f19967b;
                pVar.getClass();
                pVar.presentFragment(bn.ua(this.f19968c));
                return;
        }
    }
}
