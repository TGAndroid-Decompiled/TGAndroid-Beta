package l5;

import java.util.HashMap;
import org.telegram.ui.hs0;
public final class s {
    public final i f13926a;
    public final String f13927b;
    public final i5.c f13928c;
    public final i5.e d;
    public final t e;

    public s(i iVar, String str, i5.c cVar, i5.e eVar, t tVar) {
        this.f13926a = iVar;
        this.f13927b = str;
        this.f13928c = cVar;
        this.d = eVar;
        this.e = tVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.e;
            q5.b bVar = tVar.f13931c;
            i b10 = this.f13926a.b(aVar.f10993c);
            ?? obj = new Object();
            obj.f7339f = new HashMap();
            obj.d = Long.valueOf(tVar.f13929a.q());
            obj.e = Long.valueOf(tVar.f13930b.q());
            obj.f7336a = this.f13927b;
            obj.f7338c = new m(this.f13928c, (byte[]) eVar.apply(aVar.f10992b));
            obj.f7337b = aVar.f10991a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f41192b.execute(new hs0(aVar2, b10, gVar, obj.g(), 22));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
