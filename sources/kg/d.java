package kg;

import android.content.SharedPreferences;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f18273a;
    public final e f18274b;

    public d(e eVar, int i7) {
        this.f18273a = i7;
        this.f18274b = eVar;
    }

    @Override
    public final void run() {
        int i7 = this.f18273a;
        e eVar = this.f18274b;
        switch (i7) {
            case 0:
                eVar.a();
                return;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i10 = eVar.f18290a;
                disablepeerconnectedbot.peer = mp.u1(i10).l1(eVar.f18297s);
                ConnectionsManager.getInstance(i10).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = mp.u1(i10).f25660g7.edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f18297s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f18297s);
                remove2.remove("dialog_botflags" + eVar.f18297s).apply();
                ks.f(i10).k(79, Long.valueOf(eVar.f18297s));
                f.a(i10).f18311f = false;
                return;
            default:
                vf.c.t(eVar.getContext(), eVar.f18300y);
                return;
        }
    }
}
