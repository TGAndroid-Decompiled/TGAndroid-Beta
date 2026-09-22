package org.telegram.messenger;

import android.os.Bundle;
import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class vg implements Runnable {
    public final int f17779a;
    public final Object f17780b;

    public vg(Object obj, int i10) {
        this.f17779a = i10;
        this.f17780b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17779a) {
            case 0:
                ((MusicPlayerService) this.f17780b).stopSelf();
                return;
            case 1:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.f17780b);
                return;
            case 2:
                ((NotificationsSettingsFacade) this.f17780b).lambda$applyDialogNotificationsSettings$0();
                return;
            case 3:
                ((CancellationSignal) this.f17780b).cancel();
                return;
            case 4:
                ((ProxyRotationController) this.f17780b).lambda$new$2();
                return;
            case 5:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f17780b).lambda$onRequestPushToken$1();
                return;
            case 6:
                ((RichMessageLayout.PreviewView) this.f17780b).lambda$onTouchEvent$0();
                return;
            case 7:
                ((RichMessageLayout.RichButtonRowBlock) this.f17780b).invalidate();
                return;
            case 8:
                ((RichMessageLayout.RichButtonSpan) this.f17780b).invalidate();
                return;
            case 9:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f17780b);
                return;
            case 10:
                ((RichMessageLayout.Text) this.f17780b).lambda$scheduleLongPress$2();
                return;
            case 11:
                ((SecretChatHelper) this.f17780b).lambda$startSecretChat$25();
                return;
            case 12:
                ((SendMessagesHelper) this.f17780b).lambda$new$0();
                return;
            case 13:
                ((MessagesStorage.StringCallback) this.f17780b).run(null);
                return;
            case 14:
                ((SendMessagesHelper.LocationProvider) this.f17780b).lambda$start$0();
                return;
            case 15:
                ((TelegramMediaSession) this.f17780b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f17780b).loadTranslatingDialogsCached();
                return;
        }
    }
}
