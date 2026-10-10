package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import la.h;
import n4.x;
public final class d {
    public final x f16266a;
    public final h f16267b;
    public final HashMap f16268c;

    public d(Context context, h hVar) {
        x xVar = new x(context, 25);
        this.f16268c = new HashMap();
        this.f16266a = xVar;
        this.f16267b = hVar;
    }

    public final synchronized e a(String str) {
        if (this.f16268c.containsKey(str)) {
            return (e) this.f16268c.get(str);
        }
        CctBackendFactory R = this.f16266a.R(str);
        if (R == null) {
            return null;
        }
        h hVar = this.f16267b;
        e create = R.create(new b((Context) hVar.f15466b, (u5.a) hVar.f15467c, (u5.a) hVar.d, str));
        this.f16268c.put(str, create);
        return create;
    }
}
