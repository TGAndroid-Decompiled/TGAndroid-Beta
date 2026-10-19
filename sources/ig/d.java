package ig;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f12851a;
    public final e f12852b;

    public d(e eVar, int i10) {
        this.f12851a = i10;
        this.f12852b = eVar;
    }

    @Override
    public final void run() {
        int i10 = this.f12851a;
        e eVar = this.f12852b;
        switch (i10) {
            case 0:
                eVar.a();
                return;
            case 1:
                eVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = eVar.f12869a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(eVar.f12875s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i11).edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f12875s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f12875s);
                remove2.remove("dialog_botflags" + eVar.f12875s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(eVar.f12875s));
                f.a(i11).f12888f = false;
                return;
            default:
                pf.d.r(eVar.getContext(), eVar.f12877x);
                return;
        }
    }
}
