package org.telegram.messenger;

import android.os.Bundle;
import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class ug implements Runnable {
    public final int f17709a;
    public final Object f17710b;

    public ug(Object obj, int i10) {
        this.f17709a = i10;
        this.f17710b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17709a) {
            case 0:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.f17710b);
                return;
            case 1:
                ((NotificationsSettingsFacade) this.f17710b).lambda$applyDialogNotificationsSettings$0();
                return;
            case 2:
                ((CancellationSignal) this.f17710b).cancel();
                return;
            case 3:
                ((ProxyRotationController) this.f17710b).lambda$new$2();
                return;
            case 4:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f17710b).lambda$onRequestPushToken$1();
                return;
            case 5:
                ((RichMessageLayout.PreviewView) this.f17710b).lambda$onTouchEvent$0();
                return;
            case 6:
                ((RichMessageLayout.RichButtonRowBlock) this.f17710b).invalidate();
                return;
            case 7:
                ((RichMessageLayout.RichButtonSpan) this.f17710b).invalidate();
                return;
            case 8:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f17710b);
                return;
            case 9:
                ((RichMessageLayout.Text) this.f17710b).lambda$scheduleLongPress$2();
                return;
            case 10:
                ((SecretChatHelper) this.f17710b).lambda$startSecretChat$25();
                return;
            case 11:
                ((SendMessagesHelper) this.f17710b).lambda$new$0();
                return;
            case 12:
                ((MessagesStorage.StringCallback) this.f17710b).run(null);
                return;
            case 13:
                ((SendMessagesHelper.LocationProvider) this.f17710b).lambda$start$0();
                return;
            case 14:
                ((TelegramMediaSession) this.f17710b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f17710b).loadTranslatingDialogsCached();
                return;
        }
    }
}
