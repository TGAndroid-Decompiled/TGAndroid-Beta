package l5;

import java.util.HashMap;
import org.telegram.ui.zr0;
public final class s {
    public final i f15367a;
    public final String f15368b;
    public final i5.c f15369c;
    public final i5.e d;
    public final t f15370e;

    public s(i iVar, String str, i5.c cVar, i5.e eVar, t tVar) {
        this.f15367a = iVar;
        this.f15368b = str;
        this.f15369c = cVar;
        this.d = eVar;
        this.f15370e = tVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.f15370e;
            q5.b bVar = tVar.f15374c;
            i b10 = this.f15367a.b(aVar.f11961c);
            ?? obj = new Object();
            obj.f7909f = new HashMap();
            obj.d = Long.valueOf(tVar.f15372a.q());
            obj.f7908e = Long.valueOf(tVar.f15373b.q());
            obj.f7905a = this.f15368b;
            obj.f7907c = new m(this.f15369c, (byte[]) eVar.apply(aVar.f11960b));
            obj.f7906b = aVar.f11959a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f44834b.execute(new zr0(aVar2, b10, gVar, obj.g(), 22));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
