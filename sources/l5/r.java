package l5;

import java.util.HashMap;
import org.telegram.ui.jr0;
public final class r {
    public final i f14137a;
    public final String f14138b;
    public final i5.c f14139c;
    public final i5.e d;
    public final s e;

    public r(i iVar, String str, i5.c cVar, i5.e eVar, s sVar) {
        this.f14137a = iVar;
        this.f14138b = str;
        this.f14139c = cVar;
        this.d = eVar;
        this.e = sVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.e;
            q5.b bVar = sVar.f14142c;
            i b10 = this.f14137a.b(aVar.f10980c);
            ?? obj = new Object();
            obj.f7315f = new HashMap();
            obj.d = Long.valueOf(sVar.f14140a.q());
            obj.e = Long.valueOf(sVar.f14141b.q());
            obj.f7312a = this.f14138b;
            obj.f7314c = new l(this.f14139c, (byte[]) eVar.apply(aVar.f10979b));
            obj.f7313b = aVar.f10978a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f41453b.execute(new jr0(aVar2, b10, gVar, obj.g(), 23));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
