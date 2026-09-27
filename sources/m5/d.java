package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import la.h;
public final class d {
    public final of.b f14983a;
    public final h f14984b;
    public final HashMap f14985c;

    public d(Context context, h hVar) {
        of.b bVar = new of.b((Object) context, 27);
        this.f14985c = new HashMap();
        this.f14983a = bVar;
        this.f14984b = hVar;
    }

    public final synchronized e a(String str) {
        if (this.f14985c.containsKey(str)) {
            return (e) this.f14985c.get(str);
        }
        CctBackendFactory I = this.f14983a.I(str);
        if (I == null) {
            return null;
        }
        h hVar = this.f14984b;
        e create = I.create(new b((Context) hVar.f14168b, (u5.a) hVar.f14169c, (u5.a) hVar.d, str));
        this.f14985c.put(str, create);
        return create;
    }
}
