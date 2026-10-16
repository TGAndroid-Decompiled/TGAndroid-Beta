package b1;

import v0.i;
public final class h implements Runnable {
    public final int f2056a;
    public final i f2057b;
    public final w0.i f2058c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f2056a = i10;
        this.f2057b = iVar;
        this.f2058c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f2056a) {
            case 0:
                Object obj = this.f2058c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f2057b.onError(obj);
                return;
            default:
                this.f2057b.onError(this.f2058c);
                return;
        }
    }
}
