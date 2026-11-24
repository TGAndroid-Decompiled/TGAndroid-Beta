package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jh1 extends n39 {
    public final int c;
    public final wjb d;
    public final lh1 e;

    public jh1(lh1 lh1Var, int i, wjb wjbVar) {
        this.e = lh1Var;
        this.c = i;
        this.d = wjbVar;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.e.c.size();
    }

    @Override
    public final void t(defpackage.s49 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh1.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        return new s49(new anb(this.c, 3, this.d, context));
    }

    @Override
    public final void y(s49 s49Var) {
        TLRPC.WallPaper wallPaper;
        lh1 lh1Var = this.e;
        ArrayList arrayList = lh1Var.c;
        int b = s49Var.b();
        View view = s49Var.a;
        if (b >= 0 && b < arrayList.size()) {
            wd2 wd2Var = (wd2) arrayList.get(b);
            anb anbVar = (anb) view;
            anbVar.g(wd2Var.d, false);
            if (wd2Var.a.b) {
                wallPaper = null;
            } else {
                wallPaper = lh1Var.w;
            }
            anbVar.setFallbackWallpaper(wallPaper);
        }
    }
}
