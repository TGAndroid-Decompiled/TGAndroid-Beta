package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import la.h;
public final class d {
    public final of.b f16318a;
    public final h f16319b;
    public final HashMap f16320c;

    public d(Context context, h hVar) {
        of.b bVar = new of.b((Object) context, 27);
        this.f16320c = new HashMap();
        this.f16318a = bVar;
        this.f16319b = hVar;
    }

    public final synchronized e a(String str) {
        if (this.f16320c.containsKey(str)) {
            return (e) this.f16320c.get(str);
        }
        CctBackendFactory y3 = this.f16318a.y(str);
        if (y3 == null) {
            return null;
        }
        h hVar = this.f16319b;
        e create = y3.create(new b((Context) hVar.f15397b, (u5.a) hVar.f15398c, (u5.a) hVar.d, str));
        this.f16320c.put(str, create);
        return create;
    }
}
