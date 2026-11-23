package oi;

import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.ui;
public final class o1 implements ll, bj {
    public final a2 f22243a;
    public final ui f22244b;

    public o1(a2 a2Var, ui uiVar) {
        this.f22243a = a2Var;
        this.f22244b = uiVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        a2 a2Var = this.f22243a;
        a2Var.getClass();
        ui uiVar = this.f22244b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f28623w = 600;
            pageblockmap.h = 400;
            a2Var.Q.V1(pageblockmap);
            uiVar.a(true);
            return;
        }
        uiVar.a(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f22243a.Q.e2((gj) arrayList.get(0));
        }
        this.f22244b.a(true);
    }
}
