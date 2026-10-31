package nh;
public final class o implements Runnable {
    public final int f13884a;
    public final p f13885b;
    public final int f13886c;

    public o(p pVar, int i10, int i11) {
        this.f13884a = i11;
        this.f13885b = pVar;
        this.f13886c = i10;
    }

    @Override
    public final void run() {
        switch (this.f13884a) {
            case 0:
                p pVar = this.f13885b;
                pVar.post(new o(pVar, this.f13886c, 1));
                return;
            default:
                int i10 = this.f13886c;
                p pVar2 = this.f13885b;
                if (i10 == pVar2.h) {
                    pVar2.f13890f = false;
                    pVar2.d = true;
                    pVar2.b();
                    return;
                }
                return;
        }
    }
}
