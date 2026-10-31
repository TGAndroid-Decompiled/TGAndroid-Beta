package l5;

import java.util.HashMap;
import org.telegram.ui.px0;
public final class r {
    public final i f11682a;
    public final String f11683b;
    public final i5.c f11684c;
    public final i5.e d;
    public final s e;

    public r(i iVar, String str, i5.c cVar, i5.e eVar, s sVar) {
        this.f11682a = iVar;
        this.f11683b = str;
        this.f11684c = cVar;
        this.d = eVar;
        this.e = sVar;
    }

    public final void a(i5.a aVar, i5.g gVar) {
        i5.e eVar = this.d;
        if (eVar != null) {
            s sVar = this.e;
            q5.c cVar = sVar.f11687c;
            i b10 = this.f11682a.b(aVar.f8203c);
            ?? obj = new Object();
            obj.f9350f = new HashMap();
            obj.d = Long.valueOf(sVar.f11685a.g());
            obj.e = Long.valueOf(sVar.f11686b.g());
            obj.f9347a = this.f11683b;
            obj.f9349c = new l(this.f11684c, (byte[]) eVar.apply(aVar.f8202b));
            obj.f9348b = aVar.f8201a;
            q5.b bVar = (q5.b) cVar;
            bVar.f45484b.execute(new px0(bVar, b10, gVar, obj.f(), 12));
            return;
        }
        throw new NullPointerException("Null transformer");
    }
}
