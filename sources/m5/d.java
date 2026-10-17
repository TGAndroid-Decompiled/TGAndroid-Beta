package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m.g3;
public final class d {
    public final qf.b f16784a;
    public final g3 f16785b;
    public final HashMap f16786c;

    public d(Context context, g3 g3Var) {
        qf.b bVar = new qf.b(context, 29);
        this.f16786c = new HashMap();
        this.f16784a = bVar;
        this.f16785b = g3Var;
    }

    public final synchronized e a(String str) {
        if (this.f16786c.containsKey(str)) {
            return (e) this.f16786c.get(str);
        }
        CctBackendFactory U = this.f16784a.U(str);
        if (U == null) {
            return null;
        }
        g3 g3Var = this.f16785b;
        e create = U.create(new b((Context) g3Var.f16196b, (u5.a) g3Var.f16197c, (u5.a) g3Var.d, str));
        this.f16786c.put(str, create);
        return create;
    }
}
