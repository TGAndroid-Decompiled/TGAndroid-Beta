package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class s6 implements Runnable {
    public final int f19948a;
    public final int f19949b;
    public final Object f19950c;

    public s6(int i10, Object obj, int i11) {
        this.f19948a = i11;
        this.f19949b = i10;
        this.f19950c = obj;
    }

    @Override
    public final void run() {
        switch (this.f19948a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f19950c).lambda$onCallStateChanged$0(this.f19949b);
                return;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f19949b, (TLRPC.TL_help_appConfig) this.f19950c);
                return;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f19949b, (TLRPC.messages_AvailableEffects) this.f19950c);
                return;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f19949b, (TL_account.TL_webBrowserSettings) this.f19950c);
                return;
            case 4:
                AutoDeleteMediaTask.b(this.f19949b, (File) this.f19950c);
                return;
            case 5:
                FileLoader.lambda$deleteFiles$16((ArrayList) this.f19950c, this.f19949b);
                return;
            case 6:
                ((FilesMigrationService) this.f19950c).lambda$updateProgress$1(this.f19949b);
                return;
            case 7:
                MediaController.lambda$saveFile$47((org.telegram.ui.ActionBar.d2) this.f19950c, this.f19949b);
                return;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f19950c, this.f19949b);
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f19949b, (TLRPC.TL_updates) this.f19950c);
                return;
            case 10:
                SendMessagesHelper.lambda$handleError$119(this.f19949b, (AccountInstance) this.f19950c);
                return;
            default:
                Utilities.lambda$doCallbacks$0(this.f19949b, (Utilities.Callback[]) this.f19950c);
                return;
        }
    }

    public s6(Object obj, int i10, int i11) {
        this.f19948a = i11;
        this.f19950c = obj;
        this.f19949b = i10;
    }
}
