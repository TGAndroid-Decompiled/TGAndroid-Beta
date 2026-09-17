package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class n6 implements Runnable {
    public final int f18460a;
    public final int f18461b;
    public final Object f18462c;

    public n6(int i10, Object obj, int i11) {
        this.f18460a = i11;
        this.f18461b = i10;
        this.f18462c = obj;
    }

    @Override
    public final void run() {
        switch (this.f18460a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f18462c).lambda$onCallStateChanged$0(this.f18461b);
                return;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f18461b, (TLRPC.TL_help_appConfig) this.f18462c);
                return;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f18461b, (TLRPC.messages_AvailableEffects) this.f18462c);
                return;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f18461b, (TL_account.TL_webBrowserSettings) this.f18462c);
                return;
            case 4:
                AutoDeleteMediaTask.b(this.f18461b, (File) this.f18462c);
                return;
            case 5:
                FileLoader.lambda$deleteFiles$16((ArrayList) this.f18462c, this.f18461b);
                return;
            case 6:
                ((FilesMigrationService) this.f18462c).lambda$updateProgress$1(this.f18461b);
                return;
            case 7:
                MediaController.lambda$saveFile$47((org.telegram.ui.ActionBar.b2) this.f18462c, this.f18461b);
                return;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f18462c, this.f18461b);
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f18461b, (TLRPC.TL_updates) this.f18462c);
                return;
            case 10:
                SendMessagesHelper.lambda$handleError$119(this.f18461b, (AccountInstance) this.f18462c);
                return;
            default:
                Utilities.lambda$doCallbacks$0(this.f18461b, (Utilities.Callback[]) this.f18462c);
                return;
        }
    }

    public n6(Object obj, int i10, int i11) {
        this.f18460a = i11;
        this.f18462c = obj;
        this.f18461b = i10;
    }
}
