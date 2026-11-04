package o5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import k4.j;
import mi.h0;
public final class d {
    public final h0 f20911a;
    public final j f20912b;
    public final HashMap f20913c;

    public d(Context context, j jVar) {
        h0 h0Var = new h0(context, 3);
        this.f20913c = new HashMap();
        this.f20911a = h0Var;
        this.f20912b = jVar;
    }

    public final synchronized e a(String str) {
        if (this.f20913c.containsKey(str)) {
            return (e) this.f20913c.get(str);
        }
        CctBackendFactory B = this.f20911a.B(str);
        if (B == null) {
            return null;
        }
        j jVar = this.f20912b;
        e create = B.create(new b((Context) jVar.f16869a, (w5.a) jVar.f16870b, (w5.a) jVar.f16871c, str));
        this.f20913c.put(str, create);
        return create;
    }
}
