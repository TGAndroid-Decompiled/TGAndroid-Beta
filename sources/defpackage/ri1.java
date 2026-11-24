package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ri1 extends q59 {
    public final int c;
    public final ylb d;
    public final ti1 e;

    public ri1(ti1 ti1Var, int i, ylb ylbVar) {
        this.e = ti1Var;
        this.c = i;
        this.d = ylbVar;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.e.c.size();
    }

    @Override
    public final void t(defpackage.u69 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri1.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        return new u69(new bpb(this.c, 3, this.d, context));
    }

    @Override
    public final void y(u69 u69Var) {
        TLRPC.WallPaper wallPaper;
        ti1 ti1Var = this.e;
        ArrayList arrayList = ti1Var.c;
        int b = u69Var.b();
        View view = u69Var.a;
        if (b >= 0 && b < arrayList.size()) {
            hf2 hf2Var = (hf2) arrayList.get(b);
            bpb bpbVar = (bpb) view;
            bpbVar.g(hf2Var.d, false);
            if (hf2Var.a.b) {
                wallPaper = null;
            } else {
                wallPaper = ti1Var.w;
            }
            bpbVar.setFallbackWallpaper(wallPaper);
        }
    }
}
