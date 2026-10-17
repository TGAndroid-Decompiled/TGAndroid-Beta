package ig;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f12864a;
    public final e f12865b;

    public d(e eVar, int i10) {
        this.f12864a = i10;
        this.f12865b = eVar;
    }

    @Override
    public final void run() {
        int i10 = this.f12864a;
        e eVar = this.f12865b;
        switch (i10) {
            case 0:
                eVar.a();
                return;
            case 1:
                eVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = eVar.f12877a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(eVar.f12883s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i11).edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f12883s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f12883s);
                remove2.remove("dialog_botflags" + eVar.f12883s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(eVar.f12883s));
                f.a(i11).f12894f = false;
                return;
            default:
                pf.d.r(eVar.getContext(), eVar.f12885x);
                return;
        }
    }
}
