package li;

import org.telegram.ui.bn;
public final class h implements Runnable {
    public final int f19941a;
    public final p f19942b;
    public final long f19943c;

    public h(p pVar, long j3, int i7) {
        this.f19941a = i7;
        this.f19942b = pVar;
        this.f19943c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19941a) {
            case 0:
                p.c0(this.f19942b, this.f19943c);
                return;
            default:
                p pVar = this.f19942b;
                pVar.getClass();
                pVar.presentFragment(bn.ua(this.f19943c));
                return;
        }
    }
}
