package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class tb implements Runnable {
    public final int f18476a;
    public final MessagesController f18477b;
    public final TLObject f18478c;

    public tb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f18476a = i10;
        this.f18477b = messagesController;
        this.f18478c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18476a) {
            case 0:
                this.f18477b.lambda$loadGlobalNotificationsSettings$201(this.f18478c);
                return;
            case 1:
                this.f18477b.lambda$reloadReactionsNotifySettings$203(this.f18478c);
                return;
            case 2:
                this.f18477b.lambda$getContentSettings$504(this.f18478c);
                return;
            case 3:
                this.f18477b.lambda$loadSuggestedFilters$24(this.f18478c);
                return;
            case 4:
                this.f18477b.lambda$loadHintDialogs$194(this.f18478c);
                return;
            case 5:
                this.f18477b.lambda$loadUnreadDialogs$360(this.f18478c);
                return;
            default:
                this.f18477b.lambda$loadSignUpNotificationsSettings$205(this.f18478c);
                return;
        }
    }
}
