package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;

public final class Utilities$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final int f$0;
    public final Object f$1;

    public Utilities$$ExternalSyntheticLambda0(int i, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Utilities.lambda$doCallbacks$0(this.f$0, (Utilities.Callback[]) this.f$1);
                break;
            case 1:
                ((MediaController.AnonymousClass4) this.f$1).lambda$onCallStateChanged$0(this.f$0);
                break;
            case 2:
                MessagesController.AnonymousClass1.lambda$setLocal$2(this.f$0, (TLRPC.TL_help_appConfig) this.f$1);
                break;
            case 3:
                MessagesController.AnonymousClass4.lambda$setLocal$2(this.f$0, (TLRPC.messages_AvailableEffects) this.f$1);
                break;
            case 4:
                MessagesController.AnonymousClass5.lambda$setLocal$1(this.f$0, (TL_account.TL_webBrowserSettings) this.f$1);
                break;
            case 5:
                AutoDeleteMediaTask.lambda$run$1(this.f$0, (File) this.f$1);
                break;
            case 6:
                FileLoader.lambda$deleteFiles$16((ArrayList) this.f$1, this.f$0);
                break;
            case 7:
                ((FilesMigrationService) this.f$1).lambda$updateProgress$1(this.f$0);
                break;
            case 8:
                MediaController.lambda$saveFile$47((AlertDialog) this.f$1, this.f$0);
                break;
            case 9:
                PushListenerController.lambda$sendRegistrationToServer$1((String) this.f$1, this.f$0);
                break;
            case 10:
                PushListenerController.lambda$processRemoteMessage$2(this.f$0, (TLRPC.TL_updates) this.f$1);
                break;
            default:
                SendMessagesHelper.lambda$handleError$119(this.f$0, (AccountInstance) this.f$1);
                break;
        }
    }

    public Utilities$$ExternalSyntheticLambda0(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = i;
    }
}
