package ii;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.wi;
public final class s1 implements cl, ej {
    public final e2 f11607a;
    public final wi f11608b;

    public s1(e2 e2Var, wi wiVar) {
        this.f11607a = e2Var;
        this.f11608b = wiVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        e2 e2Var = this.f11607a;
        e2Var.getClass();
        wi wiVar = this.f11608b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f18557w = 600;
            pageblockmap.h = 400;
            e2Var.P.R1(pageblockmap);
            wiVar.dismiss(true);
            return;
        }
        wiVar.dismiss(true);
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f11607a.P.b2((MessageObject) arrayList.get(0));
        }
        this.f11608b.dismiss(true);
    }
}
