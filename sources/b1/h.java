package b1;

import v0.i;
public final class h implements Runnable {
    public final int f1404a;
    public final i f1405b;
    public final w0.i f1406c;

    public h(i iVar, w0.i iVar2, int i9) {
        this.f1404a = i9;
        this.f1405b = iVar;
        this.f1406c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f1404a) {
            case 0:
                Object obj = this.f1406c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f1405b.onError(obj);
                return;
            default:
                this.f1405b.onError(this.f1406c);
                return;
        }
    }
}
