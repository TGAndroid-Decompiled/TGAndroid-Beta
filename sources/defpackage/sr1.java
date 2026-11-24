package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.ui.ActionBar.d;
public final class sr1 implements id2 {
    public final yv1 a;

    public sr1(yv1 yv1Var) {
        this.a = yv1Var;
    }

    @Override
    public final void dismiss() {
        this.a.j0.U(null, null);
    }

    @Override
    public final void p() {
        yv1 yv1Var = this.a;
        yv1Var.Hc(true);
        c41.A(yv1Var, yv1Var.getMessagesController().o2(yv1Var.l6, yv1Var.d(), null), yv1Var.Ba).j();
    }

    @Override
    public final void r() {
        yv1 yv1Var = this.a;
        if (yv1Var.l6 != 0 && yv1Var.g4 != 3) {
            if (yv1Var.f != null) {
                yv1Var.getMessagesController().c4(yv1Var.f, true, false);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", yv1Var.l6);
            if (yv1Var.d() != 0) {
                bundle.putLong("topic_id", yv1Var.d());
            }
            yv1Var.presentFragment(new st8(bundle, yv1Var.Ba));
        }
    }

    @Override
    public final void s() {
        int i;
        yv1 yv1Var = this.a;
        i = ((d) yv1Var).currentAccount;
        SharedPreferences sharedPreferences = oc7.r1(i).W3;
        boolean z = sharedPreferences.getBoolean("sound_enabled_" + lo7.p(yv1Var.l6, yv1Var.d(), false), true);
        boolean z2 = !z ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + lo7.p(yv1Var.l6, yv1Var.d(), false), z2).apply();
        if (c41.a(yv1Var)) {
            c41.S(z ? 1 : 0, yv1Var.getResourceProvider(), yv1Var).j();
        }
        yv1Var.yd(false);
    }

    @Override
    public final void t(int i) {
        yv1 yv1Var = this.a;
        if (i == 0) {
            if (yv1Var.getMessagesController().o2(yv1Var.l6, yv1Var.d(), null)) {
                yv1Var.Hc(true);
            }
            if (c41.a(yv1Var)) {
                c41.z(yv1Var, 4, i, yv1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        yv1Var.getNotificationsController().H(yv1Var.l6, i, yv1Var.d());
        if (c41.a(yv1Var)) {
            c41.z(yv1Var, 5, i, yv1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void h() {
    }
}
