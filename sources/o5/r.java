package o5;

import java.util.HashMap;
import p4.s0;
public final class r {
    public final i f21724a;
    public final String f21725b;
    public final l5.c f21726c;
    public final l5.e d;
    public final s f21727e;

    public r(i iVar, String str, l5.c cVar, l5.e eVar, s sVar) {
        this.f21724a = iVar;
        this.f21725b = str;
        this.f21726c = cVar;
        this.d = eVar;
        this.f21727e = sVar;
    }

    public final void a(l5.a aVar, l5.g gVar) {
        l5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.f21727e;
            t5.b bVar = sVar.f21731c;
            i b10 = this.f21724a.b(aVar.f19666c);
            ?? obj = new Object();
            obj.f13743f = new HashMap();
            obj.d = Long.valueOf(sVar.f21729a.r());
            obj.f13742e = Long.valueOf(sVar.f21730b.r());
            obj.f13739a = this.f21725b;
            obj.f13741c = new l(this.f21726c, (byte[]) eVar.apply(aVar.f19665b));
            obj.f13740b = aVar.f19664a;
            l5.b bVar2 = aVar.d;
            if (bVar2 != null) {
                obj.f13744g = bVar2.f19667a;
            }
            t5.a aVar2 = (t5.a) bVar;
            aVar2.f57625b.execute(new s0(aVar2, b10, gVar, obj.b(), 3));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
