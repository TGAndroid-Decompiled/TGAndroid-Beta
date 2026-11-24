package defpackage;

import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class nv extends pr7 {
    public final pv c;

    public nv(pv pvVar) {
        this.c = pvVar;
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.c.e;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        if (this.c.e.items.contains(((mv) obj).a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(gec gecVar, int i) {
        xv xvVar;
        pv pvVar = this.c;
        dx dxVar = pvVar.y;
        o oVar = pvVar.E;
        TL_iv.PageBlock pageBlock = pvVar.e.items.get(i);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            cv cvVar = new cv(pvVar.getContext(), oVar, dxVar, 1);
            cvVar.a((TL_iv.pageBlockPhoto) pageBlock, dxVar.F.cached_page, false, true);
            xvVar = cvVar;
        } else {
            xv xvVar2 = new xv(pvVar.getContext(), oVar, dxVar, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            xvVar2.b(pageblockvideo, (yv) oVar.E.f(pageblockvideo.video_id), false, true);
            xvVar = xvVar2;
        }
        gecVar.addView(xvVar);
        ?? obj = new Object();
        obj.b = xvVar;
        obj.a = pageBlock;
        return obj;
    }
}
