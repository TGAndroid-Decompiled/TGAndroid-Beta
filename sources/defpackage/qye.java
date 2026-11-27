package defpackage;

import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
public abstract class qye {
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

    public static dba b(Set set, pj8 pj8Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof dba) {
                dba dbaVar = (dba) sortedSet;
                pj8 pj8Var2 = dbaVar.b;
                pj8Var2.getClass();
                return new dba((SortedSet) dbaVar.a, new qj8(Arrays.asList(pj8Var2, pj8Var)));
            }
            return new dba(sortedSet, pj8Var);
        } else if (set instanceof dba) {
            dba dbaVar2 = (dba) set;
            pj8 pj8Var3 = dbaVar2.b;
            pj8Var3.getClass();
            return new dba(dbaVar2.a, new qj8(Arrays.asList(pj8Var3, pj8Var)));
        } else {
            set.getClass();
            return new dba(set, pj8Var);
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

    public static cba d(bp5 bp5Var, bp5 bp5Var2) {
        yve.l(bp5Var, "set1");
        yve.l(bp5Var2, "set2");
        return new cba(bp5Var, bp5Var2);
    }
}
