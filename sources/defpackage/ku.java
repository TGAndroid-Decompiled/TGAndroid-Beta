package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class ku extends j79 {
    public final nu c;

    public ku(nu nuVar) {
        this.c = nuVar;
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
    public final void t(f89 f89Var, int i) {
        nu nuVar = this.c;
        mu muVar = nuVar.w;
        ArrayList<TL_iv.PageBlock> arrayList = nuVar.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i) - 1);
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 0) {
            yv yvVar = (yv) view;
            yvVar.U = (j47) muVar.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            yvVar.b(pageblockvideo, (zv) nuVar.y.E.f(pageblockvideo.video_id), false, true);
            return;
        }
        dv dvVar = (dv) view;
        dvVar.S = (j47) muVar.b.get(pageBlock);
        dvVar.a((TL_iv.pageBlockPhoto) pageBlock, nuVar.x.F.cached_page, false, true);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View dvVar;
        nu nuVar = this.c;
        ex exVar = nuVar.x;
        o oVar = nuVar.y;
        if (i != 0) {
            dvVar = new yv(nuVar.getContext(), oVar, exVar, 2);
        } else {
            dvVar = new dv(nuVar.getContext(), oVar, exVar, 2);
        }
        return new f89(dvVar);
    }
}
