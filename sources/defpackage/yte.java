package defpackage;

import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
public abstract class yte {
    public static boolean a(Set set, Object obj) {
        if (set != obj) {
            if (obj instanceof Set) {
                Set set2 = (Set) obj;
                try {
                    if (set.size() == set2.size()) {
                        if (set.containsAll(set2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static m7a b(Set set, bg8 bg8Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof m7a) {
                m7a m7aVar = (m7a) sortedSet;
                bg8 bg8Var2 = m7aVar.b;
                bg8Var2.getClass();
                return new m7a((SortedSet) m7aVar.a, new cg8(Arrays.asList(bg8Var2, bg8Var)));
            }
            return new m7a(sortedSet, bg8Var);
        } else if (set instanceof m7a) {
            m7a m7aVar2 = (m7a) set;
            bg8 bg8Var3 = m7aVar2.b;
            bg8Var3.getClass();
            return new m7a(m7aVar2.a, new cg8(Arrays.asList(bg8Var3, bg8Var)));
        } else {
            set.getClass();
            return new m7a(set, bg8Var);
        }
    }

    public static int c(Set set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 = ~(~(i2 + i));
        }
        return i2;
    }

    public static l7a d(ym5 ym5Var, ym5 ym5Var2) {
        gre.l(ym5Var, "set1");
        gre.l(ym5Var2, "set2");
        return new l7a(ym5Var, ym5Var2);
    }
}
