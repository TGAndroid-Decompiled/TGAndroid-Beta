package org.telegram.messenger;
public final class af implements Runnable {
    public final int f21432a;
    public final cf f21433b;
    public final int f21434c;

    public af(cf cfVar, int i7, int i10) {
        this.f21432a = i10;
        this.f21433b = cfVar;
        this.f21434c = i7;
    }

    @Override
    public final void run() {
        switch (this.f21432a) {
            case 0:
                cf cfVar = this.f21433b;
                try {
                    cfVar.f21847b.o(this.f21434c);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                cf cfVar2 = this.f21433b;
                try {
                    cfVar2.f21847b.o(this.f21434c);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 2:
                cf cfVar3 = this.f21433b;
                try {
                    cfVar3.f21847b.o(this.f21434c);
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            default:
                cf cfVar4 = this.f21433b;
                try {
                    cfVar4.f21847b.o(this.f21434c);
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
        }
    }
}
