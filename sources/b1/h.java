package b1;

import v0.i;
public final class h implements Runnable {
    public final int f1932a;
    public final i f1933b;
    public final w0.i f1934c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f1932a = i10;
        this.f1933b = iVar;
        this.f1934c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f1932a) {
            case 0:
                Object obj = this.f1934c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f1933b.onError(obj);
                return;
            default:
                this.f1933b.onError(this.f1934c);
                return;
        }
    }
}
