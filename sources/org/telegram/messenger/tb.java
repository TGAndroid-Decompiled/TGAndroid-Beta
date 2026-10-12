package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class tb implements Runnable {
    public final int f18972a;
    public final MessagesController f18973b;
    public final TLObject f18974c;

    public tb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f18972a = i10;
        this.f18973b = messagesController;
        this.f18974c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18972a) {
            case 0:
                this.f18973b.lambda$loadGlobalNotificationsSettings$201(this.f18974c);
                return;
            case 1:
                this.f18973b.lambda$reloadReactionsNotifySettings$203(this.f18974c);
                return;
            case 2:
                this.f18973b.lambda$getContentSettings$504(this.f18974c);
                return;
            case 3:
                this.f18973b.lambda$loadSuggestedFilters$24(this.f18974c);
                return;
            case 4:
                this.f18973b.lambda$loadHintDialogs$194(this.f18974c);
                return;
            case 5:
                this.f18973b.lambda$loadUnreadDialogs$360(this.f18974c);
                return;
            default:
                this.f18973b.lambda$loadSignUpNotificationsSettings$205(this.f18974c);
                return;
        }
    }
}
