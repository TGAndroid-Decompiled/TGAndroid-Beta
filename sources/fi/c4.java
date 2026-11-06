package fi;
public final class c4 implements Runnable {
    public final int f11727a;
    public final o5 f11728b;
    public final tg.r1 f11729c;

    public c4(o5 o5Var, tg.r1 r1Var, int i7) {
        this.f11727a = i7;
        this.f11728b = o5Var;
        this.f11729c = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f11727a) {
            case 0:
                this.f11728b.A0(this.f11729c, true);
                return;
            default:
                this.f11728b.z0(this.f11729c);
                return;
        }
    }
}
