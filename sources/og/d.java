package og;

import android.graphics.Rect;
import android.graphics.RenderNode;
import android.support.v4.media.session.y;
import lf.m0;
import org.telegram.messenger.AndroidUtilities;
public final class d {
    public final c f16780b;
    public final c f16781c;
    public long f16782e;
    public final RenderNode f16779a = y.c();
    public final Rect d = new Rect();

    public d(e eVar) {
        int i10;
        if (eVar.f16783a) {
            c cVar = new c(eVar, "glass", 0, true);
            this.f16781c = cVar;
            cVar.f16774e = 4;
            cVar.f16775f = 4;
            cVar.d(AndroidUtilities.dpf2(6.0f), m0.b());
            c cVar2 = new c(eVar, "blur", 0, false);
            this.f16780b = cVar2;
            cVar2.f16774e = 8;
            cVar2.f16775f = 8;
            cVar2.c(AndroidUtilities.dpf2(38.34f));
        } else if (eVar.f16785c) {
            c cVar3 = new c(eVar, "blur", 0, false);
            this.f16780b = cVar3;
            boolean z4 = eVar.f16784b;
            if (z4) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            int i11 = z4 ? 16 : 8;
            cVar3.f16774e = i10;
            cVar3.f16775f = i11;
            cVar3.d(AndroidUtilities.dpf2(40.0f), m0.b());
            this.f16781c = null;
        } else {
            c cVar4 = new c(eVar, "blur", 1, false);
            this.f16780b = cVar4;
            cVar4.f16774e = 8;
            cVar4.f16775f = 8;
            cVar4.c(AndroidUtilities.dpf2(40.0f));
            cVar4.e(m0.b());
            this.f16781c = null;
        }
    }
}
