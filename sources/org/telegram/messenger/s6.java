package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class s6 implements Runnable {
    public final int f18842a;
    public final int f18843b;
    public final Object f18844c;

    public s6(int i10, Object obj, int i11) {
        this.f18842a = i11;
        this.f18843b = i10;
        this.f18844c = obj;
    }

    @Override
    public final void run() {
        switch (this.f18842a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f18844c).lambda$onCallStateChanged$0(this.f18843b);
                return;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f18843b, (TLRPC.TL_help_appConfig) this.f18844c);
                return;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f18843b, (TLRPC.messages_AvailableEffects) this.f18844c);
                return;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f18843b, (TL_account.TL_webBrowserSettings) this.f18844c);
                return;
            case 4:
                AutoDeleteMediaTask.b(this.f18843b, (File) this.f18844c);
                return;
            case 5:
                FileLoader.lambda$deleteFiles$16((ArrayList) this.f18844c, this.f18843b);
                return;
            case 6:
                ((FilesMigrationService) this.f18844c).lambda$updateProgress$1(this.f18843b);
                return;
            case 7:
                MediaController.lambda$saveFile$48((org.telegram.ui.ActionBar.a2) this.f18844c, this.f18843b);
                return;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f18844c, this.f18843b);
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f18843b, (TLRPC.TL_updates) this.f18844c);
                return;
            case 10:
                SendMessagesHelper.lambda$handleError$122(this.f18843b, (AccountInstance) this.f18844c);
                return;
            default:
                Utilities.lambda$doCallbacks$0(this.f18843b, (Utilities.Callback[]) this.f18844c);
                return;
        }
    }

    public s6(Object obj, int i10, int i11) {
        this.f18842a = i11;
        this.f18844c = obj;
        this.f18843b = i10;
    }
}
