package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class qb implements Runnable {
    public final int f18924a;
    public final MessagesController f18925b;
    public final TLObject f18926c;

    public qb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f18924a = i10;
        this.f18925b = messagesController;
        this.f18926c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18924a) {
            case 0:
                this.f18925b.lambda$loadGlobalNotificationsSettings$201(this.f18926c);
                return;
            case 1:
                this.f18925b.lambda$reloadReactionsNotifySettings$203(this.f18926c);
                return;
            case 2:
                this.f18925b.lambda$getContentSettings$504(this.f18926c);
                return;
            case 3:
                this.f18925b.lambda$loadSuggestedFilters$24(this.f18926c);
                return;
            case 4:
                this.f18925b.lambda$loadHintDialogs$194(this.f18926c);
                return;
            case 5:
                this.f18925b.lambda$loadUnreadDialogs$360(this.f18926c);
                return;
            default:
                this.f18925b.lambda$loadSignUpNotificationsSettings$205(this.f18926c);
                return;
        }
    }
}
