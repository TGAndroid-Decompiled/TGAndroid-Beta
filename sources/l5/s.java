package l5;

import java.util.HashMap;
import org.telegram.ui.zr0;
public final class s {
    public final i f15366a;
    public final String f15367b;
    public final i5.c f15368c;
    public final i5.e d;
    public final t f15369e;

    public s(i iVar, String str, i5.c cVar, i5.e eVar, t tVar) {
        this.f15366a = iVar;
        this.f15367b = str;
        this.f15368c = cVar;
        this.d = eVar;
        this.f15369e = tVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.f15369e;
            q5.b bVar = tVar.f15373c;
            i b10 = this.f15366a.b(aVar.f11960c);
            ?? obj = new Object();
            obj.f7908f = new HashMap();
            obj.d = Long.valueOf(tVar.f15371a.q());
            obj.f7907e = Long.valueOf(tVar.f15372b.q());
            obj.f7904a = this.f15367b;
            obj.f7906c = new m(this.f15368c, (byte[]) eVar.apply(aVar.f11959b));
            obj.f7905b = aVar.f11958a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f44827b.execute(new zr0(aVar2, b10, gVar, obj.g(), 22));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
