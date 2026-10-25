package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class x6 implements Runnable {
    public final int f21803a;
    public final int f21804b;
    public final Object f21805c;

    public x6(int i10, Object obj, int i11) {
        this.f21803a = i11;
        this.f21804b = i10;
        this.f21805c = obj;
    }

    @Override
    public final void run() {
        switch (this.f21803a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f21805c).lambda$onCallStateChanged$0(this.f21804b);
                return;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f21804b, (TLRPC.TL_help_appConfig) this.f21805c);
                return;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f21804b, (TLRPC.messages_AvailableEffects) this.f21805c);
                return;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f21804b, (TL_account.TL_webBrowserSettings) this.f21805c);
                return;
            case 4:
                AutoDeleteMediaTask.b(this.f21804b, (File) this.f21805c);
                return;
            case 5:
                FileLoader.lambda$deleteFiles$18((ArrayList) this.f21805c, this.f21804b);
                return;
            case 6:
                ((FilesMigrationService) this.f21805c).lambda$updateProgress$1(this.f21804b);
                return;
            case 7:
                MediaController.lambda$saveFile$50((org.telegram.ui.ActionBar.e2) this.f21805c, this.f21804b);
                return;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f21805c, this.f21804b);
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f21804b, (TLRPC.TL_updates) this.f21805c);
                return;
            case 10:
                SendMessagesHelper.lambda$handleError$122(this.f21804b, (AccountInstance) this.f21805c);
                return;
            default:
                Utilities.lambda$doCallbacks$0(this.f21804b, (Utilities.Callback[]) this.f21805c);
                return;
        }
    }

    public x6(Object obj, int i10, int i11) {
        this.f21803a = i11;
        this.f21805c = obj;
        this.f21804b = i10;
    }
}
