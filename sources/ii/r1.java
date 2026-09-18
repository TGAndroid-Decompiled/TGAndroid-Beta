package ii;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.vi;
public final class r1 implements bl, dj {
    public final d2 f11597a;
    public final vi f11598b;

    public r1(d2 d2Var, vi viVar) {
        this.f11597a = d2Var;
        this.f11598b = viVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        d2 d2Var = this.f11597a;
        d2Var.getClass();
        vi viVar = this.f11598b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f18517w = 600;
            pageblockmap.h = 400;
            d2Var.P.S1(pageblockmap);
            viVar.dismiss(true);
            return;
        }
        viVar.dismiss(true);
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f11597a.P.c2((MessageObject) arrayList.get(0));
        }
        this.f11598b.dismiss(true);
    }
}
