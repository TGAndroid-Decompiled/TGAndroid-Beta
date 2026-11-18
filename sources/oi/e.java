package oi;

import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.zi;
public final class e implements jl, zi {
    public final o f22005a;
    public final si f22006b;

    public e(o oVar, si siVar) {
        this.f22005a = oVar;
        this.f22006b = siVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        o oVar = this.f22005a;
        oVar.getClass();
        si siVar = this.f22006b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f28630w = 600;
            pageblockmap.h = 400;
            oVar.f22210r.V1(pageblockmap);
            oVar.a0(true);
            siVar.a(true);
            return;
        }
        siVar.a(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f22005a.f22210r.e2((fj) arrayList.get(0));
        }
        this.f22006b.a(true);
    }
}
