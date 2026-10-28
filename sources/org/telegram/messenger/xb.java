package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class xb implements Runnable {
    public final int f21829a;
    public final MessagesController f21830b;
    public final TLObject f21831c;

    public xb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f21829a = i10;
        this.f21830b = messagesController;
        this.f21831c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21829a) {
            case 0:
                this.f21830b.lambda$loadGlobalNotificationsSettings$201(this.f21831c);
                return;
            case 1:
                this.f21830b.lambda$reloadReactionsNotifySettings$203(this.f21831c);
                return;
            case 2:
                this.f21830b.lambda$getContentSettings$507(this.f21831c);
                return;
            case 3:
                this.f21830b.lambda$loadSuggestedFilters$24(this.f21831c);
                return;
            case 4:
                this.f21830b.lambda$loadUnreadDialogs$362(this.f21831c);
                return;
            case 5:
                this.f21830b.lambda$loadHintDialogs$194(this.f21831c);
                return;
            default:
                this.f21830b.lambda$loadSignUpNotificationsSettings$205(this.f21831c);
                return;
        }
    }
}
