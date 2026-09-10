package hi;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.yi;
public final class f implements gl, gj {
    public final s f9557a;
    public final yi f9558b;

    public f(s sVar, yi yiVar) {
        this.f9557a = sVar;
        this.f9558b = yiVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        s sVar = this.f9557a;
        sVar.getClass();
        yi yiVar = this.f9558b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f17421w = 600;
            pageblockmap.h = 400;
            sVar.f9835r.Q1(pageblockmap);
            sVar.V(true);
            yiVar.dismiss(true);
            return;
        }
        yiVar.dismiss(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f9557a.f9835r.a2((MessageObject) arrayList.get(0));
        }
        this.f9558b.dismiss(true);
    }
}
