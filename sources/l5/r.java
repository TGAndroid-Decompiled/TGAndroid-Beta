package l5;

import java.util.HashMap;
import org.telegram.ui.fy0;
public final class r {
    public final i f12811a;
    public final String f12812b;
    public final i5.c f12813c;
    public final i5.e d;
    public final s e;

    public r(i iVar, String str, i5.c cVar, i5.e eVar, s sVar) {
        this.f12811a = iVar;
        this.f12812b = str;
        this.f12813c = cVar;
        this.d = eVar;
        this.e = sVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.e;
            q5.b bVar = sVar.f12816c;
            i b10 = this.f12811a.b(aVar.f10474c);
            ?? obj = new Object();
            obj.f6106f = new HashMap();
            obj.d = Long.valueOf(sVar.f12814a.u());
            obj.e = Long.valueOf(sVar.f12815b.u());
            obj.f6103a = this.f12812b;
            obj.f6105c = new l(this.f12813c, (byte[]) eVar.apply(aVar.f10473b));
            obj.f6104b = aVar.f10472a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f40542b.execute(new fy0(aVar2, b10, gVar, obj.g(), 20));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
