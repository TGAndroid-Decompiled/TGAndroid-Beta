package jg;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class d implements Runnable {
    public final int f15662a;
    public final e f15663b;

    public d(e eVar, int i10) {
        this.f15662a = i10;
        this.f15663b = eVar;
    }

    @Override
    public final void run() {
        int i10 = this.f15662a;
        e eVar = this.f15663b;
        switch (i10) {
            case 0:
                eVar.a();
                return;
            case 1:
                eVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = eVar.f15678a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(eVar.f15684s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i11).edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + eVar.f15684s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + eVar.f15684s);
                remove2.remove("dialog_botflags" + eVar.f15684s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(eVar.f15684s));
                f.a(i11).f15696f = false;
                return;
            default:
                qf.d.r(eVar.getContext(), eVar.f15686x);
                return;
        }
    }
}
