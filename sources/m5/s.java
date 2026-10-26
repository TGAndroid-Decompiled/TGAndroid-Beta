package m5;

import java.util.HashMap;
import org.telegram.ui.ag0;
public final class s {
    public final i f18352a;
    public final String f18353b;
    public final j5.c f18354c;
    public final j5.e d;
    public final t e;

    public s(i iVar, String str, j5.c cVar, j5.e eVar, t tVar) {
        this.f18352a = iVar;
        this.f18353b = str;
        this.f18354c = cVar;
        this.d = eVar;
        this.e = tVar;
    }

    public final void a(j5.a aVar, j5.g gVar) {
        j5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.e;
            r5.b bVar = tVar.f18357c;
            i b10 = this.f18352a.b(aVar.f15510c);
            ?? obj = new Object();
            obj.f1153f = new HashMap();
            obj.f1150a = Long.valueOf(tVar.f18355a.o());
            obj.e = Long.valueOf(tVar.f18356b.o());
            obj.f1151b = this.f18353b;
            obj.d = new m(this.f18354c, (byte[]) eVar.apply(aVar.f15509b));
            obj.f1152c = aVar.f15508a;
            r5.a aVar2 = (r5.a) bVar;
            aVar2.f47302b.execute(new ag0(aVar2, b10, gVar, obj.h(), 29));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
