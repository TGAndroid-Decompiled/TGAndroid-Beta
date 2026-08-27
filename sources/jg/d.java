package jg;

import android.graphics.Rect;
import android.graphics.RenderNode;
import android.support.v4.media.session.z;
import gf.n0;
import org.telegram.messenger.AndroidUtilities;

public final class d {

    public final c f12969b;

    public final c f12970c;

    public long f12971e;

    public final RenderNode f12968a = z.c();
    public final Rect d = new Rect();

    public d(e eVar) {
        if (eVar.f12972a) {
            c cVar = new c(eVar, "glass", 0, true);
            this.f12970c = cVar;
            cVar.f12963e = 4;
            cVar.f12964f = 4;
            cVar.d(AndroidUtilities.dpf2(6.0f), n0.b());
            c cVar2 = new c(eVar, "blur", 0, false);
            this.f12969b = cVar2;
            cVar2.f12963e = 8;
            cVar2.f12964f = 8;
            cVar2.c(AndroidUtilities.dpf2(38.34f));
            return;
        }
        if (!eVar.f12974c) {
            c cVar3 = new c(eVar, "blur", 1, false);
            this.f12969b = cVar3;
            cVar3.f12963e = 8;
            cVar3.f12964f = 8;
            cVar3.c(AndroidUtilities.dpf2(40.0f));
            cVar3.e(n0.b());
            this.f12970c = null;
            return;
        }
        c cVar4 = new c(eVar, "blur", 0, false);
        this.f12969b = cVar4;
        boolean z10 = eVar.f12973b;
        int i10 = z10 ? 16 : 8;
        int i11 = z10 ? 16 : 8;
        cVar4.f12963e = i10;
        cVar4.f12964f = i11;
        cVar4.d(AndroidUtilities.dpf2(40.0f), n0.b());
        this.f12970c = null;
    }
}
