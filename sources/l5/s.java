package l5;

import java.util.HashMap;
import org.telegram.ui.gs0;
public final class s {
    public final i f15179a;
    public final String f15180b;
    public final i5.c f15181c;
    public final i5.e d;
    public final t f15182e;

    public s(i iVar, String str, i5.c cVar, i5.e eVar, t tVar) {
        this.f15179a = iVar;
        this.f15180b = str;
        this.f15181c = cVar;
        this.d = eVar;
        this.f15182e = tVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.f15182e;
            q5.b bVar = tVar.f15186c;
            i b10 = this.f15179a.b(aVar.f12009c);
            ?? obj = new Object();
            obj.f7954f = new HashMap();
            obj.d = Long.valueOf(tVar.f15184a.W());
            obj.f7953e = Long.valueOf(tVar.f15185b.W());
            obj.f7950a = this.f15180b;
            obj.f7952c = new m(this.f15181c, (byte[]) eVar.apply(aVar.f12008b));
            obj.f7951b = aVar.f12007a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f45934b.execute(new gs0(aVar2, b10, gVar, obj.g(), 22));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
