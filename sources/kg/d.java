package kg;

import android.content.SharedPreferences;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f18377a;
    public final e f18378b;

    public d(e eVar, int i7) {
        this.f18377a = i7;
        this.f18378b = eVar;
    }

    @Override
    public final void run() {
        int i7 = this.f18377a;
        e eVar = this.f18378b;
        switch (i7) {
            case 0:
                eVar.a();
                return;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i10 = eVar.f18381a;
                disablepeerconnectedbot.peer = mp.u1(i10).l1(eVar.f18388s);
                ConnectionsManager.getInstance(i10).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = mp.u1(i10).f25753g7.edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f18388s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f18388s);
                remove2.remove("dialog_botflags" + eVar.f18388s).apply();
                ks.f(i10).k(79, Long.valueOf(eVar.f18388s));
                f.a(i10).f18407f = false;
                return;
            default:
                vf.c.t(eVar.getContext(), eVar.f18391y);
                return;
        }
    }
}
