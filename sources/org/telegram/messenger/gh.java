package org.telegram.messenger;

import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class gh implements Runnable {
    public final int f17966a;
    public final Object f17967b;

    public gh(Object obj, int i10) {
        this.f17966a = i10;
        this.f17967b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17966a) {
            case 0:
                ((NotificationsSettingsFacade) this.f17967b).lambda$applyDialogNotificationsSettings$0();
                return;
            case 1:
                ((CancellationSignal) this.f17967b).cancel();
                return;
            case 2:
                ((ProxyRotationController) this.f17967b).lambda$new$2();
                return;
            case 3:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f17967b).lambda$onRequestPushToken$1();
                return;
            case 4:
                ((RichMessageLayout.PreviewView) this.f17967b).lambda$onTouchEvent$0();
                return;
            case 5:
                ((RichMessageLayout.RichButtonRowBlock) this.f17967b).invalidate();
                return;
            case 6:
                ((RichMessageLayout.RichButtonSpan) this.f17967b).invalidate();
                return;
            case 7:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f17967b);
                return;
            case 8:
                ((RichMessageLayout.Text) this.f17967b).lambda$scheduleLongPress$2();
                return;
            case 9:
                ((SecretChatHelper) this.f17967b).lambda$startSecretChat$25();
                return;
            case 10:
                ((SendMessagesHelper) this.f17967b).lambda$new$0();
                return;
            case 11:
                ((MessagesStorage.StringCallback) this.f17967b).run(null);
                return;
            case 12:
                ((SendMessagesHelper.LocationProvider) this.f17967b).lambda$start$0();
                return;
            case 13:
                ((TelegramMediaSession) this.f17967b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f17967b).loadTranslatingDialogsCached();
                return;
        }
    }
}
