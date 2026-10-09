package b1;

import v0.i;
public final class h implements Runnable {
    public final int f3205a;
    public final i f3206b;
    public final w0.i f3207c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f3205a = i10;
        this.f3206b = iVar;
        this.f3207c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f3205a) {
            case 0:
                Object obj = this.f3207c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f3206b.onError(obj);
                return;
            default:
                this.f3206b.onError(this.f3207c);
                return;
        }
    }
}
