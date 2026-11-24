package defpackage;
public final class f50 implements x76, fu2 {
    public final long a;

    public f50(long j) {
        this.a = j;
    }

    @Override
    public final void accept(Object obj) {
        ((cf8) obj).e(this.a);
    }

    @Override
    public final void invoke(Object obj) {
        u40 u40Var;
        ab3 ab3Var = (ab3) obj;
        cb3 cb3Var = ab3Var.a;
        if (ab3Var == cb3Var.j && (u40Var = cb3Var.n) != null) {
            u40Var.h(this.a);
        }
    }
}
