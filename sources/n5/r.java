package n5;

import java.util.HashMap;
import org.telegram.ui.ih0;
public final class r {
    public final i f20264a;
    public final String f20265b;
    public final k5.c f20266c;
    public final k5.e d;
    public final s f20267e;

    public r(i iVar, String str, k5.c cVar, k5.e eVar, s sVar) {
        this.f20264a = iVar;
        this.f20265b = str;
        this.f20266c = cVar;
        this.d = eVar;
        this.f20267e = sVar;
    }

    public final void a(k5.a aVar, k5.g gVar) {
        k5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.f20267e;
            s5.b bVar = sVar.f20271c;
            i b10 = this.f20264a.b(aVar.f16874c);
            ?? obj = new Object();
            obj.f11837f = new HashMap();
            obj.d = Long.valueOf(sVar.f20269a.o());
            obj.f11836e = Long.valueOf(sVar.f20270b.o());
            obj.f11833a = this.f20265b;
            obj.f11835c = new l(this.f20266c, (byte[]) eVar.apply(aVar.f16873b));
            obj.f11834b = aVar.f16872a;
            k5.b bVar2 = aVar.d;
            if (bVar2 != null) {
                obj.f11838g = bVar2.f16875a;
            }
            s5.a aVar2 = (s5.a) bVar;
            aVar2.f54668b.execute(new ih0(aVar2, b10, gVar, obj.b(), 27));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
