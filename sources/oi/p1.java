package oi;

import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.ui;
public final class p1 implements ll, bj {
    public final b2 f22304a;
    public final ui f22305b;

    public p1(b2 b2Var, ui uiVar) {
        this.f22304a = b2Var;
        this.f22305b = uiVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        b2 b2Var = this.f22304a;
        b2Var.getClass();
        ui uiVar = this.f22305b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f28656w = 600;
            pageblockmap.h = 400;
            b2Var.Q.V1(pageblockmap);
            uiVar.a(true);
            return;
        }
        uiVar.a(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f22304a.Q.e2((fj) arrayList.get(0));
        }
        this.f22305b.a(true);
    }
}
