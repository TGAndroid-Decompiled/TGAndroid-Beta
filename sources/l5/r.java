package l5;

import java.util.HashMap;
import org.telegram.ui.fs0;
public final class r {
    public final i f14111a;
    public final String f14112b;
    public final i5.c f14113c;
    public final i5.e d;
    public final s e;

    public r(i iVar, String str, i5.c cVar, i5.e eVar, s sVar) {
        this.f14111a = iVar;
        this.f14112b = str;
        this.f14113c = cVar;
        this.d = eVar;
        this.e = sVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.e;
            q5.b bVar = sVar.f14116c;
            i b10 = this.f14111a.b(aVar.f10994c);
            ?? obj = new Object();
            obj.f7333f = new HashMap();
            obj.d = Long.valueOf(sVar.f14114a.q());
            obj.e = Long.valueOf(sVar.f14115b.q());
            obj.f7330a = this.f14112b;
            obj.f7332c = new l(this.f14113c, (byte[]) eVar.apply(aVar.f10993b));
            obj.f7331b = aVar.f10992a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f41467b.execute(new fs0(aVar2, b10, gVar, obj.g(), 22));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
