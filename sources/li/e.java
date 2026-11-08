package li;

import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.vk;
public final class e implements vk, ki {
    public final p f18528a;
    public final di f18529b;

    public e(p pVar, di diVar) {
        this.f18528a = pVar;
        this.f18529b = diVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        p pVar = this.f18528a;
        pVar.getClass();
        di diVar = this.f18529b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f27181w = 600;
            pageblockmap.h = 400;
            pVar.f18760r.V1(pageblockmap);
            pVar.a0(true);
            diVar.a(true);
            return;
        }
        diVar.a(true);
    }

    @Override
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
        if (!arrayList.isEmpty()) {
            this.f18528a.f18760r.e2((ij) arrayList.get(0));
        }
        this.f18529b.a(true);
    }
}
