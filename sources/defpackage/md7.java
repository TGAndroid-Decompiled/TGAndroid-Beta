package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
public final class md7 {
    public final sk4 a;
    public final mv6 b;
    public final HashMap c;

    public md7(Context context, mv6 mv6Var) {
        sk4 sk4Var = new sk4(context, (byte) 9);
        this.c = new HashMap();
        this.a = sk4Var;
        this.b = mv6Var;
    }

    public final synchronized e1c a(String str) {
        if (this.c.containsKey(str)) {
            return (e1c) this.c.get(str);
        }
        CctBackendFactory u = this.a.u(str);
        if (u == null) {
            return null;
        }
        mv6 mv6Var = this.b;
        e1c create = u.create(new m90((Context) mv6Var.b, (ti2) mv6Var.c, (ti2) mv6Var.d, str));
        this.c.put(str, create);
        return create;
    }
}
