package defpackage;
public abstract class gl0 extends ui6 {
    @Override
    public final void e(ui6 ui6Var) {
        if (ui6Var instanceof gl0) {
            this.b = ui6Var;
        } else {
            u36.j("Parent of block must also be block (can not be inline)");
        }
    }
}
