package kg;

import android.content.SharedPreferences;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f18272a;
    public final e f18273b;

    public d(e eVar, int i7) {
        this.f18272a = i7;
        this.f18273b = eVar;
    }

    @Override
    public final void run() {
        int i7 = this.f18272a;
        e eVar = this.f18273b;
        switch (i7) {
            case 0:
                eVar.a();
                return;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i10 = eVar.f18285a;
                disablepeerconnectedbot.peer = np.u1(i10).l1(eVar.f18292s);
                ConnectionsManager.getInstance(i10).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = np.u1(i10).f25821g7.edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f18292s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f18292s);
                remove2.remove("dialog_botflags" + eVar.f18292s).apply();
                ls.f(i10).k(79, Long.valueOf(eVar.f18292s));
                f.a(i10).f18307f = false;
                return;
            default:
                vf.c.t(eVar.getContext(), eVar.f18295y);
                return;
        }
    }
}
