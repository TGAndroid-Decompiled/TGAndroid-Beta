package org.telegram.messenger;
public final class te implements Runnable {
    public final int f25508a;
    public final ve f25509b;
    public final int f25510c;

    public te(ve veVar, int i3, int i10) {
        this.f25508a = i10;
        this.f25509b = veVar;
        this.f25510c = i3;
    }

    @Override
    public final void run() {
        switch (this.f25508a) {
            case 0:
                ve veVar = this.f25509b;
                try {
                    veVar.f25854b.o(this.f25510c);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                ve veVar2 = this.f25509b;
                try {
                    veVar2.f25854b.o(this.f25510c);
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 2:
                ve veVar3 = this.f25509b;
                try {
                    veVar3.f25854b.o(this.f25510c);
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            default:
                ve veVar4 = this.f25509b;
                try {
                    veVar4.f25854b.o(this.f25510c);
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
        }
    }
}
