package defpackage;
public abstract class hg8 implements bg8 {
    public static final dg8 a;
    public static final hg8[] b;

    static {
        dg8 dg8Var = new dg8();
        a = dg8Var;
        b = new hg8[]{dg8Var, new hg8() {
            @Override
            public final boolean apply(Object obj) {
                return false;
            }

            @Override
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new hg8() {
            @Override
            public final boolean apply(Object obj) {
                if (obj == null) {
                    return true;
                }
                return false;
            }

            @Override
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new hg8() {
            @Override
            public final boolean apply(Object obj) {
                if (obj != null) {
                    return true;
                }
                return false;
            }

            @Override
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static hg8 valueOf(String str) {
        return (hg8) Enum.valueOf(hg8.class, str);
    }

    public static hg8[] values() {
        return (hg8[]) b.clone();
    }
}
