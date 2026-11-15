package c1;

import w0.i;
public final class a implements Runnable {
    public final int f4068a;
    public final f f4069b;
    public final i f4070c;

    public a(f fVar, i iVar, int i7) {
        this.f4068a = i7;
        this.f4069b = fVar;
        this.f4070c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f4068a) {
            case 0:
                this.f4069b.f().a(this.f4070c);
                return;
            case 1:
                this.f4069b.f().a(this.f4070c);
                return;
            default:
                this.f4069b.f().a(this.f4070c);
                return;
        }
    }
}
