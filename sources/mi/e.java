package mi;

import java.util.ArrayList;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.tk;
public final class e implements tk, ki {
    public final p f19566a;
    public final bi f19567b;

    public e(p pVar, bi biVar) {
        this.f19566a = pVar;
        this.f19567b = biVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        p pVar = this.f19566a;
        pVar.getClass();
        bi biVar = this.f19567b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f27226w = 600;
            pageblockmap.h = 400;
            pVar.f19793r.V1(pageblockmap);
            pVar.a0(true);
            biVar.a(true);
            return;
        }
        biVar.a(true);
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f19566a.f19793r.e2((zi) arrayList.get(0));
        }
        this.f19567b.a(true);
    }
}
