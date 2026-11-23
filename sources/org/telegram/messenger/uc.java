package org.telegram.messenger;
public final class uc implements Runnable {
    public final int f27177a;
    public final hd f27178b;
    public final int f27179c;

    public uc(hd hdVar, int i7, int i10) {
        this.f27177a = i10;
        this.f27178b = hdVar;
        this.f27179c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27177a) {
            case 0:
                hd hdVar = this.f27178b;
                hdVar.P = false;
                hdVar.j(this.f27179c);
                return;
            case 1:
                hd hdVar2 = this.f27178b;
                hdVar2.P = false;
                hdVar2.j(this.f27179c);
                return;
            case 2:
                this.f27178b.a1(this.f27179c, null, true, null);
                return;
            default:
                this.f27178b.a1(this.f27179c, null, true, null);
                return;
        }
    }
}
