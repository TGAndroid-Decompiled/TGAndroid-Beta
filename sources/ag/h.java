package ag;

import android.content.SharedPreferences;
import org.telegram.messenger.at;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class h implements Runnable {
    public final int f537a;
    public final j f538b;

    public h(j jVar, int i10) {
        this.f537a = i10;
        this.f538b = jVar;
    }

    @Override
    public final void run() {
        int i10 = this.f537a;
        j jVar = this.f538b;
        switch (i10) {
            case 0:
                jVar.a();
                return;
            case 1:
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = jVar.f570a;
                disablepeerconnectedbot.peer = wp.r1(i11).i1(jVar.f576s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = wp.r1(i11).e7.edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + jVar.f576s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + jVar.f576s);
                remove2.remove("dialog_botflags" + jVar.f576s).apply();
                at.f(i11).k(79, Long.valueOf(jVar.f576s));
                k.a(i11).f597f = false;
                return;
            default:
                gf.f.r(jVar.getContext(), jVar.f579y);
                return;
        }
    }
}
