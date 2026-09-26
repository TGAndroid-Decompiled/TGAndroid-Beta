package fi;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.l10;
import org.telegram.ui.s10;
public final class a0 implements s10 {
    public final k0 f9067a;

    public a0(k0 k0Var) {
        this.f9067a = k0Var;
    }

    @Override
    public final boolean c(l10 l10Var) {
        return false;
    }

    @Override
    public final void d(MessageObject messageObject) {
        int i10;
        k0 k0Var = this.f9067a;
        m2 m2Var = k0Var.f9112s;
        i10 = ((e3) k0Var).currentAccount;
        m2Var.presentFragment(mo0.K(messageObject, i10));
        k0Var.dismiss();
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void a() {
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
    }
}
