package b1;

import v0.i;
public final class h implements Runnable {
    public final int f3670a;
    public final i f3671b;
    public final w0.i f3672c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f3670a = i10;
        this.f3671b = iVar;
        this.f3672c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f3670a) {
            case 0:
                Object obj = this.f3672c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f3671b.onError(obj);
                return;
            default:
                this.f3671b.onError(this.f3672c);
                return;
        }
    }
}
