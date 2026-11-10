package org.telegram.messenger;
public final class wc implements Runnable {
    public final int f26289a;
    public final id f26290b;
    public final int f26291c;

    public wc(id idVar, int i7, int i10) {
        this.f26289a = i10;
        this.f26290b = idVar;
        this.f26291c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26289a) {
            case 0:
                id idVar = this.f26290b;
                idVar.P = false;
                idVar.j(this.f26291c);
                return;
            case 1:
                id idVar2 = this.f26290b;
                idVar2.P = false;
                idVar2.j(this.f26291c);
                return;
            case 2:
                this.f26290b.Z0(this.f26291c, null, true, null);
                return;
            default:
                this.f26290b.Z0(this.f26291c, null, true, null);
                return;
        }
    }
}
