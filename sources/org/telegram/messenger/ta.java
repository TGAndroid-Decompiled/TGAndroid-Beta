package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f17610a;
    public final MessagesController f17611b;
    public final TLObject f17612c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f17610a = i10;
        this.f17611b = messagesController;
        this.f17612c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17610a) {
            case 0:
                this.f17611b.lambda$loadHintDialogs$195(this.f17612c);
                return;
            case 1:
                this.f17611b.lambda$getContentSettings$501(this.f17612c);
                return;
            case 2:
                this.f17611b.lambda$reloadReactionsNotifySettings$204(this.f17612c);
                return;
            case 3:
                this.f17611b.lambda$loadGlobalNotificationsSettings$202(this.f17612c);
                return;
            case 4:
                this.f17611b.lambda$loadUnreadDialogs$361(this.f17612c);
                return;
            case 5:
                this.f17611b.lambda$loadSuggestedFilters$24(this.f17612c);
                return;
            default:
                this.f17611b.lambda$loadSignUpNotificationsSettings$206(this.f17612c);
                return;
        }
    }
}
