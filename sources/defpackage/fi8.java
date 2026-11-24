package defpackage;
public enum fi8 extends ji8 {
    public fi8() {
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
