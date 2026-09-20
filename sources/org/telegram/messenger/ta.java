package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f17593a;
    public final MessagesController f17594b;
    public final TLObject f17595c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f17593a = i10;
        this.f17594b = messagesController;
        this.f17595c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17593a) {
            case 0:
                this.f17594b.lambda$loadHintDialogs$195(this.f17595c);
                return;
            case 1:
                this.f17594b.lambda$getContentSettings$501(this.f17595c);
                return;
            case 2:
                this.f17594b.lambda$reloadReactionsNotifySettings$204(this.f17595c);
                return;
            case 3:
                this.f17594b.lambda$loadGlobalNotificationsSettings$202(this.f17595c);
                return;
            case 4:
                this.f17594b.lambda$loadUnreadDialogs$361(this.f17595c);
                return;
            case 5:
                this.f17594b.lambda$loadSuggestedFilters$24(this.f17595c);
                return;
            default:
                this.f17594b.lambda$loadSignUpNotificationsSettings$206(this.f17595c);
                return;
        }
    }
}
