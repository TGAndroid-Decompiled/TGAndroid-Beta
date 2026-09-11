package l5;

import java.util.HashMap;
import org.telegram.ui.es0;
public final class r {
    public final i f15302a;
    public final String f15303b;
    public final i5.c f15304c;
    public final i5.e d;
    public final s f15305e;

    public r(i iVar, String str, i5.c cVar, i5.e eVar, s sVar) {
        this.f15302a = iVar;
        this.f15303b = str;
        this.f15304c = cVar;
        this.d = eVar;
        this.f15305e = sVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.f15305e;
            q5.b bVar = sVar.f15309c;
            i b10 = this.f15302a.b(aVar.f11856c);
            ?? obj = new Object();
            obj.f6378f = new HashMap();
            obj.d = Long.valueOf(sVar.f15307a.l());
            obj.f6377e = Long.valueOf(sVar.f15308b.l());
            obj.f6374a = this.f15303b;
            obj.f6376c = new l(this.f15304c, (byte[]) eVar.apply(aVar.f11855b));
            obj.f6375b = aVar.f11854a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f44199b.execute(new es0(aVar2, b10, gVar, obj.g(), 22));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
