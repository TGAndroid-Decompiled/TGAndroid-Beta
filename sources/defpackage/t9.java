package defpackage;

import android.os.Bundle;
import java.util.HashMap;
public final class t9 implements b36 {
    public final String a;
    public final r9 b;
    public final s9 c;
    public final br2 d;

    public t9(br2 br2Var, String str, r9 r9Var, s9 s9Var) {
        this.d = br2Var;
        this.a = str;
        this.b = r9Var;
        this.c = s9Var;
    }

    @Override
    public final void b(e36 e36Var, u26 u26Var) {
        boolean equals = u26.ON_START.equals(u26Var);
        String str = this.a;
        br2 br2Var = this.d;
        if (equals) {
            HashMap hashMap = br2Var.e;
            Bundle bundle = br2Var.g;
            HashMap hashMap2 = br2Var.f;
            r9 r9Var = this.b;
            s9 s9Var = this.c;
            hashMap.put(str, new v9(r9Var, s9Var));
            if (hashMap2.containsKey(str)) {
                Object obj = hashMap2.get(str);
                hashMap2.remove(str);
                r9Var.m(obj);
            }
            q9 q9Var = (q9) bundle.getParcelable(str);
            if (q9Var != null) {
                bundle.remove(str);
                r9Var.m(s9Var.a(q9Var.b, q9Var.a));
            }
        } else if (u26.ON_STOP.equals(u26Var)) {
            br2Var.e.remove(str);
        } else if (u26.ON_DESTROY.equals(u26Var)) {
            br2Var.e(str);
        }
    }
}
