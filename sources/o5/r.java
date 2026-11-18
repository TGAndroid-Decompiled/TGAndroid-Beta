package o5;

import java.util.HashMap;
import p4.s0;
public final class r {
    public final i f21733a;
    public final String f21734b;
    public final l5.c f21735c;
    public final l5.e d;
    public final s f21736e;

    public r(i iVar, String str, l5.c cVar, l5.e eVar, s sVar) {
        this.f21733a = iVar;
        this.f21734b = str;
        this.f21735c = cVar;
        this.d = eVar;
        this.f21736e = sVar;
    }

    public final void a(l5.a aVar, l5.g gVar) {
        l5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.f21736e;
            t5.b bVar = sVar.f21740c;
            i b10 = this.f21733a.b(aVar.f19672c);
            ?? obj = new Object();
            obj.f13751f = new HashMap();
            obj.d = Long.valueOf(sVar.f21738a.r());
            obj.f13750e = Long.valueOf(sVar.f21739b.r());
            obj.f13747a = this.f21734b;
            obj.f13749c = new l(this.f21735c, (byte[]) eVar.apply(aVar.f19671b));
            obj.f13748b = aVar.f19670a;
            l5.b bVar2 = aVar.d;
            if (bVar2 != null) {
                obj.f13752g = bVar2.f19673a;
            }
            t5.a aVar2 = (t5.a) bVar;
            aVar2.f57617b.execute(new s0(aVar2, b10, gVar, obj.b(), 3));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
