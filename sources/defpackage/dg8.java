package defpackage;
public enum dg8 extends hg8 {
    public dg8() {
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
