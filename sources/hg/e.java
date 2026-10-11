package hg;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class e implements Runnable {
    public final int f11201a;
    public final f f11202b;

    public e(f fVar, int i10) {
        this.f11201a = i10;
        this.f11202b = fVar;
    }

    @Override
    public final void run() {
        int i10 = this.f11201a;
        f fVar = this.f11202b;
        switch (i10) {
            case 0:
                fVar.a();
                return;
            case 1:
                fVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = fVar.f11216a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(fVar.f11223s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i11).edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + fVar.f11223s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + fVar.f11223s);
                remove2.remove("dialog_botflags" + fVar.f11223s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(fVar.f11223s));
                g.a(i11).f11240f = false;
                return;
            default:
                of.f.s(fVar.getContext(), fVar.f11225x);
                return;
        }
    }
}
