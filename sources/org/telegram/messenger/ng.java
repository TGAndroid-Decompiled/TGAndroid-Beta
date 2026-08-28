package org.telegram.messenger;

import android.os.Bundle;
import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class ng implements Runnable {
    public final int f21061a;
    public final Object f21062b;

    public ng(Object obj, int i9) {
        this.f21061a = i9;
        this.f21062b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21061a) {
            case 0:
                ((MusicPlayerService) this.f21062b).stopSelf();
                return;
            case 1:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.f21062b);
                return;
            case 2:
                ((NotificationsSettingsFacade) this.f21062b).lambda$applyDialogNotificationsSettings$0();
                return;
            case 3:
                ((CancellationSignal) this.f21062b).cancel();
                return;
            case 4:
                ((ProxyRotationController) this.f21062b).lambda$new$2();
                return;
            case 5:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f21062b).lambda$onRequestPushToken$1();
                return;
            case 6:
                ((RichMessageLayout.PreviewView) this.f21062b).lambda$onTouchEvent$0();
                return;
            case 7:
                ((RichMessageLayout.RichButtonRowBlock) this.f21062b).invalidate();
                return;
            case 8:
                ((RichMessageLayout.RichButtonSpan) this.f21062b).invalidate();
                return;
            case 9:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f21062b);
                return;
            case 10:
                ((RichMessageLayout.Text) this.f21062b).lambda$scheduleLongPress$2();
                return;
            case 11:
                ((SecretChatHelper) this.f21062b).lambda$startSecretChat$25();
                return;
            case 12:
                ((SendMessagesHelper) this.f21062b).lambda$new$0();
                return;
            case 13:
                ((MessagesStorage.StringCallback) this.f21062b).run(null);
                return;
            case 14:
                ((SendMessagesHelper.LocationProvider) this.f21062b).lambda$start$0();
                return;
            case 15:
                ((TelegramMediaSession) this.f21062b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f21062b).loadTranslatingDialogsCached();
                return;
        }
    }
}
