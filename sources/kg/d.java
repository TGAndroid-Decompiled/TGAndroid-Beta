package kg;

import android.content.SharedPreferences;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f17332a;
    public final e f17333b;

    public d(e eVar, int i7) {
        this.f17332a = i7;
        this.f17333b = eVar;
    }

    @Override
    public final void run() {
        int i7 = this.f17332a;
        e eVar = this.f17333b;
        switch (i7) {
            case 0:
                eVar.a();
                return;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i10 = eVar.f17341a;
                disablepeerconnectedbot.peer = qp.s1(i10).j1(eVar.f17348s);
                ConnectionsManager.getInstance(i10).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = qp.s1(i10).f24757d7.edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f17348s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f17348s);
                remove2.remove("dialog_botflags" + eVar.f17348s).apply();
                qs.f(i10).k(79, Long.valueOf(eVar.f17348s));
                f.a(i10).f17367f = false;
                return;
            default:
                vf.c.t(eVar.getContext(), eVar.f17351y);
                return;
        }
    }
}
