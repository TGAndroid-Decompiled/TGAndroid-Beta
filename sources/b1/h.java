package b1;

import v0.i;
public final class h implements Runnable {
    public final int f2903a;
    public final i f2904b;
    public final w0.i f2905c;

    public h(i iVar, w0.i iVar2, int i10) {
        this.f2903a = i10;
        this.f2904b = iVar;
        this.f2905c = iVar2;
    }

    @Override
    public final void run() {
        switch (this.f2903a) {
            case 0:
                Object obj = this.f2905c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.f2904b.onError(obj);
                return;
            default:
                this.f2904b.onError(this.f2905c);
                return;
        }
    }
}
