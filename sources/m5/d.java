package m5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import lf.i;
public final class d {
    public final of.b f14913a;
    public final i f14914b;
    public final HashMap f14915c;

    public d(Context context, i iVar) {
        of.b bVar = new of.b((Object) context, 27);
        this.f14915c = new HashMap();
        this.f14913a = bVar;
        this.f14914b = iVar;
    }

    public final synchronized e a(String str) {
        if (this.f14915c.containsKey(str)) {
            return (e) this.f14915c.get(str);
        }
        CctBackendFactory I = this.f14913a.I(str);
        if (I == null) {
            return null;
        }
        i iVar = this.f14914b;
        e create = I.create(new b((Context) iVar.f14179b, (u5.a) iVar.f14180c, (u5.a) iVar.d, str));
        this.f14915c.put(str, create);
        return create;
    }
}
