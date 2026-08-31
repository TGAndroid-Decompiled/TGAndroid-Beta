package b1;

import v0.i;
public final class h implements Runnable {
    public final int f1385a;
    public final i f1386b;
    public final w0.i f1387c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f1385a = i10;
        this.f1386b = iVar;
        this.f1387c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f1385a) {
            case 0:
                Object obj = this.f1387c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f1386b.onError(obj);
                return;
            default:
                this.f1386b.onError(this.f1387c);
                return;
        }
    }
}
