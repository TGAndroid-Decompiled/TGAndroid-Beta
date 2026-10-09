package ii;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.yi;
public final class s1 implements sl, hj {
    public final e2 f12671a;
    public final yi f12672b;

    public s1(e2 e2Var, yi yiVar) {
        this.f12671a = e2Var;
        this.f12672b = yiVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        e2 e2Var = this.f12671a;
        e2Var.getClass();
        yi yiVar = this.f12672b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f20261w = 600;
            pageblockmap.h = 400;
            e2Var.P.S1(pageblockmap);
            yiVar.dismiss(true);
            return;
        }
        yiVar.dismiss(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f12671a.P.c2((MessageObject) arrayList.get(0));
        }
        this.f12672b.dismiss(true);
    }
}
