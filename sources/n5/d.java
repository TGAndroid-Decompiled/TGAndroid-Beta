package n5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
public final class d {
    public final m4.c f18722a;
    public final k6.c f18723b;
    public final HashMap f18724c;

    public d(Context context, k6.c cVar) {
        m4.c cVar2 = new m4.c(context, 3);
        this.f18724c = new HashMap();
        this.f18722a = cVar2;
        this.f18723b = cVar;
    }

    public final synchronized e a(String str) {
        if (this.f18724c.containsKey(str)) {
            return (e) this.f18724c.get(str);
        }
        CctBackendFactory G = this.f18722a.G(str);
        if (G == null) {
            return null;
        }
        k6.c cVar = this.f18723b;
        e create = G.create(new b((Context) cVar.f16406b, (v5.a) cVar.f16407c, (v5.a) cVar.d, str));
        this.f18724c.put(str, create);
        return create;
    }
}
