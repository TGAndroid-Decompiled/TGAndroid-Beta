package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
public abstract class cm5 extends qm5 {
    public static cm5 g(HashMap hashMap) {
        int i;
        Set entrySet = hashMap.entrySet();
        if (entrySet != null) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        ?? kpVar = new kp(i);
        kpVar.E(entrySet);
        return kpVar.C();
    }

    @Override
    public final gm5 f() {
        v59 v59Var = ((v59) this).n;
        ym5 ym5Var = v59Var.b;
        if (ym5Var == null) {
            z59 d = v59Var.d();
            v59Var.b = d;
            return d;
        }
        return ym5Var;
    }

    @Override
    public final Collection values() {
        v59 v59Var = ((v59) this).n;
        ym5 ym5Var = v59Var.b;
        if (ym5Var == null) {
            z59 d = v59Var.d();
            v59Var.b = d;
            return d;
        }
        return ym5Var;
    }
}
