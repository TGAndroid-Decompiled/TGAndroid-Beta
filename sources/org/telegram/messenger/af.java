package org.telegram.messenger;
public final class af implements Runnable {
    public final int f21428a;
    public final cf f21429b;
    public final int f21430c;

    public af(cf cfVar, int i7, int i10) {
        this.f21428a = i10;
        this.f21429b = cfVar;
        this.f21430c = i7;
    }

    @Override
    public final void run() {
        switch (this.f21428a) {
            case 0:
                cf cfVar = this.f21429b;
                try {
                    cfVar.f21810b.o(this.f21430c);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                cf cfVar2 = this.f21429b;
                try {
                    cfVar2.f21810b.o(this.f21430c);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 2:
                cf cfVar3 = this.f21429b;
                try {
                    cfVar3.f21810b.o(this.f21430c);
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            default:
                cf cfVar4 = this.f21429b;
                try {
                    cfVar4.f21810b.o(this.f21430c);
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
        }
    }
}
