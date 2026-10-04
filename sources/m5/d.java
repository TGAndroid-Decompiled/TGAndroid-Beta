package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import la.h;
public final class d {
    public final of.b f16323a;
    public final h f16324b;
    public final HashMap f16325c;

    public d(Context context, h hVar) {
        of.b bVar = new of.b((Object) context, 27);
        this.f16325c = new HashMap();
        this.f16323a = bVar;
        this.f16324b = hVar;
    }

    public final synchronized e a(String str) {
        if (this.f16325c.containsKey(str)) {
            return (e) this.f16325c.get(str);
        }
        CctBackendFactory y3 = this.f16323a.y(str);
        if (y3 == null) {
            return null;
        }
        h hVar = this.f16324b;
        e create = y3.create(new b((Context) hVar.f15399b, (u5.a) hVar.f15400c, (u5.a) hVar.d, str));
        this.f16325c.put(str, create);
        return create;
    }
}
