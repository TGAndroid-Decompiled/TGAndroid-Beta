package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
public final class of7 {
    public final mj4 a;
    public final mx6 b;
    public final HashMap c;

    public of7(Context context, mx6 mx6Var) {
        mj4 mj4Var = new mj4(context, (byte) 11);
        this.c = new HashMap();
        this.a = mj4Var;
        this.b = mx6Var;
    }

    public final synchronized e3c a(String str) {
        if (this.c.containsKey(str)) {
            return (e3c) this.c.get(str);
        }
        CctBackendFactory k = this.a.k(str);
        if (k == null) {
            return null;
        }
        mx6 mx6Var = this.b;
        e3c create = k.create(new ma0((Context) mx6Var.b, (hk2) mx6Var.c, (hk2) mx6Var.d, str));
        this.c.put(str, create);
        return create;
    }
}
