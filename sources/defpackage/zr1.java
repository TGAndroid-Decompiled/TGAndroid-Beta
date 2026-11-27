package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class zr1 extends ow9 {
    public final zu1 J;

    public zr1(zu1 zu1Var, Context context, zu1 zu1Var2, int i, long j, vnb vnbVar) {
        super(context, zu1Var2, i, j, vnbVar);
        this.J = zu1Var;
    }

    @Override
    public final void b(boolean z) {
        zu1 zu1Var = this.J;
        zu1Var.F5();
        zu1Var.D5();
        gs1 gs1Var = zu1Var.Mb;
        if (gs1Var != null) {
            gs1Var.setTranslationY(zu1Var.T9 + getCurrentHeight());
        }
        if (z) {
            zu1Var.aa = true;
            zu1Var.Rc();
        }
    }

    @Override
    public final boolean f(w49 w49Var) {
        boolean z;
        int i;
        boolean z2;
        zu1 zu1Var = this.J;
        zu1Var.F3 = w49Var;
        if (w49Var != null) {
            z = true;
        } else {
            z = false;
        }
        zu1Var.G3 = z;
        if (w49Var == null) {
            ls6 mediaDataController = zu1Var.getMediaDataController();
            mediaDataController.Z0.clear();
            mediaDataController.a1.clear();
            mediaDataController.b1.clear();
            zu1Var.Jb(false);
            zu1Var.nd(0, 0, -1);
        }
        zu1Var.qd();
        zu1Var.dd();
        zu1Var.I3 = zu1Var.k0.getSearchField().getText().toString();
        ls6 mediaDataController2 = zu1Var.getMediaDataController();
        String str = zu1Var.I3;
        long j = zu1Var.l6;
        long j2 = zu1Var.d7;
        i = ((e) zu1Var).classGuid;
        long j3 = zu1Var.s4;
        TLRPC.User user = zu1Var.D3;
        TLRPC.Chat chat = zu1Var.E3;
        if (TextUtils.isEmpty(zu1Var.I3) && zu1Var.F3 == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        mediaDataController2.Z1(str, j, j2, i, 0, j3, false, user, chat, z2, zu1Var.F3);
        hl.t1(zu1Var.k0.getSearchField());
        return true;
    }

    @Override
    public final void h(boolean z) {
        boolean z2;
        super.h(z);
        zu1 zu1Var = this.J;
        s7 s7Var = zu1Var.k0;
        if (s7Var != null && s7Var.w() && a() && zu1Var.J3 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        g(z2);
    }
}
