package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class o6 implements Runnable {
    public final int f17163a;
    public final int f17164b;
    public final Object f17165c;

    public o6(int i10, Object obj, int i11) {
        this.f17163a = i11;
        this.f17164b = i10;
        this.f17165c = obj;
    }

    @Override
    public final void run() {
        switch (this.f17163a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f17165c).lambda$onCallStateChanged$0(this.f17164b);
                return;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f17164b, (TLRPC.TL_help_appConfig) this.f17165c);
                return;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f17164b, (TLRPC.messages_AvailableEffects) this.f17165c);
                return;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f17164b, (TL_account.TL_webBrowserSettings) this.f17165c);
                return;
            case 4:
                AutoDeleteMediaTask.b(this.f17164b, (File) this.f17165c);
                return;
            case 5:
                FileLoader.lambda$deleteFiles$16((ArrayList) this.f17165c, this.f17164b);
                return;
            case 6:
                ((FilesMigrationService) this.f17165c).lambda$updateProgress$1(this.f17164b);
                return;
            case 7:
                MediaController.lambda$saveFile$47((org.telegram.ui.ActionBar.c2) this.f17165c, this.f17164b);
                return;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f17165c, this.f17164b);
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f17164b, (TLRPC.TL_updates) this.f17165c);
                return;
            case 10:
                SendMessagesHelper.lambda$handleError$119(this.f17164b, (AccountInstance) this.f17165c);
                return;
            default:
                Utilities.lambda$doCallbacks$0(this.f17164b, (Utilities.Callback[]) this.f17165c);
                return;
        }
    }

    public o6(Object obj, int i10, int i11) {
        this.f17163a = i11;
        this.f17165c = obj;
        this.f17164b = i10;
    }
}
