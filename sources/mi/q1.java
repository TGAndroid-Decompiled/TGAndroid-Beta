package mi;

import java.util.ArrayList;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.tk;
public final class q1 implements tk, ki {
    public final c2 f19830a;
    public final bi f19831b;

    public q1(c2 c2Var, bi biVar) {
        this.f19830a = c2Var;
        this.f19831b = biVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        c2 c2Var = this.f19830a;
        c2Var.getClass();
        bi biVar = this.f19831b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f27226w = 600;
            pageblockmap.h = 400;
            c2Var.Q.V1(pageblockmap);
            biVar.a(true);
            return;
        }
        biVar.a(true);
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f19830a.Q.e2((zi) arrayList.get(0));
        }
        this.f19831b.a(true);
    }
}
