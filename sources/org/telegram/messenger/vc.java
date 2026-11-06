package org.telegram.messenger;
public final class vc implements Runnable {
    public final int f25964a;
    public final hd f25965b;
    public final int f25966c;

    public vc(hd hdVar, int i7, int i10) {
        this.f25964a = i10;
        this.f25965b = hdVar;
        this.f25966c = i7;
    }

    @Override
    public final void run() {
        switch (this.f25964a) {
            case 0:
                hd hdVar = this.f25965b;
                hdVar.P = false;
                hdVar.j(this.f25966c);
                return;
            case 1:
                hd hdVar2 = this.f25965b;
                hdVar2.P = false;
                hdVar2.j(this.f25966c);
                return;
            case 2:
                this.f25965b.Z0(this.f25966c, null, true, null);
                return;
            default:
                this.f25965b.Z0(this.f25966c, null, true, null);
                return;
        }
    }
}
