package org.telegram.messenger;

import android.os.Bundle;
import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class ug implements Runnable {
    public final int f17699a;
    public final Object f17700b;

    public ug(Object obj, int i10) {
        this.f17699a = i10;
        this.f17700b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17699a) {
            case 0:
                ((MusicPlayerService) this.f17700b).stopSelf();
                return;
            case 1:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.f17700b);
                return;
            case 2:
                ((NotificationsSettingsFacade) this.f17700b).lambda$applyDialogNotificationsSettings$0();
                return;
            case 3:
                ((CancellationSignal) this.f17700b).cancel();
                return;
            case 4:
                ((ProxyRotationController) this.f17700b).lambda$new$2();
                return;
            case 5:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f17700b).lambda$onRequestPushToken$1();
                return;
            case 6:
                ((RichMessageLayout.PreviewView) this.f17700b).lambda$onTouchEvent$0();
                return;
            case 7:
                ((RichMessageLayout.RichButtonRowBlock) this.f17700b).invalidate();
                return;
            case 8:
                ((RichMessageLayout.RichButtonSpan) this.f17700b).invalidate();
                return;
            case 9:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f17700b);
                return;
            case 10:
                ((RichMessageLayout.Text) this.f17700b).lambda$scheduleLongPress$2();
                return;
            case 11:
                ((SecretChatHelper) this.f17700b).lambda$startSecretChat$25();
                return;
            case 12:
                ((SendMessagesHelper) this.f17700b).lambda$new$0();
                return;
            case 13:
                ((MessagesStorage.StringCallback) this.f17700b).run(null);
                return;
            case 14:
                ((SendMessagesHelper.LocationProvider) this.f17700b).lambda$start$0();
                return;
            case 15:
                ((TelegramMediaSession) this.f17700b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f17700b).loadTranslatingDialogsCached();
                return;
        }
    }
}
