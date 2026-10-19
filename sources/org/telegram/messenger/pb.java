package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class pb implements Runnable {
    public final int f19246a;
    public final MessagesController f19247b;
    public final TLObject f19248c;

    public pb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19246a = i10;
        this.f19247b = messagesController;
        this.f19248c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19246a) {
            case 0:
                this.f19247b.lambda$loadGlobalNotificationsSettings$201(this.f19248c);
                return;
            case 1:
                this.f19247b.lambda$reloadReactionsNotifySettings$203(this.f19248c);
                return;
            case 2:
                this.f19247b.lambda$getContentSettings$504(this.f19248c);
                return;
            case 3:
                this.f19247b.lambda$loadSuggestedFilters$24(this.f19248c);
                return;
            case 4:
                this.f19247b.lambda$loadHintDialogs$194(this.f19248c);
                return;
            case 5:
                this.f19247b.lambda$loadUnreadDialogs$360(this.f19248c);
                return;
            default:
                this.f19247b.lambda$loadSignUpNotificationsSettings$205(this.f19248c);
                return;
        }
    }
}
