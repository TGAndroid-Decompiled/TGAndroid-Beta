package org.telegram.messenger;

import android.os.Bundle;
import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class ug implements Runnable {
    public final int f19344a;
    public final Object f19345b;

    public ug(Object obj, int i10) {
        this.f19344a = i10;
        this.f19345b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19344a) {
            case 0:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.f19345b);
                return;
            case 1:
                ((NotificationsSettingsFacade) this.f19345b).lambda$applyDialogNotificationsSettings$0();
                return;
            case 2:
                ((CancellationSignal) this.f19345b).cancel();
                return;
            case 3:
                ((ProxyRotationController) this.f19345b).lambda$new$2();
                return;
            case 4:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f19345b).lambda$onRequestPushToken$1();
                return;
            case 5:
                ((RichMessageLayout.PreviewView) this.f19345b).lambda$onTouchEvent$0();
                return;
            case 6:
                ((RichMessageLayout.RichButtonRowBlock) this.f19345b).invalidate();
                return;
            case 7:
                ((RichMessageLayout.RichButtonSpan) this.f19345b).invalidate();
                return;
            case 8:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f19345b);
                return;
            case 9:
                ((RichMessageLayout.Text) this.f19345b).lambda$scheduleLongPress$2();
                return;
            case 10:
                ((SecretChatHelper) this.f19345b).lambda$startSecretChat$25();
                return;
            case 11:
                ((SendMessagesHelper) this.f19345b).lambda$new$0();
                return;
            case 12:
                ((MessagesStorage.StringCallback) this.f19345b).run(null);
                return;
            case 13:
                ((SendMessagesHelper.LocationProvider) this.f19345b).lambda$start$0();
                return;
            case 14:
                ((TelegramMediaSession) this.f19345b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f19345b).loadTranslatingDialogsCached();
                return;
        }
    }
}
