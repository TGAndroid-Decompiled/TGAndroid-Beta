package o5;

import java.util.HashMap;
import org.telegram.ui.io0;
public final class r {
    public final i f20842a;
    public final String f20843b;
    public final l5.c f20844c;
    public final l5.e d;
    public final s f20845e;

    public r(i iVar, String str, l5.c cVar, l5.e eVar, s sVar) {
        this.f20842a = iVar;
        this.f20843b = str;
        this.f20844c = cVar;
        this.d = eVar;
        this.f20845e = sVar;
    }

    public final void a(l5.a aVar, l5.g gVar) {
        l5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.f20845e;
            t5.b bVar = sVar.f20849c;
            i b10 = this.f20842a.b(aVar.f18169c);
            ?? obj = new Object();
            obj.f14076f = new HashMap();
            obj.d = Long.valueOf(sVar.f20847a.s());
            obj.f14075e = Long.valueOf(sVar.f20848b.s());
            obj.f14072a = this.f20843b;
            obj.f14074c = new l(this.f20844c, (byte[]) eVar.apply(aVar.f18168b));
            obj.f14073b = aVar.f18167a;
            l5.b bVar2 = aVar.d;
            if (bVar2 != null) {
                obj.f14077g = bVar2.f18170a;
            }
            t5.a aVar2 = (t5.a) bVar;
            aVar2.f55330b.execute(new io0(aVar2, b10, gVar, obj.b(), 26));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
