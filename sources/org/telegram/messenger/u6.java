package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class u6 implements Runnable {
    public final int f16463a;
    public final int f16464b;
    public final Object f16465c;

    public u6(int i10, Object obj, int i11) {
        this.f16463a = i11;
        this.f16464b = i10;
        this.f16465c = obj;
    }

    @Override
    public final void run() {
        switch (this.f16463a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f16465c).lambda$onCallStateChanged$0(this.f16464b);
                return;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f16464b, (TLRPC.TL_help_appConfig) this.f16465c);
                return;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f16464b, (TLRPC.messages_AvailableEffects) this.f16465c);
                return;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f16464b, (TL_account.TL_webBrowserSettings) this.f16465c);
                return;
            case 4:
                AutoDeleteMediaTask.b(this.f16464b, (File) this.f16465c);
                return;
            case 5:
                FileLoader.lambda$deleteFiles$16((ArrayList) this.f16465c, this.f16464b);
                return;
            case 6:
                ((FilesMigrationService) this.f16465c).lambda$updateProgress$1(this.f16464b);
                return;
            case 7:
                MediaController.lambda$saveFile$47((org.telegram.ui.ActionBar.d2) this.f16465c, this.f16464b);
                return;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f16465c, this.f16464b);
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f16464b, (TLRPC.TL_updates) this.f16465c);
                return;
            case 10:
                SendMessagesHelper.lambda$handleError$119(this.f16464b, (AccountInstance) this.f16465c);
                return;
            default:
                Utilities.lambda$doCallbacks$0(this.f16464b, (Utilities.Callback[]) this.f16465c);
                return;
        }
    }

    public u6(Object obj, int i10, int i11) {
        this.f16463a = i11;
        this.f16465c = obj;
        this.f16464b = i10;
    }
}
