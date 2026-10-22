package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class w6 implements Runnable {
    public final int f19969a;
    public final int f19970b;
    public final Object f19971c;

    public w6(int i10, Object obj, int i11) {
        this.f19969a = i11;
        this.f19970b = i10;
        this.f19971c = obj;
    }

    @Override
    public final void run() {
        switch (this.f19969a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f19971c).lambda$onCallStateChanged$0(this.f19970b);
                return;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f19970b, (TLRPC.TL_help_appConfig) this.f19971c);
                return;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f19970b, (TLRPC.messages_AvailableEffects) this.f19971c);
                return;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f19970b, (TL_account.TL_webBrowserSettings) this.f19971c);
                return;
            case 4:
                AutoDeleteMediaTask.b(this.f19970b, (File) this.f19971c);
                return;
            case 5:
                FileLoader.lambda$deleteFiles$18((ArrayList) this.f19971c, this.f19970b);
                return;
            case 6:
                ((FilesMigrationService) this.f19971c).lambda$updateProgress$1(this.f19970b);
                return;
            case 7:
                MediaController.lambda$saveFile$50((org.telegram.ui.ActionBar.b2) this.f19971c, this.f19970b);
                return;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f19971c, this.f19970b);
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f19970b, (TLRPC.TL_updates) this.f19971c);
                return;
            case 10:
                SendMessagesHelper.lambda$handleError$122(this.f19970b, (AccountInstance) this.f19971c);
                return;
            default:
                Utilities.lambda$doCallbacks$0(this.f19970b, (Utilities.Callback[]) this.f19971c);
                return;
        }
    }

    public w6(Object obj, int i10, int i11) {
        this.f19969a = i11;
        this.f19971c = obj;
        this.f19970b = i10;
    }
}
