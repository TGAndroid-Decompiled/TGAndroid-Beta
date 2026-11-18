package o5;

import java.util.HashMap;
import p4.s0;
public final class r {
    public final i f21730a;
    public final String f21731b;
    public final l5.c f21732c;
    public final l5.e d;
    public final s f21733e;

    public r(i iVar, String str, l5.c cVar, l5.e eVar, s sVar) {
        this.f21730a = iVar;
        this.f21731b = str;
        this.f21732c = cVar;
        this.d = eVar;
        this.f21733e = sVar;
    }

    public final void a(l5.a aVar, l5.g gVar) {
        l5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.f21733e;
            t5.b bVar = sVar.f21737c;
            i b10 = this.f21730a.b(aVar.f19669c);
            ?? obj = new Object();
            obj.f13748f = new HashMap();
            obj.d = Long.valueOf(sVar.f21735a.r());
            obj.f13747e = Long.valueOf(sVar.f21736b.r());
            obj.f13744a = this.f21731b;
            obj.f13746c = new l(this.f21732c, (byte[]) eVar.apply(aVar.f19668b));
            obj.f13745b = aVar.f19667a;
            l5.b bVar2 = aVar.d;
            if (bVar2 != null) {
                obj.f13749g = bVar2.f19670a;
            }
            t5.a aVar2 = (t5.a) bVar;
            aVar2.f57617b.execute(new s0(aVar2, b10, gVar, obj.b(), 3));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
