package org.telegram.messenger;

import android.os.CancellationSignal;
import java.io.File;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessagesHelper;
public final class jh implements Runnable {
    public final int f17991a;
    public final Object f17992b;

    public jh(Object obj, int i10) {
        this.f17991a = i10;
        this.f17992b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17991a) {
            case 0:
                NotificationsSettingsFacade.b((NotificationsSettingsFacade) this.f17992b);
                return;
            case 1:
                ((CancellationSignal) this.f17992b).cancel();
                return;
            case 2:
                ProxyRotationController.b((ProxyRotationController) this.f17992b);
                return;
            case 3:
                ((PushListenerController.GooglePushListenerServiceProvider) this.f17992b).lambda$onRequestPushToken$1();
                return;
            case 4:
                RecordedAudioTranscriptionController.lambda$cleanup$3((File) this.f17992b);
                return;
            case 5:
                ((RecordedAudioTranscriptionRequest) this.f17992b).lambda$new$0();
                return;
            case 6:
                ((RichMessageLayout.PreviewView) this.f17992b).lambda$onTouchEvent$0();
                return;
            case 7:
                ((RichMessageLayout.RichButtonRowBlock) this.f17992b).invalidate();
                return;
            case 8:
                ((RichMessageLayout.RichButtonSpan) this.f17992b).invalidate();
                return;
            case 9:
                RichMessageLayout.RichUnsupportedBlock.lambda$new$0((RichMessageLayout) this.f17992b);
                return;
            case 10:
                ((RichMessageLayout.Text) this.f17992b).lambda$scheduleLongPress$2();
                return;
            case 11:
                ((SecretChatHelper) this.f17992b).lambda$startSecretChat$25();
                return;
            case 12:
                ((SendMessagesHelper) this.f17992b).lambda$new$0();
                return;
            case 13:
                ((MessagesStorage.StringCallback) this.f17992b).run(null);
                return;
            case 14:
                ((SendMessagesHelper.LocationProvider) this.f17992b).lambda$start$0();
                return;
            case 15:
                ((TelegramMediaSession) this.f17992b).onAccountSwitched();
                return;
            default:
                ((TranslateController) this.f17992b).loadTranslatingDialogsCached();
                return;
        }
    }
}
