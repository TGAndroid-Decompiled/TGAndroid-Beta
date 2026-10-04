package b1;

import v0.i;
public final class h implements Runnable {
    public final int f3126a;
    public final i f3127b;
    public final w0.i f3128c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f3126a = i10;
        this.f3127b = iVar;
        this.f3128c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f3126a) {
            case 0:
                Object obj = this.f3128c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f3127b.onError(obj);
                return;
            default:
                this.f3127b.onError(this.f3128c);
                return;
        }
    }
}
