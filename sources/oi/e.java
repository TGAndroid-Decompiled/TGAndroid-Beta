package oi;

import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.ti;
public final class e implements jl, aj {
    public final p f22128a;
    public final ti f22129b;

    public e(p pVar, ti tiVar) {
        this.f22128a = pVar;
        this.f22129b = tiVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        p pVar = this.f22128a;
        pVar.getClass();
        ti tiVar = this.f22129b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f28717w = 600;
            pageblockmap.h = 400;
            pVar.f22367r.V1(pageblockmap);
            pVar.a0(true);
            tiVar.a(true);
            return;
        }
        tiVar.a(true);
    }

    @Override
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f22128a.f22367r.e2((fj) arrayList.get(0));
        }
        this.f22129b.a(true);
    }
}
