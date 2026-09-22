package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f17608a;
    public final MessagesController f17609b;
    public final TLObject f17610c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f17608a = i10;
        this.f17609b = messagesController;
        this.f17610c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17608a) {
            case 0:
                this.f17609b.lambda$loadHintDialogs$195(this.f17610c);
                return;
            case 1:
                this.f17609b.lambda$getContentSettings$501(this.f17610c);
                return;
            case 2:
                this.f17609b.lambda$reloadReactionsNotifySettings$204(this.f17610c);
                return;
            case 3:
                this.f17609b.lambda$loadGlobalNotificationsSettings$202(this.f17610c);
                return;
            case 4:
                this.f17609b.lambda$loadUnreadDialogs$361(this.f17610c);
                return;
            case 5:
                this.f17609b.lambda$loadSuggestedFilters$24(this.f17610c);
                return;
            default:
                this.f17609b.lambda$loadSignUpNotificationsSettings$206(this.f17610c);
                return;
        }
    }
}
