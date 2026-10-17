package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ob implements Runnable {
    public final int f19167a;
    public final MessagesController f19168b;
    public final TLObject f19169c;

    public ob(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19167a = i10;
        this.f19168b = messagesController;
        this.f19169c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19167a) {
            case 0:
                this.f19168b.lambda$loadGlobalNotificationsSettings$201(this.f19169c);
                return;
            case 1:
                this.f19168b.lambda$reloadReactionsNotifySettings$203(this.f19169c);
                return;
            case 2:
                this.f19168b.lambda$getContentSettings$504(this.f19169c);
                return;
            case 3:
                this.f19168b.lambda$loadSuggestedFilters$24(this.f19169c);
                return;
            case 4:
                this.f19168b.lambda$loadHintDialogs$194(this.f19169c);
                return;
            case 5:
                this.f19168b.lambda$loadUnreadDialogs$360(this.f19169c);
                return;
            default:
                this.f19168b.lambda$loadSignUpNotificationsSettings$205(this.f19169c);
                return;
        }
    }
}
