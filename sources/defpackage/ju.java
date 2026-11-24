package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class ju extends w39 {
    public final mu c;

    public ju(mu muVar) {
        this.c = muVar;
    }

    @Override
    public final int b() {
        TL_iv.pageBlockCollage pageblockcollage = this.c.s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override
    public final int d(int i) {
        ArrayList<TL_iv.PageBlock> arrayList = this.c.s.items;
        if (!(arrayList.get((arrayList.size() - i) - 1) instanceof TL_iv.pageBlockPhoto)) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        mu muVar = this.c;
        lu luVar = muVar.w;
        ArrayList<TL_iv.PageBlock> arrayList = muVar.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i) - 1);
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 0) {
            xv xvVar = (xv) view;
            xvVar.U = (c27) luVar.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            xvVar.b(pageblockvideo, (yv) muVar.y.E.f(pageblockvideo.video_id), false, true);
            return;
        }
        cv cvVar = (cv) view;
        cvVar.S = (c27) luVar.b.get(pageBlock);
        cvVar.a((TL_iv.pageBlockPhoto) pageBlock, muVar.x.F.cached_page, false, true);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View cvVar;
        mu muVar = this.c;
        dx dxVar = muVar.x;
        o oVar = muVar.y;
        if (i != 0) {
            cvVar = new xv(muVar.getContext(), oVar, dxVar, 2);
        } else {
            cvVar = new cv(muVar.getContext(), oVar, dxVar, 2);
        }
        return new s49(cvVar);
    }
}
