package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class n6 implements Runnable {
    public final int f21023a;
    public final int f21024b;
    public final Object f21025c;

    public n6(int i9, Object obj, int i10) {
        this.f21023a = i10;
        this.f21024b = i9;
        this.f21025c = obj;
    }

    @Override
    public final void run() {
        switch (this.f21023a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f21025c).lambda$onCallStateChanged$0(this.f21024b);
                return;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f21024b, (TLRPC.TL_help_appConfig) this.f21025c);
                return;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f21024b, (TLRPC.messages_AvailableEffects) this.f21025c);
                return;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f21024b, (TL_account.TL_webBrowserSettings) this.f21025c);
                return;
            case 4:
                AutoDeleteMediaTask.b(this.f21024b, (File) this.f21025c);
                return;
            case 5:
                FileLoader.lambda$deleteFiles$16((ArrayList) this.f21025c, this.f21024b);
                return;
            case 6:
                ((FilesMigrationService) this.f21025c).lambda$updateProgress$1(this.f21024b);
                return;
            case 7:
                MediaController.lambda$saveFile$47((org.telegram.ui.ActionBar.c2) this.f21025c, this.f21024b);
                return;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f21025c, this.f21024b);
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f21024b, (TLRPC.TL_updates) this.f21025c);
                return;
            case 10:
                SendMessagesHelper.lambda$handleError$119(this.f21024b, (AccountInstance) this.f21025c);
                return;
            default:
                Utilities.lambda$doCallbacks$0(this.f21024b, (Utilities.Callback[]) this.f21025c);
                return;
        }
    }

    public n6(Object obj, int i9, int i10) {
        this.f21023a = i10;
        this.f21025c = obj;
        this.f21024b = i9;
    }
}
