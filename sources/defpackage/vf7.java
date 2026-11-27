package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
public final class vf7 {
    public final ym4 a;
    public final rx6 b;
    public final HashMap c;

    public vf7(Context context, rx6 rx6Var) {
        ym4 ym4Var = new ym4(context, (byte) 9);
        this.c = new HashMap();
        this.a = ym4Var;
        this.b = rx6Var;
    }

    public final synchronized d5c a(String str) {
        if (this.c.containsKey(str)) {
            return (d5c) this.c.get(str);
        }
        CctBackendFactory y = this.a.y(str);
        if (y == null) {
            return null;
        }
        rx6 rx6Var = this.b;
        d5c create = y.create(new o90((Context) rx6Var.b, (pj2) rx6Var.c, (pj2) rx6Var.d, str));
        this.c.put(str, create);
        return create;
    }
}
