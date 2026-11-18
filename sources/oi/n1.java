package oi;

import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.zi;
public final class n1 implements jl, zi {
    public final z1 f22183a;
    public final si f22184b;

    public n1(z1 z1Var, si siVar) {
        this.f22183a = z1Var;
        this.f22184b = siVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        z1 z1Var = this.f22183a;
        z1Var.getClass();
        si siVar = this.f22184b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f28628w = 600;
            pageblockmap.h = 400;
            z1Var.Q.V1(pageblockmap);
            siVar.a(true);
            return;
        }
        siVar.a(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f22183a.Q.e2((fj) arrayList.get(0));
        }
        this.f22184b.a(true);
    }
}
