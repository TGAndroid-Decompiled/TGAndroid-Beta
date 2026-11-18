package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f26979a;
    public final gd f26980b;
    public final int f26981c;

    public tc(gd gdVar, int i7, int i10) {
        this.f26979a = i10;
        this.f26980b = gdVar;
        this.f26981c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26979a) {
            case 0:
                gd gdVar = this.f26980b;
                gdVar.P = false;
                gdVar.j(this.f26981c);
                return;
            case 1:
                gd gdVar2 = this.f26980b;
                gdVar2.P = false;
                gdVar2.j(this.f26981c);
                return;
            case 2:
                this.f26980b.Z0(this.f26981c, null, true, null);
                return;
            default:
                this.f26980b.Z0(this.f26981c, null, true, null);
                return;
        }
    }
}
