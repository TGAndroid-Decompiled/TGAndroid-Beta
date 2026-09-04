package org.telegram.messenger;

import android.os.Bundle;
import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class vg implements Runnable {
    public final int f19247a;
    public final Object f19248b;

    public vg(Object obj, int i10) {
        this.f19247a = i10;
        this.f19248b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19247a) {
            case 0:
                ((MusicPlayerService) this.f19248b).stopSelf();
                return;
            case 1:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.f19248b);
                return;
            case 2:
                ((NotificationsSettingsFacade) this.f19248b).lambda$applyDialogNotificationsSettings$0();
                return;
            case 3:
                ((CancellationSignal) this.f19248b).cancel();
                return;
            case 4:
                ((ProxyRotationController) this.f19248b).lambda$new$2();
                return;
            case 5:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f19248b).lambda$onRequestPushToken$1();
                return;
            case 6:
                ((RichMessageLayout.PreviewView) this.f19248b).lambda$onTouchEvent$0();
                return;
            case 7:
                ((RichMessageLayout.RichButtonRowBlock) this.f19248b).invalidate();
                return;
            case 8:
                ((RichMessageLayout.RichButtonSpan) this.f19248b).invalidate();
                return;
            case 9:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f19248b);
                return;
            case 10:
                ((RichMessageLayout.Text) this.f19248b).lambda$scheduleLongPress$2();
                return;
            case 11:
                ((SecretChatHelper) this.f19248b).lambda$startSecretChat$25();
                return;
            case 12:
                ((SendMessagesHelper) this.f19248b).lambda$new$0();
                return;
            case 13:
                ((MessagesStorage.StringCallback) this.f19248b).run(null);
                return;
            case 14:
                ((SendMessagesHelper.LocationProvider) this.f19248b).lambda$start$0();
                return;
            case 15:
                ((TelegramMediaSession) this.f19248b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f19248b).loadTranslatingDialogsCached();
                return;
        }
    }
}
