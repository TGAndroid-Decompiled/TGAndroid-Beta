package fi;
public final class l2 implements Runnable {
    public final int f12313a;
    public final p2 f12314b;
    public final ai.i f12315c;

    public l2(p2 p2Var, ai.i iVar, int i7) {
        this.f12313a = i7;
        this.f12314b = p2Var;
        this.f12315c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f12313a) {
            case 0:
                p2 p2Var = this.f12314b;
                p2Var.getClass();
                org.telegram.messenger.g0.i3(new l2(p2Var, this.f12315c, 1), 320L);
                return;
            default:
                p2 p2Var2 = this.f12314b;
                p2Var2.getClass();
                this.f12315c.a(new ai.i(p2Var2, 19));
                return;
        }
    }
}
