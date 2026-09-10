package gg;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f8837a;
    public final e f8838b;

    public d(e eVar, int i10) {
        this.f8837a = i10;
        this.f8838b = eVar;
    }

    @Override
    public final void run() {
        int i10 = this.f8837a;
        e eVar = this.f8838b;
        switch (i10) {
            case 0:
                eVar.a();
                return;
            case 1:
                eVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = eVar.f8849a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(eVar.f8855s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i11).edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f8855s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f8855s);
                remove2.remove("dialog_botflags" + eVar.f8855s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(eVar.f8855s));
                f.a(i11).f8883f = false;
                return;
            default:
                nf.f.s(eVar.getContext(), eVar.f8857x);
                return;
        }
    }
}
