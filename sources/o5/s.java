package o5;

import java.util.HashMap;
import p4.l0;
public final class s {
    public final i f21824a;
    public final String f21825b;
    public final l5.c f21826c;
    public final l5.e d;
    public final t f21827e;

    public s(i iVar, String str, l5.c cVar, l5.e eVar, t tVar) {
        this.f21824a = iVar;
        this.f21825b = str;
        this.f21826c = cVar;
        this.d = eVar;
        this.f21827e = tVar;
    }

    public final void a(l5.a aVar, l5.g gVar) {
        l5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.f21827e;
            t5.b bVar = tVar.f21831c;
            i b10 = this.f21824a.b(aVar.f19766c);
            ?? obj = new Object();
            obj.f13743f = new HashMap();
            obj.d = Long.valueOf(tVar.f21829a.o());
            obj.f13742e = Long.valueOf(tVar.f21830b.o());
            obj.f13739a = this.f21825b;
            obj.f13741c = new m(this.f21826c, (byte[]) eVar.apply(aVar.f19765b));
            obj.f13740b = aVar.f19764a;
            l5.b bVar2 = aVar.d;
            if (bVar2 != null) {
                obj.f13744g = bVar2.f19767a;
            }
            t5.a aVar2 = (t5.a) bVar;
            aVar2.f57739b.execute(new l0(aVar2, b10, gVar, obj.b(), 4));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
