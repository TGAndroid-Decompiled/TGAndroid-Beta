package l5;

import java.util.HashMap;
import org.telegram.ui.in0;
public final class s {
    public final i f16002a;
    public final String f16003b;
    public final i5.c f16004c;
    public final i5.e d;
    public final t e;

    public s(i iVar, String str, i5.c cVar, i5.e eVar, t tVar) {
        this.f16002a = iVar;
        this.f16003b = str;
        this.f16004c = cVar;
        this.d = eVar;
        this.e = tVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.e;
            q5.b bVar = tVar.f16007c;
            i b10 = this.f16002a.b(aVar.f12737c);
            ?? obj = new Object();
            obj.f7660f = new HashMap();
            obj.d = Long.valueOf(tVar.f16005a.d());
            obj.e = Long.valueOf(tVar.f16006b.d());
            obj.f7657a = this.f16003b;
            obj.f7659c = new m(this.f16004c, (byte[]) eVar.apply(aVar.f12736b));
            obj.f7658b = aVar.f12735a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f44830b.execute(new in0(aVar2, b10, gVar, obj.f(), 26));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
