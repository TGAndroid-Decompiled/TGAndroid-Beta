package kg;

import android.content.SharedPreferences;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f17894a;
    public final e f17895b;

    public d(e eVar, int i7) {
        this.f17894a = i7;
        this.f17895b = eVar;
    }

    @Override
    public final void run() {
        int i7 = this.f17894a;
        e eVar = this.f17895b;
        switch (i7) {
            case 0:
                eVar.a();
                return;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i10 = eVar.f17903a;
                disablepeerconnectedbot.peer = np.s1(i10).j1(eVar.f17910s);
                ConnectionsManager.getInstance(i10).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = np.s1(i10).f25273e7.edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f17910s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f17910s);
                remove2.remove("dialog_botflags" + eVar.f17910s).apply();
                ns.f(i10).k(79, Long.valueOf(eVar.f17910s));
                f.a(i10).f17929f = false;
                return;
            default:
                vf.c.t(eVar.getContext(), eVar.f17913y);
                return;
        }
    }
}
