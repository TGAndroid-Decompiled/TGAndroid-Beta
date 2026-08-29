package lg;

import android.graphics.Rect;
import android.graphics.RenderNode;
import android.support.v4.media.session.z;
import jf.m0;
import org.telegram.messenger.AndroidUtilities;
public final class d {
    public final c f15250b;
    public final c f15251c;
    public long f15252e;
    public final RenderNode f15249a = z.c();
    public final Rect d = new Rect();

    public d(e eVar) {
        int i10;
        if (eVar.f15253a) {
            c cVar = new c(eVar, "glass", 0, true);
            this.f15251c = cVar;
            cVar.f15244e = 4;
            cVar.f15245f = 4;
            cVar.d(AndroidUtilities.dpf2(6.0f), m0.b());
            c cVar2 = new c(eVar, "blur", 0, false);
            this.f15250b = cVar2;
            cVar2.f15244e = 8;
            cVar2.f15245f = 8;
            cVar2.c(AndroidUtilities.dpf2(38.34f));
        } else if (eVar.f15255c) {
            c cVar3 = new c(eVar, "blur", 0, false);
            this.f15250b = cVar3;
            boolean z10 = eVar.f15254b;
            if (z10) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            int i11 = z10 ? 16 : 8;
            cVar3.f15244e = i10;
            cVar3.f15245f = i11;
            cVar3.d(AndroidUtilities.dpf2(40.0f), m0.b());
            this.f15251c = null;
        } else {
            c cVar4 = new c(eVar, "blur", 1, false);
            this.f15250b = cVar4;
            cVar4.f15244e = 8;
            cVar4.f15245f = 8;
            cVar4.c(AndroidUtilities.dpf2(40.0f));
            cVar4.e(m0.b());
            this.f15251c = null;
        }
    }
}
