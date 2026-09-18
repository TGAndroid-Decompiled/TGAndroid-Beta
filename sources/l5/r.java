package l5;

import java.util.HashMap;
import org.telegram.ui.fs0;
public final class r {
    public final i f14072a;
    public final String f14073b;
    public final i5.c f14074c;
    public final i5.e d;
    public final s e;

    public r(i iVar, String str, i5.c cVar, i5.e eVar, s sVar) {
        this.f14072a = iVar;
        this.f14073b = str;
        this.f14074c = cVar;
        this.d = eVar;
        this.e = sVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.e;
            q5.b bVar = sVar.f14077c;
            i b10 = this.f14072a.b(aVar.f10993c);
            ?? obj = new Object();
            obj.f7332f = new HashMap();
            obj.d = Long.valueOf(sVar.f14075a.q());
            obj.e = Long.valueOf(sVar.f14076b.q());
            obj.f7329a = this.f14073b;
            obj.f7331c = new l(this.f14074c, (byte[]) eVar.apply(aVar.f10992b));
            obj.f7330b = aVar.f10991a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f41426b.execute(new fs0(aVar2, b10, gVar, obj.g(), 22));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
