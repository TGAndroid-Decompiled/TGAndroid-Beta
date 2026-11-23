package kg;

import android.content.SharedPreferences;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f18315a;
    public final e f18316b;

    public d(e eVar, int i7) {
        this.f18315a = i7;
        this.f18316b = eVar;
    }

    @Override
    public final void run() {
        int i7 = this.f18315a;
        e eVar = this.f18316b;
        switch (i7) {
            case 0:
                eVar.a();
                return;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i10 = eVar.f18319a;
                disablepeerconnectedbot.peer = np.u1(i10).l1(eVar.f18326s);
                ConnectionsManager.getInstance(i10).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = np.u1(i10).f25857g7.edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f18326s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f18326s);
                remove2.remove("dialog_botflags" + eVar.f18326s).apply();
                ls.f(i10).k(79, Long.valueOf(eVar.f18326s));
                f.a(i10).f18345f = false;
                return;
            default:
                vf.c.t(eVar.getContext(), eVar.f18329y);
                return;
        }
    }
}
