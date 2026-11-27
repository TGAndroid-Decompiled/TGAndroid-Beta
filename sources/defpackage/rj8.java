package defpackage;
public enum rj8 extends vj8 {
    public rj8() {
        super("ALWAYS_TRUE", 0);
    }

    @Override
    public final boolean apply(Object obj) {
        return true;
    }

    @Override
    public final String toString() {
        return "Predicates.alwaysTrue()";
    }
}
