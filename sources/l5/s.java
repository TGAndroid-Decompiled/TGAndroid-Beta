package l5;

import java.util.HashMap;
import org.telegram.ui.hn0;
public final class s {
    public final i f15940a;
    public final String f15941b;
    public final i5.c f15942c;
    public final i5.e d;
    public final t e;

    public s(i iVar, String str, i5.c cVar, i5.e eVar, t tVar) {
        this.f15940a = iVar;
        this.f15941b = str;
        this.f15942c = cVar;
        this.d = eVar;
        this.e = tVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.e;
            q5.b bVar = tVar.f15945c;
            i b10 = this.f15940a.b(aVar.f12707c);
            ?? obj = new Object();
            obj.f7651f = new HashMap();
            obj.d = Long.valueOf(tVar.f15943a.d());
            obj.e = Long.valueOf(tVar.f15944b.d());
            obj.f7648a = this.f15941b;
            obj.f7650c = new m(this.f15942c, (byte[]) eVar.apply(aVar.f12706b));
            obj.f7649b = aVar.f12705a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f44453b.execute(new hn0(aVar2, b10, gVar, obj.h(), 26));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
