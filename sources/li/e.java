package li;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.nl;
import org.telegram.ui.Components.ti;
public final class e implements nl, cj {
    public final q f17203a;
    public final ti f17204b;

    public e(q qVar, ti tiVar) {
        this.f17203a = qVar;
        this.f17204b = tiVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        q qVar = this.f17203a;
        qVar.getClass();
        ti tiVar = this.f17204b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f22253w = 600;
            pageblockmap.h = 400;
            qVar.f17417r.X1(pageblockmap);
            qVar.Y(true);
            tiVar.dismiss(true);
            return;
        }
        tiVar.dismiss(true);
    }

    @Override
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f17203a.f17417r.h2((MessageObject) arrayList.get(0));
        }
        this.f17204b.dismiss(true);
    }
}
