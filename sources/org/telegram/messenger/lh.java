package org.telegram.messenger;

import android.os.CancellationSignal;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class lh implements Runnable {
    public final int f20620a;
    public final Object f20621b;

    public lh(Object obj, int i10) {
        this.f20620a = i10;
        this.f20621b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20620a) {
            case 0:
                ((CancellationSignal) this.f20621b).cancel();
                return;
            case 1:
                ((ProxyRotationController) this.f20621b).lambda$new$2();
                return;
            case 2:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f20621b).lambda$onRequestPushToken$1();
                return;
            case 3:
                ((RichMessageLayout.PreviewView) this.f20621b).lambda$onTouchEvent$0();
                return;
            case 4:
                ((RichMessageLayout.RichButtonRowBlock) this.f20621b).invalidate();
                return;
            case 5:
                ((RichMessageLayout.RichButtonSpan) this.f20621b).invalidate();
                return;
            case 6:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f20621b);
                return;
            case 7:
                ((RichMessageLayout.Text) this.f20621b).lambda$scheduleLongPress$2();
                return;
            case 8:
                ((SecretChatHelper) this.f20621b).lambda$startSecretChat$25();
                return;
            case 9:
                ((SendMessagesHelper) this.f20621b).lambda$new$0();
                return;
            case 10:
                ((MessagesStorage.StringCallback) this.f20621b).run(null);
                return;
            case 11:
                ((SendMessagesHelper.LocationProvider) this.f20621b).lambda$start$0();
                return;
            case 12:
                ((TelegramMediaSession) this.f20621b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f20621b).loadTranslatingDialogsCached();
                return;
        }
    }
}
