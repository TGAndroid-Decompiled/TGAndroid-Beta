package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import la.h;
public final class d {
    public final of.b f14957a;
    public final h f14958b;
    public final HashMap f14959c;

    public d(Context context, h hVar) {
        of.b bVar = new of.b((Object) context, 27);
        this.f14959c = new HashMap();
        this.f14957a = bVar;
        this.f14958b = hVar;
    }

    public final synchronized e a(String str) {
        if (this.f14959c.containsKey(str)) {
            return (e) this.f14959c.get(str);
        }
        CctBackendFactory I = this.f14957a.I(str);
        if (I == null) {
            return null;
        }
        h hVar = this.f14958b;
        e create = I.create(new b((Context) hVar.f14167b, (u5.a) hVar.f14168c, (u5.a) hVar.d, str));
        this.f14959c.put(str, create);
        return create;
    }
}
