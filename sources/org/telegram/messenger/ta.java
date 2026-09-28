package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f17609a;
    public final MessagesController f17610b;
    public final TLObject f17611c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f17609a = i10;
        this.f17610b = messagesController;
        this.f17611c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17609a) {
            case 0:
                this.f17610b.lambda$loadHintDialogs$195(this.f17611c);
                return;
            case 1:
                this.f17610b.lambda$getContentSettings$501(this.f17611c);
                return;
            case 2:
                this.f17610b.lambda$reloadReactionsNotifySettings$204(this.f17611c);
                return;
            case 3:
                this.f17610b.lambda$loadGlobalNotificationsSettings$202(this.f17611c);
                return;
            case 4:
                this.f17610b.lambda$loadUnreadDialogs$361(this.f17611c);
                return;
            case 5:
                this.f17610b.lambda$loadSuggestedFilters$24(this.f17611c);
                return;
            default:
                this.f17610b.lambda$loadSignUpNotificationsSettings$206(this.f17611c);
                return;
        }
    }
}
