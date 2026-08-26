package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

public final class MessagesController$$ExternalSyntheticLambda184 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final TLObject f$1;

    public MessagesController$$ExternalSyntheticLambda184(MessagesController messagesController, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadHintDialogs$195(this.f$1);
                break;
            case 1:
                this.f$0.lambda$getContentSettings$501(this.f$1);
                break;
            case 2:
                this.f$0.lambda$reloadReactionsNotifySettings$204(this.f$1);
                break;
            case 3:
                this.f$0.lambda$loadGlobalNotificationsSettings$202(this.f$1);
                break;
            case 4:
                this.f$0.lambda$loadUnreadDialogs$361(this.f$1);
                break;
            case 5:
                this.f$0.lambda$loadSuggestedFilters$24(this.f$1);
                break;
            default:
                this.f$0.lambda$loadSignUpNotificationsSettings$206(this.f$1);
                break;
        }
    }
}
