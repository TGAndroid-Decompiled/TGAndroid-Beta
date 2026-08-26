package org.telegram.messenger;

import android.os.Bundle;
import android.os.CancellationSignal;
import java.io.FileNotFoundException;

public final class SecretChatHelper$$ExternalSyntheticLambda22 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public SecretChatHelper$$ExternalSyntheticLambda22(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() throws FileNotFoundException {
        switch (this.$r8$classId) {
            case 0:
                ((SecretChatHelper) this.f$0).lambda$startSecretChat$25();
                break;
            case 1:
                ((MusicPlayerService) this.f$0).stopSelf();
                break;
            case 2:
                NotificationBadge.HuaweiHomeBadger.lambda$executeBadge$0((Bundle) this.f$0);
                break;
            case 3:
                ((NotificationsSettingsFacade) this.f$0).lambda$applyDialogNotificationsSettings$0();
                break;
            case 4:
                ((CancellationSignal) this.f$0).cancel();
                break;
            case 5:
                ((ProxyRotationController) this.f$0).lambda$new$2();
                break;
            case 6:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f$0).lambda$onRequestPushToken$1();
                break;
            case 7:
                ((RichMessageLayout.PreviewView) this.f$0).lambda$onTouchEvent$0();
                break;
            case 8:
                ((RichMessageLayout.RichButtonRowBlock) this.f$0).invalidate();
                break;
            case 9:
                ((RichMessageLayout.RichButtonSpan) this.f$0).invalidate();
                break;
            case 10:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f$0);
                break;
            case 11:
                ((RichMessageLayout.Text) this.f$0).lambda$scheduleLongPress$2();
                break;
            case 12:
                ((SendMessagesHelper) this.f$0).lambda$new$0();
                break;
            case 13:
                ((MessagesStorage.StringCallback) this.f$0).run(null);
                break;
            case 14:
                ((SendMessagesHelper.LocationProvider) this.f$0).lambda$start$0();
                break;
            case 15:
                ((TelegramMediaSession) this.f$0).onAccountSwitched();
                break;
            default:
                ((TranslateController) this.f$0).loadTranslatingDialogsCached();
                break;
        }
    }
}
