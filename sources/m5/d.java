package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import lf.i;
public final class d {
    public final of.b f14706a;
    public final i f14707b;
    public final HashMap f14708c;

    public d(Context context, i iVar) {
        of.b bVar = new of.b((Object) context, 27);
        this.f14708c = new HashMap();
        this.f14706a = bVar;
        this.f14707b = iVar;
    }

    public final synchronized e a(String str) {
        if (this.f14708c.containsKey(str)) {
            return (e) this.f14708c.get(str);
        }
        CctBackendFactory J = this.f14706a.J(str);
        if (J == null) {
            return null;
        }
        i iVar = this.f14707b;
        e create = J.create(new b((Context) iVar.f14011b, (u5.a) iVar.f14012c, (u5.a) iVar.d, str));
        this.f14708c.put(str, create);
        return create;
    }
}
