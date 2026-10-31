package d9;
public abstract class r implements l {
    public static final n f5807a;
    public static final r[] f5808b;

    static {
        n nVar = new n();
        f5807a = nVar;
        f5808b = new r[]{nVar, new r() {
            @Override
            public final boolean apply(Object obj) {
                return false;
            }

            @Override
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new r() {
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
        }, new r() {
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

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f5808b.clone();
    }
}
