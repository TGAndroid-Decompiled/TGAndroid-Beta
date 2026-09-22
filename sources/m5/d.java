package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import lf.h;
import n4.y;
public final class d {
    public final y f14964a;
    public final h f14965b;
    public final HashMap f14966c;

    public d(Context context, h hVar) {
        y yVar = new y(context);
        this.f14966c = new HashMap();
        this.f14964a = yVar;
        this.f14965b = hVar;
    }

    public final synchronized f a(String str) {
        if (this.f14966c.containsKey(str)) {
            return (f) this.f14966c.get(str);
        }
        CctBackendFactory L = this.f14964a.L(str);
        if (L == null) {
            return null;
        }
        h hVar = this.f14965b;
        f create = L.create(new b((Context) hVar.f14230b, (u5.a) hVar.f14231c, (u5.a) hVar.d, str));
        this.f14966c.put(str, create);
        return create;
    }
}
