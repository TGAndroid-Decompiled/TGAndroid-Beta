package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import lf.h;
import n4.y;
public final class d {
    public final y f14949a;
    public final h f14950b;
    public final HashMap f14951c;

    public d(Context context, h hVar) {
        y yVar = new y(context);
        this.f14951c = new HashMap();
        this.f14949a = yVar;
        this.f14950b = hVar;
    }

    public final synchronized f a(String str) {
        if (this.f14951c.containsKey(str)) {
            return (f) this.f14951c.get(str);
        }
        CctBackendFactory L = this.f14949a.L(str);
        if (L == null) {
            return null;
        }
        h hVar = this.f14950b;
        f create = L.create(new b((Context) hVar.f14215b, (u5.a) hVar.f14216c, (u5.a) hVar.d, str));
        this.f14951c.put(str, create);
        return create;
    }
}
