package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import lf.i;
public final class d {
    public final of.b f14729a;
    public final i f14730b;
    public final HashMap f14731c;

    public d(Context context, i iVar) {
        of.b bVar = new of.b((Object) context, 27);
        this.f14731c = new HashMap();
        this.f14729a = bVar;
        this.f14730b = iVar;
    }

    public final synchronized e a(String str) {
        if (this.f14731c.containsKey(str)) {
            return (e) this.f14731c.get(str);
        }
        CctBackendFactory J = this.f14729a.J(str);
        if (J == null) {
            return null;
        }
        i iVar = this.f14730b;
        e create = J.create(new b((Context) iVar.f14021b, (u5.a) iVar.f14022c, (u5.a) iVar.d, str));
        this.f14731c.put(str, create);
        return create;
    }
}
