package nh;
public final class o implements Runnable {
    public final int f13885a;
    public final p f13886b;
    public final int f13887c;

    public o(p pVar, int i10, int i11) {
        this.f13885a = i11;
        this.f13886b = pVar;
        this.f13887c = i10;
    }

    @Override
    public final void run() {
        switch (this.f13885a) {
            case 0:
                p pVar = this.f13886b;
                pVar.post(new o(pVar, this.f13887c, 1));
                return;
            default:
                int i10 = this.f13887c;
                p pVar2 = this.f13886b;
                if (i10 == pVar2.h) {
                    pVar2.f13891f = false;
                    pVar2.d = true;
                    pVar2.b();
                    return;
                }
                return;
        }
    }
}
