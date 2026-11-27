package defpackage;

import java.util.Map;
public final class pk6 implements es4 {
    public final rk6 a;

    public pk6(rk6 rk6Var) {
        this.a = rk6Var;
    }

    @Override
    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        rk6 rk6Var = this.a;
        rk6Var.getClass();
        entry.getClass();
        return new ok6(entry, rk6Var);
    }
}
