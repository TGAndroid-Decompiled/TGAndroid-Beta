package b1;

import v0.i;
public final class h implements Runnable {
    public final int f1596a;
    public final i f1597b;
    public final w0.i f1598c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f1596a = i10;
        this.f1597b = iVar;
        this.f1598c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f1596a) {
            case 0:
                Object obj = this.f1598c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f1597b.onError(obj);
                return;
            default:
                this.f1597b.onError(this.f1598c);
                return;
        }
    }
}
