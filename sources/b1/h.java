package b1;

import v0.i;
public final class h implements Runnable {
    public final int f3666a;
    public final i f3667b;
    public final w0.i f3668c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f3666a = i10;
        this.f3667b = iVar;
        this.f3668c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f3666a) {
            case 0:
                Object obj = this.f3668c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f3667b.onError(obj);
                return;
            default:
                this.f3667b.onError(this.f3668c);
                return;
        }
    }
}
