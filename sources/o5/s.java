package o5;

import java.util.HashMap;
public final class s {
    public final i f21367a;
    public final String f21368b;
    public final l5.c f21369c;
    public final l5.e d;
    public final t f21370e;

    public s(i iVar, String str, l5.c cVar, l5.e eVar, t tVar) {
        this.f21367a = iVar;
        this.f21368b = str;
        this.f21369c = cVar;
        this.d = eVar;
        this.f21370e = tVar;
    }

    public final void a(l5.a aVar, l5.g gVar) {
        l5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.f21370e;
            t5.c cVar = tVar.f21374c;
            i b10 = this.f21367a.b(aVar.f19305c);
            ?? obj = new Object();
            obj.f13436f = new HashMap();
            obj.d = Long.valueOf(tVar.f21372a.s());
            obj.f13435e = Long.valueOf(tVar.f21373b.s());
            obj.f13432a = this.f21368b;
            obj.f13434c = new m(this.f21369c, (byte[]) eVar.apply(aVar.f19304b));
            obj.f13433b = aVar.f19303a;
            l5.b bVar = aVar.d;
            if (bVar != null) {
                obj.f13437g = bVar.f19306a;
            }
            t5.b bVar2 = (t5.b) cVar;
            bVar2.f57045b.execute(new t5.a(bVar2, b10, gVar, obj.b(), 0));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
