package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class tb implements Runnable {
    public final int f19582a;
    public final MessagesController f19583b;
    public final TLObject f19584c;

    public tb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f19582a = i10;
        this.f19583b = messagesController;
        this.f19584c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19582a) {
            case 0:
                this.f19583b.lambda$loadGlobalNotificationsSettings$201(this.f19584c);
                return;
            case 1:
                this.f19583b.lambda$reloadReactionsNotifySettings$203(this.f19584c);
                return;
            case 2:
                this.f19583b.lambda$getContentSettings$504(this.f19584c);
                return;
            case 3:
                this.f19583b.lambda$loadSuggestedFilters$24(this.f19584c);
                return;
            case 4:
                this.f19583b.lambda$loadHintDialogs$194(this.f19584c);
                return;
            case 5:
                this.f19583b.lambda$loadUnreadDialogs$360(this.f19584c);
                return;
            default:
                this.f19583b.lambda$loadSignUpNotificationsSettings$205(this.f19584c);
                return;
        }
    }
}
