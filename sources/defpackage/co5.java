package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
public abstract class co5 extends qo5 {
    public static co5 g(HashMap hashMap) {
        int i;
        Set entrySet = hashMap.entrySet();
        if (entrySet != null) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        ?? kqVar = new kq(i);
        kqVar.E(entrySet);
        return kqVar.C();
    }

    @Override
    public final go5 f() {
        x79 x79Var = ((x79) this).n;
        yo5 yo5Var = x79Var.b;
        if (yo5Var == null) {
            b89 d = x79Var.d();
            x79Var.b = d;
            return d;
        }
        return yo5Var;
    }

    @Override
    public final Collection values() {
        x79 x79Var = ((x79) this).n;
        yo5 yo5Var = x79Var.b;
        if (yo5Var == null) {
            b89 d = x79Var.d();
            x79Var.b = d;
            return d;
        }
        return yo5Var;
    }
}
