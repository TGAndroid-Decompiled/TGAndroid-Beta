package hg;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f11147a;
    public final e f11148b;

    public d(e eVar, int i10) {
        this.f11147a = i10;
        this.f11148b = eVar;
    }

    @Override
    public final void run() {
        int i10 = this.f11147a;
        e eVar = this.f11148b;
        switch (i10) {
            case 0:
                eVar.a();
                return;
            case 1:
                eVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = eVar.f11153a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(eVar.f11160s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i11).edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f11160s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f11160s);
                remove2.remove("dialog_botflags" + eVar.f11160s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(eVar.f11160s));
                f.a(i11).f11186f = false;
                return;
            default:
                nf.f.s(eVar.getContext(), eVar.f11162x);
                return;
        }
    }
}
