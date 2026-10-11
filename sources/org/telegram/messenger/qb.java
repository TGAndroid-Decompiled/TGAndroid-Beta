package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class qb implements Runnable {
    public final int f18929a;
    public final MessagesController f18930b;
    public final TLObject f18931c;

    public qb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f18929a = i10;
        this.f18930b = messagesController;
        this.f18931c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18929a) {
            case 0:
                this.f18930b.lambda$loadGlobalNotificationsSettings$201(this.f18931c);
                return;
            case 1:
                this.f18930b.lambda$reloadReactionsNotifySettings$203(this.f18931c);
                return;
            case 2:
                this.f18930b.lambda$getContentSettings$504(this.f18931c);
                return;
            case 3:
                this.f18930b.lambda$loadSuggestedFilters$24(this.f18931c);
                return;
            case 4:
                this.f18930b.lambda$loadHintDialogs$194(this.f18931c);
                return;
            case 5:
                this.f18930b.lambda$loadUnreadDialogs$360(this.f18931c);
                return;
            default:
                this.f18930b.lambda$loadSignUpNotificationsSettings$205(this.f18931c);
                return;
        }
    }
}
