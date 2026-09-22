package b1;

import v0.i;
public final class h implements Runnable {
    public final int f2900a;
    public final i f2901b;
    public final w0.i f2902c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f2900a = i10;
        this.f2901b = iVar;
        this.f2902c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f2900a) {
            case 0:
                Object obj = this.f2902c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f2901b.onError(obj);
                return;
            default:
                this.f2901b.onError(this.f2902c);
                return;
        }
    }
}
