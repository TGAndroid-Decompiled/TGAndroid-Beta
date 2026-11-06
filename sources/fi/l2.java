package fi;
public final class l2 implements Runnable {
    public final int f12311a;
    public final p2 f12312b;
    public final ai.i f12313c;

    public l2(p2 p2Var, ai.i iVar, int i7) {
        this.f12311a = i7;
        this.f12312b = p2Var;
        this.f12313c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f12311a) {
            case 0:
                p2 p2Var = this.f12312b;
                p2Var.getClass();
                org.telegram.messenger.g0.i3(new l2(p2Var, this.f12313c, 1), 320L);
                return;
            default:
                p2 p2Var2 = this.f12312b;
                p2Var2.getClass();
                this.f12313c.a(new ai.i(p2Var2, 19));
                return;
        }
    }
}
