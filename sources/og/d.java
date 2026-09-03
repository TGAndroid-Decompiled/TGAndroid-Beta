package og;

import android.graphics.Rect;
import android.graphics.RenderNode;
import android.support.v4.media.session.y;
import lf.m0;
import org.telegram.messenger.AndroidUtilities;
public final class d {
    public final c f16782b;
    public final c f16783c;
    public long f16784e;
    public final RenderNode f16781a = y.c();
    public final Rect d = new Rect();

    public d(e eVar) {
        int i10;
        if (eVar.f16785a) {
            c cVar = new c(eVar, "glass", 0, true);
            this.f16783c = cVar;
            cVar.f16776e = 4;
            cVar.f16777f = 4;
            cVar.d(AndroidUtilities.dpf2(6.0f), m0.b());
            c cVar2 = new c(eVar, "blur", 0, false);
            this.f16782b = cVar2;
            cVar2.f16776e = 8;
            cVar2.f16777f = 8;
            cVar2.c(AndroidUtilities.dpf2(38.34f));
        } else if (eVar.f16787c) {
            c cVar3 = new c(eVar, "blur", 0, false);
            this.f16782b = cVar3;
            boolean z4 = eVar.f16786b;
            if (z4) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            int i11 = z4 ? 16 : 8;
            cVar3.f16776e = i10;
            cVar3.f16777f = i11;
            cVar3.d(AndroidUtilities.dpf2(40.0f), m0.b());
            this.f16783c = null;
        } else {
            c cVar4 = new c(eVar, "blur", 1, false);
            this.f16782b = cVar4;
            cVar4.f16776e = 8;
            cVar4.f16777f = 8;
            cVar4.c(AndroidUtilities.dpf2(40.0f));
            cVar4.e(m0.b());
            this.f16783c = null;
        }
    }
}
