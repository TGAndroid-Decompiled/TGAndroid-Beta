package defpackage;

import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
public abstract class bwe {
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

    public static n9a b(Set set, di8 di8Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof n9a) {
                n9a n9aVar = (n9a) sortedSet;
                di8 di8Var2 = n9aVar.b;
                di8Var2.getClass();
                return new n9a((SortedSet) n9aVar.a, new ei8(Arrays.asList(di8Var2, di8Var)));
            }
            return new n9a(sortedSet, di8Var);
        } else if (set instanceof n9a) {
            n9a n9aVar2 = (n9a) set;
            di8 di8Var3 = n9aVar2.b;
            di8Var3.getClass();
            return new n9a(n9aVar2.a, new ei8(Arrays.asList(di8Var3, di8Var)));
        } else {
            set.getClass();
            return new n9a(set, di8Var);
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

    public static m9a d(yo5 yo5Var, yo5 yo5Var2) {
        jte.l(yo5Var, "set1");
        jte.l(yo5Var2, "set2");
        return new m9a(yo5Var, yo5Var2);
    }
}
