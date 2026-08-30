package ng;

import android.graphics.Rect;
import android.graphics.RenderNode;
import android.support.v4.media.session.y;
import lf.m0;
import org.telegram.messenger.AndroidUtilities;
public final class d {
    public final c f14995b;
    public final c f14996c;
    public long e;
    public final RenderNode f14994a = y.c();
    public final Rect d = new Rect();

    public d(e eVar) {
        int i10;
        if (eVar.f14997a) {
            c cVar = new c(eVar, "glass", 0, true);
            this.f14996c = cVar;
            cVar.e = 4;
            cVar.f14990f = 4;
            cVar.d(AndroidUtilities.dpf2(6.0f), m0.b());
            c cVar2 = new c(eVar, "blur", 0, false);
            this.f14995b = cVar2;
            cVar2.e = 8;
            cVar2.f14990f = 8;
            cVar2.c(AndroidUtilities.dpf2(38.34f));
        } else if (eVar.f14999c) {
            c cVar3 = new c(eVar, "blur", 0, false);
            this.f14995b = cVar3;
            boolean z4 = eVar.f14998b;
            if (z4) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            int i11 = z4 ? 16 : 8;
            cVar3.e = i10;
            cVar3.f14990f = i11;
            cVar3.d(AndroidUtilities.dpf2(40.0f), m0.b());
            this.f14996c = null;
        } else {
            c cVar4 = new c(eVar, "blur", 1, false);
            this.f14995b = cVar4;
            cVar4.e = 8;
            cVar4.f14990f = 8;
            cVar4.c(AndroidUtilities.dpf2(40.0f));
            cVar4.e(m0.b());
            this.f14996c = null;
        }
    }
}
