package hi;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.yi;
public final class t1 implements gl, gj {
    public final g2 f9854a;
    public final yi f9855b;

    public t1(g2 g2Var, yi yiVar) {
        this.f9854a = g2Var;
        this.f9855b = yiVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        g2 g2Var = this.f9854a;
        g2Var.getClass();
        yi yiVar = this.f9855b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f17421w = 600;
            pageblockmap.h = 400;
            g2Var.P.Q1(pageblockmap);
            yiVar.dismiss(true);
            return;
        }
        yiVar.dismiss(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f9854a.P.a2((MessageObject) arrayList.get(0));
        }
        this.f9855b.dismiss(true);
    }
}
