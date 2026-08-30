package b1;

import v0.i;
public final class h implements Runnable {
    public final int f1285a;
    public final i f1286b;
    public final w0.i f1287c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f1285a = i10;
        this.f1286b = iVar;
        this.f1287c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f1285a) {
            case 0:
                Object obj = this.f1287c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f1286b.onError(obj);
                return;
            default:
                this.f1286b.onError(this.f1287c);
                return;
        }
    }
}
