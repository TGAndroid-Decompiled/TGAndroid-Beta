package ig;

import android.graphics.Rect;
import android.graphics.RenderNode;
import android.support.v4.media.session.z;
import ff.n0;
import org.telegram.messenger.AndroidUtilities;
public final class d {
    public final c f11157b;
    public final c f11158c;
    public long f11159e;
    public final RenderNode f11156a = z.c();
    public final Rect d = new Rect();

    public d(e eVar) {
        int i9;
        if (eVar.f11160a) {
            c cVar = new c(eVar, "glass", 0, true);
            this.f11158c = cVar;
            cVar.f11151e = 4;
            cVar.f11152f = 4;
            cVar.d(AndroidUtilities.dpf2(6.0f), n0.b());
            c cVar2 = new c(eVar, "blur", 0, false);
            this.f11157b = cVar2;
            cVar2.f11151e = 8;
            cVar2.f11152f = 8;
            cVar2.c(AndroidUtilities.dpf2(38.34f));
        } else if (eVar.f11162c) {
            c cVar3 = new c(eVar, "blur", 0, false);
            this.f11157b = cVar3;
            boolean z10 = eVar.f11161b;
            if (z10) {
                i9 = 16;
            } else {
                i9 = 8;
            }
            int i10 = z10 ? 16 : 8;
            cVar3.f11151e = i9;
            cVar3.f11152f = i10;
            cVar3.d(AndroidUtilities.dpf2(40.0f), n0.b());
            this.f11158c = null;
        } else {
            c cVar4 = new c(eVar, "blur", 1, false);
            this.f11157b = cVar4;
            cVar4.f11151e = 8;
            cVar4.f11152f = 8;
            cVar4.c(AndroidUtilities.dpf2(40.0f));
            cVar4.e(n0.b());
            this.f11158c = null;
        }
    }
}
