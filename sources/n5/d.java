package n5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
public final class d {
    public final m4.c f18721a;
    public final k6.c f18722b;
    public final HashMap f18723c;

    public d(Context context, k6.c cVar) {
        m4.c cVar2 = new m4.c(context, 3);
        this.f18723c = new HashMap();
        this.f18721a = cVar2;
        this.f18722b = cVar;
    }

    public final synchronized e a(String str) {
        if (this.f18723c.containsKey(str)) {
            return (e) this.f18723c.get(str);
        }
        CctBackendFactory G = this.f18721a.G(str);
        if (G == null) {
            return null;
        }
        k6.c cVar = this.f18722b;
        e create = G.create(new b((Context) cVar.f16405b, (v5.a) cVar.f16406c, (v5.a) cVar.d, str));
        this.f18723c.put(str, create);
        return create;
    }
}
