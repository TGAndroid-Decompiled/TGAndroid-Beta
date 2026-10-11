package l5;

import java.util.HashMap;
import org.telegram.ui.ds0;
public final class r {
    public final i f15433a;
    public final String f15434b;
    public final i5.c f15435c;
    public final i5.e d;
    public final s f15436e;

    public r(i iVar, String str, i5.c cVar, i5.e eVar, s sVar) {
        this.f15433a = iVar;
        this.f15434b = str;
        this.f15435c = cVar;
        this.d = eVar;
        this.f15436e = sVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.f15436e;
            q5.b bVar = sVar.f15440c;
            i b10 = this.f15433a.b(aVar.f12010c);
            ?? obj = new Object();
            obj.f7957f = new HashMap();
            obj.d = Long.valueOf(sVar.f15438a.Z());
            obj.f7956e = Long.valueOf(sVar.f15439b.Z());
            obj.f7953a = this.f15434b;
            obj.f7955c = new l(this.f15435c, (byte[]) eVar.apply(aVar.f12009b));
            obj.f7954b = aVar.f12008a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f46072b.execute(new ds0(aVar2, b10, gVar, obj.g(), 23));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
