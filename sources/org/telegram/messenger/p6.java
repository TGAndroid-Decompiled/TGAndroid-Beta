package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class p6 implements Runnable {

    public final int f21226a;

    public final int f21227b;

    public final Object f21228c;

    public p6(int i10, Object obj, int i11) {
        this.f21226a = i11;
        this.f21227b = i10;
        this.f21228c = obj;
    }

    @Override
    public final void run() {
        switch (this.f21226a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f21228c).lambda$onCallStateChanged$0(this.f21227b);
                break;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f21227b, (TLRPC.TL_help_appConfig) this.f21228c);
                break;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f21227b, (TLRPC.messages_AvailableEffects) this.f21228c);
                break;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f21227b, (TL_account.TL_webBrowserSettings) this.f21228c);
                break;
            case 4:
                AutoDeleteMediaTask.lambda$run$1(this.f21227b, (File) this.f21228c);
                break;
            case 5:
                FileLoader.lambda$deleteFiles$16((ArrayList) this.f21228c, this.f21227b);
                break;
            case 6:
                ((FilesMigrationService) this.f21228c).lambda$updateProgress$1(this.f21227b);
                break;
            case 7:
                MediaController.lambda$saveFile$47((org.telegram.ui.ActionBar.b2) this.f21228c, this.f21227b);
                break;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f21228c, this.f21227b);
                break;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f21227b, (TLRPC.TL_updates) this.f21228c);
                break;
            case 10:
                SendMessagesHelper.lambda$handleError$119(this.f21227b, (AccountInstance) this.f21228c);
                break;
            default:
                Utilities.lambda$doCallbacks$0(this.f21227b, (Utilities.Callback[]) this.f21228c);
                break;
        }
    }

    public p6(Object obj, int i10, int i11) {
        this.f21226a = i11;
        this.f21228c = obj;
        this.f21227b = i10;
    }
}
