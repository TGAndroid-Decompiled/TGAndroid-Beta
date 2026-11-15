package org.telegram.messenger;
public final class uc implements Runnable {
    public final int f26802a;
    public final hd f26803b;
    public final int f26804c;

    public uc(hd hdVar, int i7, int i10) {
        this.f26802a = i10;
        this.f26803b = hdVar;
        this.f26804c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26802a) {
            case 0:
                hd hdVar = this.f26803b;
                hdVar.P = false;
                hdVar.j(this.f26804c);
                return;
            case 1:
                hd hdVar2 = this.f26803b;
                hdVar2.P = false;
                hdVar2.j(this.f26804c);
                return;
            case 2:
                this.f26803b.Z0(this.f26804c, null, true, null);
                return;
            default:
                this.f26803b.Z0(this.f26804c, null, true, null);
                return;
        }
    }
}
