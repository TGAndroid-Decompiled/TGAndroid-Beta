package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class y6 implements Runnable {
    public final int f21885a;
    public final int f21886b;
    public final Object f21887c;

    public y6(int i10, Object obj, int i11) {
        this.f21885a = i11;
        this.f21886b = i10;
        this.f21887c = obj;
    }

    @Override
    public final void run() {
        switch (this.f21885a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f21887c).lambda$onCallStateChanged$0(this.f21886b);
                return;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f21886b, (TLRPC.TL_help_appConfig) this.f21887c);
                return;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f21886b, (TLRPC.messages_AvailableEffects) this.f21887c);
                return;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f21886b, (TL_account.TL_webBrowserSettings) this.f21887c);
                return;
            case 4:
                AutoDeleteMediaTask.b(this.f21886b, (File) this.f21887c);
                return;
            case 5:
                FileLoader.lambda$deleteFiles$18((ArrayList) this.f21887c, this.f21886b);
                return;
            case 6:
                ((FilesMigrationService) this.f21887c).lambda$updateProgress$1(this.f21886b);
                return;
            case 7:
                MediaController.lambda$saveFile$50((org.telegram.ui.ActionBar.e2) this.f21887c, this.f21886b);
                return;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f21887c, this.f21886b);
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f21886b, (TLRPC.TL_updates) this.f21887c);
                return;
            case 10:
                SendMessagesHelper.lambda$handleError$122(this.f21886b, (AccountInstance) this.f21887c);
                return;
            default:
                Utilities.lambda$doCallbacks$0(this.f21886b, (Utilities.Callback[]) this.f21887c);
                return;
        }
    }

    public y6(Object obj, int i10, int i11) {
        this.f21885a = i11;
        this.f21887c = obj;
        this.f21886b = i10;
    }
}
