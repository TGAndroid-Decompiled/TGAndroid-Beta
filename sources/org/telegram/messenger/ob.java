package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ob implements Runnable {
    public final int f19169a;
    public final MessagesController f19170b;
    public final TLObject f19171c;

    public ob(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19169a = i10;
        this.f19170b = messagesController;
        this.f19171c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19169a) {
            case 0:
                this.f19170b.lambda$loadGlobalNotificationsSettings$201(this.f19171c);
                return;
            case 1:
                this.f19170b.lambda$reloadReactionsNotifySettings$203(this.f19171c);
                return;
            case 2:
                this.f19170b.lambda$getContentSettings$504(this.f19171c);
                return;
            case 3:
                this.f19170b.lambda$loadSuggestedFilters$24(this.f19171c);
                return;
            case 4:
                this.f19170b.lambda$loadHintDialogs$194(this.f19171c);
                return;
            case 5:
                this.f19170b.lambda$loadUnreadDialogs$360(this.f19171c);
                return;
            default:
                this.f19170b.lambda$loadSignUpNotificationsSettings$205(this.f19171c);
                return;
        }
    }
}
