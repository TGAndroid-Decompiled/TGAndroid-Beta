package oi;

import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.si;
public final class e implements cl, si {
    public final o f21646a;
    public final ki f21647b;

    public e(o oVar, ki kiVar) {
        this.f21646a = oVar;
        this.f21647b = kiVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        o oVar = this.f21646a;
        oVar.getClass();
        ki kiVar = this.f21647b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f28276w = 600;
            pageblockmap.h = 400;
            oVar.f21848r.V1(pageblockmap);
            oVar.a0(true);
            kiVar.a(true);
            return;
        }
        kiVar.a(true);
    }

    @Override
    public void k(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f21646a.f21848r.e2((gj) arrayList.get(0));
        }
        this.f21647b.a(true);
    }
}
