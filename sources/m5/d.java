package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import lf.i;
public final class d {
    public final of.b f14741a;
    public final i f14742b;
    public final HashMap f14743c;

    public d(Context context, i iVar) {
        of.b bVar = new of.b((Object) context, 27);
        this.f14743c = new HashMap();
        this.f14741a = bVar;
        this.f14742b = iVar;
    }

    public final synchronized e a(String str) {
        if (this.f14743c.containsKey(str)) {
            return (e) this.f14743c.get(str);
        }
        CctBackendFactory J = this.f14741a.J(str);
        if (J == null) {
            return null;
        }
        i iVar = this.f14742b;
        e create = J.create(new b((Context) iVar.f14033b, (u5.a) iVar.f14034c, (u5.a) iVar.d, str));
        this.f14743c.put(str, create);
        return create;
    }
}
