package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
public abstract class fo5 extends to5 {
    public static fo5 g(HashMap hashMap) {
        int i;
        Set entrySet = hashMap.entrySet();
        if (entrySet != null) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        ?? lpVar = new lp(i);
        lpVar.G(entrySet);
        return lpVar.D();
    }

    @Override
    public final jo5 f() {
        i99 i99Var = ((i99) this).n;
        bp5 bp5Var = i99Var.b;
        if (bp5Var == null) {
            m99 d = i99Var.d();
            i99Var.b = d;
            return d;
        }
        return bp5Var;
    }

    @Override
    public final Collection values() {
        i99 i99Var = ((i99) this).n;
        bp5 bp5Var = i99Var.b;
        if (bp5Var == null) {
            m99 d = i99Var.d();
            i99Var.b = d;
            return d;
        }
        return bp5Var;
    }
}
