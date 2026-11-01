package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import li.k;
public final class d {
    public final m4.c f13010a;
    public final k f13011b;
    public final HashMap f13012c;

    public d(Context context, k kVar) {
        m4.c cVar = new m4.c(context);
        this.f13012c = new HashMap();
        this.f13010a = cVar;
        this.f13011b = kVar;
    }

    public final synchronized f a(String str) {
        if (this.f13012c.containsKey(str)) {
            return (f) this.f13012c.get(str);
        }
        CctBackendFactory E = this.f13010a.E(str);
        if (E == null) {
            return null;
        }
        k kVar = this.f13011b;
        f create = E.create(new b((Context) kVar.f12101b, (u5.a) kVar.f12102c, (u5.a) kVar.d, str));
        this.f13012c.put(str, create);
        return create;
    }
}
