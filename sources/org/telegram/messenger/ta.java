package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f17626a;
    public final MessagesController f17627b;
    public final TLObject f17628c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f17626a = i10;
        this.f17627b = messagesController;
        this.f17628c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17626a) {
            case 0:
                this.f17627b.lambda$loadHintDialogs$195(this.f17628c);
                return;
            case 1:
                this.f17627b.lambda$getContentSettings$501(this.f17628c);
                return;
            case 2:
                this.f17627b.lambda$reloadReactionsNotifySettings$204(this.f17628c);
                return;
            case 3:
                this.f17627b.lambda$loadGlobalNotificationsSettings$202(this.f17628c);
                return;
            case 4:
                this.f17627b.lambda$loadUnreadDialogs$361(this.f17628c);
                return;
            case 5:
                this.f17627b.lambda$loadSuggestedFilters$24(this.f17628c);
                return;
            default:
                this.f17627b.lambda$loadSignUpNotificationsSettings$206(this.f17628c);
                return;
        }
    }
}
