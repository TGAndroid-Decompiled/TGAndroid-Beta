package org.telegram.messenger;

import android.os.Bundle;
import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class dh implements Runnable {
    public final int f15016a;
    public final Object f15017b;

    public dh(Object obj, int i10) {
        this.f15016a = i10;
        this.f15017b = obj;
    }

    @Override
    public final void run() {
        switch (this.f15016a) {
            case 0:
                ((MusicPlayerService) this.f15017b).stopSelf();
                return;
            case 1:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.f15017b);
                return;
            case 2:
                ((NotificationsSettingsFacade) this.f15017b).lambda$applyDialogNotificationsSettings$0();
                return;
            case 3:
                ((CancellationSignal) this.f15017b).cancel();
                return;
            case 4:
                ((ProxyRotationController) this.f15017b).lambda$new$2();
                return;
            case 5:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f15017b).lambda$onRequestPushToken$1();
                return;
            case 6:
                ((RichMessageLayout.PreviewView) this.f15017b).lambda$onTouchEvent$0();
                return;
            case 7:
                ((RichMessageLayout.RichButtonRowBlock) this.f15017b).invalidate();
                return;
            case 8:
                ((RichMessageLayout.RichButtonSpan) this.f15017b).invalidate();
                return;
            case 9:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f15017b);
                return;
            case 10:
                ((RichMessageLayout.Text) this.f15017b).lambda$scheduleLongPress$2();
                return;
            case 11:
                ((SecretChatHelper) this.f15017b).lambda$startSecretChat$25();
                return;
            case 12:
                ((SendMessagesHelper) this.f15017b).lambda$new$0();
                return;
            case 13:
                ((MessagesStorage.StringCallback) this.f15017b).run(null);
                return;
            case 14:
                ((SendMessagesHelper.LocationProvider) this.f15017b).lambda$start$0();
                return;
            case 15:
                ((TelegramMediaSession) this.f15017b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f15017b).loadTranslatingDialogsCached();
                return;
        }
    }
}
