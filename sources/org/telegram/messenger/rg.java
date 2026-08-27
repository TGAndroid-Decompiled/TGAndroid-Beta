package org.telegram.messenger;

import android.os.Bundle;
import android.os.CancellationSignal;
import java.io.FileNotFoundException;

public final class rg implements Runnable {

    public final int f21442a;

    public final Object f21443b;

    public rg(Object obj, int i10) {
        this.f21442a = i10;
        this.f21443b = obj;
    }

    @Override
    public final void run() throws FileNotFoundException {
        switch (this.f21442a) {
            case 0:
                ((MusicPlayerService) this.f21443b).stopSelf();
                break;
            case 1:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.f21443b);
                break;
            case 2:
                ((NotificationsSettingsFacade) this.f21443b).lambda$applyDialogNotificationsSettings$0();
                break;
            case 3:
                ((CancellationSignal) this.f21443b).cancel();
                break;
            case 4:
                ((ProxyRotationController) this.f21443b).lambda$new$2();
                break;
            case 5:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f21443b).lambda$onRequestPushToken$1();
                break;
            case 6:
                ((RichMessageLayout.PreviewView) this.f21443b).lambda$onTouchEvent$0();
                break;
            case 7:
                ((RichMessageLayout.RichButtonRowBlock) this.f21443b).invalidate();
                break;
            case 8:
                ((RichMessageLayout.RichButtonSpan) this.f21443b).invalidate();
                break;
            case 9:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f21443b);
                break;
            case 10:
                ((RichMessageLayout.Text) this.f21443b).lambda$scheduleLongPress$2();
                break;
            case 11:
                ((SecretChatHelper) this.f21443b).lambda$startSecretChat$25();
                break;
            case 12:
                ((SendMessagesHelper) this.f21443b).lambda$new$0();
                break;
            case 13:
                ((MessagesStorage.StringCallback) this.f21443b).run(null);
                break;
            case 14:
                ((SendMessagesHelper.LocationProvider) this.f21443b).lambda$start$0();
                break;
            case 15:
                ((TelegramMediaSession) this.f21443b).onAccountSwitched();
                break;
            default:
                ((TranslateController) this.f21443b).loadTranslatingDialogsCached();
                break;
        }
    }
}
