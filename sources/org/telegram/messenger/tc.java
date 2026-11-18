package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f26981a;
    public final gd f26982b;
    public final int f26983c;

    public tc(gd gdVar, int i7, int i10) {
        this.f26981a = i10;
        this.f26982b = gdVar;
        this.f26983c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26981a) {
            case 0:
                gd gdVar = this.f26982b;
                gdVar.P = false;
                gdVar.j(this.f26983c);
                return;
            case 1:
                gd gdVar2 = this.f26982b;
                gdVar2.P = false;
                gdVar2.j(this.f26983c);
                return;
            case 2:
                this.f26982b.Z0(this.f26983c, null, true, null);
                return;
            default:
                this.f26982b.Z0(this.f26983c, null, true, null);
                return;
        }
    }
}
