package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class qb implements Runnable {
    public final int f18920a;
    public final MessagesController f18921b;
    public final TLObject f18922c;

    public qb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f18920a = i10;
        this.f18921b = messagesController;
        this.f18922c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18920a) {
            case 0:
                this.f18921b.lambda$loadGlobalNotificationsSettings$201(this.f18922c);
                return;
            case 1:
                this.f18921b.lambda$reloadReactionsNotifySettings$203(this.f18922c);
                return;
            case 2:
                this.f18921b.lambda$getContentSettings$504(this.f18922c);
                return;
            case 3:
                this.f18921b.lambda$loadSuggestedFilters$24(this.f18922c);
                return;
            case 4:
                this.f18921b.lambda$loadHintDialogs$194(this.f18922c);
                return;
            case 5:
                this.f18921b.lambda$loadUnreadDialogs$360(this.f18922c);
                return;
            default:
                this.f18921b.lambda$loadSignUpNotificationsSettings$205(this.f18922c);
                return;
        }
    }
}
