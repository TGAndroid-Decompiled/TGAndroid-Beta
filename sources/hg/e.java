package hg;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class e implements Runnable {
    public final int f11151a;
    public final f f11152b;

    public e(f fVar, int i10) {
        this.f11151a = i10;
        this.f11152b = fVar;
    }

    @Override
    public final void run() {
        int i10 = this.f11151a;
        f fVar = this.f11152b;
        switch (i10) {
            case 0:
                fVar.a();
                return;
            case 1:
                fVar.getClass();
                TL_account.disablePeerConnectedBot disablepeerconnectedbot = new TL_account.disablePeerConnectedBot();
                int i11 = fVar.f11171a;
                disablepeerconnectedbot.peer = MessagesController.getInstance(i11).getInputPeer(fVar.f11178s);
                ConnectionsManager.getInstance(i11).sendRequest(disablepeerconnectedbot, null);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i11).edit();
                SharedPreferences.Editor remove = edit.remove("dialog_botid" + fVar.f11178s);
                SharedPreferences.Editor remove2 = remove.remove("dialog_boturl" + fVar.f11178s);
                remove2.remove("dialog_botflags" + fVar.f11178s).apply();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(fVar.f11178s));
                g.a(i11).f11194f = false;
                return;
            default:
                nf.f.s(fVar.getContext(), fVar.f11180x);
                return;
        }
    }
}
