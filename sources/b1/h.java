package b1;

import v0.i;
public final class h implements Runnable {
    public final int f3669a;
    public final i f3670b;
    public final w0.i f3671c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f3669a = i10;
        this.f3670b = iVar;
        this.f3671c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f3669a) {
            case 0:
                Object obj = this.f3671c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f3670b.onError(obj);
                return;
            default:
                this.f3670b.onError(this.f3671c);
                return;
        }
    }
}
