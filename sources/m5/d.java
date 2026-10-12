package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import li.k;
public final class d {
    public final m4.c f15697a;
    public final k f15698b;
    public final HashMap f15699c;

    public d(Context context, k kVar) {
        m4.c cVar = new m4.c(context, 1);
        this.f15699c = new HashMap();
        this.f15697a = cVar;
        this.f15698b = kVar;
    }

    public final synchronized e a(String str) {
        if (this.f15699c.containsKey(str)) {
            return (e) this.f15699c.get(str);
        }
        CctBackendFactory D = this.f15697a.D(str);
        if (D == null) {
            return null;
        }
        k kVar = this.f15698b;
        e create = D.create(new b((Context) kVar.f14820b, (u5.a) kVar.f14821c, (u5.a) kVar.d, str));
        this.f15699c.put(str, create);
        return create;
    }
}
