package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m.h3;
import n4.s;
public final class d {
    public final s f15432a;
    public final h3 f15433b;
    public final HashMap f15434c;

    public d(Context context, h3 h3Var) {
        s sVar = new s(context, 28);
        this.f15434c = new HashMap();
        this.f15432a = sVar;
        this.f15433b = h3Var;
    }

    public final synchronized e a(String str) {
        if (this.f15434c.containsKey(str)) {
            return (e) this.f15434c.get(str);
        }
        CctBackendFactory l4 = this.f15432a.l(str);
        if (l4 == null) {
            return null;
        }
        h3 h3Var = this.f15433b;
        e create = l4.create(new b((Context) h3Var.f14850b, (u5.a) h3Var.f14851c, (u5.a) h3Var.d, str));
        this.f15434c.put(str, create);
        return create;
    }
}
