package b1;

import v0.i;
public final class h implements Runnable {
    public final int f2052a;
    public final i f2053b;
    public final w0.i f2054c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f2052a = i10;
        this.f2053b = iVar;
        this.f2054c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f2052a) {
            case 0:
                Object obj = this.f2054c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f2053b.onError(obj);
                return;
            default:
                this.f2053b.onError(this.f2054c);
                return;
        }
    }
}
