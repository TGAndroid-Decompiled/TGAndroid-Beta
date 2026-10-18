package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class r6 implements Runnable {
    public final int f19402a;
    public final int f19403b;
    public final Object f19404c;

    public r6(int i10, Object obj, int i11) {
        this.f19402a = i11;
        this.f19403b = i10;
        this.f19404c = obj;
    }

    @Override
    public final void run() {
        switch (this.f19402a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f19404c).lambda$onCallStateChanged$0(this.f19403b);
                return;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f19403b, (TLRPC.TL_help_appConfig) this.f19404c);
                return;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f19403b, (TLRPC.messages_AvailableEffects) this.f19404c);
                return;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f19403b, (TL_account.TL_webBrowserSettings) this.f19404c);
                return;
            case 4:
                AutoDeleteMediaTask.b(this.f19403b, (File) this.f19404c);
                return;
            case 5:
                FileLoader.lambda$deleteFiles$16((ArrayList) this.f19404c, this.f19403b);
                return;
            case 6:
                ((FilesMigrationService) this.f19404c).lambda$updateProgress$1(this.f19403b);
                return;
            case 7:
                MediaController.lambda$saveFile$48((org.telegram.ui.ActionBar.b2) this.f19404c, this.f19403b);
                return;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f19404c, this.f19403b);
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f19403b, (TLRPC.TL_updates) this.f19404c);
                return;
            case 10:
                SendMessagesHelper.lambda$handleError$122(this.f19403b, (AccountInstance) this.f19404c);
                return;
            default:
                Utilities.lambda$doCallbacks$0(this.f19403b, (Utilities.Callback[]) this.f19404c);
                return;
        }
    }

    public r6(Object obj, int i10, int i11) {
        this.f19402a = i11;
        this.f19404c = obj;
        this.f19403b = i10;
    }
}
