package c1;

import w0.i;
public final class a implements Runnable {
    public final int f2023a;
    public final f f2024b;
    public final i f2025c;

    public a(f fVar, i iVar, int i10) {
        this.f2023a = i10;
        this.f2024b = fVar;
        this.f2025c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f2023a) {
            case 0:
                this.f2024b.e().onError(this.f2025c);
                return;
            case 1:
                this.f2024b.e().onError(this.f2025c);
                return;
            default:
                this.f2024b.e().onError(this.f2025c);
                return;
        }
    }
}
