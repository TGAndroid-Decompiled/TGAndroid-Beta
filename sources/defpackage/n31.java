package defpackage;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class n31 implements Runnable {
    public final byte a;
    public final o31 b;

    public n31(o31 o31Var, byte b) {
        this.a = b;
        this.b = o31Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        o31 o31Var = this.b;
        switch (b) {
            case 0:
                o31Var.a();
                return;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i = o31Var.a;
                disablepeerconnectedbot.peer = na7.q1(i).h1(o31Var.s);
                ConnectionsManager.getInstance(i).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = na7.q1(i).W3.edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + o31Var.s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + o31Var.s);
                remove2.remove("dialog_botflags" + o31Var.s).apply();
                kk7.f(i).k(79, Long.valueOf(o31Var.s));
                p31.a(i).f = false;
                return;
            default:
                d01.t(o31Var.getContext(), o31Var.y);
                return;
        }
    }
}
