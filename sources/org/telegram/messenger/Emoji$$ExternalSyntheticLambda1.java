package org.telegram.messenger;

import org.telegram.ui.ActionBar.Theme;

public final class Emoji$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;

    public Emoji$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                Emoji.lambda$static$0();
                break;
            case 1:
                ContactsController.MyContentObserver.lambda$new$0();
                break;
            case 2:
                MediaController.GalleryObserverExternal.lambda$onChange$0();
                break;
            case 3:
                AppStartReceiver.lambda$onReceive$0();
                break;
            case 4:
                FileLog.dumpANR();
                break;
            case 5:
                ApplicationLoader.startPushService();
                break;
            case 6:
                ApplicationLoader.lambda$initPushServices$0();
                break;
            case 7:
                BotGuardHelper.lambda$openGuardBotWebApp$1();
                break;
            case 8:
                CodeHighlighting.lambda$prepare$2();
                break;
            case 9:
                KeepAliveJob.finishJobInternal();
                break;
            case 10:
                KeepAliveJob.lambda$startJob$0();
                break;
            case 11:
                LocaleController.lambda$applyLanguage$9();
                break;
            case 12:
                LocationController.lambda$setLastKnownLocation$10();
                break;
            case 13:
                LocationSharingService.lambda$onCreate$0();
                break;
            case 14:
                MediaDataController.lambda$cleanup$1();
                break;
            case 15:
                Theme.checkAutoNightThemeConditions(false);
                break;
            case 16:
                NotificationCenter.lambda$listen$3();
                break;
            case 17:
                NotificationsController.lambda$dismissNotification$37();
                break;
            case 18:
                SharedConfig.saveConfig();
                break;
            case 19:
                SharedConfig.lambda$checkSdCard$0();
                break;
            case 20:
                SharedConfig.lambda$checkSdCard$2();
                break;
            case 21:
                SharedConfig.lambda$checkSaveToGalleryFiles$5();
                break;
            default:
                SvgHelper.SvgDrawable.shiftRunnable = null;
                break;
        }
    }
}
