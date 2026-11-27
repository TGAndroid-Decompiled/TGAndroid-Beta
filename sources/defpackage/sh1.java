package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sh1 extends c79 {
    public final int c;
    public final vnb d;
    public final uh1 e;

    public sh1(uh1 uh1Var, int i, vnb vnbVar) {
        this.e = uh1Var;
        this.c = i;
        this.d = vnbVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.e.c.size();
    }

    @Override
    public final void t(defpackage.f89 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh1.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        return new f89(new zqb(this.c, 3, this.d, context));
    }

    @Override
    public final void y(f89 f89Var) {
        TLRPC.WallPaper wallPaper;
        uh1 uh1Var = this.e;
        ArrayList arrayList = uh1Var.c;
        int b = f89Var.b();
        View view = f89Var.a;
        if (b >= 0 && b < arrayList.size()) {
            ne2 ne2Var = (ne2) arrayList.get(b);
            zqb zqbVar = (zqb) view;
            zqbVar.g(ne2Var.d, false);
            if (ne2Var.a.b) {
                wallPaper = null;
            } else {
                wallPaper = uh1Var.w;
            }
            zqbVar.setFallbackWallpaper(wallPaper);
        }
    }
}
