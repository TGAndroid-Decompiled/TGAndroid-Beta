package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import la.h;
public final class d {
    public final of.b f14941a;
    public final h f14942b;
    public final HashMap f14943c;

    public d(Context context, h hVar) {
        of.b bVar = new of.b((Object) context, 27);
        this.f14943c = new HashMap();
        this.f14941a = bVar;
        this.f14942b = hVar;
    }

    public final synchronized e a(String str) {
        if (this.f14943c.containsKey(str)) {
            return (e) this.f14943c.get(str);
        }
        CctBackendFactory I = this.f14941a.I(str);
        if (I == null) {
            return null;
        }
        h hVar = this.f14942b;
        e create = I.create(new b((Context) hVar.f14151b, (u5.a) hVar.f14152c, (u5.a) hVar.d, str));
        this.f14943c.put(str, create);
        return create;
    }
}
