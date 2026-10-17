package l5;

import java.util.HashMap;
import org.telegram.ui.gn0;
public final class s {
    public final i f15933a;
    public final String f15934b;
    public final i5.c f15935c;
    public final i5.e d;
    public final t e;

    public s(i iVar, String str, i5.c cVar, i5.e eVar, t tVar) {
        this.f15933a = iVar;
        this.f15934b = str;
        this.f15935c = cVar;
        this.d = eVar;
        this.e = tVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.e;
            q5.b bVar = tVar.f15938c;
            i b10 = this.f15933a.b(aVar.f12709c);
            ?? obj = new Object();
            obj.f7650f = new HashMap();
            obj.d = Long.valueOf(tVar.f15936a.d());
            obj.e = Long.valueOf(tVar.f15937b.d());
            obj.f7647a = this.f15934b;
            obj.f7649c = new m(this.f15935c, (byte[]) eVar.apply(aVar.f12708b));
            obj.f7648b = aVar.f12707a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f44433b.execute(new gn0(aVar2, b10, gVar, obj.h(), 26));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
