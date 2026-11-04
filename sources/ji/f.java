package ji;

import org.telegram.ui.wm;
public final class f implements Runnable {
    public final int f16303a;
    public final n f16304b;
    public final long f16305c;

    public f(n nVar, long j10, int i3) {
        this.f16303a = i3;
        this.f16304b = nVar;
        this.f16305c = j10;
    }

    @Override
    public final void run() {
        switch (this.f16303a) {
            case 0:
                n.c0(this.f16304b, this.f16305c);
                return;
            default:
                n nVar = this.f16304b;
                nVar.getClass();
                nVar.presentFragment(wm.ra(this.f16305c));
                return;
        }
    }
}
