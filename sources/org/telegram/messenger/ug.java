package org.telegram.messenger;

import android.os.Bundle;
import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class ug implements Runnable {
    public final int f17710a;
    public final Object f17711b;

    public ug(Object obj, int i10) {
        this.f17710a = i10;
        this.f17711b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17710a) {
            case 0:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.f17711b);
                return;
            case 1:
                ((NotificationsSettingsFacade) this.f17711b).lambda$applyDialogNotificationsSettings$0();
                return;
            case 2:
                ((CancellationSignal) this.f17711b).cancel();
                return;
            case 3:
                ((ProxyRotationController) this.f17711b).lambda$new$2();
                return;
            case 4:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f17711b).lambda$onRequestPushToken$1();
                return;
            case 5:
                ((RichMessageLayout.PreviewView) this.f17711b).lambda$onTouchEvent$0();
                return;
            case 6:
                ((RichMessageLayout.RichButtonRowBlock) this.f17711b).invalidate();
                return;
            case 7:
                ((RichMessageLayout.RichButtonSpan) this.f17711b).invalidate();
                return;
            case 8:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f17711b);
                return;
            case 9:
                ((RichMessageLayout.Text) this.f17711b).lambda$scheduleLongPress$2();
                return;
            case 10:
                ((SecretChatHelper) this.f17711b).lambda$startSecretChat$25();
                return;
            case 11:
                ((SendMessagesHelper) this.f17711b).lambda$new$0();
                return;
            case 12:
                ((MessagesStorage.StringCallback) this.f17711b).run(null);
                return;
            case 13:
                ((SendMessagesHelper.LocationProvider) this.f17711b).lambda$start$0();
                return;
            case 14:
                ((TelegramMediaSession) this.f17711b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f17711b).loadTranslatingDialogsCached();
                return;
        }
    }
}
