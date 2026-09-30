package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import la.h;
public final class d {
    public final of.b f14972a;
    public final h f14973b;
    public final HashMap f14974c;

    public d(Context context, h hVar) {
        of.b bVar = new of.b((Object) context, 27);
        this.f14974c = new HashMap();
        this.f14972a = bVar;
        this.f14973b = hVar;
    }

    public final synchronized e a(String str) {
        if (this.f14974c.containsKey(str)) {
            return (e) this.f14974c.get(str);
        }
        CctBackendFactory I = this.f14972a.I(str);
        if (I == null) {
            return null;
        }
        h hVar = this.f14973b;
        e create = I.create(new b((Context) hVar.f14182b, (u5.a) hVar.f14183c, (u5.a) hVar.d, str));
        this.f14974c.put(str, create);
        return create;
    }
}
