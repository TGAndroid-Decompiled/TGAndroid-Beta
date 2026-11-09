package fi;
public final class l2 implements Runnable {
    public final int f12312a;
    public final p2 f12313b;
    public final ai.i f12314c;

    public l2(p2 p2Var, ai.i iVar, int i7) {
        this.f12312a = i7;
        this.f12313b = p2Var;
        this.f12314c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f12312a) {
            case 0:
                p2 p2Var = this.f12313b;
                p2Var.getClass();
                org.telegram.messenger.g0.i3(new l2(p2Var, this.f12314c, 1), 320L);
                return;
            default:
                p2 p2Var2 = this.f12313b;
                p2Var2.getClass();
                this.f12314c.a(new ai.i(p2Var2, 19));
                return;
        }
    }
}
