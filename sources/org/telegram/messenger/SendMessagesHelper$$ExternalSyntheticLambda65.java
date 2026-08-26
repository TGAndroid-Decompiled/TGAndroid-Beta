package org.telegram.messenger;

import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AlertsCreator;

public final class SendMessagesHelper$$ExternalSyntheticLambda65 implements Runnable {
    public final int $r8$classId;
    public final BaseFragment f$0;

    public SendMessagesHelper$$ExternalSyntheticLambda65(BaseFragment baseFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.showSendMediaAlert(7, this.f$0, null);
                break;
            case 1:
                MessagesController.lambda$checkSensitive$447(this.f$0);
                break;
            case 2:
                AlertsCreator.showSendMediaAlert(8, this.f$0, null);
                break;
            default:
                TranslateController.lambda$pushToSummarize$18(this.f$0);
                break;
        }
    }
}
