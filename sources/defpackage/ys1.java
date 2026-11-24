package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ys1 extends xu9 {
    public final yv1 J;

    public ys1(yv1 yv1Var, Context context, yv1 yv1Var2, int i, long j, ylb ylbVar) {
        super(context, yv1Var2, i, j, ylbVar);
        this.J = yv1Var;
    }

    @Override
    public final void b(boolean z) {
        yv1 yv1Var = this.J;
        yv1Var.G5();
        yv1Var.E5();
        ft1 ft1Var = yv1Var.Jb;
        if (ft1Var != null) {
            ft1Var.setTranslationY(yv1Var.T9 + getCurrentHeight());
        }
        if (z) {
            yv1Var.aa = true;
            yv1Var.Rc();
        }
    }

    @Override
    public final boolean f(k39 k39Var) {
        boolean z;
        int i;
        boolean z2;
        yv1 yv1Var = this.J;
        yv1Var.F3 = k39Var;
        if (k39Var != null) {
            z = true;
        } else {
            z = false;
        }
        yv1Var.G3 = z;
        if (k39Var == null) {
            hs6 mediaDataController = yv1Var.getMediaDataController();
            mediaDataController.Z0.clear();
            mediaDataController.a1.clear();
            mediaDataController.b1.clear();
            yv1Var.Ib(false);
            yv1Var.nd(0, 0, -1);
        }
        yv1Var.qd();
        yv1Var.dd();
        yv1Var.I3 = yv1Var.k0.getSearchField().getText().toString();
        hs6 mediaDataController2 = yv1Var.getMediaDataController();
        String str = yv1Var.I3;
        long j = yv1Var.l6;
        long j2 = yv1Var.d7;
        i = ((d) yv1Var).classGuid;
        long j3 = yv1Var.s4;
        TLRPC.User user = yv1Var.D3;
        TLRPC.Chat chat = yv1Var.E3;
        if (TextUtils.isEmpty(yv1Var.I3) && yv1Var.F3 == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        mediaDataController2.Z1(str, j, j2, i, 0, j3, false, user, chat, z2, yv1Var.F3);
        gm.t1(yv1Var.k0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z) {
        boolean z2;
        super.h(z);
        yv1 yv1Var = this.J;
        r7 r7Var = yv1Var.k0;
        if (r7Var != null && r7Var.w() && a() && yv1Var.J3 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        g(z2);
    }
}
