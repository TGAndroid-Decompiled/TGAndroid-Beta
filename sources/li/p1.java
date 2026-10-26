package li;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.nl;
import org.telegram.ui.Components.ti;
public final class p1 implements nl, cj {
    public final b2 f17403a;
    public final ti f17404b;

    public p1(b2 b2Var, ti tiVar) {
        this.f17403a = b2Var;
        this.f17404b = tiVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        b2 b2Var = this.f17403a;
        b2Var.getClass();
        ti tiVar = this.f17404b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f22252w = 600;
            pageblockmap.h = 400;
            b2Var.P.X1(pageblockmap);
            tiVar.dismiss(true);
            return;
        }
        tiVar.dismiss(true);
    }

    @Override
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f17403a.P.h2((MessageObject) arrayList.get(0));
        }
        this.f17404b.dismiss(true);
    }
}
