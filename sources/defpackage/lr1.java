package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class lr1 extends vs9 {
    public final mu1 J;

    public lr1(mu1 mu1Var, Context context, mu1 mu1Var2, int i, long j, wjb wjbVar) {
        super(context, mu1Var2, i, j, wjbVar);
        this.J = mu1Var;
    }

    @Override
    public final void b(boolean z) {
        mu1 mu1Var = this.J;
        mu1Var.y5();
        mu1Var.w5();
        sr1 sr1Var = mu1Var.Bb;
        if (sr1Var != null) {
            sr1Var.setTranslationY(mu1Var.T9 + getCurrentHeight());
        }
        if (z) {
            mu1Var.aa = true;
            mu1Var.Dc();
        }
    }

    @Override
    public final boolean f(h19 h19Var) {
        boolean z;
        int i;
        boolean z2;
        mu1 mu1Var = this.J;
        mu1Var.F3 = h19Var;
        if (h19Var != null) {
            z = true;
        } else {
            z = false;
        }
        mu1Var.G3 = z;
        if (h19Var == null) {
            hq6 mediaDataController = mu1Var.getMediaDataController();
            mediaDataController.Z0.clear();
            mediaDataController.a1.clear();
            mediaDataController.b1.clear();
            mu1Var.wb(false);
            mu1Var.Zc(0, 0, -1);
        }
        mu1Var.cd();
        mu1Var.Pc();
        mu1Var.I3 = mu1Var.k0.getSearchField().getText().toString();
        hq6 mediaDataController2 = mu1Var.getMediaDataController();
        String str = mu1Var.I3;
        long j = mu1Var.l6;
        long j2 = mu1Var.d7;
        i = ((d) mu1Var).classGuid;
        long j3 = mu1Var.s4;
        TLRPC.User user = mu1Var.D3;
        TLRPC.Chat chat = mu1Var.E3;
        if (TextUtils.isEmpty(mu1Var.I3) && mu1Var.F3 == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        mediaDataController2.Z1(str, j, j2, i, 0, j3, false, user, chat, z2, mu1Var.F3);
        gl.t1(mu1Var.k0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z) {
        boolean z2;
        super.h(z);
        mu1 mu1Var = this.J;
        r7 r7Var = mu1Var.k0;
        if (r7Var != null && r7Var.w() && a() && mu1Var.J3 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        g(z2);
    }
}
