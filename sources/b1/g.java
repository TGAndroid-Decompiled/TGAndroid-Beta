package b1;

import w0.h;
import w0.i;
public final class g implements Runnable {
    public final int f2824a;
    public final v0.g f2825b;
    public final i f2826c;

    public g(v0.g gVar, i iVar, int i7) {
        this.f2824a = i7;
        this.f2825b = gVar;
        this.f2826c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f2824a) {
            case 0:
                Object obj = this.f2826c;
                if (obj == null) {
                    obj = new h(2, "No provider data returned");
                }
                this.f2825b.T(obj);
                return;
            case 1:
                this.f2825b.T(this.f2826c);
                return;
            default:
                this.f2825b.T(this.f2826c);
                return;
        }
    }
}
