package fi;
public final class c4 implements Runnable {
    public final int f11732a;
    public final o5 f11733b;
    public final tg.r1 f11734c;

    public c4(o5 o5Var, tg.r1 r1Var, int i7) {
        this.f11732a = i7;
        this.f11733b = o5Var;
        this.f11734c = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f11732a) {
            case 0:
                this.f11733b.A0(this.f11734c, true);
                return;
            default:
                this.f11733b.z0(this.f11734c);
                return;
        }
    }
}
