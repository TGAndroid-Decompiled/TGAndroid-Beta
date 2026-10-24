package ki;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.ri;
public final class q1 implements kl, aj {
    public final d2 f15514a;
    public final ri f15515b;

    public q1(d2 d2Var, ri riVar) {
        this.f15514a = d2Var;
        this.f15515b = riVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        d2 d2Var = this.f15514a;
        d2Var.getClass();
        ri riVar = this.f15515b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f20564w = 600;
            pageblockmap.h = 400;
            d2Var.P.X1(pageblockmap);
            riVar.dismiss(true);
            return;
        }
        riVar.dismiss(true);
    }

    @Override
    public void f(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f15514a.P.h2((MessageObject) arrayList.get(0));
        }
        this.f15515b.dismiss(true);
    }
}
