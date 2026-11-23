package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f27076a;
    public final gd f27077b;
    public final int f27078c;

    public tc(gd gdVar, int i7, int i10) {
        this.f27076a = i10;
        this.f27077b = gdVar;
        this.f27078c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27076a) {
            case 0:
                gd gdVar = this.f27077b;
                gdVar.P = false;
                gdVar.j(this.f27078c);
                return;
            case 1:
                gd gdVar2 = this.f27077b;
                gdVar2.P = false;
                gdVar2.j(this.f27078c);
                return;
            case 2:
                this.f27077b.a1(this.f27078c, null, true, null);
                return;
            default:
                this.f27077b.a1(this.f27078c, null, true, null);
                return;
        }
    }
}
