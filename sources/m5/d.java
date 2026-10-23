package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m.g3;
public final class d {
    public final qf.b f16853a;
    public final g3 f16854b;
    public final HashMap f16855c;

    public d(Context context, g3 g3Var) {
        qf.b bVar = new qf.b(context, 29);
        this.f16855c = new HashMap();
        this.f16853a = bVar;
        this.f16854b = g3Var;
    }

    public final synchronized e a(String str) {
        if (this.f16855c.containsKey(str)) {
            return (e) this.f16855c.get(str);
        }
        CctBackendFactory V = this.f16853a.V(str);
        if (V == null) {
            return null;
        }
        g3 g3Var = this.f16854b;
        e create = V.create(new b((Context) g3Var.f16265b, (u5.a) g3Var.f16266c, (u5.a) g3Var.d, str));
        this.f16855c.put(str, create);
        return create;
    }
}
