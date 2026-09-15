package l5;

import java.util.HashMap;
import org.telegram.ui.fs0;
public final class s {
    public final i f13916a;
    public final String f13917b;
    public final i5.c f13918c;
    public final i5.e d;
    public final t e;

    public s(i iVar, String str, i5.c cVar, i5.e eVar, t tVar) {
        this.f13916a = iVar;
        this.f13917b = str;
        this.f13918c = cVar;
        this.d = eVar;
        this.e = tVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.e;
            q5.b bVar = tVar.f13921c;
            i b10 = this.f13916a.b(aVar.f10990c);
            ?? obj = new Object();
            obj.f7334f = new HashMap();
            obj.d = Long.valueOf(tVar.f13919a.q());
            obj.e = Long.valueOf(tVar.f13920b.q());
            obj.f7331a = this.f13917b;
            obj.f7333c = new m(this.f13918c, (byte[]) eVar.apply(aVar.f10989b));
            obj.f7332b = aVar.f10988a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f41165b.execute(new fs0(aVar2, b10, gVar, obj.g(), 22));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
