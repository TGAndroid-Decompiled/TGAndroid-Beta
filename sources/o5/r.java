package o5;

import java.util.HashMap;
import p4.s0;
public final class r {
    public final i f21758a;
    public final String f21759b;
    public final l5.c f21760c;
    public final l5.e d;
    public final s f21761e;

    public r(i iVar, String str, l5.c cVar, l5.e eVar, s sVar) {
        this.f21758a = iVar;
        this.f21759b = str;
        this.f21760c = cVar;
        this.d = eVar;
        this.f21761e = sVar;
    }

    public final void a(l5.a aVar, l5.g gVar) {
        l5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.f21761e;
            t5.b bVar = sVar.f21765c;
            i b10 = this.f21758a.b(aVar.f19700c);
            ?? obj = new Object();
            obj.f13780f = new HashMap();
            obj.d = Long.valueOf(sVar.f21763a.r());
            obj.f13779e = Long.valueOf(sVar.f21764b.r());
            obj.f13776a = this.f21759b;
            obj.f13778c = new l(this.f21760c, (byte[]) eVar.apply(aVar.f19699b));
            obj.f13777b = aVar.f19698a;
            l5.b bVar2 = aVar.d;
            if (bVar2 != null) {
                obj.f13781g = bVar2.f19701a;
            }
            t5.a aVar2 = (t5.a) bVar;
            aVar2.f57660b.execute(new s0(aVar2, b10, gVar, obj.b(), 3));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
