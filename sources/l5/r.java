package l5;

import java.util.HashMap;
import org.telegram.ui.zr0;
public final class r {
    public final i f14139a;
    public final String f14140b;
    public final i5.c f14141c;
    public final i5.e d;
    public final s e;

    public r(i iVar, String str, i5.c cVar, i5.e eVar, s sVar) {
        this.f14139a = iVar;
        this.f14140b = str;
        this.f14141c = cVar;
        this.d = eVar;
        this.e = sVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.e;
            q5.b bVar = sVar.f14144c;
            i b10 = this.f14139a.b(aVar.f10983c);
            ?? obj = new Object();
            obj.f7323f = new HashMap();
            obj.d = Long.valueOf(sVar.f14142a.q());
            obj.e = Long.valueOf(sVar.f14143b.q());
            obj.f7320a = this.f14140b;
            obj.f7322c = new l(this.f14141c, (byte[]) eVar.apply(aVar.f10982b));
            obj.f7321b = aVar.f10981a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f41484b.execute(new zr0(aVar2, b10, gVar, obj.g(), 23));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
