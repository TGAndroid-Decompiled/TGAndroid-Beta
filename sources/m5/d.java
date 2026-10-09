package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import la.h;
import n4.x;
public final class d {
    public final x f16262a;
    public final h f16263b;
    public final HashMap f16264c;

    public d(Context context, h hVar) {
        x xVar = new x(context, 25);
        this.f16264c = new HashMap();
        this.f16262a = xVar;
        this.f16263b = hVar;
    }

    public final synchronized e a(String str) {
        if (this.f16264c.containsKey(str)) {
            return (e) this.f16264c.get(str);
        }
        CctBackendFactory R = this.f16262a.R(str);
        if (R == null) {
            return null;
        }
        h hVar = this.f16263b;
        e create = R.create(new b((Context) hVar.f15462b, (u5.a) hVar.f15463c, (u5.a) hVar.d, str));
        this.f16264c.put(str, create);
        return create;
    }
}
