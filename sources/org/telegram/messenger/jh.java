package org.telegram.messenger;

import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class jh implements Runnable {
    public final int f17607a;
    public final Object f17608b;

    public jh(Object obj, int i10) {
        this.f17607a = i10;
        this.f17608b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17607a) {
            case 0:
                ((NotificationsSettingsFacade) this.f17608b).lambda$applyDialogNotificationsSettings$0();
                return;
            case 1:
                ((CancellationSignal) this.f17608b).cancel();
                return;
            case 2:
                ((ProxyRotationController) this.f17608b).lambda$new$2();
                return;
            case 3:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f17608b).lambda$onRequestPushToken$1();
                return;
            case 4:
                ((RichMessageLayout.PreviewView) this.f17608b).lambda$onTouchEvent$0();
                return;
            case 5:
                ((RichMessageLayout.RichButtonRowBlock) this.f17608b).invalidate();
                return;
            case 6:
                ((RichMessageLayout.RichButtonSpan) this.f17608b).invalidate();
                return;
            case 7:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f17608b);
                return;
            case 8:
                ((RichMessageLayout.Text) this.f17608b).lambda$scheduleLongPress$2();
                return;
            case 9:
                ((SecretChatHelper) this.f17608b).lambda$startSecretChat$25();
                return;
            case 10:
                ((SendMessagesHelper) this.f17608b).lambda$new$0();
                return;
            case 11:
                ((MessagesStorage.StringCallback) this.f17608b).run(null);
                return;
            case 12:
                ((SendMessagesHelper.LocationProvider) this.f17608b).lambda$start$0();
                return;
            case 13:
                ((TelegramMediaSession) this.f17608b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f17608b).loadTranslatingDialogsCached();
                return;
        }
    }
}
