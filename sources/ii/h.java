package ii;

import org.telegram.ui.an;
public final class h implements Runnable {
    public final int f15538a;
    public final p f15539b;
    public final long f15540c;

    public h(p pVar, long j3, int i7) {
        this.f15538a = i7;
        this.f15539b = pVar;
        this.f15540c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15538a) {
            case 0:
                p.c0(this.f15539b, this.f15540c);
                return;
            default:
                p pVar = this.f15539b;
                pVar.getClass();
                pVar.presentFragment(an.ra(this.f15540c));
                return;
        }
    }
}
