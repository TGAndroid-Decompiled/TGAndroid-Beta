package org.telegram.messenger;

import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class hh implements Runnable {
    public final int f20265a;
    public final Object f20266b;

    public hh(Object obj, int i10) {
        this.f20265a = i10;
        this.f20266b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20265a) {
            case 0:
                ((NotificationsSettingsFacade) this.f20266b).lambda$applyDialogNotificationsSettings$0();
                return;
            case 1:
                ((CancellationSignal) this.f20266b).cancel();
                return;
            case 2:
                ((ProxyRotationController) this.f20266b).lambda$new$2();
                return;
            case 3:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f20266b).lambda$onRequestPushToken$1();
                return;
            case 4:
                ((RichMessageLayout.PreviewView) this.f20266b).lambda$onTouchEvent$0();
                return;
            case 5:
                ((RichMessageLayout.RichButtonRowBlock) this.f20266b).invalidate();
                return;
            case 6:
                ((RichMessageLayout.RichButtonSpan) this.f20266b).invalidate();
                return;
            case 7:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f20266b);
                return;
            case 8:
                ((RichMessageLayout.Text) this.f20266b).lambda$scheduleLongPress$2();
                return;
            case 9:
                ((SecretChatHelper) this.f20266b).lambda$startSecretChat$25();
                return;
            case 10:
                ((SendMessagesHelper) this.f20266b).lambda$new$0();
                return;
            case 11:
                ((MessagesStorage.StringCallback) this.f20266b).run(null);
                return;
            case 12:
                ((SendMessagesHelper.LocationProvider) this.f20266b).lambda$start$0();
                return;
            case 13:
                ((TelegramMediaSession) this.f20266b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f20266b).loadTranslatingDialogsCached();
                return;
        }
    }
}
