package defpackage;

import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class ov extends vu7 {
    public final qv c;

    public ov(qv qvVar) {
        this.c = qvVar;
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
        if (this.c.e.items.contains(((nv) obj).a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(fic ficVar, int i) {
        yv yvVar;
        qv qvVar = this.c;
        ex exVar = qvVar.y;
        o oVar = qvVar.E;
        TL_iv.PageBlock pageBlock = qvVar.e.items.get(i);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            dv dvVar = new dv(qvVar.getContext(), oVar, exVar, 1);
            dvVar.a((TL_iv.pageBlockPhoto) pageBlock, exVar.F.cached_page, false, true);
            yvVar = dvVar;
        } else {
            yv yvVar2 = new yv(qvVar.getContext(), oVar, exVar, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            yvVar2.b(pageblockvideo, (zv) oVar.E.f(pageblockvideo.video_id), false, true);
            yvVar = yvVar2;
        }
        ficVar.addView(yvVar);
        ?? obj = new Object();
        obj.b = yvVar;
        obj.a = pageBlock;
        return obj;
    }
}
