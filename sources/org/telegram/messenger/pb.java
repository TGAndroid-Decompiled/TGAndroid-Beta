package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class pb implements Runnable {
    public final int f19243a;
    public final MessagesController f19244b;
    public final TLObject f19245c;

    public pb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19243a = i10;
        this.f19244b = messagesController;
        this.f19245c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19243a) {
            case 0:
                this.f19244b.lambda$loadGlobalNotificationsSettings$201(this.f19245c);
                return;
            case 1:
                this.f19244b.lambda$reloadReactionsNotifySettings$203(this.f19245c);
                return;
            case 2:
                this.f19244b.lambda$getContentSettings$504(this.f19245c);
                return;
            case 3:
                this.f19244b.lambda$loadSuggestedFilters$24(this.f19245c);
                return;
            case 4:
                this.f19244b.lambda$loadHintDialogs$194(this.f19245c);
                return;
            case 5:
                this.f19244b.lambda$loadUnreadDialogs$360(this.f19245c);
                return;
            default:
                this.f19244b.lambda$loadSignUpNotificationsSettings$205(this.f19245c);
                return;
        }
    }
}
