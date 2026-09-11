package bh;

import android.graphics.Rect;
import android.graphics.RenderNode;
import android.support.v4.media.session.y;
import org.telegram.messenger.AndroidUtilities;
import yf.g0;
public final class e {
    public final d f2679b;
    public final d f2680c;
    public long f2681e;
    public final RenderNode f2678a = y.c();
    public final Rect d = new Rect();

    public e(f fVar) {
        int i10;
        if (fVar.f2682a) {
            d dVar = new d(fVar, "glass", 0, true);
            this.f2680c = dVar;
            dVar.f2673e = 4;
            dVar.f2674f = 4;
            dVar.d(AndroidUtilities.dpf2(6.0f), g0.b());
            d dVar2 = new d(fVar, "blur", 0, false);
            this.f2679b = dVar2;
            dVar2.f2673e = 8;
            dVar2.f2674f = 8;
            dVar2.c(AndroidUtilities.dpf2(38.34f));
        } else if (fVar.f2684c) {
            d dVar3 = new d(fVar, "blur", 0, false);
            this.f2679b = dVar3;
            boolean z10 = fVar.f2683b;
            if (z10) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            int i11 = z10 ? 16 : 8;
            dVar3.f2673e = i10;
            dVar3.f2674f = i11;
            dVar3.d(AndroidUtilities.dpf2(40.0f), g0.b());
            this.f2680c = null;
        } else {
            d dVar4 = new d(fVar, "blur", 1, false);
            this.f2679b = dVar4;
            dVar4.f2673e = 8;
            dVar4.f2674f = 8;
            dVar4.c(AndroidUtilities.dpf2(40.0f));
            dVar4.e(g0.b());
            this.f2680c = null;
        }
    }
}
