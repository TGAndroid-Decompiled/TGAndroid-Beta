package c1;

import w0.i;
public final class b implements Runnable {
    public final int f4378a;
    public final f f4379b;
    public final i f4380c;

    public b(f fVar, i iVar, int i7) {
        this.f4378a = i7;
        this.f4379b = fVar;
        this.f4380c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f4378a) {
            case 0:
                this.f4379b.f().a(this.f4380c);
                return;
            case 1:
                this.f4379b.f().a(this.f4380c);
                return;
            default:
                this.f4379b.f().a(this.f4380c);
                return;
        }
    }
}
