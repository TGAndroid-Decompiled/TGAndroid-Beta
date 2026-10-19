package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m.g3;
public final class d {
    public final qf.b f16792a;
    public final g3 f16793b;
    public final HashMap f16794c;

    public d(Context context, g3 g3Var) {
        qf.b bVar = new qf.b(context, 29);
        this.f16794c = new HashMap();
        this.f16792a = bVar;
        this.f16793b = g3Var;
    }

    public final synchronized e a(String str) {
        if (this.f16794c.containsKey(str)) {
            return (e) this.f16794c.get(str);
        }
        CctBackendFactory V = this.f16792a.V(str);
        if (V == null) {
            return null;
        }
        g3 g3Var = this.f16793b;
        e create = V.create(new b((Context) g3Var.f16204b, (u5.a) g3Var.f16205c, (u5.a) g3Var.d, str));
        this.f16794c.put(str, create);
        return create;
    }
}
