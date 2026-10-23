package gi;

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
import org.telegram.ui.LaunchActivity;
public final class l2 implements Runnable {
    public final int f11343a;
    public final int f11344b;

    public l2(int i10, int i11) {
        this.f11343a = i11;
        this.f11344b = i10;
    }

    @Override
    public final void run() {
        switch (this.f11343a) {
            case 0:
                MediaDataController.getInstance(this.f11344b).loadAttachMenuBots(false, true);
                return;
            case 1:
                try {
                    MessagesStorage.getInstance(this.f11344b).getDatabase().executeFast("DELETE FROM search_recent WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 2:
                MediaController.lambda$loadGalleryPhotosAlbums$60(this.f11344b);
                return;
            case 3:
                MediaController.lambda$checkGallery$1(this.f11344b);
                return;
            case 4:
                NotificationRepeat.a(this.f11344b);
                return;
            case 5:
                PushListenerController.lambda$processRemoteMessage$3(this.f11344b);
                return;
            case 6:
                PushListenerController.lambda$processRemoteMessage$4(this.f11344b);
                return;
            case 7:
                SharedConfig.lambda$checkLogsToDelete$3(this.f11344b);
                return;
            case 8:
                ConnectionsManager.lambda$onUpdate$13(this.f11344b);
                return;
            case 9:
                ConnectionsManager.lambda$onSessionCreated$14(this.f11344b);
                return;
            case 10:
                ConnectionsManager.lambda$onLogout$16(this.f11344b);
                return;
            case 11:
                MediaDataController.getInstance(this.f11344b).checkStickers(5);
                return;
            default:
                int i10 = this.f11344b;
                Pattern pattern = LaunchActivity.E1;
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
