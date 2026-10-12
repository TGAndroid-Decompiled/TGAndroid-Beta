package ji;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.vi;
public final class e implements pl, ej {
    public final r f13235a;
    public final vi f13236b;

    public e(r rVar, vi viVar) {
        this.f13235a = rVar;
        this.f13236b = viVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        r rVar = this.f13235a;
        rVar.getClass();
        vi viVar = this.f13236b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f19437w = 600;
            pageblockmap.h = 400;
            rVar.f13483r.S1(pageblockmap);
            rVar.Y(true);
            viVar.dismiss(true);
            return;
        }
        viVar.dismiss(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f13235a.f13483r.c2((MessageObject) arrayList.get(0));
        }
        this.f13236b.dismiss(true);
    }
}
