package org.telegram.messenger;

import java.util.regex.Pattern;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class e6 implements Runnable {
    public final int f18541a;
    public final int f18542b;

    public e6(int i10, int i11) {
        this.f18541a = i11;
        this.f18542b = i10;
    }

    @Override
    public final void run() {
        switch (this.f18541a) {
            case 0:
                MediaController.lambda$loadGalleryPhotosAlbums$57(this.f18542b);
                return;
            case 1:
                MediaController.lambda$checkGallery$1(this.f18542b);
                return;
            case 2:
                NotificationRepeat.a(this.f18542b);
                return;
            case 3:
                PushListenerController.lambda$processRemoteMessage$3(this.f18542b);
                return;
            case 4:
                PushListenerController.lambda$processRemoteMessage$4(this.f18542b);
                return;
            case 5:
                SharedConfig.lambda$checkLogsToDelete$3(this.f18542b);
                return;
            case 6:
                ConnectionsManager.lambda$onUpdate$13(this.f18542b);
                return;
            case 7:
                ConnectionsManager.lambda$onSessionCreated$14(this.f18542b);
                return;
            case 8:
                ConnectionsManager.lambda$onLogout$16(this.f18542b);
                return;
            case 9:
                MediaDataController.getInstance(this.f18542b).checkStickers(5);
                return;
            case 10:
                int i10 = this.f18542b;
                Pattern pattern = LaunchActivity.f34134y1;
                ApplicationLoader.mainInterfacePausedStageQueue = true;
                ApplicationLoader.mainInterfacePausedStageQueueTime = 0L;
                if (VoIPService.getSharedInstance() == null) {
                    MessagesController.getInstance(i10).ignoreSetOnline = false;
                    return;
                }
                return;
            default:
                MediaDataController.getInstance(this.f18542b).loadAttachMenuBots(false, true);
                return;
        }
    }
}
