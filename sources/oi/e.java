package oi;

import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.ui;
public final class e implements ll, bj {
    public final o f22031a;
    public final ui f22032b;

    public e(o oVar, ui uiVar) {
        this.f22031a = oVar;
        this.f22032b = uiVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        o oVar = this.f22031a;
        oVar.getClass();
        ui uiVar = this.f22032b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f28623w = 600;
            pageblockmap.h = 400;
            oVar.f22237r.V1(pageblockmap);
            oVar.a0(true);
            uiVar.a(true);
            return;
        }
        uiVar.a(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f22031a.f22237r.e2((gj) arrayList.get(0));
        }
        this.f22032b.a(true);
    }
}
