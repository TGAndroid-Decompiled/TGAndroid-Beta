package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class v6 implements Runnable {
    public final int f19739a;
    public final int f19740b;
    public final Object f19741c;

    public v6(int i10, Object obj, int i11) {
        this.f19739a = i11;
        this.f19740b = i10;
        this.f19741c = obj;
    }

    @Override
    public final void run() {
        switch (this.f19739a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f19741c).lambda$onCallStateChanged$0(this.f19740b);
                return;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f19740b, (TLRPC.TL_help_appConfig) this.f19741c);
                return;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f19740b, (TLRPC.messages_AvailableEffects) this.f19741c);
                return;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f19740b, (TL_account.TL_webBrowserSettings) this.f19741c);
                return;
            case 4:
                AutoDeleteMediaTask.b(this.f19740b, (File) this.f19741c);
                return;
            case 5:
                FileLoader.lambda$deleteFiles$18((ArrayList) this.f19741c, this.f19740b);
                return;
            case 6:
                ((FilesMigrationService) this.f19741c).lambda$updateProgress$1(this.f19740b);
                return;
            case 7:
                MediaController.lambda$saveFile$50((org.telegram.ui.ActionBar.b2) this.f19741c, this.f19740b);
                return;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f19741c, this.f19740b);
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f19740b, (TLRPC.TL_updates) this.f19741c);
                return;
            case 10:
                SendMessagesHelper.lambda$handleError$122(this.f19740b, (AccountInstance) this.f19741c);
                return;
            default:
                Utilities.lambda$doCallbacks$0(this.f19740b, (Utilities.Callback[]) this.f19741c);
                return;
        }
    }

    public v6(Object obj, int i10, int i11) {
        this.f19739a = i11;
        this.f19741c = obj;
        this.f19740b = i10;
    }
}
