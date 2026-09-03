package ng;

import android.graphics.Rect;
import android.graphics.RenderNode;
import android.support.v4.media.session.y;
import kf.n0;
import org.telegram.messenger.AndroidUtilities;
public final class d {
    public final c f14975b;
    public final c f14976c;
    public long e;
    public final RenderNode f14974a = y.c();
    public final Rect d = new Rect();

    public d(e eVar) {
        int i10;
        if (eVar.f14977a) {
            c cVar = new c(eVar, "glass", 0, true);
            this.f14976c = cVar;
            cVar.e = 4;
            cVar.f14970f = 4;
            cVar.d(AndroidUtilities.dpf2(6.0f), n0.b());
            c cVar2 = new c(eVar, "blur", 0, false);
            this.f14975b = cVar2;
            cVar2.e = 8;
            cVar2.f14970f = 8;
            cVar2.c(AndroidUtilities.dpf2(38.34f));
        } else if (eVar.f14979c) {
            c cVar3 = new c(eVar, "blur", 0, false);
            this.f14975b = cVar3;
            boolean z4 = eVar.f14978b;
            if (z4) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            int i11 = z4 ? 16 : 8;
            cVar3.e = i10;
            cVar3.f14970f = i11;
            cVar3.d(AndroidUtilities.dpf2(40.0f), n0.b());
            this.f14976c = null;
        } else {
            c cVar4 = new c(eVar, "blur", 1, false);
            this.f14975b = cVar4;
            cVar4.e = 8;
            cVar4.f14970f = 8;
            cVar4.c(AndroidUtilities.dpf2(40.0f));
            cVar4.e(n0.b());
            this.f14976c = null;
        }
    }
}
