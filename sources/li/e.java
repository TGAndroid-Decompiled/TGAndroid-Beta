package li;

import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.vk;
public final class e implements vk, ki {
    public final p f18525a;
    public final di f18526b;

    public e(p pVar, di diVar) {
        this.f18525a = pVar;
        this.f18526b = diVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        p pVar = this.f18525a;
        pVar.getClass();
        di diVar = this.f18526b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f27178w = 600;
            pageblockmap.h = 400;
            pVar.f18757r.V1(pageblockmap);
            pVar.a0(true);
            diVar.a(true);
            return;
        }
        diVar.a(true);
    }

    @Override
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
        if (!arrayList.isEmpty()) {
            this.f18525a.f18757r.e2((ij) arrayList.get(0));
        }
        this.f18526b.a(true);
    }
}
