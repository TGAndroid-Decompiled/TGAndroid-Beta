package defpackage;

import android.os.Bundle;
import java.util.HashMap;
public final class u9 implements f36 {
    public final String a;
    public final s9 b;
    public final t9 c;
    public final jq2 d;

    public u9(jq2 jq2Var, String str, s9 s9Var, t9 t9Var) {
        this.d = jq2Var;
        this.a = str;
        this.b = s9Var;
        this.c = t9Var;
    }

    @Override
    public final void b(i36 i36Var, y26 y26Var) {
        boolean equals = y26.ON_START.equals(y26Var);
        String str = this.a;
        jq2 jq2Var = this.d;
        if (equals) {
            HashMap hashMap = jq2Var.e;
            Bundle bundle = jq2Var.g;
            HashMap hashMap2 = jq2Var.f;
            s9 s9Var = this.b;
            t9 t9Var = this.c;
            hashMap.put(str, new w9(s9Var, t9Var));
            if (hashMap2.containsKey(str)) {
                Object obj = hashMap2.get(str);
                hashMap2.remove(str);
                s9Var.k(obj);
            }
            r9 r9Var = (r9) bundle.getParcelable(str);
            if (r9Var != null) {
                bundle.remove(str);
                s9Var.k(t9Var.a(r9Var.b, r9Var.a));
            }
        } else if (y26.ON_STOP.equals(y26Var)) {
            jq2Var.e.remove(str);
        } else if (y26.ON_DESTROY.equals(y26Var)) {
            jq2Var.e(str);
        }
    }
}
