package org.telegram.messenger;
public final class uc implements Runnable {
    public final int f26800a;
    public final hd f26801b;
    public final int f26802c;

    public uc(hd hdVar, int i7, int i10) {
        this.f26800a = i10;
        this.f26801b = hdVar;
        this.f26802c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26800a) {
            case 0:
                hd hdVar = this.f26801b;
                hdVar.P = false;
                hdVar.j(this.f26802c);
                return;
            case 1:
                hd hdVar2 = this.f26801b;
                hdVar2.P = false;
                hdVar2.j(this.f26802c);
                return;
            case 2:
                this.f26801b.Z0(this.f26802c, null, true, null);
                return;
            default:
                this.f26801b.Z0(this.f26802c, null, true, null);
                return;
        }
    }
}
