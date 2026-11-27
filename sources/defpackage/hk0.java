package defpackage;
public abstract class hk0 extends yi6 {
    @Override
    public final void e(yi6 yi6Var) {
        if (yi6Var instanceof hk0) {
            this.b = yi6Var;
        } else {
            lq5.j("Parent of block must also be block (can not be inline)");
        }
    }
}
