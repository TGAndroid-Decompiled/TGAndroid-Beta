package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class sb implements Runnable {
    public final int f19506a;
    public final MessagesController f19507b;
    public final TLObject f19508c;

    public sb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19506a = i10;
        this.f19507b = messagesController;
        this.f19508c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19506a) {
            case 0:
                this.f19507b.lambda$loadGlobalNotificationsSettings$201(this.f19508c);
                return;
            case 1:
                this.f19507b.lambda$reloadReactionsNotifySettings$203(this.f19508c);
                return;
            case 2:
                this.f19507b.lambda$getContentSettings$504(this.f19508c);
                return;
            case 3:
                this.f19507b.lambda$loadSuggestedFilters$24(this.f19508c);
                return;
            case 4:
                this.f19507b.lambda$loadHintDialogs$194(this.f19508c);
                return;
            case 5:
                this.f19507b.lambda$loadUnreadDialogs$360(this.f19508c);
                return;
            default:
                this.f19507b.lambda$loadSignUpNotificationsSettings$205(this.f19508c);
                return;
        }
    }
}
