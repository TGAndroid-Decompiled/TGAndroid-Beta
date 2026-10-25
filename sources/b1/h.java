package b1;

import v0.i;
public final class h implements Runnable {
    public final int f3119a;
    public final i f3120b;
    public final w0.i f3121c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f3119a = i10;
        this.f3120b = iVar;
        this.f3121c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f3119a) {
            case 0:
                Object obj = this.f3121c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f3120b.onError(obj);
                return;
            default:
                this.f3120b.onError(this.f3121c);
                return;
        }
    }
}
