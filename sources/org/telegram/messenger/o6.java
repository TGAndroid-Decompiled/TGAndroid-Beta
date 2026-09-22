package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class o6 implements Runnable {
    public final int f16907a;
    public final int f16908b;
    public final Object f16909c;

    public o6(int i10, Object obj, int i11) {
        this.f16907a = i11;
        this.f16908b = i10;
        this.f16909c = obj;
    }

    @Override
    public final void run() {
        switch (this.f16907a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f16909c).lambda$onCallStateChanged$0(this.f16908b);
                return;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f16908b, (TLRPC.TL_help_appConfig) this.f16909c);
                return;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f16908b, (TLRPC.messages_AvailableEffects) this.f16909c);
                return;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f16908b, (TL_account.TL_webBrowserSettings) this.f16909c);
                return;
            case 4:
                AutoDeleteMediaTask.b(this.f16908b, (File) this.f16909c);
                return;
            case 5:
                FileLoader.lambda$deleteFiles$16((ArrayList) this.f16909c, this.f16908b);
                return;
            case 6:
                ((FilesMigrationService) this.f16909c).lambda$updateProgress$1(this.f16908b);
                return;
            case 7:
                MediaController.lambda$saveFile$47((org.telegram.ui.ActionBar.b2) this.f16909c, this.f16908b);
                return;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f16909c, this.f16908b);
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f16908b, (TLRPC.TL_updates) this.f16909c);
                return;
            case 10:
                SendMessagesHelper.lambda$handleError$119(this.f16908b, (AccountInstance) this.f16909c);
                return;
            default:
                Utilities.lambda$doCallbacks$0(this.f16908b, (Utilities.Callback[]) this.f16909c);
                return;
        }
    }

    public o6(Object obj, int i10, int i11) {
        this.f16907a = i11;
        this.f16909c = obj;
        this.f16908b = i10;
    }
}
