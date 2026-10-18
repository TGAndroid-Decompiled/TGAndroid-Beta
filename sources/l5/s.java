package l5;

import java.util.HashMap;
import org.telegram.ui.hn0;
public final class s {
    public final i f15938a;
    public final String f15939b;
    public final i5.c f15940c;
    public final i5.e d;
    public final t e;

    public s(i iVar, String str, i5.c cVar, i5.e eVar, t tVar) {
        this.f15938a = iVar;
        this.f15939b = str;
        this.f15940c = cVar;
        this.d = eVar;
        this.e = tVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            t tVar = this.e;
            q5.b bVar = tVar.f15943c;
            i b10 = this.f15938a.b(aVar.f12705c);
            ?? obj = new Object();
            obj.f7649f = new HashMap();
            obj.d = Long.valueOf(tVar.f15941a.d());
            obj.e = Long.valueOf(tVar.f15942b.d());
            obj.f7646a = this.f15939b;
            obj.f7648c = new m(this.f15940c, (byte[]) eVar.apply(aVar.f12704b));
            obj.f7647b = aVar.f12703a;
            q5.a aVar2 = (q5.a) bVar;
            aVar2.f44410b.execute(new hn0(aVar2, b10, gVar, obj.h(), 26));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
