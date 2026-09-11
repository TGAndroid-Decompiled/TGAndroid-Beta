package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m2.t;
public final class d {
    public final pf.b f16122a;
    public final t f16123b;
    public final HashMap f16124c;

    public d(Context context, t tVar) {
        pf.b bVar = new pf.b(context, 27);
        this.f16124c = new HashMap();
        this.f16122a = bVar;
        this.f16123b = tVar;
    }

    public final synchronized e a(String str) {
        if (this.f16124c.containsKey(str)) {
            return (e) this.f16124c.get(str);
        }
        CctBackendFactory S = this.f16122a.S(str);
        if (S == null) {
            return null;
        }
        t tVar = this.f16123b;
        e create = S.create(new b((Context) tVar.f15817b, (u5.a) tVar.f15818c, (u5.a) tVar.d, str));
        this.f16124c.put(str, create);
        return create;
    }
}
