package l5;

import java.util.HashMap;
import org.telegram.ui.fn0;
public final class s {
    public final i f15939a;
    public final String f15940b;
    public final i5.c f15941c;
    public final i5.e d;
    public final t e;

    public s(i iVar, String str, i5.c cVar, i5.e eVar, t tVar) {
        this.f15939a = iVar;
        this.f15940b = str;
        this.f15941c = cVar;
        this.d = eVar;
        this.e = tVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.e;
            q5.b bVar = tVar.f15944c;
            i b10 = this.f15939a.b(aVar.f12705c);
            ?? obj = new Object();
            obj.f7648f = new HashMap();
            obj.d = Long.valueOf(tVar.f15942a.d());
            obj.e = Long.valueOf(tVar.f15943b.d());
            obj.f7645a = this.f15940b;
            obj.f7647c = new m(this.f15941c, (byte[]) eVar.apply(aVar.f12704b));
            obj.f7646b = aVar.f12703a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f44406b.execute(new fn0(aVar2, b10, gVar, obj.h(), 26));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
