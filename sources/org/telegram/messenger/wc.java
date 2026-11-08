package org.telegram.messenger;
public final class wc implements Runnable {
    public final int f26285a;
    public final id f26286b;
    public final int f26287c;

    public wc(id idVar, int i7, int i10) {
        this.f26285a = i10;
        this.f26286b = idVar;
        this.f26287c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26285a) {
            case 0:
                id idVar = this.f26286b;
                idVar.P = false;
                idVar.j(this.f26287c);
                return;
            case 1:
                id idVar2 = this.f26286b;
                idVar2.P = false;
                idVar2.j(this.f26287c);
                return;
            case 2:
                this.f26286b.Z0(this.f26287c, null, true, null);
                return;
            default:
                this.f26286b.Z0(this.f26287c, null, true, null);
                return;
        }
    }
}
