package defpackage;
public abstract class gk0 extends tg6 {
    @Override
    public final void e(tg6 tg6Var) {
        if (tg6Var instanceof gk0) {
            this.b = tg6Var;
        } else {
            w26.j("Parent of block must also be block (can not be inline)");
        }
    }
}
