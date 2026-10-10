package l5;

import java.util.HashMap;
import org.telegram.ui.rr0;
public final class r {
    public final i f15434a;
    public final String f15435b;
    public final i5.c f15436c;
    public final i5.e d;
    public final s f15437e;

    public r(i iVar, String str, i5.c cVar, i5.e eVar, s sVar) {
        this.f15434a = iVar;
        this.f15435b = str;
        this.f15436c = cVar;
        this.d = eVar;
        this.f15437e = sVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.f15437e;
            q5.b bVar = sVar.f15441c;
            i b10 = this.f15434a.b(aVar.f12011c);
            ?? obj = new Object();
            obj.f7958f = new HashMap();
            obj.d = Long.valueOf(sVar.f15439a.Z());
            obj.f7957e = Long.valueOf(sVar.f15440b.Z());
            obj.f7954a = this.f15435b;
            obj.f7956c = new l(this.f15436c, (byte[]) eVar.apply(aVar.f12010b));
            obj.f7955b = aVar.f12009a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f46041b.execute(new rr0(aVar2, b10, gVar, obj.g(), 23));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
