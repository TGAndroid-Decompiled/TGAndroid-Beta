package o5;

import java.util.HashMap;
import org.telegram.ui.jo0;
public final class r {
    public final i f20845a;
    public final String f20846b;
    public final l5.c f20847c;
    public final l5.e d;
    public final s f20848e;

    public r(i iVar, String str, l5.c cVar, l5.e eVar, s sVar) {
        this.f20845a = iVar;
        this.f20846b = str;
        this.f20847c = cVar;
        this.d = eVar;
        this.f20848e = sVar;
    }

    public final void a(l5.a aVar, l5.g gVar) {
        l5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.f20848e;
            t5.b bVar = sVar.f20852c;
            i b10 = this.f20845a.b(aVar.f18172c);
            ?? obj = new Object();
            obj.f14076f = new HashMap();
            obj.d = Long.valueOf(sVar.f20850a.s());
            obj.f14075e = Long.valueOf(sVar.f20851b.s());
            obj.f14072a = this.f20846b;
            obj.f14074c = new l(this.f20847c, (byte[]) eVar.apply(aVar.f18171b));
            obj.f14073b = aVar.f18170a;
            l5.b bVar2 = aVar.d;
            if (bVar2 != null) {
                obj.f14077g = bVar2.f18173a;
            }
            t5.a aVar2 = (t5.a) bVar;
            aVar2.f55447b.execute(new jo0(aVar2, b10, gVar, obj.b(), 26));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
