package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import la.h;
public final class d {
    public final of.b f16319a;
    public final h f16320b;
    public final HashMap f16321c;

    public d(Context context, h hVar) {
        of.b bVar = new of.b((Object) context, 27);
        this.f16321c = new HashMap();
        this.f16319a = bVar;
        this.f16320b = hVar;
    }

    public final synchronized e a(String str) {
        if (this.f16321c.containsKey(str)) {
            return (e) this.f16321c.get(str);
        }
        CctBackendFactory y3 = this.f16319a.y(str);
        if (y3 == null) {
            return null;
        }
        h hVar = this.f16320b;
        e create = y3.create(new b((Context) hVar.f15398b, (u5.a) hVar.f15399c, (u5.a) hVar.d, str));
        this.f16321c.put(str, create);
        return create;
    }
}
