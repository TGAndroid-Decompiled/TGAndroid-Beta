package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class jv extends y59 {
    public final mv c;

    public jv(mv mvVar) {
        this.c = mvVar;
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
    public final void t(u69 u69Var, int i) {
        mv mvVar = this.c;
        lv lvVar = mvVar.w;
        ArrayList<TL_iv.PageBlock> arrayList = mvVar.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i) - 1);
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 0) {
            xw xwVar = (xw) view;
            xwVar.U = (c47) lvVar.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            xwVar.b(pageblockvideo, (yw) mvVar.y.E.f(pageblockvideo.video_id), false, true);
            return;
        }
        cw cwVar = (cw) view;
        cwVar.S = (c47) lvVar.b.get(pageBlock);
        cwVar.a((TL_iv.pageBlockPhoto) pageBlock, mvVar.x.F.cached_page, false, true);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View cwVar;
        mv mvVar = this.c;
        ey eyVar = mvVar.x;
        o oVar = mvVar.y;
        if (i != 0) {
            cwVar = new xw(mvVar.getContext(), oVar, eyVar, 2);
        } else {
            cwVar = new cw(mvVar.getContext(), oVar, eyVar, 2);
        }
        return new u69(cwVar);
    }
}
