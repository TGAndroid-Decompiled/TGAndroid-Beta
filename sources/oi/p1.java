package oi;

import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.ti;
public final class p1 implements jl, aj {
    public final b2 f22373a;
    public final ti f22374b;

    public p1(b2 b2Var, ti tiVar) {
        this.f22373a = b2Var;
        this.f22374b = tiVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        b2 b2Var = this.f22373a;
        b2Var.getClass();
        ti tiVar = this.f22374b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f28717w = 600;
            pageblockmap.h = 400;
            b2Var.Q.V1(pageblockmap);
            tiVar.a(true);
            return;
        }
        tiVar.a(true);
    }

    @Override
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f22373a.Q.e2((fj) arrayList.get(0));
        }
        this.f22374b.a(true);
    }
}
