package org.telegram.messenger;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SvgHelper;
public final class w1 implements Runnable {
    public final int f19652a;

    public w1(int i10) {
        this.f19652a = i10;
    }

    @Override
    public final void run() {
        switch (this.f19652a) {
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
                Emoji.lambda$static$0();
                return;
            case 10:
                KeepAliveJob.b();
                return;
            case 11:
                KeepAliveJob.a();
                return;
            case 12:
                LocaleController.lambda$applyLanguage$9();
                return;
            case 13:
                LocationController.lambda$setLastKnownLocation$10();
                return;
            case 14:
                LocationSharingService.lambda$onCreate$0();
                return;
            case 15:
                MediaDataController.lambda$cleanup$1();
                return;
            case 16:
                org.telegram.ui.ActionBar.h6.E(false);
                return;
            case 17:
                NotificationCenter.lambda$listen$3();
                return;
            case 18:
                NotificationsController.lambda$dismissNotification$38();
                return;
            case 19:
                SharedConfig.saveConfig();
                return;
            case 20:
                SharedConfig.lambda$checkSdCard$0();
                return;
            case 21:
                SharedConfig.lambda$checkSdCard$2();
                return;
            case 22:
                SharedConfig.lambda$checkSaveToGalleryFiles$5();
                return;
            default:
                SvgHelper.SvgDrawable.shiftRunnable = null;
                return;
        }
    }
}
