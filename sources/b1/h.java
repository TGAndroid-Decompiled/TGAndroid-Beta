package b1;

import w0.i;
public final class h implements Runnable {
    public final int f1957a;
    public final v0.h f1958b;
    public final i f1959c;

    public h(v0.h hVar, i iVar, int i10) {
        this.f1957a = i10;
        this.f1958b = hVar;
        this.f1959c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f1957a) {
            case 0:
                Object obj = this.f1959c;
                if (obj == null) {
                    obj = new w0.h(2, "No provider data returned");
                }
                this.f1958b.g(obj);
                return;
            default:
                this.f1958b.g(this.f1959c);
                return;
        }
    }
}
