package ki;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.ti;
public final class e implements ml, cj {
    public final q f15241a;
    public final ti f15242b;

    public e(q qVar, ti tiVar) {
        this.f15241a = qVar;
        this.f15242b = tiVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        q qVar = this.f15241a;
        qVar.getClass();
        ti tiVar = this.f15242b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f20495w = 600;
            pageblockmap.h = 400;
            qVar.f15450r.S1(pageblockmap);
            qVar.Y(true);
            tiVar.dismiss(true);
            return;
        }
        tiVar.dismiss(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f15241a.f15450r.c2((MessageObject) arrayList.get(0));
        }
        this.f15242b.dismiss(true);
    }
}
