package o5;

import java.util.HashMap;
import p4.s0;
public final class r {
    public final i f21755a;
    public final String f21756b;
    public final l5.c f21757c;
    public final l5.e d;
    public final s f21758e;

    public r(i iVar, String str, l5.c cVar, l5.e eVar, s sVar) {
        this.f21755a = iVar;
        this.f21756b = str;
        this.f21757c = cVar;
        this.d = eVar;
        this.f21758e = sVar;
    }

    public final void a(l5.a aVar, l5.g gVar) {
        l5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.f21758e;
            t5.b bVar = sVar.f21762c;
            i b10 = this.f21755a.b(aVar.f19697c);
            ?? obj = new Object();
            obj.f13777f = new HashMap();
            obj.d = Long.valueOf(sVar.f21760a.r());
            obj.f13776e = Long.valueOf(sVar.f21761b.r());
            obj.f13773a = this.f21756b;
            obj.f13775c = new l(this.f21757c, (byte[]) eVar.apply(aVar.f19696b));
            obj.f13774b = aVar.f19695a;
            l5.b bVar2 = aVar.d;
            if (bVar2 != null) {
                obj.f13778g = bVar2.f19698a;
            }
            t5.a aVar2 = (t5.a) bVar;
            aVar2.f57656b.execute(new s0(aVar2, b10, gVar, obj.b(), 3));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
