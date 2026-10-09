package l5;

import java.util.HashMap;
import org.telegram.ui.rr0;
public final class r {
    public final i f15430a;
    public final String f15431b;
    public final i5.c f15432c;
    public final i5.e d;
    public final s f15433e;

    public r(i iVar, String str, i5.c cVar, i5.e eVar, s sVar) {
        this.f15430a = iVar;
        this.f15431b = str;
        this.f15432c = cVar;
        this.d = eVar;
        this.f15433e = sVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.f15433e;
            q5.b bVar = sVar.f15437c;
            i b10 = this.f15430a.b(aVar.f12011c);
            ?? obj = new Object();
            obj.f7958f = new HashMap();
            obj.d = Long.valueOf(sVar.f15435a.Z());
            obj.f7957e = Long.valueOf(sVar.f15436b.Z());
            obj.f7954a = this.f15431b;
            obj.f7956c = new l(this.f15432c, (byte[]) eVar.apply(aVar.f12010b));
            obj.f7955b = aVar.f12009a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f45995b.execute(new rr0(aVar2, b10, gVar, obj.g(), 23));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
