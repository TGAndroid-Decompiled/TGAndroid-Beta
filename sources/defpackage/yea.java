package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
public final class yea extends yv1 {
    public boolean Gd;
    public final int Hd;
    public final nha Id;

    public yea(nha nhaVar, Bundle bundle, int i) {
        super(bundle);
        this.Id = nhaVar;
        this.Hd = i;
        this.Gd = true;
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        nha nhaVar = this.Id;
        zga zgaVar = nhaVar.V;
        if (this.Gd) {
            if (this.k0 != null) {
                Ba("");
                this.k0.P(zgaVar.x, false);
            }
            ys1 ys1Var = this.D1;
            if (ys1Var != null) {
                ys1Var.e(zgaVar.y, false);
            }
            hs6 mediaDataController = nhaVar.y1.getMediaDataController();
            int classGuid = getClassGuid();
            k39 k39Var = zgaVar.y;
            String str = zgaVar.x;
            ArrayList arrayList = zgaVar.n;
            ArrayList arrayList2 = zgaVar.h;
            int i = zgaVar.w;
            boolean z3 = zgaVar.s;
            mediaDataController.R0 = k39Var;
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
            mediaDataController.f1 = this.Hd;
            mediaDataController.getNotificationCenter().k(nm7.H0, Integer.valueOf(classGuid), 0, Integer.valueOf(mediaDataController.e0()), Long.valueOf(mediaDataController.getUserConfig().e()), Integer.valueOf(mediaDataController.f1), Integer.valueOf(mediaDataController.k0()), Boolean.TRUE);
            this.Gd = false;
        }
        super.onTransitionAnimationStart(z, z2);
    }
}
