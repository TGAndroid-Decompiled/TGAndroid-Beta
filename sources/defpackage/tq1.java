package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.ui.ActionBar.e;
public final class tq1 implements nc2 {
    public final zu1 a;

    public tq1(zu1 zu1Var) {
        this.a = zu1Var;
    }

    @Override
    public final void dismiss() {
        this.a.j0.U(null, null);
    }

    @Override
    public final void l() {
        zu1 zu1Var = this.a;
        zu1Var.Hc(true);
        d31.A(zu1Var, zu1Var.getMessagesController().p2(zu1Var.l6, zu1Var.c(), null), zu1Var.Ba).j();
    }

    @Override
    public final void m() {
        zu1 zu1Var = this.a;
        if (zu1Var.l6 != 0 && zu1Var.g4 != 3) {
            if (zu1Var.f != null) {
                zu1Var.getMessagesController().i4(zu1Var.f, true, false);
            }
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", zu1Var.l6);
            if (zu1Var.c() != 0) {
                bundle.putLong("topic_id", zu1Var.c());
            }
            zu1Var.presentFragment(new zu8(bundle, zu1Var.Ba));
        }
    }

    @Override
    public final void p() {
        int i;
        zu1 zu1Var = this.a;
        i = ((e) zu1Var).currentAccount;
        SharedPreferences sharedPreferences = uc7.s1(i).X3;
        boolean z = sharedPreferences.getBoolean("sound_enabled_" + ip7.p(zu1Var.l6, zu1Var.c(), false), true);
        boolean z2 = !z ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + ip7.p(zu1Var.l6, zu1Var.c(), false), z2).apply();
        if (d31.a(zu1Var)) {
            d31.S(z ? 1 : 0, zu1Var.getResourceProvider(), zu1Var).j();
        }
        zu1Var.yd(false);
    }

    @Override
    public final void q(int i) {
        zu1 zu1Var = this.a;
        if (i == 0) {
            if (zu1Var.getMessagesController().p2(zu1Var.l6, zu1Var.c(), null)) {
                zu1Var.Hc(true);
            }
            if (d31.a(zu1Var)) {
                d31.z(zu1Var, 4, i, zu1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        zu1Var.getNotificationsController().H(zu1Var.l6, i, zu1Var.c());
        if (d31.a(zu1Var)) {
            d31.z(zu1Var, 5, i, zu1Var.getResourceProvider()).j();
        }
    }

    @Override
    public final void i() {
    }
}
