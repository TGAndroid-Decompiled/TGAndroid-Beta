package defpackage;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class v41 implements Runnable {
    public final byte a;
    public final w41 b;

    public v41(w41 w41Var, byte b) {
        this.a = b;
        this.b = w41Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        w41 w41Var = this.b;
        switch (b) {
            case 0:
                w41Var.a();
                return;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i = w41Var.a;
                disablepeerconnectedbot.peer = oc7.r1(i).i1(w41Var.s);
                ConnectionsManager.getInstance(i).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = oc7.r1(i).W3.edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + w41Var.s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + w41Var.s);
                remove2.remove("dialog_botflags" + w41Var.s).apply();
                nm7.f(i).k(80, Long.valueOf(w41Var.s));
                x41.a(i).f = false;
                return;
            default:
                l11.u(w41Var.getContext(), w41Var.y);
                return;
        }
    }
}
