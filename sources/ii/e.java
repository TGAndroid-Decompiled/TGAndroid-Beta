package ii;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.yi;
public final class e implements sl, hj {
    public final r f12349a;
    public final yi f12350b;

    public e(r rVar, yi yiVar) {
        this.f12349a = rVar;
        this.f12350b = yiVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        r rVar = this.f12349a;
        rVar.getClass();
        yi yiVar = this.f12350b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f20255w = 600;
            pageblockmap.h = 400;
            rVar.f12649r.S1(pageblockmap);
            rVar.Y(true);
            yiVar.dismiss(true);
            return;
        }
        yiVar.dismiss(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f12349a.f12649r.c2((MessageObject) arrayList.get(0));
        }
        this.f12350b.dismiss(true);
    }
}
