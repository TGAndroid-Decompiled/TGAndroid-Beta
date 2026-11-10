package li;

import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.uk;
public final class p1 implements uk, ji {
    public final b2 f18771a;
    public final ci f18772b;

    public p1(b2 b2Var, ci ciVar) {
        this.f18771a = b2Var;
        this.f18772b = ciVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        b2 b2Var = this.f18771a;
        b2Var.getClass();
        ci ciVar = this.f18772b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f27185w = 600;
            pageblockmap.h = 400;
            b2Var.P.V1(pageblockmap);
            ciVar.a(true);
            return;
        }
        ciVar.a(true);
    }

    @Override
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
        if (!arrayList.isEmpty()) {
            this.f18771a.P.e2((ij) arrayList.get(0));
        }
        this.f18772b.a(true);
    }
}
