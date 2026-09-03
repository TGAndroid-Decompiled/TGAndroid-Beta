package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class s6 implements Runnable {
    public final int f19950a;
    public final int f19951b;
    public final Object f19952c;

    public s6(int i10, Object obj, int i11) {
        this.f19950a = i11;
        this.f19951b = i10;
        this.f19952c = obj;
    }

    @Override
    public final void run() {
        switch (this.f19950a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f19952c).lambda$onCallStateChanged$0(this.f19951b);
                return;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f19951b, (TLRPC.TL_help_appConfig) this.f19952c);
                return;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f19951b, (TLRPC.messages_AvailableEffects) this.f19952c);
                return;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f19951b, (TL_account.TL_webBrowserSettings) this.f19952c);
                return;
            case 4:
                AutoDeleteMediaTask.b(this.f19951b, (File) this.f19952c);
                return;
            case 5:
                FileLoader.lambda$deleteFiles$16((ArrayList) this.f19952c, this.f19951b);
                return;
            case 6:
                ((FilesMigrationService) this.f19952c).lambda$updateProgress$1(this.f19951b);
                return;
            case 7:
                MediaController.lambda$saveFile$47((org.telegram.ui.ActionBar.d2) this.f19952c, this.f19951b);
                return;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f19952c, this.f19951b);
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f19951b, (TLRPC.TL_updates) this.f19952c);
                return;
            case 10:
                SendMessagesHelper.lambda$handleError$119(this.f19951b, (AccountInstance) this.f19952c);
                return;
            default:
                Utilities.lambda$doCallbacks$0(this.f19951b, (Utilities.Callback[]) this.f19952c);
                return;
        }
    }

    public s6(Object obj, int i10, int i11) {
        this.f19950a = i11;
        this.f19952c = obj;
        this.f19951b = i10;
    }
}
