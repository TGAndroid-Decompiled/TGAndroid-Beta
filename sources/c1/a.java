package c1;

import w0.i;
public final class a implements Runnable {
    public final int f1862a;
    public final f f1863b;
    public final i f1864c;

    public a(f fVar, i iVar, int i10) {
        this.f1862a = i10;
        this.f1863b = fVar;
        this.f1864c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f1862a) {
            case 0:
                this.f1863b.e().onError(this.f1864c);
                return;
            case 1:
                this.f1863b.e().onError(this.f1864c);
                return;
            default:
                this.f1863b.e().onError(this.f1864c);
                return;
        }
    }
}
