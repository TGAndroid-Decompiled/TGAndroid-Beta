package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m.e3;
import n4.y;
public final class d {
    public final y f13573a;
    public final e3 f13574b;
    public final HashMap f13575c;

    public d(Context context, e3 e3Var) {
        y yVar = new y((Object) context, 27);
        this.f13575c = new HashMap();
        this.f13573a = yVar;
        this.f13574b = e3Var;
    }

    public final synchronized e a(String str) {
        if (this.f13575c.containsKey(str)) {
            return (e) this.f13575c.get(str);
        }
        CctBackendFactory j3 = this.f13573a.j(str);
        if (j3 == null) {
            return null;
        }
        e3 e3Var = this.f13574b;
        e create = j3.create(new b((Context) e3Var.f13001b, (u5.a) e3Var.f13002c, (u5.a) e3Var.d, str));
        this.f13575c.put(str, create);
        return create;
    }
}
