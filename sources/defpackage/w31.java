package defpackage;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class w31 implements Runnable {
    public final byte a;
    public final x31 b;

    public w31(x31 x31Var, byte b) {
        this.a = b;
        this.b = x31Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        x31 x31Var = this.b;
        switch (b) {
            case 0:
                x31Var.b();
                return;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i = x31Var.a;
                disablepeerconnectedbot.peer = uc7.s1(i).j1(x31Var.s);
                ConnectionsManager.getInstance(i).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = uc7.s1(i).W3.edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + x31Var.s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + x31Var.s);
                remove2.remove("dialog_botflags" + x31Var.s).apply();
                jn7.f(i).k(80, Long.valueOf(x31Var.s));
                y31.a(i).f = false;
                return;
            default:
                m01.u(x31Var.getContext(), x31Var.y);
                return;
        }
    }
}
