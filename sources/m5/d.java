package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import la.h;
public final class d {
    public final of.b f16328a;
    public final h f16329b;
    public final HashMap f16330c;

    public d(Context context, h hVar) {
        of.b bVar = new of.b((Object) context, 27);
        this.f16330c = new HashMap();
        this.f16328a = bVar;
        this.f16329b = hVar;
    }

    public final synchronized e a(String str) {
        if (this.f16330c.containsKey(str)) {
            return (e) this.f16330c.get(str);
        }
        CctBackendFactory x10 = this.f16328a.x(str);
        if (x10 == null) {
            return null;
        }
        h hVar = this.f16329b;
        e create = x10.create(new b((Context) hVar.f15399b, (u5.a) hVar.f15400c, (u5.a) hVar.d, str));
        this.f16330c.put(str, create);
        return create;
    }
}
