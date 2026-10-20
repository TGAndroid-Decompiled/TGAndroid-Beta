package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class qb implements Runnable {
    public final int f19341a;
    public final MessagesController f19342b;
    public final TLObject f19343c;

    public qb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19341a = i10;
        this.f19342b = messagesController;
        this.f19343c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19341a) {
            case 0:
                this.f19342b.lambda$loadGlobalNotificationsSettings$201(this.f19343c);
                return;
            case 1:
                this.f19342b.lambda$reloadReactionsNotifySettings$203(this.f19343c);
                return;
            case 2:
                this.f19342b.lambda$getContentSettings$504(this.f19343c);
                return;
            case 3:
                this.f19342b.lambda$loadSuggestedFilters$24(this.f19343c);
                return;
            case 4:
                this.f19342b.lambda$loadHintDialogs$194(this.f19343c);
                return;
            case 5:
                this.f19342b.lambda$loadUnreadDialogs$360(this.f19343c);
                return;
            default:
                this.f19342b.lambda$loadSignUpNotificationsSettings$205(this.f19343c);
                return;
        }
    }
}
