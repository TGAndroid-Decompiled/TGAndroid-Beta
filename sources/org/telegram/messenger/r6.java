package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class r6 implements Runnable {
    public final int f21408a;
    public final int f21409b;
    public final Object f21410c;

    public r6(int i10, Object obj, int i11) {
        this.f21408a = i11;
        this.f21409b = i10;
        this.f21410c = obj;
    }

    @Override
    public final void run() {
        switch (this.f21408a) {
            case 0:
                ((MediaController.AnonymousClass4) this.f21410c).lambda$onCallStateChanged$0(this.f21409b);
                return;
            case 1:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f21409b, (TLRPC.TL_help_appConfig) this.f21410c);
                return;
            case 2:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f21409b, (TLRPC.messages_AvailableEffects) this.f21410c);
                return;
            case 3:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f21409b, (TL_account.TL_webBrowserSettings) this.f21410c);
                return;
            case 4:
                AutoDeleteMediaTask.b(this.f21409b, (File) this.f21410c);
                return;
            case 5:
                FileLoader.lambda$deleteFiles$16((ArrayList) this.f21410c, this.f21409b);
                return;
            case 6:
                ((FilesMigrationService) this.f21410c).lambda$updateProgress$1(this.f21409b);
                return;
            case 7:
                MediaController.lambda$saveFile$47((org.telegram.ui.ActionBar.c2) this.f21410c, this.f21409b);
                return;
            case 8:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f21410c, this.f21409b);
                return;
            case 9:
                PushListenerController.lambda$processRemoteMessage$2(this.f21409b, (TLRPC.TL_updates) this.f21410c);
                return;
            case 10:
                SendMessagesHelper.lambda$handleError$119(this.f21409b, (AccountInstance) this.f21410c);
                return;
            default:
                Utilities.lambda$doCallbacks$0(this.f21409b, (Utilities.Callback[]) this.f21410c);
                return;
        }
    }

    public r6(Object obj, int i10, int i11) {
        this.f21408a = i11;
        this.f21410c = obj;
        this.f21409b = i10;
    }
}
