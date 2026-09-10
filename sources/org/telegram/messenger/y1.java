package org.telegram.messenger;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SvgHelper;
public final class y1 implements Runnable {
    public final int f17021a;

    public y1(int i10) {
        this.f17021a = i10;
    }

    @Override
    public final void run() {
        switch (this.f17021a) {
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
                FileLog.dumpANR();
                return;
            case 4:
                ApplicationLoader.startPushService();
                return;
            case 5:
                ApplicationLoader.lambda$initPushServices$0();
                return;
            case 6:
                BotGuardHelper.a();
                return;
            case 7:
                CodeHighlighting.f();
                return;
            case 8:
                Emoji.lambda$static$0();
                return;
            case 9:
                KeepAliveJob.b();
                return;
            case 10:
                KeepAliveJob.a();
                return;
            case 11:
                LocaleController.lambda$applyLanguage$9();
                return;
            case 12:
                LocationController.lambda$setLastKnownLocation$10();
                return;
            case 13:
                LocationSharingService.lambda$onCreate$0();
                return;
            case 14:
                MediaDataController.lambda$cleanup$1();
                return;
            case 15:
                org.telegram.ui.ActionBar.j6.E(false);
                return;
            case 16:
                NotificationCenter.lambda$listen$3();
                return;
            case 17:
                NotificationsController.lambda$dismissNotification$37();
                return;
            case 18:
                SharedConfig.saveConfig();
                return;
            case 19:
                SharedConfig.lambda$checkSdCard$0();
                return;
            case 20:
                SharedConfig.lambda$checkSdCard$2();
                return;
            case 21:
                SharedConfig.lambda$checkSaveToGalleryFiles$5();
                return;
            default:
                SvgHelper.SvgDrawable.shiftRunnable = null;
                return;
        }
    }
}
