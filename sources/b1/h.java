package b1;

import v0.i;
public final class h implements Runnable {
    public final int f1296a;
    public final i f1297b;
    public final w0.i f1298c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f1296a = i10;
        this.f1297b = iVar;
        this.f1298c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f1296a) {
            case 0:
                Object obj = this.f1298c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f1297b.onError(obj);
                return;
            default:
                this.f1297b.onError(this.f1298c);
                return;
        }
    }
}
