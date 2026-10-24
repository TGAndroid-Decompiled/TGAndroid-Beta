package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class w6 implements Runnable {
    public final int f20032a;
    public final int f20033b;
    public final Object f20034c;

    public w6(int i10, Object obj, int i11) {
        this.f20032a = i11;
        this.f20033b = i10;
        this.f20034c = obj;
    }

    @Override
    public final void run() {
        switch (this.f20032a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f20034c).lambda$onCallStateChanged$0(this.f20033b);
                return;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f20033b, (TLRPC.TL_help_appConfig) this.f20034c);
                return;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f20033b, (TLRPC.messages_AvailableEffects) this.f20034c);
                return;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f20033b, (TL_account.TL_webBrowserSettings) this.f20034c);
                return;
            case 4:
                AutoDeleteMediaTask.b(this.f20033b, (File) this.f20034c);
                return;
            case 5:
                FileLoader.lambda$deleteFiles$18((ArrayList) this.f20034c, this.f20033b);
                return;
            case 6:
                ((FilesMigrationService) this.f20034c).lambda$updateProgress$1(this.f20033b);
                return;
            case 7:
                MediaController.lambda$saveFile$50((org.telegram.ui.ActionBar.c2) this.f20034c, this.f20033b);
                return;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f20034c, this.f20033b);
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f20033b, (TLRPC.TL_updates) this.f20034c);
                return;
            case 10:
                SendMessagesHelper.lambda$handleError$122(this.f20033b, (AccountInstance) this.f20034c);
                return;
            default:
                Utilities.lambda$doCallbacks$0(this.f20033b, (Utilities.Callback[]) this.f20034c);
                return;
        }
    }

    public w6(Object obj, int i10, int i11) {
        this.f20032a = i11;
        this.f20034c = obj;
        this.f20033b = i10;
    }
}
