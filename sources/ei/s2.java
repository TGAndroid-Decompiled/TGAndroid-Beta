package ei;

import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationRepeat;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class s2 implements Runnable {
    public final int f9329a;
    public final int f9330b;

    public s2(int i10, int i11) {
        this.f9329a = i11;
        this.f9330b = i10;
    }

    @Override
    public final void run() {
        switch (this.f9329a) {
            case 0:
                MediaDataController.getInstance(this.f9330b).loadAttachMenuBots(false, true);
                return;
            case 1:
                MediaController.lambda$loadGalleryPhotosAlbums$57(this.f9330b);
                return;
            case 2:
                MediaController.lambda$checkGallery$1(this.f9330b);
                return;
            case 3:
                NotificationRepeat.a(this.f9330b);
                return;
            case 4:
                PushListenerController.lambda$processRemoteMessage$3(this.f9330b);
                return;
            case 5:
                PushListenerController.lambda$processRemoteMessage$4(this.f9330b);
                return;
            case 6:
                SharedConfig.lambda$checkLogsToDelete$3(this.f9330b);
                return;
            case 7:
                ConnectionsManager.lambda$onUpdate$13(this.f9330b);
                return;
            case 8:
                ConnectionsManager.lambda$onSessionCreated$14(this.f9330b);
                return;
            case 9:
                ConnectionsManager.lambda$onLogout$16(this.f9330b);
                return;
            case 10:
                MediaDataController.getInstance(this.f9330b).checkStickers(5);
                return;
            default:
                int i10 = this.f9330b;
                Pattern pattern = LaunchActivity.B1;
                ApplicationLoader.mainInterfacePausedStageQueue = true;
                ApplicationLoader.mainInterfacePausedStageQueueTime = 0L;
                if (VoIPService.getSharedInstance() == null) {
                    MessagesController.getInstance(i10).ignoreSetOnline = false;
                    return;
                }
                return;
        }
    }
}
