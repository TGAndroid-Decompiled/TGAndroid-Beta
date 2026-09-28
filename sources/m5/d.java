package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import la.h;
public final class d {
    public final of.b f14956a;
    public final h f14957b;
    public final HashMap f14958c;

    public d(Context context, h hVar) {
        of.b bVar = new of.b((Object) context, 27);
        this.f14958c = new HashMap();
        this.f14956a = bVar;
        this.f14957b = hVar;
    }

    public final synchronized e a(String str) {
        if (this.f14958c.containsKey(str)) {
            return (e) this.f14958c.get(str);
        }
        CctBackendFactory I = this.f14956a.I(str);
        if (I == null) {
            return null;
        }
        h hVar = this.f14957b;
        e create = I.create(new b((Context) hVar.f14166b, (u5.a) hVar.f14167c, (u5.a) hVar.d, str));
        this.f14958c.put(str, create);
        return create;
    }
}
