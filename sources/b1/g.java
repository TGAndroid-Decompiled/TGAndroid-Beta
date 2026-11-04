package b1;

import v0.h;
import w0.i;
public final class g implements Runnable {
    public final int f2338a;
    public final h f2339b;
    public final i f2340c;

    public g(h hVar, i iVar, int i3) {
        this.f2338a = i3;
        this.f2339b = hVar;
        this.f2340c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f2338a) {
            case 0:
                Object obj = this.f2340c;
                if (obj == null) {
                    obj = new w0.h(2, "No provider data returned");
                }
                this.f2339b.a(obj);
                return;
            default:
                this.f2339b.a(this.f2340c);
                return;
        }
    }
}
