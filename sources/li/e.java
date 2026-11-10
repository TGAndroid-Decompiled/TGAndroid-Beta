package li;

import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.uk;
public final class e implements uk, ji {
    public final p f18531a;
    public final ci f18532b;

    public e(p pVar, ci ciVar) {
        this.f18531a = pVar;
        this.f18532b = ciVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        p pVar = this.f18531a;
        pVar.getClass();
        ci ciVar = this.f18532b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f27185w = 600;
            pageblockmap.h = 400;
            pVar.f18763r.V1(pageblockmap);
            pVar.a0(true);
            ciVar.a(true);
            return;
        }
        ciVar.a(true);
    }

    @Override
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
        if (!arrayList.isEmpty()) {
            this.f18531a.f18763r.e2((ij) arrayList.get(0));
        }
        this.f18532b.a(true);
    }
}
