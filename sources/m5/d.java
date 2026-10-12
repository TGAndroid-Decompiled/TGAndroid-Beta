package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m.f3;
public final class d {
    public final pf.b f16012a;
    public final f3 f16013b;
    public final HashMap f16014c;

    public d(Context context, f3 f3Var) {
        pf.b bVar = new pf.b((Object) context, 26);
        this.f16014c = new HashMap();
        this.f16012a = bVar;
        this.f16013b = f3Var;
    }

    public final synchronized e a(String str) {
        if (this.f16014c.containsKey(str)) {
            return (e) this.f16014c.get(str);
        }
        CctBackendFactory N = this.f16012a.N(str);
        if (N == null) {
            return null;
        }
        f3 f3Var = this.f16013b;
        e create = N.create(new b((Context) f3Var.f15423b, (u5.a) f3Var.f15424c, (u5.a) f3Var.d, str));
        this.f16014c.put(str, create);
        return create;
    }
}
