package o5;

import java.util.HashMap;
import org.telegram.ui.mo0;
public final class r {
    public final i f20850a;
    public final String f20851b;
    public final l5.c f20852c;
    public final l5.e d;
    public final s f20853e;

    public r(i iVar, String str, l5.c cVar, l5.e eVar, s sVar) {
        this.f20850a = iVar;
        this.f20851b = str;
        this.f20852c = cVar;
        this.d = eVar;
        this.f20853e = sVar;
    }

    public final void a(l5.a aVar, l5.g gVar) {
        l5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.f20853e;
            t5.b bVar = sVar.f20857c;
            i b10 = this.f20850a.b(aVar.f18175c);
            ?? obj = new Object();
            obj.f14078f = new HashMap();
            obj.d = Long.valueOf(sVar.f20855a.s());
            obj.f14077e = Long.valueOf(sVar.f20856b.s());
            obj.f14074a = this.f20851b;
            obj.f14076c = new l(this.f20852c, (byte[]) eVar.apply(aVar.f18174b));
            obj.f14075b = aVar.f18173a;
            l5.b bVar2 = aVar.d;
            if (bVar2 != null) {
                obj.f14079g = bVar2.f18176a;
            }
            t5.a aVar2 = (t5.a) bVar;
            aVar2.f55458b.execute(new mo0(aVar2, b10, gVar, obj.b(), 26));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
