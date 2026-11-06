package org.telegram.messenger;
public final class vc implements Runnable {
    public final int f25956a;
    public final hd f25957b;
    public final int f25958c;

    public vc(hd hdVar, int i7, int i10) {
        this.f25956a = i10;
        this.f25957b = hdVar;
        this.f25958c = i7;
    }

    @Override
    public final void run() {
        switch (this.f25956a) {
            case 0:
                hd hdVar = this.f25957b;
                hdVar.P = false;
                hdVar.j(this.f25958c);
                return;
            case 1:
                hd hdVar2 = this.f25957b;
                hdVar2.P = false;
                hdVar2.j(this.f25958c);
                return;
            case 2:
                this.f25957b.Z0(this.f25958c, null, true, null);
                return;
            default:
                this.f25957b.Z0(this.f25958c, null, true, null);
                return;
        }
    }
}
