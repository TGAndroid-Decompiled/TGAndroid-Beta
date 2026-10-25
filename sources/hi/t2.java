package hi;

import java.util.Set;
import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationRepeat;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.db1;
import org.telegram.ui.Components.fb1;
import org.telegram.ui.Components.jb1;
import org.telegram.ui.LaunchActivity;
public final class t2 implements Runnable {
    public final int f13286a;
    public final int f13287b;

    public t2(int i10, int i11) {
        this.f13286a = i11;
        this.f13287b = i10;
    }

    @Override
    public final void run() {
        jb1 jb1Var;
        switch (this.f13286a) {
            case 0:
                MediaDataController.getInstance(this.f13287b).loadAttachMenuBots(false, true);
                return;
            case 1:
                try {
                    MessagesStorage.getInstance(this.f13287b).getDatabase().executeFast("DELETE FROM search_recent WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 2:
                MediaController.lambda$loadGalleryPhotosAlbums$60(this.f13287b);
                return;
            case 3:
                MediaController.lambda$checkGallery$1(this.f13287b);
                return;
            case 4:
                NotificationRepeat.a(this.f13287b);
                return;
            case 5:
                PushListenerController.lambda$processRemoteMessage$3(this.f13287b);
                return;
            case 6:
                PushListenerController.lambda$processRemoteMessage$4(this.f13287b);
                return;
            case 7:
                SharedConfig.lambda$checkLogsToDelete$3(this.f13287b);
                return;
            case 8:
                ConnectionsManager.lambda$onUpdate$13(this.f13287b);
                return;
            case 9:
                ConnectionsManager.lambda$onSessionCreated$14(this.f13287b);
                return;
            case 10:
                ConnectionsManager.lambda$onLogout$16(this.f13287b);
                return;
            case 11:
                MediaDataController.getInstance(this.f13287b).checkStickers(5);
                return;
            case 12:
                int i10 = this.f13287b;
                Set keySet = fb1.f28144b.keySet();
                fb1.n(i10 + "/", keySet);
                for (db1 db1Var : fb1.f28143a.values()) {
                    if (db1Var.f27486b == i10 && db1Var.f27492k.isEmpty() && (jb1Var = db1Var.f27490i) != null) {
                        jb1Var.m();
                        jb1Var.f29586g = null;
                        jb1Var.f29587i = 0;
                        jb1Var.f29589k = 0;
                        jb1Var.f29590l = false;
                    }
                }
                return;
            case 13:
                String m10 = a1.g.m(this.f13287b, "/");
                fb1.n(m10, fb1.f28144b.keySet());
                fb1.n(m10, fb1.f28145c.keySet());
                fb1.n(m10, fb1.d.keySet());
                return;
            default:
                int i11 = this.f13287b;
                Pattern pattern = LaunchActivity.D1;
                ApplicationLoader.mainInterfacePausedStageQueue = true;
                ApplicationLoader.mainInterfacePausedStageQueueTime = 0L;
                if (VoIPService.getSharedInstance() == null) {
                    MessagesController.getInstance(i11).ignoreSetOnline = false;
                    return;
                }
                return;
        }
    }
}
