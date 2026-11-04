package lg;

import android.content.SharedPreferences;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f18263a;
    public final e f18264b;

    public d(e eVar, int i3) {
        this.f18263a = i3;
        this.f18264b = eVar;
    }

    @Override
    public final void run() {
        int i3 = this.f18263a;
        e eVar = this.f18264b;
        switch (i3) {
            case 0:
                eVar.a();
                return;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i10 = eVar.f18271a;
                disablepeerconnectedbot.peer = hp.s1(i10).j1(eVar.f18278s);
                ConnectionsManager.getInstance(i10).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = hp.s1(i10).f22989d7.edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f18278s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f18278s);
                remove2.remove("dialog_botflags" + eVar.f18278s).apply();
                hs.f(i10).k(79, Long.valueOf(eVar.f18278s));
                f.a(i10).f18294f = false;
                return;
            default:
                sf.c.t(eVar.getContext(), eVar.f18281y);
                return;
        }
    }
}
