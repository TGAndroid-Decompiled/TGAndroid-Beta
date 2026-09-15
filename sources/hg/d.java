package hg;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f10245a;
    public final e f10246b;

    public d(e eVar, int i10) {
        this.f10245a = i10;
        this.f10246b = eVar;
    }

    @Override
    public final void run() {
        int i10 = this.f10245a;
        e eVar = this.f10246b;
        switch (i10) {
            case 0:
                eVar.a();
                return;
            case 1:
                eVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = eVar.f10251a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(eVar.f10257s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i11).edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f10257s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f10257s);
                remove2.remove("dialog_botflags" + eVar.f10257s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(eVar.f10257s));
                f.a(i11).f10280f = false;
                return;
            default:
                nf.f.s(eVar.getContext(), eVar.f10259x);
                return;
        }
    }
}
