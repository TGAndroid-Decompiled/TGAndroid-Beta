package l5;

import java.util.HashMap;
import org.telegram.ui.es0;
public final class s {
    public final i f13914a;
    public final String f13915b;
    public final i5.c f13916c;
    public final i5.e d;
    public final t e;

    public s(i iVar, String str, i5.c cVar, i5.e eVar, t tVar) {
        this.f13914a = iVar;
        this.f13915b = str;
        this.f13916c = cVar;
        this.d = eVar;
        this.e = tVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.e;
            q5.b bVar = tVar.f13919c;
            i b10 = this.f13914a.b(aVar.f10992c);
            ?? obj = new Object();
            obj.f7336f = new HashMap();
            obj.d = Long.valueOf(tVar.f13917a.q());
            obj.e = Long.valueOf(tVar.f13918b.q());
            obj.f7333a = this.f13915b;
            obj.f7335c = new m(this.f13916c, (byte[]) eVar.apply(aVar.f10991b));
            obj.f7334b = aVar.f10990a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f41161b.execute(new es0(aVar2, b10, gVar, obj.g(), 22));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
