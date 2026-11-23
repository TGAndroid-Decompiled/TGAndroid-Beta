package org.telegram.messenger;
public final class uc implements Runnable {
    public final int f27141a;
    public final hd f27142b;
    public final int f27143c;

    public uc(hd hdVar, int i7, int i10) {
        this.f27141a = i10;
        this.f27142b = hdVar;
        this.f27143c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27141a) {
            case 0:
                hd hdVar = this.f27142b;
                hdVar.P = false;
                hdVar.j(this.f27143c);
                return;
            case 1:
                hd hdVar2 = this.f27142b;
                hdVar2.P = false;
                hdVar2.j(this.f27143c);
                return;
            case 2:
                this.f27142b.a1(this.f27143c, null, true, null);
                return;
            default:
                this.f27142b.a1(this.f27143c, null, true, null);
                return;
        }
    }
}
