package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f17604a;
    public final MessagesController f17605b;
    public final TLObject f17606c;

    public ta(MessagesController messagesController, TLObject tLObject, int i10) {
        this.f17604a = i10;
        this.f17605b = messagesController;
        this.f17606c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17604a) {
            case 0:
                this.f17605b.lambda$loadHintDialogs$195(this.f17606c);
                return;
            case 1:
                this.f17605b.lambda$getContentSettings$501(this.f17606c);
                return;
            case 2:
                this.f17605b.lambda$reloadReactionsNotifySettings$204(this.f17606c);
                return;
            case 3:
                this.f17605b.lambda$loadGlobalNotificationsSettings$202(this.f17606c);
                return;
            case 4:
                this.f17605b.lambda$loadUnreadDialogs$361(this.f17606c);
                return;
            case 5:
                this.f17605b.lambda$loadSuggestedFilters$24(this.f17606c);
                return;
            default:
                this.f17605b.lambda$loadSignUpNotificationsSettings$206(this.f17606c);
                return;
        }
    }
}
