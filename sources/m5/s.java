package m5;

import java.util.HashMap;
import org.telegram.ui.cg0;
public final class s {
    public final i f18351a;
    public final String f18352b;
    public final j5.c f18353c;
    public final j5.e d;
    public final t e;

    public s(i iVar, String str, j5.c cVar, j5.e eVar, t tVar) {
        this.f18351a = iVar;
        this.f18352b = str;
        this.f18353c = cVar;
        this.d = eVar;
        this.e = tVar;
    }

    public final void a(j5.a aVar, j5.g gVar) {
        j5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.e;
            r5.b bVar = tVar.f18356c;
            i b10 = this.f18351a.b(aVar.f15509c);
            ?? obj = new Object();
            obj.f1153f = new HashMap();
            obj.f1150a = Long.valueOf(tVar.f18354a.o());
            obj.e = Long.valueOf(tVar.f18355b.o());
            obj.f1151b = this.f18352b;
            obj.d = new m(this.f18353c, (byte[]) eVar.apply(aVar.f15508b));
            obj.f1152c = aVar.f15507a;
            r5.a aVar2 = (r5.a) bVar;
            aVar2.f47337b.execute(new cg0(aVar2, b10, gVar, obj.h(), 29));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
