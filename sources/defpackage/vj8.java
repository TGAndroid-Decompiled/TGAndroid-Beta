package defpackage;
public abstract class vj8 implements pj8 {
    public static final rj8 a;
    public static final vj8[] b;

    static {
        rj8 rj8Var = new rj8();
        a = rj8Var;
        b = new vj8[]{rj8Var, new vj8() {
            @Override
            public final boolean apply(Object obj) {
                return false;
            }

            @Override
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new vj8() {
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
        }, new vj8() {
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

    public static vj8 valueOf(String str) {
        return (vj8) Enum.valueOf(vj8.class, str);
    }

    public static vj8[] values() {
        return (vj8[]) b.clone();
    }
}
