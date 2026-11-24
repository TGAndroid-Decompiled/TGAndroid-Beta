package defpackage;

import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class nw extends qt7 {
    public final pw c;

    public nw(pw pwVar) {
        this.c = pwVar;
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
        if (this.c.e.items.contains(((mw) obj).a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(ggc ggcVar, int i) {
        xw xwVar;
        pw pwVar = this.c;
        ey eyVar = pwVar.y;
        o oVar = pwVar.E;
        TL_iv.PageBlock pageBlock = pwVar.e.items.get(i);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            cw cwVar = new cw(pwVar.getContext(), oVar, eyVar, 1);
            cwVar.a((TL_iv.pageBlockPhoto) pageBlock, eyVar.F.cached_page, false, true);
            xwVar = cwVar;
        } else {
            xw xwVar2 = new xw(pwVar.getContext(), oVar, eyVar, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            xwVar2.b(pageblockvideo, (yw) oVar.E.f(pageblockvideo.video_id), false, true);
            xwVar = xwVar2;
        }
        ggcVar.addView(xwVar);
        ?? obj = new Object();
        obj.b = xwVar;
        obj.a = pageBlock;
        return obj;
    }
}
