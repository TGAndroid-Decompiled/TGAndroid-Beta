package b1;

import v0.i;
public final class h implements Runnable {
    public final int f3203a;
    public final i f3204b;
    public final w0.i f3205c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f3203a = i10;
        this.f3204b = iVar;
        this.f3205c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f3203a) {
            case 0:
                Object obj = this.f3205c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f3204b.onError(obj);
                return;
            default:
                this.f3204b.onError(this.f3205c);
                return;
        }
    }
}
