package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import li.k;
public final class d {
    public final m4.c f13009a;
    public final k f13010b;
    public final HashMap f13011c;

    public d(Context context, k kVar) {
        m4.c cVar = new m4.c(context);
        this.f13011c = new HashMap();
        this.f13009a = cVar;
        this.f13010b = kVar;
    }

    public final synchronized f a(String str) {
        if (this.f13011c.containsKey(str)) {
            return (f) this.f13011c.get(str);
        }
        CctBackendFactory E = this.f13009a.E(str);
        if (E == null) {
            return null;
        }
        k kVar = this.f13010b;
        f create = E.create(new b((Context) kVar.f12100b, (u5.a) kVar.f12101c, (u5.a) kVar.d, str));
        this.f13011c.put(str, create);
        return create;
    }
}
