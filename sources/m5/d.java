package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m.g3;
public final class d {
    public final qf.b f16791a;
    public final g3 f16792b;
    public final HashMap f16793c;

    public d(Context context, g3 g3Var) {
        qf.b bVar = new qf.b(context, 29);
        this.f16793c = new HashMap();
        this.f16791a = bVar;
        this.f16792b = g3Var;
    }

    public final synchronized e a(String str) {
        if (this.f16793c.containsKey(str)) {
            return (e) this.f16793c.get(str);
        }
        CctBackendFactory U = this.f16791a.U(str);
        if (U == null) {
            return null;
        }
        g3 g3Var = this.f16792b;
        e create = U.create(new b((Context) g3Var.f16203b, (u5.a) g3Var.f16204c, (u5.a) g3Var.d, str));
        this.f16793c.put(str, create);
        return create;
    }
}
