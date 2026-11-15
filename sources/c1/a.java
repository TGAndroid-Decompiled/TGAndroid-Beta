package c1;

import w0.i;
public final class a implements Runnable {
    public final int f4065a;
    public final f f4066b;
    public final i f4067c;

    public a(f fVar, i iVar, int i7) {
        this.f4065a = i7;
        this.f4066b = fVar;
        this.f4067c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f4065a) {
            case 0:
                this.f4066b.f().a(this.f4067c);
                return;
            case 1:
                this.f4066b.f().a(this.f4067c);
                return;
            default:
                this.f4066b.f().a(this.f4067c);
                return;
        }
    }
}
