package b1;

import v0.i;
public final class h implements Runnable {
    public final int f2897a;
    public final i f2898b;
    public final w0.i f2899c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f2897a = i10;
        this.f2898b = iVar;
        this.f2899c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f2897a) {
            case 0:
                Object obj = this.f2899c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f2898b.onError(obj);
                return;
            default:
                this.f2898b.onError(this.f2899c);
                return;
        }
    }
}
