package org.telegram.messenger;

import android.os.Bundle;
import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class xg implements Runnable {
    public final int f20645a;
    public final Object f20646b;

    public xg(Object obj, int i10) {
        this.f20645a = i10;
        this.f20646b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20645a) {
            case 0:
                ((MusicPlayerService) this.f20646b).stopSelf();
                return;
            case 1:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.f20646b);
                return;
            case 2:
                ((NotificationsSettingsFacade) this.f20646b).lambda$applyDialogNotificationsSettings$0();
                return;
            case 3:
                ((CancellationSignal) this.f20646b).cancel();
                return;
            case 4:
                ((ProxyRotationController) this.f20646b).lambda$new$2();
                return;
            case 5:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f20646b).lambda$onRequestPushToken$1();
                return;
            case 6:
                ((RichMessageLayout.PreviewView) this.f20646b).lambda$onTouchEvent$0();
                return;
            case 7:
                ((RichMessageLayout.RichButtonRowBlock) this.f20646b).invalidate();
                return;
            case 8:
                ((RichMessageLayout.RichButtonSpan) this.f20646b).invalidate();
                return;
            case 9:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f20646b);
                return;
            case 10:
                ((RichMessageLayout.Text) this.f20646b).lambda$scheduleLongPress$2();
                return;
            case 11:
                ((SecretChatHelper) this.f20646b).lambda$startSecretChat$25();
                return;
            case 12:
                ((SendMessagesHelper) this.f20646b).lambda$new$0();
                return;
            case 13:
                ((MessagesStorage.StringCallback) this.f20646b).run(null);
                return;
            case 14:
                ((SendMessagesHelper.LocationProvider) this.f20646b).lambda$start$0();
                return;
            case 15:
                ((TelegramMediaSession) this.f20646b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f20646b).loadTranslatingDialogsCached();
                return;
        }
    }
}
