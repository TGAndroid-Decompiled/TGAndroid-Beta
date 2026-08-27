package b1;

import v0.i;

public final class h implements Runnable {

    public final int f1900a;

    public final i f1901b;

    public final w0.i f1902c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f1900a = i10;
        this.f1901b = iVar;
        this.f1902c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f1900a) {
            case 0:
                Object hVar = this.f1902c;
                if (hVar == null) {
                    hVar = new w0.h("No provider data returned", 2);
                }
                this.f1901b.onError(hVar);
                break;
            default:
                this.f1901b.onError(this.f1902c);
                break;
        }
    }
}
