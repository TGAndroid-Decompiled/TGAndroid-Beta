package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m2.t;
public final class d {
    public final pf.b f16149a;
    public final t f16150b;
    public final HashMap f16151c;

    public d(Context context, t tVar) {
        pf.b bVar = new pf.b(context, 27);
        this.f16151c = new HashMap();
        this.f16149a = bVar;
        this.f16150b = tVar;
    }

    public final synchronized e a(String str) {
        if (this.f16151c.containsKey(str)) {
            return (e) this.f16151c.get(str);
        }
        CctBackendFactory S = this.f16149a.S(str);
        if (S == null) {
            return null;
        }
        t tVar = this.f16150b;
        e create = S.create(new b((Context) tVar.f15844b, (u5.a) tVar.f15845c, (u5.a) tVar.d, str));
        this.f16151c.put(str, create);
        return create;
    }
}
