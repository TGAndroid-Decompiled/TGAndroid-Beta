package l5;

import java.util.HashMap;
import org.telegram.ui.yr0;
public final class s {
    public final i f13902a;
    public final String f13903b;
    public final i5.c f13904c;
    public final i5.e d;
    public final t e;

    public s(i iVar, String str, i5.c cVar, i5.e eVar, t tVar) {
        this.f13902a = iVar;
        this.f13903b = str;
        this.f13904c = cVar;
        this.d = eVar;
        this.e = tVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.e;
            q5.b bVar = tVar.f13907c;
            i b10 = this.f13902a.b(aVar.f10980c);
            ?? obj = new Object();
            obj.f7322f = new HashMap();
            obj.d = Long.valueOf(tVar.f13905a.q());
            obj.e = Long.valueOf(tVar.f13906b.q());
            obj.f7319a = this.f13903b;
            obj.f7321c = new m(this.f13904c, (byte[]) eVar.apply(aVar.f10979b));
            obj.f7320b = aVar.f10978a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f41117b.execute(new yr0(aVar2, b10, gVar, obj.g(), 22));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
