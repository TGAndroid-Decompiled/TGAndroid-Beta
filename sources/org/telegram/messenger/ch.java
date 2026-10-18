package org.telegram.messenger;

import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class ch implements Runnable {
    public final int f18100a;
    public final Object f18101b;

    public ch(Object obj, int i10) {
        this.f18100a = i10;
        this.f18101b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18100a) {
            case 0:
                ((NotificationsSettingsFacade) this.f18101b).lambda$applyDialogNotificationsSettings$0();
                return;
            case 1:
                ((CancellationSignal) this.f18101b).cancel();
                return;
            case 2:
                ((ProxyRotationController) this.f18101b).lambda$new$2();
                return;
            case 3:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f18101b).lambda$onRequestPushToken$1();
                return;
            case 4:
                ((RichMessageLayout.PreviewView) this.f18101b).lambda$onTouchEvent$0();
                return;
            case 5:
                ((RichMessageLayout.RichButtonRowBlock) this.f18101b).invalidate();
                return;
            case 6:
                ((RichMessageLayout.RichButtonSpan) this.f18101b).invalidate();
                return;
            case 7:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f18101b);
                return;
            case 8:
                ((RichMessageLayout.Text) this.f18101b).lambda$scheduleLongPress$2();
                return;
            case 9:
                ((SecretChatHelper) this.f18101b).lambda$startSecretChat$25();
                return;
            case 10:
                ((SendMessagesHelper) this.f18101b).lambda$new$0();
                return;
            case 11:
                ((MessagesStorage.StringCallback) this.f18101b).run(null);
                return;
            case 12:
                ((SendMessagesHelper.LocationProvider) this.f18101b).lambda$start$0();
                return;
            case 13:
                ((TelegramMediaSession) this.f18101b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f18101b).loadTranslatingDialogsCached();
                return;
        }
    }
}
