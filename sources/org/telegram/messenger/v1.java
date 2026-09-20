package org.telegram.messenger;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SvgHelper;
public final class v1 implements Runnable {
    public final int f17717a;

    public v1(int i10) {
        this.f17717a = i10;
    }

    @Override
    public final void run() {
        switch (this.f17717a) {
            case 0:
                ContactsController.MyContentObserver.lambda$new$0();
                return;
            case 1:
                MediaController.GalleryObserverExternal.lambda$onChange$0();
                return;
            case 2:
                AppStartReceiver.a();
                return;
            case 3:
                ApplicationLoader.lambda$new$1();
                return;
            case 4:
                NotificationCenter.sanitize();
                return;
            case 5:
                FileLog.dumpANR();
                return;
            case 6:
                ApplicationLoader.startPushService();
                return;
            case 7:
                ApplicationLoader.lambda$initPushServices$2();
                return;
            case 8:
                BotGuardHelper.a();
                return;
            case 9:
                CodeHighlighting.lambda$prepare$2();
                return;
            case 10:
                Emoji.lambda$static$0();
                return;
            case 11:
                KeepAliveJob.b();
                return;
            case 12:
                KeepAliveJob.a();
                return;
            case 13:
                LocaleController.lambda$applyLanguage$9();
                return;
            case 14:
                LocationController.lambda$setLastKnownLocation$10();
                return;
            case 15:
                LocationSharingService.lambda$onCreate$0();
                return;
            case 16:
                MediaDataController.lambda$cleanup$1();
                return;
            case 17:
                org.telegram.ui.ActionBar.j6.E(false);
                return;
            case 18:
                NotificationCenter.lambda$listen$3();
                return;
            case 19:
                NotificationsController.lambda$dismissNotification$37();
                return;
            case 20:
                SharedConfig.saveConfig();
                return;
            case 21:
                SharedConfig.lambda$checkSdCard$0();
                return;
            case 22:
                SharedConfig.lambda$checkSdCard$2();
                return;
            case 23:
                SharedConfig.lambda$checkSaveToGalleryFiles$5();
                return;
            default:
                SvgHelper.SvgDrawable.shiftRunnable = null;
                return;
        }
    }
}
