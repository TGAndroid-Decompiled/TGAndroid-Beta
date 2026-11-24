package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
public final class yca extends mu1 {
    public boolean vd;
    public final int wd;
    public final nfa xd;

    public yca(nfa nfaVar, Bundle bundle, int i) {
        super(bundle);
        this.xd = nfaVar;
        this.wd = i;
        this.vd = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        nfa nfaVar = this.xd;
        zea zeaVar = nfaVar.V;
        if (this.vd) {
            if (this.k0 != null) {
                pa("");
                this.k0.P(zeaVar.x, false);
            }
            lr1 lr1Var = this.D1;
            if (lr1Var != null) {
                lr1Var.e(zeaVar.y, false);
            }
            hq6 mediaDataController = nfaVar.y1.getMediaDataController();
            int classGuid = getClassGuid();
            h19 h19Var = zeaVar.y;
            String str = zeaVar.x;
            ArrayList arrayList = zeaVar.n;
            ArrayList arrayList2 = zeaVar.h;
            int i = zeaVar.w;
            boolean z3 = zeaVar.s;
            mediaDataController.R0 = h19Var;
            mediaDataController.e1 = str;
            boolean[] zArr = mediaDataController.Y0;
            zArr[0] = z3;
            zArr[1] = true;
            ArrayList arrayList3 = mediaDataController.a1;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            mediaDataController.b1.clear();
            mediaDataController.b1.addAll(arrayList);
            mediaDataController.m2();
            int[] iArr = mediaDataController.X0;
            iArr[0] = i;
            iArr[1] = 0;
            mediaDataController.f1 = this.wd;
            mediaDataController.getNotificationCenter().k(kk7.G0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.e0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f1), Integer.valueOf(mediaDataController.k0()), Boolean.TRUE);
            this.vd = false;
        }
        super.onTransitionAnimationStart(z, z2);
    }
}
