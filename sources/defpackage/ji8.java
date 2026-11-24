package defpackage;
public abstract class ji8 implements di8 {
    public static final fi8 a;
    public static final ji8[] b;

    static {
        fi8 fi8Var = new fi8();
        a = fi8Var;
        b = new ji8[]{fi8Var, new ji8() {
            @Override
            public final boolean apply(Object obj) {
                return false;
            }

            @Override
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new ji8() {
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
        }, new ji8() {
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

    public static ji8 valueOf(String str) {
        return (ji8) Enum.valueOf(ji8.class, str);
    }

    public static ji8[] values() {
        return (ji8[]) b.clone();
    }
}
