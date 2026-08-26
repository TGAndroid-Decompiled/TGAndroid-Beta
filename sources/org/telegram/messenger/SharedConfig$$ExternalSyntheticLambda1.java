package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.SuggestEmojiView;

public final class SharedConfig$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final int f$0;

    public SharedConfig$$ExternalSyntheticLambda1(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SharedConfig.lambda$checkLogsToDelete$3(this.f$0);
                break;
            case 1:
                MediaController.lambda$loadGalleryPhotosAlbums$57(this.f$0);
                break;
            case 2:
                MediaController.lambda$checkGallery$1(this.f$0);
                break;
            case 3:
                NotificationRepeat.lambda$onHandleIntent$0(this.f$0);
                break;
            case 4:
                PushListenerController.lambda$processRemoteMessage$4(this.f$0);
                break;
            case 5:
                PushListenerController.lambda$processRemoteMessage$3(this.f$0);
                break;
            case 6:
                ConnectionsManager.lambda$onUpdate$13(this.f$0);
                break;
            case 7:
                ConnectionsManager.lambda$onSessionCreated$14(this.f$0);
                break;
            case 8:
                ConnectionsManager.lambda$onLogout$16(this.f$0);
                break;
            case 9:
                SuggestEmojiView.lambda$new$0(this.f$0);
                break;
            default:
                MediaDataController.getInstance(this.f$0).loadAttachMenuBots(false, true);
                break;
        }
    }
}
