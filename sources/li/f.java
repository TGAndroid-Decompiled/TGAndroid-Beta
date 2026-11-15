package li;

import org.telegram.ui.an;
public final class f implements Runnable {
    public final int f19563a;
    public final n f19564b;
    public final long f19565c;

    public f(n nVar, long j3, int i7) {
        this.f19563a = i7;
        this.f19564b = nVar;
        this.f19565c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19563a) {
            case 0:
                n.c0(this.f19564b, this.f19565c);
                return;
            default:
                n nVar = this.f19564b;
                nVar.getClass();
                nVar.presentFragment(an.ua(this.f19565c));
                return;
        }
    }
}
