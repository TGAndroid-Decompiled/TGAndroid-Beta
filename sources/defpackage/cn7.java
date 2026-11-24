package defpackage;
public final class cn7 extends yu9 {
    public final hn7 d;

    public cn7(hn7 hn7Var) {
        this.d = hn7Var;
    }

    @Override
    public final void c(boolean z) {
        this.d.a(!z);
    }

    @Override
    public final CharSequence d() {
        hn7 hn7Var = this.d;
        q8c q8cVar = hn7Var.v0;
        int i = hn7Var.I;
        if (q8cVar != null) {
            return (CharSequence) q8cVar.a(Integer.valueOf(i));
        }
        return hn7Var.d(i);
    }
}
