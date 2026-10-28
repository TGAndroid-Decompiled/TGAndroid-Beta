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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.jb1;
import org.telegram.ui.Components.nb1;
import org.telegram.ui.LaunchActivity;
public final class t2 implements Runnable {
    public final int f13285a;
    public final int f13286b;

    public t2(int i10, int i11) {
        this.f13285a = i11;
        this.f13286b = i10;
    }

    @Override
    public final void run() {
        nb1 nb1Var;
        switch (this.f13285a) {
            case 0:
                MediaDataController.getInstance(this.f13286b).loadAttachMenuBots(false, true);
                return;
            case 1:
                try {
                    MessagesStorage.getInstance(this.f13286b).getDatabase().executeFast("DELETE FROM search_recent WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 2:
                MediaController.lambda$loadGalleryPhotosAlbums$60(this.f13286b);
                return;
            case 3:
                MediaController.lambda$checkGallery$1(this.f13286b);
                return;
            case 4:
                NotificationRepeat.a(this.f13286b);
                return;
            case 5:
                PushListenerController.lambda$processRemoteMessage$3(this.f13286b);
                return;
            case 6:
                PushListenerController.lambda$processRemoteMessage$4(this.f13286b);
                return;
            case 7:
                SharedConfig.lambda$checkLogsToDelete$3(this.f13286b);
                return;
            case 8:
                ConnectionsManager.lambda$onUpdate$13(this.f13286b);
                return;
            case 9:
                ConnectionsManager.lambda$onSessionCreated$14(this.f13286b);
                return;
            case 10:
                ConnectionsManager.lambda$onLogout$16(this.f13286b);
                return;
            case 11:
                MediaDataController.getInstance(this.f13286b).checkStickers(5);
                return;
            case 12:
                int i10 = this.f13286b;
                Set keySet = jb1.f29625b.keySet();
                jb1.t(i10 + "/", keySet);
                for (gb1 gb1Var : jb1.f29624a.values()) {
                    if (gb1Var.f28512b == i10 && gb1Var.f28528u.isEmpty() && (nb1Var = gb1Var.f28526s) != null) {
                        nb1Var.r();
                        nb1Var.f30842g = null;
                        nb1Var.f30843i = 0;
                        nb1Var.f30845k = 0;
                        nb1Var.f30846l = false;
                    }
                }
                return;
            case 13:
                String m10 = a1.g.m(this.f13286b, "/");
                jb1.t(m10, jb1.f29625b.keySet());
                jb1.t(m10, jb1.f29626c.keySet());
                jb1.t(m10, jb1.d.keySet());
                return;
            default:
                int i11 = this.f13286b;
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
