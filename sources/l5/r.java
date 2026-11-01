package l5;

import java.util.HashMap;
import org.telegram.ui.ox0;
public final class r {
    public final i f11683a;
    public final String f11684b;
    public final i5.c f11685c;
    public final i5.e d;
    public final s e;

    public r(i iVar, String str, i5.c cVar, i5.e eVar, s sVar) {
        this.f11683a = iVar;
        this.f11684b = str;
        this.f11685c = cVar;
        this.d = eVar;
        this.e = sVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.e;
            q5.c cVar = sVar.f11688c;
            i b10 = this.f11683a.b(aVar.f8204c);
            ?? obj = new Object();
            obj.f9351f = new HashMap();
            obj.d = Long.valueOf(sVar.f11686a.g());
            obj.e = Long.valueOf(sVar.f11687b.g());
            obj.f9348a = this.f11684b;
            obj.f9350c = new l(this.f11685c, (byte[]) eVar.apply(aVar.f8203b));
            obj.f9349b = aVar.f8202a;
            q5.b bVar = (q5.b) cVar;
            bVar.f45495b.execute(new ox0(bVar, b10, gVar, obj.f(), 12));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
