package oi;

import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.si;
public final class n1 implements cl, si {
    public final z1 f21832a;
    public final ki f21833b;

    public n1(z1 z1Var, ki kiVar) {
        this.f21832a = z1Var;
        this.f21833b = kiVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        z1 z1Var = this.f21832a;
        z1Var.getClass();
        ki kiVar = this.f21833b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f28276w = 600;
            pageblockmap.h = 400;
            z1Var.Q.V1(pageblockmap);
            kiVar.a(true);
            return;
        }
        kiVar.a(true);
    }

    @Override
    public void k(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f21832a.Q.e2((gj) arrayList.get(0));
        }
        this.f21833b.a(true);
    }
}
