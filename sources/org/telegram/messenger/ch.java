package org.telegram.messenger;

import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class ch implements Runnable {
    public final int f18103a;
    public final Object f18104b;

    public ch(Object obj, int i10) {
        this.f18103a = i10;
        this.f18104b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18103a) {
            case 0:
                ((NotificationsSettingsFacade) this.f18104b).lambda$applyDialogNotificationsSettings$0();
                return;
            case 1:
                ((CancellationSignal) this.f18104b).cancel();
                return;
            case 2:
                ((ProxyRotationController) this.f18104b).lambda$new$2();
                return;
            case 3:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f18104b).lambda$onRequestPushToken$1();
                return;
            case 4:
                ((RichMessageLayout.PreviewView) this.f18104b).lambda$onTouchEvent$0();
                return;
            case 5:
                ((RichMessageLayout.RichButtonRowBlock) this.f18104b).invalidate();
                return;
            case 6:
                ((RichMessageLayout.RichButtonSpan) this.f18104b).invalidate();
                return;
            case 7:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f18104b);
                return;
            case 8:
                ((RichMessageLayout.Text) this.f18104b).lambda$scheduleLongPress$2();
                return;
            case 9:
                ((SecretChatHelper) this.f18104b).lambda$startSecretChat$25();
                return;
            case 10:
                ((SendMessagesHelper) this.f18104b).lambda$new$0();
                return;
            case 11:
                ((MessagesStorage.StringCallback) this.f18104b).run(null);
                return;
            case 12:
                ((SendMessagesHelper.LocationProvider) this.f18104b).lambda$start$0();
                return;
            case 13:
                ((TelegramMediaSession) this.f18104b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f18104b).loadTranslatingDialogsCached();
                return;
        }
    }
}
