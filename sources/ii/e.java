package ii;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.wi;
public final class e implements cl, ej {
    public final r f11300a;
    public final wi f11301b;

    public e(r rVar, wi wiVar) {
        this.f11300a = rVar;
        this.f11301b = wiVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        r rVar = this.f11300a;
        rVar.getClass();
        wi wiVar = this.f11301b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f18304w = 600;
            pageblockmap.h = 400;
            rVar.f11572r.R1(pageblockmap);
            rVar.V(true);
            wiVar.dismiss(true);
            return;
        }
        wiVar.dismiss(true);
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f11300a.f11572r.b2((MessageObject) arrayList.get(0));
        }
        this.f11301b.dismiss(true);
    }
}
