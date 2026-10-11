package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import la.h;
public final class d {
    public final pf.b f16326a;
    public final h f16327b;
    public final HashMap f16328c;

    public d(Context context, h hVar) {
        pf.b bVar = new pf.b((Object) context, 26);
        this.f16328c = new HashMap();
        this.f16326a = bVar;
        this.f16327b = hVar;
    }

    public final synchronized e a(String str) {
        if (this.f16328c.containsKey(str)) {
            return (e) this.f16328c.get(str);
        }
        CctBackendFactory Q = this.f16326a.Q(str);
        if (Q == null) {
            return null;
        }
        h hVar = this.f16327b;
        e create = Q.create(new b((Context) hVar.f15501b, (u5.a) hVar.f15502c, (u5.a) hVar.d, str));
        this.f16328c.put(str, create);
        return create;
    }
}
