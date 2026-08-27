package nh;

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

public final class k2 implements Runnable {

    public final int f18788a;

    public final int f18789b;

    public k2(int i10, int i11) {
        this.f18788a = i11;
        this.f18789b = i10;
    }

    @Override
    public final void run() {
        switch (this.f18788a) {
            case 0:
                MediaDataController.getInstance(this.f18789b).loadAttachMenuBots(false, true);
                break;
            case 1:
                MediaController.lambda$loadGalleryPhotosAlbums$57(this.f18789b);
                break;
            case 2:
                MediaController.lambda$checkGallery$1(this.f18789b);
                break;
            case 3:
                NotificationRepeat.lambda$onHandleIntent$0(this.f18789b);
                break;
            case 4:
                PushListenerController.lambda$processRemoteMessage$3(this.f18789b);
                break;
            case 5:
                PushListenerController.lambda$processRemoteMessage$4(this.f18789b);
                break;
            case 6:
                SharedConfig.lambda$checkLogsToDelete$3(this.f18789b);
                break;
            case 7:
                ConnectionsManager.lambda$onUpdate$13(this.f18789b);
                break;
            case 8:
                ConnectionsManager.lambda$onSessionCreated$14(this.f18789b);
                break;
            case 9:
                ConnectionsManager.lambda$onLogout$16(this.f18789b);
                break;
            case 10:
                MediaDataController.getInstance(this.f18789b).checkStickers(5);
                break;
            default:
                int i10 = this.f18789b;
                Pattern pattern = LaunchActivity.f35496x1;
                ApplicationLoader.mainInterfacePausedStageQueue = true;
                ApplicationLoader.mainInterfacePausedStageQueueTime = 0L;
                if (VoIPService.getSharedInstance() == null) {
                    MessagesController.getInstance(i10).ignoreSetOnline = false;
                }
                break;
        }
    }
}
