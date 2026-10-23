package org.telegram.messenger;

import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class fh implements Runnable {
    public final int f18380a;
    public final Object f18381b;

    public fh(Object obj, int i10) {
        this.f18380a = i10;
        this.f18381b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18380a) {
            case 0:
                ((NotificationsSettingsFacade) this.f18381b).lambda$applyDialogNotificationsSettings$0();
                return;
            case 1:
                ((CancellationSignal) this.f18381b).cancel();
                return;
            case 2:
                ((ProxyRotationController) this.f18381b).lambda$new$2();
                return;
            case 3:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f18381b).lambda$onRequestPushToken$1();
                return;
            case 4:
                ((RichMessageLayout.PreviewView) this.f18381b).lambda$onTouchEvent$0();
                return;
            case 5:
                ((RichMessageLayout.RichButtonRowBlock) this.f18381b).invalidate();
                return;
            case 6:
                ((RichMessageLayout.RichButtonSpan) this.f18381b).invalidate();
                return;
            case 7:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f18381b);
                return;
            case 8:
                ((RichMessageLayout.Text) this.f18381b).lambda$scheduleLongPress$2();
                return;
            case 9:
                ((SecretChatHelper) this.f18381b).lambda$startSecretChat$25();
                return;
            case 10:
                ((SendMessagesHelper) this.f18381b).lambda$new$0();
                return;
            case 11:
                ((MessagesStorage.StringCallback) this.f18381b).run(null);
                return;
            case 12:
                ((SendMessagesHelper.LocationProvider) this.f18381b).lambda$start$0();
                return;
            case 13:
                ((TelegramMediaSession) this.f18381b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f18381b).loadTranslatingDialogsCached();
                return;
        }
    }
}
