package l5;

import java.util.HashMap;
import org.telegram.ui.jr0;
public final class r {
    public final i f14153a;
    public final String f14154b;
    public final i5.c f14155c;
    public final i5.e d;
    public final s e;

    public r(i iVar, String str, i5.c cVar, i5.e eVar, s sVar) {
        this.f14153a = iVar;
        this.f14154b = str;
        this.f14155c = cVar;
        this.d = eVar;
        this.e = sVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.e;
            q5.b bVar = sVar.f14158c;
            i b10 = this.f14153a.b(aVar.f10994c);
            ?? obj = new Object();
            obj.f7327f = new HashMap();
            obj.d = Long.valueOf(sVar.f14156a.q());
            obj.e = Long.valueOf(sVar.f14157b.q());
            obj.f7324a = this.f14154b;
            obj.f7326c = new l(this.f14155c, (byte[]) eVar.apply(aVar.f10993b));
            obj.f7325b = aVar.f10992a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f41553b.execute(new jr0(aVar2, b10, gVar, obj.g(), 23));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
