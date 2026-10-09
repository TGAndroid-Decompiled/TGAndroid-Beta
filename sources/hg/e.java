package hg;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class e implements Runnable {
    public final int f11202a;
    public final f f11203b;

    public e(f fVar, int i10) {
        this.f11202a = i10;
        this.f11203b = fVar;
    }

    @Override
    public final void run() {
        int i10 = this.f11202a;
        f fVar = this.f11203b;
        switch (i10) {
            case 0:
                fVar.a();
                return;
            case 1:
                fVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = fVar.f11217a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(fVar.f11224s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i11).edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + fVar.f11224s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + fVar.f11224s);
                remove2.remove("dialog_botflags" + fVar.f11224s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(fVar.f11224s));
                g.a(i11).f11241f = false;
                return;
            default:
                of.f.s(fVar.getContext(), fVar.f11226x);
                return;
        }
    }
}
