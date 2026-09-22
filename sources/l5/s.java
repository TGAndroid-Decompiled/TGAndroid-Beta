package l5;

import java.util.HashMap;
import org.telegram.ui.fs0;
public final class s {
    public final i f14126a;
    public final String f14127b;
    public final i5.c f14128c;
    public final i5.e d;
    public final t e;

    public s(i iVar, String str, i5.c cVar, i5.e eVar, t tVar) {
        this.f14126a = iVar;
        this.f14127b = str;
        this.f14128c = cVar;
        this.d = eVar;
        this.e = tVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.e;
            q5.b bVar = tVar.f14131c;
            i b10 = this.f14126a.b(aVar.f10994c);
            ?? obj = new Object();
            obj.f7331f = new HashMap();
            obj.d = Long.valueOf(tVar.f14129a.q());
            obj.e = Long.valueOf(tVar.f14130b.q());
            obj.f7328a = this.f14127b;
            obj.f7330c = new m(this.f14128c, (byte[]) eVar.apply(aVar.f10993b));
            obj.f7329b = aVar.f10992a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f41488b.execute(new fs0(aVar2, b10, gVar, obj.g(), 22));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
