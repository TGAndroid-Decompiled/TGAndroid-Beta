package l5;

import java.util.HashMap;
import org.telegram.ui.es0;
public final class r {
    public final i f15329a;
    public final String f15330b;
    public final i5.c f15331c;
    public final i5.e d;
    public final s f15332e;

    public r(i iVar, String str, i5.c cVar, i5.e eVar, s sVar) {
        this.f15329a = iVar;
        this.f15330b = str;
        this.f15331c = cVar;
        this.d = eVar;
        this.f15332e = sVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.f15332e;
            q5.b bVar = sVar.f15336c;
            i b10 = this.f15329a.b(aVar.f11882c);
            ?? obj = new Object();
            obj.f6405f = new HashMap();
            obj.d = Long.valueOf(sVar.f15334a.l());
            obj.f6404e = Long.valueOf(sVar.f15335b.l());
            obj.f6401a = this.f15330b;
            obj.f6403c = new l(this.f15331c, (byte[]) eVar.apply(aVar.f11881b));
            obj.f6402b = aVar.f11880a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f44227b.execute(new es0(aVar2, b10, gVar, obj.g(), 22));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
