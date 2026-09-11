package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class sa implements Runnable {
    public final int f18976a;
    public final MessagesController f18977b;
    public final TLObject f18978c;

    public sa(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f18976a = i10;
        this.f18977b = messagesController;
        this.f18978c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18976a) {
            case 0:
                this.f18977b.lambda$loadHintDialogs$195(this.f18978c);
                return;
            case 1:
                this.f18977b.lambda$getContentSettings$501(this.f18978c);
                return;
            case 2:
                this.f18977b.lambda$reloadReactionsNotifySettings$204(this.f18978c);
                return;
            case 3:
                this.f18977b.lambda$loadGlobalNotificationsSettings$202(this.f18978c);
                return;
            case 4:
                this.f18977b.lambda$loadUnreadDialogs$361(this.f18978c);
                return;
            case 5:
                this.f18977b.lambda$loadSuggestedFilters$24(this.f18978c);
                return;
            default:
                this.f18977b.lambda$loadSignUpNotificationsSettings$206(this.f18978c);
                return;
        }
    }
}
