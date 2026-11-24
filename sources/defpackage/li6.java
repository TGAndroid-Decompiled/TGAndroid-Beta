package defpackage;

import java.util.Map;
public final class li6 implements aq4 {
    public final ni6 a;

    public li6(ni6 ni6Var) {
        this.a = ni6Var;
    }

    @Override
    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        ni6 ni6Var = this.a;
        ni6Var.getClass();
        entry.getClass();
        return new ki6(entry, ni6Var);
    }
}
