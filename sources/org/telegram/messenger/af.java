package org.telegram.messenger;
public final class af implements Runnable {
    public final int f14604a;
    public final cf f14605b;
    public final int f14606c;

    public af(cf cfVar, int i10, int i11) {
        this.f14604a = i11;
        this.f14605b = cfVar;
        this.f14606c = i10;
    }

    @Override
    public final void run() {
        switch (this.f14604a) {
            case 0:
                cf cfVar = this.f14605b;
                try {
                    cfVar.f15012b.o(this.f14606c);
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                cf cfVar2 = this.f14605b;
                try {
                    cfVar2.f15012b.o(this.f14606c);
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 2:
                cf cfVar3 = this.f14605b;
                try {
                    cfVar3.f15012b.o(this.f14606c);
                    return;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
            default:
                cf cfVar4 = this.f14605b;
                try {
                    cfVar4.f15012b.o(this.f14606c);
                    return;
                } catch (Exception e11) {
                    f8.g(e11, true);
                    return;
                }
        }
    }
}
