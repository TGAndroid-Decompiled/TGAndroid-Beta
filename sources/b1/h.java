package b1;

import v0.i;
public final class h implements Runnable {
    public final int f2902a;
    public final i f2903b;
    public final w0.i f2904c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f2902a = i10;
        this.f2903b = iVar;
        this.f2904c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f2902a) {
            case 0:
                Object obj = this.f2904c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f2903b.onError(obj);
                return;
            default:
                this.f2903b.onError(this.f2904c);
                return;
        }
    }
}
