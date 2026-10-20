package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class t6 implements Runnable {
    public final int f19574a;
    public final int f19575b;
    public final Object f19576c;

    public t6(int i10, Object obj, int i11) {
        this.f19574a = i11;
        this.f19575b = i10;
        this.f19576c = obj;
    }

    @Override
    public final void run() {
        switch (this.f19574a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f19576c).lambda$onCallStateChanged$0(this.f19575b);
                return;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f19575b, (TLRPC.TL_help_appConfig) this.f19576c);
                return;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f19575b, (TLRPC.messages_AvailableEffects) this.f19576c);
                return;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f19575b, (TL_account.TL_webBrowserSettings) this.f19576c);
                return;
            case 4:
                AutoDeleteMediaTask.b(this.f19575b, (File) this.f19576c);
                return;
            case 5:
                FileLoader.lambda$deleteFiles$16((ArrayList) this.f19576c, this.f19575b);
                return;
            case 6:
                ((FilesMigrationService) this.f19576c).lambda$updateProgress$1(this.f19575b);
                return;
            case 7:
                MediaController.lambda$saveFile$48((org.telegram.ui.ActionBar.b2) this.f19576c, this.f19575b);
                return;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f19576c, this.f19575b);
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f19575b, (TLRPC.TL_updates) this.f19576c);
                return;
            case 10:
                SendMessagesHelper.lambda$handleError$122(this.f19575b, (AccountInstance) this.f19576c);
                return;
            default:
                Utilities.lambda$doCallbacks$0(this.f19575b, (Utilities.Callback[]) this.f19576c);
                return;
        }
    }

    public t6(Object obj, int i10, int i11) {
        this.f19574a = i11;
        this.f19576c = obj;
        this.f19575b = i10;
    }
}
