package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m.f3;
public final class d {
    public final pf.b f16013a;
    public final f3 f16014b;
    public final HashMap f16015c;

    public d(Context context, f3 f3Var) {
        pf.b bVar = new pf.b((Object) context, 26);
        this.f16015c = new HashMap();
        this.f16013a = bVar;
        this.f16014b = f3Var;
    }

    public final synchronized e a(String str) {
        if (this.f16015c.containsKey(str)) {
            return (e) this.f16015c.get(str);
        }
        CctBackendFactory N = this.f16013a.N(str);
        if (N == null) {
            return null;
        }
        f3 f3Var = this.f16014b;
        e create = N.create(new b((Context) f3Var.f15424b, (u5.a) f3Var.f15425c, (u5.a) f3Var.d, str));
        this.f16015c.put(str, create);
        return create;
    }
}
