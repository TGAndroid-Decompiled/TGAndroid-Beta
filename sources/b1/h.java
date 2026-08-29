package b1;

import v0.i;
public final class h implements Runnable {
    public final int f1894a;
    public final i f1895b;
    public final w0.i f1896c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f1894a = i10;
        this.f1895b = iVar;
        this.f1896c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f1894a) {
            case 0:
                Object obj = this.f1896c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f1895b.onError(obj);
                return;
            default:
                this.f1895b.onError(this.f1896c);
                return;
        }
    }
}
