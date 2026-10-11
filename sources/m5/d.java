package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import la.h;
public final class d {
    public final pf.b f16290a;
    public final h f16291b;
    public final HashMap f16292c;

    public d(Context context, h hVar) {
        pf.b bVar = new pf.b((Object) context, 26);
        this.f16292c = new HashMap();
        this.f16290a = bVar;
        this.f16291b = hVar;
    }

    public final synchronized e a(String str) {
        if (this.f16292c.containsKey(str)) {
            return (e) this.f16292c.get(str);
        }
        CctBackendFactory Q = this.f16290a.Q(str);
        if (Q == null) {
            return null;
        }
        h hVar = this.f16291b;
        e create = Q.create(new b((Context) hVar.f15465b, (u5.a) hVar.f15466c, (u5.a) hVar.d, str));
        this.f16292c.put(str, create);
        return create;
    }
}
