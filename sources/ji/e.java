package ji;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.vi;
public final class e implements bl, dj {
    public final r f13899a;
    public final vi f13900b;

    public e(r rVar, vi viVar) {
        this.f13899a = rVar;
        this.f13900b = viVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        r rVar = this.f13899a;
        rVar.getClass();
        vi viVar = this.f13900b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f20120w = 600;
            pageblockmap.h = 400;
            rVar.f14159r.Q1(pageblockmap);
            rVar.V(true);
            viVar.dismiss(true);
            return;
        }
        viVar.dismiss(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f13899a.f14159r.a2((MessageObject) arrayList.get(0));
        }
        this.f13900b.dismiss(true);
    }
}
