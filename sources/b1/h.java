package b1;

import v0.i;
public final class h implements Runnable {
    public final int f3673a;
    public final i f3674b;
    public final w0.i f3675c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f3673a = i10;
        this.f3674b = iVar;
        this.f3675c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f3673a) {
            case 0:
                Object obj = this.f3675c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f3674b.onError(obj);
                return;
            default:
                this.f3674b.onError(this.f3675c);
                return;
        }
    }
}
