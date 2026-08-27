package c2;

import ag.h1;

public final class c implements Runnable {

    public final int f2240a;

    public final h1 f2241b;

    public final int f2242c;

    public c(h1 h1Var, int i10, int i11) {
        this.f2240a = i11;
        this.f2241b = h1Var;
        this.f2242c = i10;
    }

    @Override
    public final void run() {
        switch (this.f2240a) {
            case 0:
                z zVar = ((e) ((a5.n) this.f2241b.f415f).d).d;
                if (zVar != null) {
                    zVar.j(this.f2242c);
                }
                break;
            default:
                z zVar2 = ((e) ((a5.n) this.f2241b.f415f).d).d;
                if (zVar2 != null) {
                    zVar2.k(this.f2242c);
                }
                break;
        }
    }
}
