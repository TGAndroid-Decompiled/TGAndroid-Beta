package b1;

import v0.i;
public final class h implements Runnable {
    public final int f2895a;
    public final i f2896b;
    public final w0.i f2897c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f2895a = i10;
        this.f2896b = iVar;
        this.f2897c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f2895a) {
            case 0:
                Object obj = this.f2897c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f2896b.onError(obj);
                return;
            default:
                this.f2896b.onError(this.f2897c);
                return;
        }
    }
}
