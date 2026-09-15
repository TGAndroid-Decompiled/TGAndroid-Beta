package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m.e3;
public final class d {
    public final of.b f14731a;
    public final e3 f14732b;
    public final HashMap f14733c;

    public d(Context context, e3 e3Var) {
        of.b bVar = new of.b((Object) context, 27);
        this.f14733c = new HashMap();
        this.f14731a = bVar;
        this.f14732b = e3Var;
    }

    public final synchronized e a(String str) {
        if (this.f14733c.containsKey(str)) {
            return (e) this.f14733c.get(str);
        }
        CctBackendFactory J = this.f14731a.J(str);
        if (J == null) {
            return null;
        }
        e3 e3Var = this.f14732b;
        e create = J.create(new b((Context) e3Var.f14165b, (u5.a) e3Var.f14166c, (u5.a) e3Var.d, str));
        this.f14733c.put(str, create);
        return create;
    }
}
