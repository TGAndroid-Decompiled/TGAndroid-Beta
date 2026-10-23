package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class sb implements Runnable {
    public final int f19574a;
    public final MessagesController f19575b;
    public final TLObject f19576c;

    public sb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19574a = i10;
        this.f19575b = messagesController;
        this.f19576c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19574a) {
            case 0:
                this.f19575b.lambda$loadGlobalNotificationsSettings$201(this.f19576c);
                return;
            case 1:
                this.f19575b.lambda$reloadReactionsNotifySettings$203(this.f19576c);
                return;
            case 2:
                this.f19575b.lambda$getContentSettings$504(this.f19576c);
                return;
            case 3:
                this.f19575b.lambda$loadSuggestedFilters$24(this.f19576c);
                return;
            case 4:
                this.f19575b.lambda$loadHintDialogs$194(this.f19576c);
                return;
            case 5:
                this.f19575b.lambda$loadUnreadDialogs$360(this.f19576c);
                return;
            default:
                this.f19575b.lambda$loadSignUpNotificationsSettings$205(this.f19576c);
                return;
        }
    }
}
