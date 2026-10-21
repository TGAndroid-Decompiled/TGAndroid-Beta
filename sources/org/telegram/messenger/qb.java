package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class qb implements Runnable {
    public final int f19338a;
    public final MessagesController f19339b;
    public final TLObject f19340c;

    public qb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19338a = i10;
        this.f19339b = messagesController;
        this.f19340c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19338a) {
            case 0:
                this.f19339b.lambda$loadGlobalNotificationsSettings$201(this.f19340c);
                return;
            case 1:
                this.f19339b.lambda$reloadReactionsNotifySettings$203(this.f19340c);
                return;
            case 2:
                this.f19339b.lambda$getContentSettings$504(this.f19340c);
                return;
            case 3:
                this.f19339b.lambda$loadSuggestedFilters$24(this.f19340c);
                return;
            case 4:
                this.f19339b.lambda$loadHintDialogs$194(this.f19340c);
                return;
            case 5:
                this.f19339b.lambda$loadUnreadDialogs$360(this.f19340c);
                return;
            default:
                this.f19339b.lambda$loadSignUpNotificationsSettings$205(this.f19340c);
                return;
        }
    }
}
