package hg;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class e implements Runnable {
    public final int f10254a;
    public final f f10255b;

    public e(f fVar, int i10) {
        this.f10254a = i10;
        this.f10255b = fVar;
    }

    @Override
    public final void run() {
        int i10 = this.f10254a;
        f fVar = this.f10255b;
        switch (i10) {
            case 0:
                fVar.a();
                return;
            case 1:
                fVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = fVar.f10260a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(fVar.f10266s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i11).edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + fVar.f10266s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + fVar.f10266s);
                remove2.remove("dialog_botflags" + fVar.f10266s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(fVar.f10266s));
                g.a(i11).f10290f = false;
                return;
            default:
                nf.f.s(fVar.getContext(), fVar.f10268x);
                return;
        }
    }
}
