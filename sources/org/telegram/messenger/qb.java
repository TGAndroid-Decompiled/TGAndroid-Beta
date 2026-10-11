package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class qb implements Runnable {
    public final int f18965a;
    public final MessagesController f18966b;
    public final TLObject f18967c;

    public qb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f18965a = i10;
        this.f18966b = messagesController;
        this.f18967c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18965a) {
            case 0:
                this.f18966b.lambda$loadGlobalNotificationsSettings$201(this.f18967c);
                return;
            case 1:
                this.f18966b.lambda$reloadReactionsNotifySettings$203(this.f18967c);
                return;
            case 2:
                this.f18966b.lambda$getContentSettings$504(this.f18967c);
                return;
            case 3:
                this.f18966b.lambda$loadSuggestedFilters$24(this.f18967c);
                return;
            case 4:
                this.f18966b.lambda$loadHintDialogs$194(this.f18967c);
                return;
            case 5:
                this.f18966b.lambda$loadUnreadDialogs$360(this.f18967c);
                return;
            default:
                this.f18966b.lambda$loadSignUpNotificationsSettings$205(this.f18967c);
                return;
        }
    }
}
