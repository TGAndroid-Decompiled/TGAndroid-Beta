package b1;

import v0.i;
public final class h implements Runnable {
    public final int f1959a;
    public final i f1960b;
    public final w0.i f1961c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f1959a = i10;
        this.f1960b = iVar;
        this.f1961c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f1959a) {
            case 0:
                Object obj = this.f1961c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f1960b.onError(obj);
                return;
            default:
                this.f1960b.onError(this.f1961c);
                return;
        }
    }
}
