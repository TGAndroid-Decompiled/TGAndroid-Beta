package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class tb implements Runnable {
    public final int f18973a;
    public final MessagesController f18974b;
    public final TLObject f18975c;

    public tb(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f18973a = i10;
        this.f18974b = messagesController;
        this.f18975c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18973a) {
            case 0:
                this.f18974b.lambda$loadGlobalNotificationsSettings$201(this.f18975c);
                return;
            case 1:
                this.f18974b.lambda$reloadReactionsNotifySettings$203(this.f18975c);
                return;
            case 2:
                this.f18974b.lambda$getContentSettings$504(this.f18975c);
                return;
            case 3:
                this.f18974b.lambda$loadSuggestedFilters$24(this.f18975c);
                return;
            case 4:
                this.f18974b.lambda$loadHintDialogs$194(this.f18975c);
                return;
            case 5:
                this.f18974b.lambda$loadUnreadDialogs$360(this.f18975c);
                return;
            default:
                this.f18974b.lambda$loadSignUpNotificationsSettings$205(this.f18975c);
                return;
        }
    }
}
