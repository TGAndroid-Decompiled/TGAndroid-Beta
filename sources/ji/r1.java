package ji;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.vi;
public final class r1 implements pl, ej {
    public final d2 f13491a;
    public final vi f13492b;

    public r1(d2 d2Var, vi viVar) {
        this.f13491a = d2Var;
        this.f13492b = viVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        d2 d2Var = this.f13491a;
        d2Var.getClass();
        vi viVar = this.f13492b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f19437w = 600;
            pageblockmap.h = 400;
            d2Var.P.S1(pageblockmap);
            viVar.dismiss(true);
            return;
        }
        viVar.dismiss(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f13491a.P.c2((MessageObject) arrayList.get(0));
        }
        this.f13492b.dismiss(true);
    }
}
