package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m.g3;
public final class d {
    public final qf.b f16789a;
    public final g3 f16790b;
    public final HashMap f16791c;

    public d(Context context, g3 g3Var) {
        qf.b bVar = new qf.b(context, 29);
        this.f16791c = new HashMap();
        this.f16789a = bVar;
        this.f16790b = g3Var;
    }

    public final synchronized e a(String str) {
        if (this.f16791c.containsKey(str)) {
            return (e) this.f16791c.get(str);
        }
        CctBackendFactory U = this.f16789a.U(str);
        if (U == null) {
            return null;
        }
        g3 g3Var = this.f16790b;
        e create = U.create(new b((Context) g3Var.f16201b, (u5.a) g3Var.f16202c, (u5.a) g3Var.d, str));
        this.f16791c.put(str, create);
        return create;
    }
}
