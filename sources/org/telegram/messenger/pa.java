package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class pa implements Runnable {
    public final int f21225a;
    public final MessagesController f21226b;
    public final TLObject f21227c;

    public pa(MessagesController messagesController, TLObject tLObject, int i9) {
        this.f21225a = i9;
        this.f21226b = messagesController;
        this.f21227c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21225a) {
            case 0:
                this.f21226b.lambda$loadHintDialogs$195(this.f21227c);
                return;
            case 1:
                this.f21226b.lambda$getContentSettings$501(this.f21227c);
                return;
            case 2:
                this.f21226b.lambda$reloadReactionsNotifySettings$204(this.f21227c);
                return;
            case 3:
                this.f21226b.lambda$loadGlobalNotificationsSettings$202(this.f21227c);
                return;
            case 4:
                this.f21226b.lambda$loadUnreadDialogs$361(this.f21227c);
                return;
            case 5:
                this.f21226b.lambda$loadSuggestedFilters$24(this.f21227c);
                return;
            default:
                this.f21226b.lambda$loadSignUpNotificationsSettings$206(this.f21227c);
                return;
        }
    }
}
