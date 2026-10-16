package l5;

import java.util.HashMap;
import org.telegram.ui.yw0;
public final class r {
    public final i f14598a;
    public final String f14599b;
    public final i5.c f14600c;
    public final i5.e d;
    public final s e;

    public r(i iVar, String str, i5.c cVar, i5.e eVar, s sVar) {
        this.f14598a = iVar;
        this.f14599b = str;
        this.f14600c = cVar;
        this.d = eVar;
        this.e = sVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.e;
            q5.b bVar = sVar.f14603c;
            i b10 = this.f14598a.b(aVar.f11320c);
            ?? obj = new Object();
            obj.f6197f = new HashMap();
            obj.d = Long.valueOf(sVar.f14601a.b());
            obj.e = Long.valueOf(sVar.f14602b.b());
            obj.f6194a = this.f14599b;
            obj.f6196c = new l(this.f14600c, (byte[]) eVar.apply(aVar.f11319b));
            obj.f6195b = aVar.f11318a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f43065b.execute(new yw0(aVar2, b10, gVar, obj.g(), 21));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
