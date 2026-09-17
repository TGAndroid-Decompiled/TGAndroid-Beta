package org.telegram.messenger;

import android.os.Bundle;
import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class ug implements Runnable {
    public final int f19200a;
    public final Object f19201b;

    public ug(Object obj, int i10) {
        this.f19200a = i10;
        this.f19201b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19200a) {
            case 0:
                ((MusicPlayerService) this.f19201b).stopSelf();
                return;
            case 1:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.f19201b);
                return;
            case 2:
                ((NotificationsSettingsFacade) this.f19201b).lambda$applyDialogNotificationsSettings$0();
                return;
            case 3:
                ((CancellationSignal) this.f19201b).cancel();
                return;
            case 4:
                ((ProxyRotationController) this.f19201b).lambda$new$2();
                return;
            case 5:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f19201b).lambda$onRequestPushToken$1();
                return;
            case 6:
                ((RichMessageLayout.PreviewView) this.f19201b).lambda$onTouchEvent$0();
                return;
            case 7:
                ((RichMessageLayout.RichButtonRowBlock) this.f19201b).invalidate();
                return;
            case 8:
                ((RichMessageLayout.RichButtonSpan) this.f19201b).invalidate();
                return;
            case 9:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f19201b);
                return;
            case 10:
                ((RichMessageLayout.Text) this.f19201b).lambda$scheduleLongPress$2();
                return;
            case 11:
                ((SecretChatHelper) this.f19201b).lambda$startSecretChat$25();
                return;
            case 12:
                ((SendMessagesHelper) this.f19201b).lambda$new$0();
                return;
            case 13:
                ((MessagesStorage.StringCallback) this.f19201b).run(null);
                return;
            case 14:
                ((SendMessagesHelper.LocationProvider) this.f19201b).lambda$start$0();
                return;
            case 15:
                ((TelegramMediaSession) this.f19201b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f19201b).loadTranslatingDialogsCached();
                return;
        }
    }
}
