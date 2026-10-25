package jg;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f15663a;
    public final e f15664b;

    public d(e eVar, int i10) {
        this.f15663a = i10;
        this.f15664b = eVar;
    }

    @Override
    public final void run() {
        int i10 = this.f15663a;
        e eVar = this.f15664b;
        switch (i10) {
            case 0:
                eVar.a();
                return;
            case 1:
                eVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = eVar.f15679a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(eVar.f15685s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i11).edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f15685s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f15685s);
                remove2.remove("dialog_botflags" + eVar.f15685s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(eVar.f15685s));
                f.a(i11).f15697f = false;
                return;
            default:
                qf.d.r(eVar.getContext(), eVar.f15687x);
                return;
        }
    }
}
