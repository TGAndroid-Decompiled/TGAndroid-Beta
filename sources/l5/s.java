package l5;

import java.util.HashMap;
import org.telegram.ui.fn0;
public final class s {
    public final i f15941a;
    public final String f15942b;
    public final i5.c f15943c;
    public final i5.e d;
    public final t e;

    public s(i iVar, String str, i5.c cVar, i5.e eVar, t tVar) {
        this.f15941a = iVar;
        this.f15942b = str;
        this.f15943c = cVar;
        this.d = eVar;
        this.e = tVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.e;
            q5.b bVar = tVar.f15946c;
            i b10 = this.f15941a.b(aVar.f12707c);
            ?? obj = new Object();
            obj.f7650f = new HashMap();
            obj.d = Long.valueOf(tVar.f15944a.d());
            obj.e = Long.valueOf(tVar.f15945b.d());
            obj.f7647a = this.f15942b;
            obj.f7649c = new m(this.f15943c, (byte[]) eVar.apply(aVar.f12706b));
            obj.f7648b = aVar.f12705a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f44404b.execute(new fn0(aVar2, b10, gVar, obj.h(), 26));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
