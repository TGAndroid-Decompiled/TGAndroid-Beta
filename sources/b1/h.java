package b1;

import v0.i;
public final class h implements Runnable {
    public final int f3668a;
    public final i f3669b;
    public final w0.i f3670c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f3668a = i10;
        this.f3669b = iVar;
        this.f3670c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f3668a) {
            case 0:
                Object obj = this.f3670c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f3669b.onError(obj);
                return;
            default:
                this.f3669b.onError(this.f3670c);
                return;
        }
    }
}
